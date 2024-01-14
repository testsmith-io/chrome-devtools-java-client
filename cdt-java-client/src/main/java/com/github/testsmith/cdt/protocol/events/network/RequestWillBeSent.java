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
import com.github.testsmith.cdt.protocol.types.network.Initiator;
import com.github.testsmith.cdt.protocol.types.network.Request;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;
import com.github.testsmith.cdt.protocol.types.network.Response;

/**
 * Fired when page is about to send HTTP request.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RequestWillBeSent {

  private String requestId;

  private String loaderId;

  private String documentURL;

  private Request request;

  private Double timestamp;

  private Double wallTime;

  private Initiator initiator;

  @Optional private Response redirectResponse;

  @Optional private ResourceType type;

  @Optional private String frameId;

  @Optional private Boolean hasUserGesture;

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
   * URL of the document this request is loaded for.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDocumentURL() {
    return documentURL;
  }

  /**
   * URL of the document this request is loaded for.
   *
   * @param documentURL a {@link java.lang.String} object
   */
  public void setDocumentURL(String documentURL) {
    this.documentURL = documentURL;
  }

  /**
   * Request data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Request} object
   */
  public Request getRequest() {
    return request;
  }

  /**
   * Request data.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.network.Request} object
   */
  public void setRequest(Request request) {
    this.request = request;
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
   * Timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWallTime() {
    return wallTime;
  }

  /**
   * Timestamp.
   *
   * @param wallTime a {@link java.lang.Double} object
   */
  public void setWallTime(Double wallTime) {
    this.wallTime = wallTime;
  }

  /**
   * Request initiator.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Initiator} object
   */
  public Initiator getInitiator() {
    return initiator;
  }

  /**
   * Request initiator.
   *
   * @param initiator a {@link com.github.testsmith.cdt.protocol.types.network.Initiator} object
   */
  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }

  /**
   * Redirect response data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public Response getRedirectResponse() {
    return redirectResponse;
  }

  /**
   * Redirect response data.
   *
   * @param redirectResponse a {@link com.github.testsmith.cdt.protocol.types.network.Response}
   *     object
   */
  public void setRedirectResponse(Response redirectResponse) {
    this.redirectResponse = redirectResponse;
  }

  /**
   * Type of this resource.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getType() {
    return type;
  }

  /**
   * Type of this resource.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public void setType(ResourceType type) {
    this.type = type;
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

  /**
   * Whether the request is initiated by a user gesture. Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasUserGesture() {
    return hasUserGesture;
  }

  /**
   * Whether the request is initiated by a user gesture. Defaults to false.
   *
   * @param hasUserGesture a {@link java.lang.Boolean} object
   */
  public void setHasUserGesture(Boolean hasUserGesture) {
    this.hasUserGesture = hasUserGesture;
  }
}
