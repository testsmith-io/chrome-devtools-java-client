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
 * VirtualAuthenticatorOptions class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class VirtualAuthenticatorOptions {

  private AuthenticatorProtocol protocol;

  @Optional private Ctap2Version ctap2Version;

  private AuthenticatorTransport transport;

  @Optional private Boolean hasResidentKey;

  @Optional private Boolean hasUserVerification;

  @Optional private Boolean hasLargeBlob;

  @Optional private Boolean hasCredBlob;

  @Optional private Boolean automaticPresenceSimulation;

  @Optional private Boolean isUserVerified;

  /**
   * Getter for the field <code>protocol</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webauthn.AuthenticatorProtocol} object
   */
  public AuthenticatorProtocol getProtocol() {
    return protocol;
  }

  /**
   * Setter for the field <code>protocol</code>.
   *
   * @param protocol a {@link
   *     com.github.testsmith.cdt.protocol.types.webauthn.AuthenticatorProtocol} object
   */
  public void setProtocol(AuthenticatorProtocol protocol) {
    this.protocol = protocol;
  }

  /**
   * Defaults to ctap2_0. Ignored if |protocol| == u2f.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webauthn.Ctap2Version} object
   */
  public Ctap2Version getCtap2Version() {
    return ctap2Version;
  }

  /**
   * Defaults to ctap2_0. Ignored if |protocol| == u2f.
   *
   * @param ctap2Version a {@link com.github.testsmith.cdt.protocol.types.webauthn.Ctap2Version}
   *     object
   */
  public void setCtap2Version(Ctap2Version ctap2Version) {
    this.ctap2Version = ctap2Version;
  }

  /**
   * Getter for the field <code>transport</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webauthn.AuthenticatorTransport}
   *     object
   */
  public AuthenticatorTransport getTransport() {
    return transport;
  }

  /**
   * Setter for the field <code>transport</code>.
   *
   * @param transport a {@link
   *     com.github.testsmith.cdt.protocol.types.webauthn.AuthenticatorTransport} object
   */
  public void setTransport(AuthenticatorTransport transport) {
    this.transport = transport;
  }

  /**
   * Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasResidentKey() {
    return hasResidentKey;
  }

  /**
   * Defaults to false.
   *
   * @param hasResidentKey a {@link java.lang.Boolean} object
   */
  public void setHasResidentKey(Boolean hasResidentKey) {
    this.hasResidentKey = hasResidentKey;
  }

  /**
   * Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasUserVerification() {
    return hasUserVerification;
  }

  /**
   * Defaults to false.
   *
   * @param hasUserVerification a {@link java.lang.Boolean} object
   */
  public void setHasUserVerification(Boolean hasUserVerification) {
    this.hasUserVerification = hasUserVerification;
  }

  /**
   * If set to true, the authenticator will support the largeBlob extension.
   * https://w3c.github.io/webauthn#largeBlob Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasLargeBlob() {
    return hasLargeBlob;
  }

  /**
   * If set to true, the authenticator will support the largeBlob extension.
   * https://w3c.github.io/webauthn#largeBlob Defaults to false.
   *
   * @param hasLargeBlob a {@link java.lang.Boolean} object
   */
  public void setHasLargeBlob(Boolean hasLargeBlob) {
    this.hasLargeBlob = hasLargeBlob;
  }

  /**
   * If set to true, the authenticator will support the credBlob extension.
   * https://fidoalliance.org/specs/fido-v2.1-rd-20201208/fido-client-to-authenticator-protocol-v2.1-rd-20201208.html#sctn-credBlob-extension
   * Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasCredBlob() {
    return hasCredBlob;
  }

  /**
   * If set to true, the authenticator will support the credBlob extension.
   * https://fidoalliance.org/specs/fido-v2.1-rd-20201208/fido-client-to-authenticator-protocol-v2.1-rd-20201208.html#sctn-credBlob-extension
   * Defaults to false.
   *
   * @param hasCredBlob a {@link java.lang.Boolean} object
   */
  public void setHasCredBlob(Boolean hasCredBlob) {
    this.hasCredBlob = hasCredBlob;
  }

  /**
   * If set to true, tests of user presence will succeed immediately. Otherwise, they will not be
   * resolved. Defaults to true.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAutomaticPresenceSimulation() {
    return automaticPresenceSimulation;
  }

  /**
   * If set to true, tests of user presence will succeed immediately. Otherwise, they will not be
   * resolved. Defaults to true.
   *
   * @param automaticPresenceSimulation a {@link java.lang.Boolean} object
   */
  public void setAutomaticPresenceSimulation(Boolean automaticPresenceSimulation) {
    this.automaticPresenceSimulation = automaticPresenceSimulation;
  }

  /**
   * Sets whether User Verification succeeds or fails for an authenticator. Defaults to false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsUserVerified() {
    return isUserVerified;
  }

  /**
   * Sets whether User Verification succeeds or fails for an authenticator. Defaults to false.
   *
   * @param isUserVerified a {@link java.lang.Boolean} object
   */
  public void setIsUserVerified(Boolean isUserVerified) {
    this.isUserVerified = isUserVerified;
  }
}
