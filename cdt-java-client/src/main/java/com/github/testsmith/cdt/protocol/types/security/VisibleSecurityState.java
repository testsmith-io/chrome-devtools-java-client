package com.github.testsmith.cdt.protocol.types.security;

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
import java.util.List;

/**
 * Security state information about the page.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class VisibleSecurityState {

  private SecurityState securityState;

  @Optional private CertificateSecurityState certificateSecurityState;

  @Optional private SafetyTipInfo safetyTipInfo;

  private List<String> securityStateIssueIds;

  /**
   * The security level of the page.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public SecurityState getSecurityState() {
    return securityState;
  }

  /**
   * The security level of the page.
   *
   * @param securityState a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState}
   *     object
   */
  public void setSecurityState(SecurityState securityState) {
    this.securityState = securityState;
  }

  /**
   * Security state details about the page certificate.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.CertificateSecurityState}
   *     object
   */
  public CertificateSecurityState getCertificateSecurityState() {
    return certificateSecurityState;
  }

  /**
   * Security state details about the page certificate.
   *
   * @param certificateSecurityState a {@link
   *     com.github.testsmith.cdt.protocol.types.security.CertificateSecurityState} object
   */
  public void setCertificateSecurityState(CertificateSecurityState certificateSecurityState) {
    this.certificateSecurityState = certificateSecurityState;
  }

  /**
   * The type of Safety Tip triggered on the page. Note that this field will be set even if the
   * Safety Tip UI was not actually shown.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SafetyTipInfo} object
   */
  public SafetyTipInfo getSafetyTipInfo() {
    return safetyTipInfo;
  }

  /**
   * The type of Safety Tip triggered on the page. Note that this field will be set even if the
   * Safety Tip UI was not actually shown.
   *
   * @param safetyTipInfo a {@link com.github.testsmith.cdt.protocol.types.security.SafetyTipInfo}
   *     object
   */
  public void setSafetyTipInfo(SafetyTipInfo safetyTipInfo) {
    this.safetyTipInfo = safetyTipInfo;
  }

  /**
   * Array of security state issues ids.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getSecurityStateIssueIds() {
    return securityStateIssueIds;
  }

  /**
   * Array of security state issues ids.
   *
   * @param securityStateIssueIds a {@link java.util.List} object
   */
  public void setSecurityStateIssueIds(List<String> securityStateIssueIds) {
    this.securityStateIssueIds = securityStateIssueIds;
  }
}
