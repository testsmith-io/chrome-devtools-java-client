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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;
import com.github.testsmith.cdt.protocol.types.network.Response;

/**
 * Fired when HTTP response is available.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ResponseReceived {

  private String requestId;

  private String loaderId;

  private Double timestamp;

  private ResourceType type;

  private Response response;

  @Optional private String frameId;

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
   * Loader identifier. Empty string if the request is fetched from worker.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLoaderId() {
    return loaderId;
  }

  /**
   * Loader identifier. Empty string if the request is fetched from worker.
   *
   * @param loaderId a {@link java.lang.String} object
   */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
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
   * Resource type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getType() {
    return type;
  }

  /**
   * Resource type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /**
   * Response data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public Response getResponse() {
    return response;
  }

  /**
   * Response data.
   *
   * @param response a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public void setResponse(Response response) {
    this.response = response;
  }

  /**
   * Frame identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Frame identifier.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
