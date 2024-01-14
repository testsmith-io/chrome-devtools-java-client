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
 * Details about the security state of the page certificate.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class CertificateSecurityState {

  private String protocol;

  private String keyExchange;

  @Optional private String keyExchangeGroup;

  private String cipher;

  @Optional private String mac;

  private List<String> certificate;

  private String subjectName;

  private String issuer;

  private Double validFrom;

  private Double validTo;

  @Optional private String certificateNetworkError;

  private Boolean certificateHasWeakSignature;

  private Boolean certificateHasSha1Signature;

  private Boolean modernSSL;

  private Boolean obsoleteSslProtocol;

  private Boolean obsoleteSslKeyExchange;

  private Boolean obsoleteSslCipher;

  private Boolean obsoleteSslSignature;

  /**
   * Protocol name (e.g. "TLS 1.2" or "QUIC").
   *
   * @return a {@link java.lang.String} object
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Protocol name (e.g. "TLS 1.2" or "QUIC").
   *
   * @param protocol a {@link java.lang.String} object
   */
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Key Exchange used by the connection, or the empty string if not applicable.
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeyExchange() {
    return keyExchange;
  }

  /**
   * Key Exchange used by the connection, or the empty string if not applicable.
   *
   * @param keyExchange a {@link java.lang.String} object
   */
  public void setKeyExchange(String keyExchange) {
    this.keyExchange = keyExchange;
  }

  /**
   * (EC)DH group used by the connection, if applicable.
   *
   * @return a {@link java.lang.String} object
   */
  public String getKeyExchangeGroup() {
    return keyExchangeGroup;
  }

  /**
   * (EC)DH group used by the connection, if applicable.
   *
   * @param keyExchangeGroup a {@link java.lang.String} object
   */
  public void setKeyExchangeGroup(String keyExchangeGroup) {
    this.keyExchangeGroup = keyExchangeGroup;
  }

  /**
   * Cipher name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCipher() {
    return cipher;
  }

  /**
   * Cipher name.
   *
   * @param cipher a {@link java.lang.String} object
   */
  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  /**
   * TLS MAC. Note that AEAD ciphers do not have separate MACs.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMac() {
    return mac;
  }

  /**
   * TLS MAC. Note that AEAD ciphers do not have separate MACs.
   *
   * @param mac a {@link java.lang.String} object
   */
  public void setMac(String mac) {
    this.mac = mac;
  }

  /**
   * Page certificate.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getCertificate() {
    return certificate;
  }

  /**
   * Page certificate.
   *
   * @param certificate a {@link java.util.List} object
   */
  public void setCertificate(List<String> certificate) {
    this.certificate = certificate;
  }

  /**
   * Certificate subject name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSubjectName() {
    return subjectName;
  }

  /**
   * Certificate subject name.
   *
   * @param subjectName a {@link java.lang.String} object
   */
  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  /**
   * Name of the issuing CA.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Name of the issuing CA.
   *
   * @param issuer a {@link java.lang.String} object
   */
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * Certificate valid from date.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getValidFrom() {
    return validFrom;
  }

  /**
   * Certificate valid from date.
   *
   * @param validFrom a {@link java.lang.Double} object
   */
  public void setValidFrom(Double validFrom) {
    this.validFrom = validFrom;
  }

  /**
   * Certificate valid to (expiration) date
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getValidTo() {
    return validTo;
  }

  /**
   * Certificate valid to (expiration) date
   *
   * @param validTo a {@link java.lang.Double} object
   */
  public void setValidTo(Double validTo) {
    this.validTo = validTo;
  }

  /**
   * The highest priority network error code, if the certificate has an error.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCertificateNetworkError() {
    return certificateNetworkError;
  }

  /**
   * The highest priority network error code, if the certificate has an error.
   *
   * @param certificateNetworkError a {@link java.lang.String} object
   */
  public void setCertificateNetworkError(String certificateNetworkError) {
    this.certificateNetworkError = certificateNetworkError;
  }

  /**
   * True if the certificate uses a weak signature aglorithm.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCertificateHasWeakSignature() {
    return certificateHasWeakSignature;
  }

  /**
   * True if the certificate uses a weak signature aglorithm.
   *
   * @param certificateHasWeakSignature a {@link java.lang.Boolean} object
   */
  public void setCertificateHasWeakSignature(Boolean certificateHasWeakSignature) {
    this.certificateHasWeakSignature = certificateHasWeakSignature;
  }

  /**
   * True if the certificate has a SHA1 signature in the chain.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCertificateHasSha1Signature() {
    return certificateHasSha1Signature;
  }

  /**
   * True if the certificate has a SHA1 signature in the chain.
   *
   * @param certificateHasSha1Signature a {@link java.lang.Boolean} object
   */
  public void setCertificateHasSha1Signature(Boolean certificateHasSha1Signature) {
    this.certificateHasSha1Signature = certificateHasSha1Signature;
  }

  /**
   * True if modern SSL
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getModernSSL() {
    return modernSSL;
  }

  /**
   * True if modern SSL
   *
   * @param modernSSL a {@link java.lang.Boolean} object
   */
  public void setModernSSL(Boolean modernSSL) {
    this.modernSSL = modernSSL;
  }

  /**
   * True if the connection is using an obsolete SSL protocol.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getObsoleteSslProtocol() {
    return obsoleteSslProtocol;
  }

  /**
   * True if the connection is using an obsolete SSL protocol.
   *
   * @param obsoleteSslProtocol a {@link java.lang.Boolean} object
   */
  public void setObsoleteSslProtocol(Boolean obsoleteSslProtocol) {
    this.obsoleteSslProtocol = obsoleteSslProtocol;
  }

  /**
   * True if the connection is using an obsolete SSL key exchange.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getObsoleteSslKeyExchange() {
    return obsoleteSslKeyExchange;
  }

  /**
   * True if the connection is using an obsolete SSL key exchange.
   *
   * @param obsoleteSslKeyExchange a {@link java.lang.Boolean} object
   */
  public void setObsoleteSslKeyExchange(Boolean obsoleteSslKeyExchange) {
    this.obsoleteSslKeyExchange = obsoleteSslKeyExchange;
  }

  /**
   * True if the connection is using an obsolete SSL cipher.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getObsoleteSslCipher() {
    return obsoleteSslCipher;
  }

  /**
   * True if the connection is using an obsolete SSL cipher.
   *
   * @param obsoleteSslCipher a {@link java.lang.Boolean} object
   */
  public void setObsoleteSslCipher(Boolean obsoleteSslCipher) {
    this.obsoleteSslCipher = obsoleteSslCipher;
  }

  /**
   * True if the connection is using an obsolete SSL signature.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getObsoleteSslSignature() {
    return obsoleteSslSignature;
  }

  /**
   * True if the connection is using an obsolete SSL signature.
   *
   * @param obsoleteSslSignature a {@link java.lang.Boolean} object
   */
  public void setObsoleteSslSignature(Boolean obsoleteSslSignature) {
    this.obsoleteSslSignature = obsoleteSslSignature;
  }
}
