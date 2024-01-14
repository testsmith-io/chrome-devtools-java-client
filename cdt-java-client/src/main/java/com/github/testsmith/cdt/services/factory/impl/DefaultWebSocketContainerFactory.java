package com.github.testsmith.cdt.services.factory.impl;

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

import static com.github.testsmith.cdt.services.utils.ConfigurationUtils.systemProperty;

import com.github.testsmith.cdt.services.factory.WebSocketContainerFactory;
import javax.websocket.WebSocketContainer;
import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.container.grizzly.client.GrizzlyClientContainer;

/**
 * Default WebSocketContainer factory creates a WebSocketContainer from GrizzlyContainerProvider.
 * This class sets 8MB as internal receiving buffer, which was 4MB by default. By using {@link
 * #WEBSOCKET_INCOMING_BUFFER_PROPERTY} this can further be increased if required. The following
 * code sets the the incoming buffer size to 24 MB.
 *
 * <pre>
 *   static {
 *     System.setProperty(
 *         DefaultWebSocketContainerFactory.WEBSOCKET_INCOMING_BUFFER_PROPERTY,
 *         Long.toString((long) DefaultWebSocketContainerFactory.MB * 24)
 *     );
 *   }
 * </pre>
 *
 * @author Kenan Klisura
 * @version $Id: $Id
 */
public class DefaultWebSocketContainerFactory implements WebSocketContainerFactory {

  /**
   * Constant <code>
   * WEBSOCKET_INCOMING_BUFFER_PROPERTY="com.github.testsmith.cdt.services.confi"{trunked}</code>
   */
  public static final String WEBSOCKET_INCOMING_BUFFER_PROPERTY =
      "com.github.testsmith.cdt.services.config.incomingBuffer";

  /** Constant <code>KB=1024</code> */
  public static final int KB = 1024;
  /** Constant <code>MB=1024 * KB</code> */
  public static final int MB = 1024 * KB;

  private static final int DEFAULT_INCOMING_BUFFER_SIZE = 8 * MB;

  private static final long INCOMING_BUFFER_SIZE =
      systemProperty(WEBSOCKET_INCOMING_BUFFER_PROPERTY, DEFAULT_INCOMING_BUFFER_SIZE);

  /**
   * Constant <code>INCOMING_BUFFER_SIZE_PROPERTY="org.glassfish.tyrus.incomingBufferSize"</code>
   */
  public static final String INCOMING_BUFFER_SIZE_PROPERTY =
      "org.glassfish.tyrus.incomingBufferSize";

  /** {@inheritDoc} */
  @Override
  public WebSocketContainer getWebSocketContainer() {
    final ClientManager client = ClientManager.createClient(GrizzlyClientContainer.class.getName());
    client.getProperties().put(INCOMING_BUFFER_SIZE_PROPERTY, INCOMING_BUFFER_SIZE);
    return client;
  }
}
