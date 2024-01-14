package com.github.testsmith.cdt.protocol.types.audits;

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

/**
 * MixedContentIssueDetails class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class MixedContentIssueDetails {

  @Optional private MixedContentResourceType resourceType;

  private MixedContentResolutionStatus resolutionStatus;

  private String insecureURL;

  private String mainResourceURL;

  @Optional private AffectedRequest request;

  @Optional private AffectedFrame frame;

  /**
   * The type of resource causing the mixed content issue (css, js, iframe, form,...). Marked as
   * optional because it is mapped to from blink::mojom::RequestContextType, which will be replaced
   * by network::mojom::RequestDestination
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.MixedContentResourceType}
   *     object
   */
  public MixedContentResourceType getResourceType() {
    return resourceType;
  }

  /**
   * The type of resource causing the mixed content issue (css, js, iframe, form,...). Marked as
   * optional because it is mapped to from blink::mojom::RequestContextType, which will be replaced
   * by network::mojom::RequestDestination
   *
   * @param resourceType a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.MixedContentResourceType} object
   */
  public void setResourceType(MixedContentResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * The way the mixed content issue is being resolved.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.MixedContentResolutionStatus}
   *     object
   */
  public MixedContentResolutionStatus getResolutionStatus() {
    return resolutionStatus;
  }

  /**
   * The way the mixed content issue is being resolved.
   *
   * @param resolutionStatus a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.MixedContentResolutionStatus} object
   */
  public void setResolutionStatus(MixedContentResolutionStatus resolutionStatus) {
    this.resolutionStatus = resolutionStatus;
  }

  /**
   * The unsafe http url causing the mixed content issue.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInsecureURL() {
    return insecureURL;
  }

  /**
   * The unsafe http url causing the mixed content issue.
   *
   * @param insecureURL a {@link java.lang.String} object
   */
  public void setInsecureURL(String insecureURL) {
    this.insecureURL = insecureURL;
  }

  /**
   * The url responsible for the call to an unsafe url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMainResourceURL() {
    return mainResourceURL;
  }

  /**
   * The url responsible for the call to an unsafe url.
   *
   * @param mainResourceURL a {@link java.lang.String} object
   */
  public void setMainResourceURL(String mainResourceURL) {
    this.mainResourceURL = mainResourceURL;
  }

  /**
   * The mixed content request. Does not always exist (e.g. for unsafe form submission urls).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public AffectedRequest getRequest() {
    return request;
  }

  /**
   * The mixed content request. Does not always exist (e.g. for unsafe form submission urls).
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  /**
   * Optional because not every mixed content issue is necessarily linked to a frame.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getFrame() {
    return frame;
  }

  /**
   * Optional because not every mixed content issue is necessarily linked to a frame.
   *
   * @param frame a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public void setFrame(AffectedFrame frame) {
    this.frame = frame;
  }
}
