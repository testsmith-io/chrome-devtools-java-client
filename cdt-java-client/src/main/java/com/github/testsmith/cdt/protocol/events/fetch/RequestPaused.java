package com.github.testsmith.cdt.protocol.events.fetch;

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
import com.github.testsmith.cdt.protocol.types.fetch.HeaderEntry;
import com.github.testsmith.cdt.protocol.types.network.ErrorReason;
import com.github.testsmith.cdt.protocol.types.network.Request;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;
import java.util.List;

/**
 * Issued when the domain is enabled and the request URL matches the specified filter. The request
 * is paused until the client responds with one of continueRequest, failRequest or fulfillRequest.
 * The stage of the request can be determined by presence of responseErrorReason and
 * responseStatusCode -- the request is at the response stage if either of these fields is present
 * and in the request stage otherwise.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RequestPaused {

  private String requestId;

  private Request request;

  private String frameId;

  private ResourceType resourceType;

  @Optional private ErrorReason responseErrorReason;

  @Optional private Integer responseStatusCode;

  @Optional private List<HeaderEntry> responseHeaders;

  @Optional private String networkId;

  /**
   * Each request the page makes will have a unique id.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Each request the page makes will have a unique id.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * The details of the request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Request} object
   */
  public Request getRequest() {
    return request;
  }

  /**
   * The details of the request.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.network.Request} object
   */
  public void setRequest(Request request) {
    this.request = request;
  }

  /**
   * The id of the frame that initiated the request.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * The id of the frame that initiated the request.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * How the requested resource will be used.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getResourceType() {
    return resourceType;
  }

  /**
   * How the requested resource will be used.
   *
   * @param resourceType a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType}
   *     object
   */
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Response error if intercepted at response stage.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ErrorReason} object
   */
  public ErrorReason getResponseErrorReason() {
    return responseErrorReason;
  }

  /**
   * Response error if intercepted at response stage.
   *
   * @param responseErrorReason a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ErrorReason} object
   */
  public void setResponseErrorReason(ErrorReason responseErrorReason) {
    this.responseErrorReason = responseErrorReason;
  }

  /**
   * Response code if intercepted at response stage.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  /**
   * Response code if intercepted at response stage.
   *
   * @param responseStatusCode a {@link java.lang.Integer} object
   */
  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }

  /**
   * Response headers if intercepted at the response stage.
   *
   * @return a {@link java.util.List} object
   */
  public List<HeaderEntry> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Response headers if intercepted at the response stage.
   *
   * @param responseHeaders a {@link java.util.List} object
   */
  public void setResponseHeaders(List<HeaderEntry> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
   * then this networkId will be the same as the requestId present in the requestWillBeSent event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
   * then this networkId will be the same as the requestId present in the requestWillBeSent event.
   *
   * @param networkId a {@link java.lang.String} object
   */
  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }
}
