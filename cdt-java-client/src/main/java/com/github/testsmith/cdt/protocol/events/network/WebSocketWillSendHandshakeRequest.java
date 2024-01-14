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

import com.github.testsmith.cdt.protocol.types.network.WebSocketRequest;

/**
 * Fired when WebSocket is about to initiate handshake.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WebSocketWillSendHandshakeRequest {

  private String requestId;

  private Double timestamp;

  private Double wallTime;

  private WebSocketRequest request;

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
   * UTC Timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWallTime() {
    return wallTime;
  }

  /**
   * UTC Timestamp.
   *
   * @param wallTime a {@link java.lang.Double} object
   */
  public void setWallTime(Double wallTime) {
    this.wallTime = wallTime;
  }

  /**
   * WebSocket request data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.WebSocketRequest} object
   */
  public WebSocketRequest getRequest() {
    return request;
  }

  /**
   * WebSocket request data.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.network.WebSocketRequest}
   *     object
   */
  public void setRequest(WebSocketRequest request) {
    this.request = request;
  }
}