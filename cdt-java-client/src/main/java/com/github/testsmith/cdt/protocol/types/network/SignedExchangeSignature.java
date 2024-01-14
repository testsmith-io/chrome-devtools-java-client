package com.github.testsmith.cdt.protocol.types.network;

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
 * Information about a signed exchange signature.
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#rfc.section.3.1
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SignedExchangeSignature {

  private String label;

  private String signature;

  private String integrity;

  @Optional private String certUrl;

  @Optional private String certSha256;

  private String validityUrl;

  private Integer date;

  private Integer expires;

  @Optional private List<String> certificates;

  /**
   * Signed exchange signature label.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLabel() {
    return label;
  }

  /**
   * Signed exchange signature label.
   *
   * @param label a {@link java.lang.String} object
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The hex string of signed exchange signature.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSignature() {
    return signature;
  }

  /**
   * The hex string of signed exchange signature.
   *
   * @param signature a {@link java.lang.String} object
   */
  public void setSignature(String signature) {
    this.signature = signature;
  }

  /**
   * Signed exchange signature integrity.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIntegrity() {
    return integrity;
  }

  /**
   * Signed exchange signature integrity.
   *
   * @param integrity a {@link java.lang.String} object
   */
  public void setIntegrity(String integrity) {
    this.integrity = integrity;
  }

  /**
   * Signed exchange signature cert Url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCertUrl() {
    return certUrl;
  }

  /**
   * Signed exchange signature cert Url.
   *
   * @param certUrl a {@link java.lang.String} object
   */
  public void setCertUrl(String certUrl) {
    this.certUrl = certUrl;
  }

  /**
   * The hex string of signed exchange signature cert sha256.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCertSha256() {
    return certSha256;
  }

  /**
   * The hex string of signed exchange signature cert sha256.
   *
   * @param certSha256 a {@link java.lang.String} object
   */
  public void setCertSha256(String certSha256) {
    this.certSha256 = certSha256;
  }

  /**
   * Signed exchange signature validity Url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getValidityUrl() {
    return validityUrl;
  }

  /**
   * Signed exchange signature validity Url.
   *
   * @param validityUrl a {@link java.lang.String} object
   */
  public void setValidityUrl(String validityUrl) {
    this.validityUrl = validityUrl;
  }

  /**
   * Signed exchange signature date.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDate() {
    return date;
  }

  /**
   * Signed exchange signature date.
   *
   * @param date a {@link java.lang.Integer} object
   */
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   * Signed exchange signature expires.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExpires() {
    return expires;
  }

  /**
   * Signed exchange signature expires.
   *
   * @param expires a {@link java.lang.Integer} object
   */
  public void setExpires(Integer expires) {
    this.expires = expires;
  }

  /**
   * The encoded certificates.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getCertificates() {
    return certificates;
  }

  /**
   * The encoded certificates.
   *
   * @param certificates a {@link java.util.List} object
   */
  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }
}
