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
 * This struct holds a list of optional fields with additional information specific to the kind of
 * issue. When adding a new issue code, please also add a new optional field to this type.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InspectorIssueDetails {

  @Optional private SameSiteCookieIssueDetails sameSiteCookieIssueDetails;

  @Optional private MixedContentIssueDetails mixedContentIssueDetails;

  @Optional private BlockedByResponseIssueDetails blockedByResponseIssueDetails;

  @Optional private HeavyAdIssueDetails heavyAdIssueDetails;

  @Optional private ContentSecurityPolicyIssueDetails contentSecurityPolicyIssueDetails;

  @Optional private SharedArrayBufferIssueDetails sharedArrayBufferIssueDetails;

  @Optional private TrustedWebActivityIssueDetails twaQualityEnforcementDetails;

  @Optional private LowTextContrastIssueDetails lowTextContrastIssueDetails;

  @Optional private CorsIssueDetails corsIssueDetails;

  @Optional private AttributionReportingIssueDetails attributionReportingIssueDetails;

  /**
   * Getter for the field <code>sameSiteCookieIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SameSiteCookieIssueDetails}
   *     object
   */
  public SameSiteCookieIssueDetails getSameSiteCookieIssueDetails() {
    return sameSiteCookieIssueDetails;
  }

  /**
   * Setter for the field <code>sameSiteCookieIssueDetails</code>.
   *
   * @param sameSiteCookieIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.SameSiteCookieIssueDetails} object
   */
  public void setSameSiteCookieIssueDetails(SameSiteCookieIssueDetails sameSiteCookieIssueDetails) {
    this.sameSiteCookieIssueDetails = sameSiteCookieIssueDetails;
  }

  /**
   * Getter for the field <code>mixedContentIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.MixedContentIssueDetails}
   *     object
   */
  public MixedContentIssueDetails getMixedContentIssueDetails() {
    return mixedContentIssueDetails;
  }

  /**
   * Setter for the field <code>mixedContentIssueDetails</code>.
   *
   * @param mixedContentIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.MixedContentIssueDetails} object
   */
  public void setMixedContentIssueDetails(MixedContentIssueDetails mixedContentIssueDetails) {
    this.mixedContentIssueDetails = mixedContentIssueDetails;
  }

  /**
   * Getter for the field <code>blockedByResponseIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.BlockedByResponseIssueDetails}
   *     object
   */
  public BlockedByResponseIssueDetails getBlockedByResponseIssueDetails() {
    return blockedByResponseIssueDetails;
  }

  /**
   * Setter for the field <code>blockedByResponseIssueDetails</code>.
   *
   * @param blockedByResponseIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.BlockedByResponseIssueDetails} object
   */
  public void setBlockedByResponseIssueDetails(
      BlockedByResponseIssueDetails blockedByResponseIssueDetails) {
    this.blockedByResponseIssueDetails = blockedByResponseIssueDetails;
  }

  /**
   * Getter for the field <code>heavyAdIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.HeavyAdIssueDetails} object
   */
  public HeavyAdIssueDetails getHeavyAdIssueDetails() {
    return heavyAdIssueDetails;
  }

  /**
   * Setter for the field <code>heavyAdIssueDetails</code>.
   *
   * @param heavyAdIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.HeavyAdIssueDetails} object
   */
  public void setHeavyAdIssueDetails(HeavyAdIssueDetails heavyAdIssueDetails) {
    this.heavyAdIssueDetails = heavyAdIssueDetails;
  }

  /**
   * Getter for the field <code>contentSecurityPolicyIssueDetails</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.ContentSecurityPolicyIssueDetails} object
   */
  public ContentSecurityPolicyIssueDetails getContentSecurityPolicyIssueDetails() {
    return contentSecurityPolicyIssueDetails;
  }

  /**
   * Setter for the field <code>contentSecurityPolicyIssueDetails</code>.
   *
   * @param contentSecurityPolicyIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.ContentSecurityPolicyIssueDetails} object
   */
  public void setContentSecurityPolicyIssueDetails(
      ContentSecurityPolicyIssueDetails contentSecurityPolicyIssueDetails) {
    this.contentSecurityPolicyIssueDetails = contentSecurityPolicyIssueDetails;
  }

  /**
   * Getter for the field <code>sharedArrayBufferIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SharedArrayBufferIssueDetails}
   *     object
   */
  public SharedArrayBufferIssueDetails getSharedArrayBufferIssueDetails() {
    return sharedArrayBufferIssueDetails;
  }

  /**
   * Setter for the field <code>sharedArrayBufferIssueDetails</code>.
   *
   * @param sharedArrayBufferIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.SharedArrayBufferIssueDetails} object
   */
  public void setSharedArrayBufferIssueDetails(
      SharedArrayBufferIssueDetails sharedArrayBufferIssueDetails) {
    this.sharedArrayBufferIssueDetails = sharedArrayBufferIssueDetails;
  }

  /**
   * Getter for the field <code>twaQualityEnforcementDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.TrustedWebActivityIssueDetails}
   *     object
   */
  public TrustedWebActivityIssueDetails getTwaQualityEnforcementDetails() {
    return twaQualityEnforcementDetails;
  }

  /**
   * Setter for the field <code>twaQualityEnforcementDetails</code>.
   *
   * @param twaQualityEnforcementDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.TrustedWebActivityIssueDetails} object
   */
  public void setTwaQualityEnforcementDetails(
      TrustedWebActivityIssueDetails twaQualityEnforcementDetails) {
    this.twaQualityEnforcementDetails = twaQualityEnforcementDetails;
  }

  /**
   * Getter for the field <code>lowTextContrastIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.LowTextContrastIssueDetails}
   *     object
   */
  public LowTextContrastIssueDetails getLowTextContrastIssueDetails() {
    return lowTextContrastIssueDetails;
  }

  /**
   * Setter for the field <code>lowTextContrastIssueDetails</code>.
   *
   * @param lowTextContrastIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.LowTextContrastIssueDetails} object
   */
  public void setLowTextContrastIssueDetails(
      LowTextContrastIssueDetails lowTextContrastIssueDetails) {
    this.lowTextContrastIssueDetails = lowTextContrastIssueDetails;
  }

  /**
   * Getter for the field <code>corsIssueDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.CorsIssueDetails} object
   */
  public CorsIssueDetails getCorsIssueDetails() {
    return corsIssueDetails;
  }

  /**
   * Setter for the field <code>corsIssueDetails</code>.
   *
   * @param corsIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.CorsIssueDetails} object
   */
  public void setCorsIssueDetails(CorsIssueDetails corsIssueDetails) {
    this.corsIssueDetails = corsIssueDetails;
  }

  /**
   * Getter for the field <code>attributionReportingIssueDetails</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.AttributionReportingIssueDetails} object
   */
  public AttributionReportingIssueDetails getAttributionReportingIssueDetails() {
    return attributionReportingIssueDetails;
  }

  /**
   * Setter for the field <code>attributionReportingIssueDetails</code>.
   *
   * @param attributionReportingIssueDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.AttributionReportingIssueDetails} object
   */
  public void setAttributionReportingIssueDetails(
      AttributionReportingIssueDetails attributionReportingIssueDetails) {
    this.attributionReportingIssueDetails = attributionReportingIssueDetails;
  }
}
