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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Security details about a request.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SecurityDetails {

  private String protocol;

  private String keyExchange;

  @Optional private String keyExchangeGroup;

  private String cipher;

  @Optional private String mac;

  private Integer certificateId;

  private String subjectName;

  private List<String> sanList;

  private String issuer;

  private Double validFrom;

  private Double validTo;

  private List<SignedCertificateTimestamp> signedCertificateTimestampList;

  private CertificateTransparencyCompliance certificateTransparencyCompliance;

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
   * Certificate ID value.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCertificateId() {
    return certificateId;
  }

  /**
   * Certificate ID value.
   *
   * @param certificateId a {@link java.lang.Integer} object
   */
  public void setCertificateId(Integer certificateId) {
    this.certificateId = certificateId;
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
   * Subject Alternative Name (SAN) DNS names and IP addresses.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getSanList() {
    return sanList;
  }

  /**
   * Subject Alternative Name (SAN) DNS names and IP addresses.
   *
   * @param sanList a {@link java.util.List} object
   */
  public void setSanList(List<String> sanList) {
    this.sanList = sanList;
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
   * List of signed certificate timestamps (SCTs).
   *
   * @return a {@link java.util.List} object
   */
  public List<SignedCertificateTimestamp> getSignedCertificateTimestampList() {
    return signedCertificateTimestampList;
  }

  /**
   * List of signed certificate timestamps (SCTs).
   *
   * @param signedCertificateTimestampList a {@link java.util.List} object
   */
  public void setSignedCertificateTimestampList(
      List<SignedCertificateTimestamp> signedCertificateTimestampList) {
    this.signedCertificateTimestampList = signedCertificateTimestampList;
  }

  /**
   * Whether the request complied with Certificate Transparency policy
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CertificateTransparencyCompliance} object
   */
  public CertificateTransparencyCompliance getCertificateTransparencyCompliance() {
    return certificateTransparencyCompliance;
  }

  /**
   * Whether the request complied with Certificate Transparency policy
   *
   * @param certificateTransparencyCompliance a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CertificateTransparencyCompliance} object
   */
  public void setCertificateTransparencyCompliance(
      CertificateTransparencyCompliance certificateTransparencyCompliance) {
    this.certificateTransparencyCompliance = certificateTransparencyCompliance;
  }
}
