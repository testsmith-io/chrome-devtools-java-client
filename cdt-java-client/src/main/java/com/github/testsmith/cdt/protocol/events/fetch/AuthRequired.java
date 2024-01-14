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

import com.github.testsmith.cdt.protocol.types.fetch.AuthChallenge;
import com.github.testsmith.cdt.protocol.types.network.Request;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;

/**
 * Issued when the domain is enabled with handleAuthRequests set to true. The request is paused
 * until client responds with continueWithAuth.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AuthRequired {

  private String requestId;

  private Request request;

  private String frameId;

  private ResourceType resourceType;

  private AuthChallenge authChallenge;

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
   * Details of the Authorization Challenge encountered. If this is set, client should respond with
   * continueRequest that contains AuthChallengeResponse.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.fetch.AuthChallenge} object
   */
  public AuthChallenge getAuthChallenge() {
    return authChallenge;
  }

  /**
   * Details of the Authorization Challenge encountered. If this is set, client should respond with
   * continueRequest that contains AuthChallengeResponse.
   *
   * @param authChallenge a {@link com.github.testsmith.cdt.protocol.types.fetch.AuthChallenge}
   *     object
   */
  public void setAuthChallenge(AuthChallenge authChallenge) {
    this.authChallenge = authChallenge;
  }
}
