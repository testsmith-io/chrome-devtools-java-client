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

/**
 * Details of a signed certificate timestamp (SCT).
 *
 * @author roy
 * @version $Id: $Id
 */
public class SignedCertificateTimestamp {

  private String status;

  private String origin;

  private String logDescription;

  private String logId;

  private Double timestamp;

  private String hashAlgorithm;

  private String signatureAlgorithm;

  private String signatureData;

  /**
   * Validation status.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatus() {
    return status;
  }

  /**
   * Validation status.
   *
   * @param status a {@link java.lang.String} object
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Origin.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Origin.
   *
   * @param origin a {@link java.lang.String} object
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Log name / description.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLogDescription() {
    return logDescription;
  }

  /**
   * Log name / description.
   *
   * @param logDescription a {@link java.lang.String} object
   */
  public void setLogDescription(String logDescription) {
    this.logDescription = logDescription;
  }

  /**
   * Log ID.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLogId() {
    return logId;
  }

  /**
   * Log ID.
   *
   * @param logId a {@link java.lang.String} object
   */
  public void setLogId(String logId) {
    this.logId = logId;
  }

  /**
   * Issuance date.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Issuance date.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Hash algorithm.
   *
   * @return a {@link java.lang.String} object
   */
  public String getHashAlgorithm() {
    return hashAlgorithm;
  }

  /**
   * Hash algorithm.
   *
   * @param hashAlgorithm a {@link java.lang.String} object
   */
  public void setHashAlgorithm(String hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
  }

  /**
   * Signature algorithm.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  /**
   * Signature algorithm.
   *
   * @param signatureAlgorithm a {@link java.lang.String} object
   */
  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  /**
   * Signature data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSignatureData() {
    return signatureData;
  }

  /**
   * Signature data.
   *
   * @param signatureData a {@link java.lang.String} object
   */
  public void setSignatureData(String signatureData) {
    this.signatureData = signatureData;
  }
}
