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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.network.AuthChallenge;
import com.github.testsmith.cdt.protocol.types.network.ErrorReason;
import com.github.testsmith.cdt.protocol.types.network.Request;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;
import java.util.Map;

/**
 * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
 * mocked. Deprecated, use Fetch.requestPaused instead.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
@Deprecated
public class RequestIntercepted {

  private String interceptionId;

  private Request request;

  private String frameId;

  private ResourceType resourceType;

  private Boolean isNavigationRequest;

  @Optional private Boolean isDownload;

  @Optional private String redirectUrl;

  @Optional private AuthChallenge authChallenge;

  @Optional private ErrorReason responseErrorReason;

  @Optional private Integer responseStatusCode;

  @Optional private Map<String, Object> responseHeaders;

  @Optional private String requestId;

  /**
   * Each request the page makes will have a unique id, however if any redirects are encountered
   * while processing that fetch, they will be reported with the same id as the original fetch.
   * Likewise if HTTP authentication is needed then the same fetch id will be used.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInterceptionId() {
    return interceptionId;
  }

  /**
   * Each request the page makes will have a unique id, however if any redirects are encountered
   * while processing that fetch, they will be reported with the same id as the original fetch.
   * Likewise if HTTP authentication is needed then the same fetch id will be used.
   *
   * @param interceptionId a {@link java.lang.String} object
   */
  public void setInterceptionId(String interceptionId) {
    this.interceptionId = interceptionId;
  }

  /**
   * Getter for the field <code>request</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Request} object
   */
  public Request getRequest() {
    return request;
  }

  /**
   * Setter for the field <code>request</code>.
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
   * Whether this is a navigation request, which can abort the navigation completely.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsNavigationRequest() {
    return isNavigationRequest;
  }

  /**
   * Whether this is a navigation request, which can abort the navigation completely.
   *
   * @param isNavigationRequest a {@link java.lang.Boolean} object
   */
  public void setIsNavigationRequest(Boolean isNavigationRequest) {
    this.isNavigationRequest = isNavigationRequest;
  }

  /**
   * Set if the request is a navigation that will result in a download. Only present after response
   * is received from the server (i.e. HeadersReceived stage).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDownload() {
    return isDownload;
  }

  /**
   * Set if the request is a navigation that will result in a download. Only present after response
   * is received from the server (i.e. HeadersReceived stage).
   *
   * @param isDownload a {@link java.lang.Boolean} object
   */
  public void setIsDownload(Boolean isDownload) {
    this.isDownload = isDownload;
  }

  /**
   * Redirect location, only sent if a redirect was intercepted.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRedirectUrl() {
    return redirectUrl;
  }

  /**
   * Redirect location, only sent if a redirect was intercepted.
   *
   * @param redirectUrl a {@link java.lang.String} object
   */
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * Details of the Authorization Challenge encountered. If this is set then
   * continueInterceptedRequest must contain an authChallengeResponse.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.AuthChallenge} object
   */
  public AuthChallenge getAuthChallenge() {
    return authChallenge;
  }

  /**
   * Details of the Authorization Challenge encountered. If this is set then
   * continueInterceptedRequest must contain an authChallengeResponse.
   *
   * @param authChallenge a {@link com.github.testsmith.cdt.protocol.types.network.AuthChallenge}
   *     object
   */
  public void setAuthChallenge(AuthChallenge authChallenge) {
    this.authChallenge = authChallenge;
  }

  /**
   * Response error if intercepted at response stage or if redirect occurred while intercepting
   * request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ErrorReason} object
   */
  public ErrorReason getResponseErrorReason() {
    return responseErrorReason;
  }

  /**
   * Response error if intercepted at response stage or if redirect occurred while intercepting
   * request.
   *
   * @param responseErrorReason a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ErrorReason} object
   */
  public void setResponseErrorReason(ErrorReason responseErrorReason) {
    this.responseErrorReason = responseErrorReason;
  }

  /**
   * Response code if intercepted at response stage or if redirect occurred while intercepting
   * request or auth retry occurred.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  /**
   * Response code if intercepted at response stage or if redirect occurred while intercepting
   * request or auth retry occurred.
   *
   * @param responseStatusCode a {@link java.lang.Integer} object
   */
  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }

  /**
   * Response headers if intercepted at the response stage or if redirect occurred while
   * intercepting request or auth retry occurred.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Response headers if intercepted at the response stage or if redirect occurred while
   * intercepting request or auth retry occurred.
   *
   * @param responseHeaders a {@link java.util.Map} object
   */
  public void setResponseHeaders(Map<String, Object> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * If the intercepted request had a corresponding requestWillBeSent event fired for it, then this
   * requestId will be the same as the requestId present in the requestWillBeSent event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * If the intercepted request had a corresponding requestWillBeSent event fired for it, then this
   * requestId will be the same as the requestId present in the requestWillBeSent event.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
}
