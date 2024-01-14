package com.github.testsmith.cdt.protocol.events.network;

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

/**
 * Fired when WebSocket message error occurs.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WebSocketFrameError {

  private String requestId;

  private Double timestamp;

  private String errorMessage;

  /**
   * Request identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Request identifier.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Timestamp.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * WebSocket error message.
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * WebSocket error message.
   *
   * @param errorMessage a {@link java.lang.String} object
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
