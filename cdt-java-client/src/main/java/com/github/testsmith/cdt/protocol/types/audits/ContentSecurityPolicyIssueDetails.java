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
 * ContentSecurityPolicyIssueDetails class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ContentSecurityPolicyIssueDetails {

  @Optional private String blockedURL;

  private String violatedDirective;

  private Boolean isReportOnly;

  private ContentSecurityPolicyViolationType contentSecurityPolicyViolationType;

  @Optional private AffectedFrame frameAncestor;

  @Optional private SourceCodeLocation sourceCodeLocation;

  @Optional private Integer violatingNodeId;

  /**
   * The url not included in allowed sources.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBlockedURL() {
    return blockedURL;
  }

  /**
   * The url not included in allowed sources.
   *
   * @param blockedURL a {@link java.lang.String} object
   */
  public void setBlockedURL(String blockedURL) {
    this.blockedURL = blockedURL;
  }

  /**
   * Specific directive that is violated, causing the CSP issue.
   *
   * @return a {@link java.lang.String} object
   */
  public String getViolatedDirective() {
    return violatedDirective;
  }

  /**
   * Specific directive that is violated, causing the CSP issue.
   *
   * @param violatedDirective a {@link java.lang.String} object
   */
  public void setViolatedDirective(String violatedDirective) {
    this.violatedDirective = violatedDirective;
  }

  /**
   * Getter for the field <code>isReportOnly</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsReportOnly() {
    return isReportOnly;
  }

  /**
   * Setter for the field <code>isReportOnly</code>.
   *
   * @param isReportOnly a {@link java.lang.Boolean} object
   */
  public void setIsReportOnly(Boolean isReportOnly) {
    this.isReportOnly = isReportOnly;
  }

  /**
   * Getter for the field <code>contentSecurityPolicyViolationType</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.ContentSecurityPolicyViolationType} object
   */
  public ContentSecurityPolicyViolationType getContentSecurityPolicyViolationType() {
    return contentSecurityPolicyViolationType;
  }

  /**
   * Setter for the field <code>contentSecurityPolicyViolationType</code>.
   *
   * @param contentSecurityPolicyViolationType a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.ContentSecurityPolicyViolationType} object
   */
  public void setContentSecurityPolicyViolationType(
      ContentSecurityPolicyViolationType contentSecurityPolicyViolationType) {
    this.contentSecurityPolicyViolationType = contentSecurityPolicyViolationType;
  }

  /**
   * Getter for the field <code>frameAncestor</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getFrameAncestor() {
    return frameAncestor;
  }

  /**
   * Setter for the field <code>frameAncestor</code>.
   *
   * @param frameAncestor a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame}
   *     object
   */
  public void setFrameAncestor(AffectedFrame frameAncestor) {
    this.frameAncestor = frameAncestor;
  }

  /**
   * Getter for the field <code>sourceCodeLocation</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SourceCodeLocation} object
   */
  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  /**
   * Setter for the field <code>sourceCodeLocation</code>.
   *
   * @param sourceCodeLocation a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.SourceCodeLocation} object
   */
  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
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
}
