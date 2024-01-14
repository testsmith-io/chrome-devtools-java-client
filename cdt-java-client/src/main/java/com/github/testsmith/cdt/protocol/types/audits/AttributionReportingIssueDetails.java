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
 * Details for issues around "Attribution Reporting API" usage. Explainer:
 * https://github.com/WICG/conversion-measurement-api
 *
 * @author roy
 * @version $Id: $Id
 */
public class AttributionReportingIssueDetails {

  private AttributionReportingIssueType violationType;

  @Optional private AffectedFrame frame;

  @Optional private AffectedRequest request;

  @Optional private Integer violatingNodeId;

  @Optional private String invalidParameter;

  /**
   * Getter for the field <code>violationType</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AttributionReportingIssueType}
   *     object
   */
  public AttributionReportingIssueType getViolationType() {
    return violationType;
  }

  /**
   * Setter for the field <code>violationType</code>.
   *
   * @param violationType a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.AttributionReportingIssueType} object
   */
  public void setViolationType(AttributionReportingIssueType violationType) {
    this.violationType = violationType;
  }

  /**
   * Getter for the field <code>frame</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getFrame() {
    return frame;
  }

  /**
   * Setter for the field <code>frame</code>.
   *
   * @param frame a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public void setFrame(AffectedFrame frame) {
    this.frame = frame;
  }

  /**
   * Getter for the field <code>request</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public AffectedRequest getRequest() {
    return request;
  }

  /**
   * Setter for the field <code>request</code>.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  /**
   * Getter for the field <code>violatingNodeId</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  /**
   * Setter for the field <code>violatingNodeId</code>.
   *
   * @param violatingNodeId a {@link java.lang.Integer} object
   */
  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }

  /**
   * Getter for the field <code>invalidParameter</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInvalidParameter() {
    return invalidParameter;
  }

  /**
   * Setter for the field <code>invalidParameter</code>.
   *
   * @param invalidParameter a {@link java.lang.String} object
   */
  public void setInvalidParameter(String invalidParameter) {
    this.invalidParameter = invalidParameter;
  }
}
