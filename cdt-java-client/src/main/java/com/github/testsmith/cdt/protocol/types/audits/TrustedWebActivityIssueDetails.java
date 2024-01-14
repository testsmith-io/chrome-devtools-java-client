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
 * TrustedWebActivityIssueDetails class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TrustedWebActivityIssueDetails {

  private String url;

  private TwaQualityEnforcementViolationType violationType;

  @Optional private Integer httpStatusCode;

  @Optional private String packageName;

  @Optional private String signature;

  /**
   * The url that triggers the violation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The url that triggers the violation.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for the field <code>violationType</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.TwaQualityEnforcementViolationType} object
   */
  public TwaQualityEnforcementViolationType getViolationType() {
    return violationType;
  }

  /**
   * Setter for the field <code>violationType</code>.
   *
   * @param violationType a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.TwaQualityEnforcementViolationType} object
   */
  public void setViolationType(TwaQualityEnforcementViolationType violationType) {
    this.violationType = violationType;
  }

  /**
   * Getter for the field <code>httpStatusCode</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Setter for the field <code>httpStatusCode</code>.
   *
   * @param httpStatusCode a {@link java.lang.Integer} object
   */
  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   * The package name of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPackageName() {
    return packageName;
  }

  /**
   * The package name of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   *
   * @param packageName a {@link java.lang.String} object
   */
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  /**
   * The signature of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSignature() {
    return signature;
  }

  /**
   * The signature of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   *
   * @param signature a {@link java.lang.String} object
   */
  public void setSignature(String signature) {
    this.signature = signature;
  }
}
