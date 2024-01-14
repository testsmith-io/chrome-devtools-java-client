package com.github.testsmith.cdt.services.impl;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2024 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.services.ChromeDevToolsService;
import com.github.testsmith.cdt.services.WebSocketService;
import com.github.testsmith.cdt.services.config.ChromeDevToolsServiceConfiguration;
import com.github.testsmith.cdt.services.exceptions.ChromeDevToolsInvocationException;
import com.github.testsmith.cdt.services.exceptions.WebSocketServiceException;
import com.github.testsmith.cdt.services.executors.EventExecutorService;
import com.github.testsmith.cdt.services.types.ChromeTab;
import com.github.testsmith.cdt.services.types.EventListenerImpl;
import com.github.testsmith.cdt.services.types.MethodInvocation;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dev tools service implementation.
 *
 * @author Kenan Klisura
 * @version $Id: $Id
 */
public abstract class ChromeDevToolsServiceImpl
    implements ChromeDevToolsService, Consumer<String>, AutoCloseable {
  private static final Logger LOGGER = LoggerFactory.getLogger(ChromeDevToolsServiceImpl.class);

  private static final String ID_PROPERTY = "id";
  private static final String ERROR_PROPERTY = "error";
  private static final String RESULT_PROPERTY = "result";
  private static final String METHOD_PROPERTY = "method";
  private static final String PARAMS_PROPERTY = "params";

  private static final ObjectMapper OBJECT_MAPPER =
      new ObjectMapper()
          .setSerializationInclusion(JsonInclude.Include.NON_NULL)
          .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final WebSocketService webSocketService;

  private final Map<Long, InvocationResult> invocationResultMap = new ConcurrentHashMap<>();

  private ChromeTab chromeTab;
  private ChromeServiceImpl chromeService;

  private final ChromeDevToolsServiceConfiguration configuration;

  private final EventExecutorService eventExecutorService;

  private final Map<String, Set<EventListenerImpl>> eventNameToHandlersMap = new HashMap<>();

  private final CountDownLatch closeLatch;

  /**
   * Instantiates a new Chrome dev tools service. This is used during proxy building phase.
   *
   * <p>See {@link
   * com.github.testsmith.cdt.services.impl.ChromeServiceImpl#createDevToolsService(ChromeTab)} See
   * {@link com.github.testsmith.cdt.services.utils.ProxyUtils#createProxyFromAbstract(Class,
   * Class[], Object[], InvocationHandler)}
   *
   * @param webSocketService Web socket service.
   * @param configuration Service configuration.
   * @throws com.github.testsmith.cdt.services.exceptions.WebSocketServiceException Web socket
   *     service exception
   */
  public ChromeDevToolsServiceImpl(
      WebSocketService webSocketService, ChromeDevToolsServiceConfiguration configuration)
      throws WebSocketServiceException {
    this.webSocketService = webSocketService;
    this.configuration = configuration;

    this.eventExecutorService = configuration.getEventExecutorService();

    this.closeLatch = new CountDownLatch(1);

    this.webSocketService.addMessageHandler(this);
  }

  /**
   * Sets the chrome service container.
   *
   * @param chromeService Chrome service.
   */
  public void setChromeService(ChromeServiceImpl chromeService) {
    this.chromeService = chromeService;
  }

  /**
   * Sets the chrome tab for this service.
   *
   * @param chromeTab the tab
   */
  public void setChromeTab(ChromeTab chromeTab) {
    this.chromeTab = chromeTab;
  }

  /** {@inheritDoc} */
  @Override
  public <T> T invoke(String returnProperty, Class<T> clazz, MethodInvocation methodInvocation) {
    return invoke(returnProperty, clazz, null, methodInvocation);
  }

  /** {@inheritDoc} */
  @Override
  public <T> T invoke(
      String returnProperty,
      Class<T> clazz,
      Class<?>[] returnTypeClasses,
      MethodInvocation methodInvocation) {
    try {
      InvocationResult invocationResult = new InvocationResult(returnProperty);
      invocationResultMap.put(methodInvocation.getId(), invocationResult);

      webSocketService.send(OBJECT_MAPPER.writeValueAsString(methodInvocation));

      boolean hasReceivedResponse =
          invocationResult.waitForResult(configuration.getReadTimeout(), TimeUnit.SECONDS);
      invocationResultMap.remove(methodInvocation.getId());

      if (!hasReceivedResponse) {
        throw new ChromeDevToolsInvocationException(
            "Timeout expired while waiting for server response.");
      }

      if (invocationResult.isSuccess()) {
        if (Void.TYPE.equals(clazz)) {
          return null;
        }

        if (returnTypeClasses != null) {
          return readJsonObject(returnTypeClasses, clazz, invocationResult.getResult());
        } else {
          return readJsonObject(clazz, invocationResult.getResult());
        }
      } else {
        ErrorObject error = readJsonObject(ErrorObject.class, invocationResult.getResult());
        StringBuilder errorMessageBuilder = new StringBuilder(error.getMessage());
        if (error.getData() != null) {
          errorMessageBuilder.append(": ");
          errorMessageBuilder.append(error.getData());
        }

        throw new ChromeDevToolsInvocationException(
            error.getCode(), errorMessageBuilder.toString());
      }
    } catch (WebSocketServiceException e) {
      throw new ChromeDevToolsInvocationException("Failed sending web socket message.", e);
    } catch (InterruptedException e) {
      throw new ChromeDevToolsInvocationException("Interrupted while waiting response.", e);
    } catch (IOException ex) {
      throw new ChromeDevToolsInvocationException("Failed reading response message.", ex);
    }
  }

  /** {@inheritDoc} */
  @Override
  public void close() {
    if (!isClosed()) {
      webSocketService.close();

      if (chromeService != null) {
        chromeService.clearChromeDevToolsServiceCache(chromeTab);
      }

      eventExecutorService.shutdown();

      closeLatch.countDown();
    }
  }

  /** {@inheritDoc} */
  @Override
  public boolean isClosed() {
    return closeLatch.getCount() == 0L;
  }

  /** {@inheritDoc} */
  @Override
  public void waitUntilClosed() {
    try {
      closeLatch.await();
    } catch (InterruptedException e) {
      // Ignore this exception.
    }
  }

  /** {@inheritDoc} */
  @Override
  public EventListener addEventListener(
      String domainName, String eventName, EventHandler eventHandler, Class<?> eventType) {
    String name = domainName + "." + eventName;

    EventListenerImpl eventListener = new EventListenerImpl(name, eventHandler, eventType, this);
    eventNameToHandlersMap.computeIfAbsent(name, this::createEventHandlerSet).add(eventListener);

    return eventListener;
  }

  /** {@inheritDoc} */
  @Override
  public void removeEventListener(EventListener eventListener) {
    EventListenerImpl eventListenerImpl = (EventListenerImpl) eventListener;

    String name = eventListenerImpl.getKey();
    EventHandler eventHandler = eventListenerImpl.getHandler();

    Set<EventListenerImpl> listeners =
        eventNameToHandlersMap.computeIfAbsent(name, this::createEventHandlerSet);
    synchronized (listeners) {
      listeners.removeIf(next -> eventHandler.equals(next.getHandler()));
    }
  }

  /** {@inheritDoc} */
  @Override
  public void accept(String message) {
    try {
      JsonNode jsonNode = OBJECT_MAPPER.readTree(message);

      JsonNode idNode = jsonNode.get(ID_PROPERTY);
      if (idNode != null) {
        Long id = idNode.asLong();
        InvocationResult invocationResult = invocationResultMap.get(id);

        if (invocationResult != null) {
          JsonNode resultNode = jsonNode.get(RESULT_PROPERTY);
          JsonNode errorNode = jsonNode.get(ERROR_PROPERTY);

          if (errorNode != null) {
            invocationResult.signalResultReady(false, errorNode);
          } else {
            if (invocationResult.getReturnProperty() != null) {
              if (resultNode != null) {
                resultNode = resultNode.get(invocationResult.getReturnProperty());
              }
            }

            invocationResult.signalResultReady(true, resultNode);
          }
        } else {
          LOGGER.warn(
              "Received result response with unknown invocation id {}. {}", id, jsonNode.asText());
        }
      } else {
        JsonNode methodNode = jsonNode.get(METHOD_PROPERTY);
        JsonNode paramsNode = jsonNode.get(PARAMS_PROPERTY);

        if (methodNode != null) {
          handleEvent(methodNode.asText(), paramsNode);
        }
      }
    } catch (IOException ex) {
      LOGGER.error("Failed reading web socket message!", ex);
    } catch (Exception ex) {
      LOGGER.error("Failed receiving web socket message!", ex);
    }
  }

  @SuppressWarnings("unchecked")
  private void handleEvent(String name, JsonNode params) {
    Set<EventListenerImpl> listeners = eventNameToHandlersMap.get(name);

    if (listeners != null) {
      final Set<EventListener> eventListeners;
      synchronized (listeners) {
        eventListeners = new HashSet<>(listeners);
      }

      if (!eventListeners.isEmpty()) {
        eventExecutorService.execute(
            () -> {
              Object event = null;

              for (EventListenerImpl listener : listeners) {
                try {
                  if (event == null) {
                    event = readJsonObject(listener.getParamType(), params);
                  }

                  listener.getHandler().onEvent(event);
                } catch (Exception e) {
                  LOGGER.error("Error while processing event {}", name, e);
                }
              }
            });
      }
    }
  }

  private <T> T readJsonObject(
      Class<?>[] classParameters, Class<T> parameterizedClazz, JsonNode jsonNode)
      throws IOException {
    if (jsonNode == null) {
      throw new ChromeDevToolsInvocationException(
          "Failed converting null response to clazz " + parameterizedClazz.getName());
    }

    final TypeFactory typeFactory = OBJECT_MAPPER.getTypeFactory();
    JavaType javaType = null;

    if (classParameters.length > 1) {
      for (int i = classParameters.length - 2; i >= 0; i--) {
        if (javaType == null) {
          javaType =
              typeFactory.constructParametricType(classParameters[i], classParameters[i + 1]);
        } else {
          javaType = typeFactory.constructParametricType(classParameters[i], javaType);
        }
      }

      javaType =
          OBJECT_MAPPER.getTypeFactory().constructParametricType(parameterizedClazz, javaType);
    } else {
      javaType =
          OBJECT_MAPPER
              .getTypeFactory()
              .constructParametricType(parameterizedClazz, classParameters[0]);
    }

    return OBJECT_MAPPER.readerFor(javaType).readValue(jsonNode);
  }

  private <T> T readJsonObject(Class<T> clazz, JsonNode jsonNode) throws IOException {
    if (jsonNode == null) {
      throw new ChromeDevToolsInvocationException(
          "Failed converting null response to clazz " + clazz.getName());
    }

    return OBJECT_MAPPER.readerFor(clazz).readValue(jsonNode);
  }

  private Set<EventListenerImpl> createEventHandlerSet(String unused) {
    return Collections.synchronizedSet(new HashSet<>());
  }

  /** Error object returned from dev tools. */
  private static class ErrorObject {
    private Long code;
    private String message;
    private String data;

    public String getData() {
      return data;
    }

    public Long getCode() {
      return code;
    }

    public String getMessage() {
      return message;
    }
  }

  /** Invocation result wrapper. */
  private static class InvocationResult {
    private final String returnProperty;
    private JsonNode result;
    private boolean isSuccess;
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    /**
     * Creates an invocation result given a return property.
     *
     * @param returnProperty Return property. Could be null.
     */
    public InvocationResult(String returnProperty) {
      this.returnProperty = returnProperty;
    }

    /**
     * Gets the return property. Could be null.
     *
     * @return Return property.
     */
    public String getReturnProperty() {
      return returnProperty;
    }

    /**
     * Gets the JSON result.
     *
     * @return the result
     */
    public JsonNode getResult() {
      return result;
    }

    /**
     * Is invocation successful.
     *
     * @return True if invocation is successful.
     */
    public boolean isSuccess() {
      return isSuccess;
    }

    /** Signals result is ready for consumption. */
    public void signalResultReady(boolean isSuccess, JsonNode result) {
      this.isSuccess = isSuccess;
      this.result = result;

      countDownLatch.countDown();
    }

    /**
     * Waits until result is available.
     *
     * @return False if timeout is expired.
     * @throws InterruptedException If wait is interrupted.
     */
    public boolean waitForResult(long timeout, TimeUnit timeUnit) throws InterruptedException {
      if (timeout == 0) {
        countDownLatch.await();
        return true;
      }

      return countDownLatch.await(timeout, timeUnit);
    }
  }
}
