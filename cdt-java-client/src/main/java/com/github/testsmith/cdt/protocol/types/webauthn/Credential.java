package com.github.testsmith.cdt.protocol.types.webauthn;

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
 * Credential class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Credential {

  private String credentialId;

  private Boolean isResidentCredential;

  @Optional private String rpId;

  private String privateKey;

  @Optional private String userHandle;

  private Integer signCount;

  @Optional private String largeBlob;

  /**
   * Getter for the field <code>credentialId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialId() {
    return credentialId;
  }

  /**
   * Setter for the field <code>credentialId</code>.
   *
   * @param credentialId a {@link java.lang.String} object
   */
  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }

  /**
   * Getter for the field <code>isResidentCredential</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsResidentCredential() {
    return isResidentCredential;
  }

  /**
   * Setter for the field <code>isResidentCredential</code>.
   *
   * @param isResidentCredential a {@link java.lang.Boolean} object
   */
  public void setIsResidentCredential(Boolean isResidentCredential) {
    this.isResidentCredential = isResidentCredential;
  }

  /**
   * Relying Party ID the credential is scoped to. Must be set when adding a credential.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRpId() {
    return rpId;
  }

  /**
   * Relying Party ID the credential is scoped to. Must be set when adding a credential.
   *
   * @param rpId a {@link java.lang.String} object
   */
  public void setRpId(String rpId) {
    this.rpId = rpId;
  }

  /**
   * The ECDSA P-256 private key in PKCS#8 format. (Encoded as a base64 string when passed over
   * JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * The ECDSA P-256 private key in PKCS#8 format. (Encoded as a base64 string when passed over
   * JSON)
   *
   * @param privateKey a {@link java.lang.String} object
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  /**
   * An opaque byte sequence with a maximum size of 64 bytes mapping the credential to a specific
   * user. (Encoded as a base64 string when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserHandle() {
    return userHandle;
  }

  /**
   * An opaque byte sequence with a maximum size of 64 bytes mapping the credential to a specific
   * user. (Encoded as a base64 string when passed over JSON)
   *
   * @param userHandle a {@link java.lang.String} object
   */
  public void setUserHandle(String userHandle) {
    this.userHandle = userHandle;
  }

  /**
   * Signature counter. This is incremented by one for each successful assertion. See
   * https://w3c.github.io/webauthn/#signature-counter
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getSignCount() {
    return signCount;
  }

  /**
   * Signature counter. This is incremented by one for each successful assertion. See
   * https://w3c.github.io/webauthn/#signature-counter
   *
   * @param signCount a {@link java.lang.Integer} object
   */
  public void setSignCount(Integer signCount) {
    this.signCount = signCount;
  }

  /**
   * The large blob associated with the credential. See
   * https://w3c.github.io/webauthn/#sctn-large-blob-extension (Encoded as a base64 string when
   * passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getLargeBlob() {
    return largeBlob;
  }

  /**
   * The large blob associated with the credential. See
   * https://w3c.github.io/webauthn/#sctn-large-blob-extension (Encoded as a base64 string when
   * passed over JSON)
   *
   * @param largeBlob a {@link java.lang.String} object
   */
  public void setLargeBlob(String largeBlob) {
    this.largeBlob = largeBlob;
  }
}
