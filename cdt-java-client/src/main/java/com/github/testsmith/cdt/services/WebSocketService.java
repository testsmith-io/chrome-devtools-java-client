package com.github.testsmith.cdt.services;

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

import com.github.testsmith.cdt.services.exceptions.WebSocketServiceException;
import java.net.URI;
import java.util.function.Consumer;

/**
 * WebSocket service definition.
 *
 * @author Kenan Klisura
 * @version $Id: $Id
 */
public interface WebSocketService {
  /**
   * Connects to a specified URI.
   *
   * @param uri Server location.
   * @throws com.github.testsmith.cdt.services.exceptions.WebSocketServiceException if any.
   */
  void connect(URI uri) throws WebSocketServiceException;

  /**
   * Sends the message using web socket.
   *
   * @param message Message to send.
   * @throws com.github.testsmith.cdt.services.exceptions.WebSocketServiceException if any.
   */
  void send(String message) throws WebSocketServiceException;

  /**
   * After receiving the message calls the consumer with appropriate message.
   *
   * @param consumer Consumer to consume the message.
   * @throws com.github.testsmith.cdt.services.exceptions.WebSocketServiceException if any.
   */
  void addMessageHandler(Consumer<String> consumer) throws WebSocketServiceException;

  /** Closes the service. */
  void close();

  /**
   * Checks if connection is closed.
   *
   * @return True if connection is closed.
   */
  boolean closed();
}
