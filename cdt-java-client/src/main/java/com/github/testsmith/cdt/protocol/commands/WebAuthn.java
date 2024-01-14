package com.github.testsmith.cdt.protocol.commands;

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
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.types.webauthn.Credential;
import com.github.testsmith.cdt.protocol.types.webauthn.VirtualAuthenticatorOptions;
import java.util.List;

/**
 * This domain allows configuring virtual authenticators to test the WebAuthn API.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface WebAuthn {

  /**
   * Enable the WebAuthn domain and start intercepting credential storage and retrieval with a
   * virtual authenticator.
   */
  void enable();

  /** Disable the WebAuthn domain. */
  void disable();

  /**
   * Creates and adds a virtual authenticator.
   *
   * @param options a {@link
   *     com.github.testsmith.cdt.protocol.types.webauthn.VirtualAuthenticatorOptions} object
   * @return a {@link java.lang.String} object
   */
  @Returns("authenticatorId")
  String addVirtualAuthenticator(@ParamName("options") VirtualAuthenticatorOptions options);

  /**
   * Removes the given authenticator.
   *
   * @param authenticatorId a {@link java.lang.String} object
   */
  void removeVirtualAuthenticator(@ParamName("authenticatorId") String authenticatorId);

  /**
   * Adds the credential to the specified authenticator.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @param credential a {@link com.github.testsmith.cdt.protocol.types.webauthn.Credential} object
   */
  void addCredential(
      @ParamName("authenticatorId") String authenticatorId,
      @ParamName("credential") Credential credential);

  /**
   * Returns a single credential stored in the given virtual authenticator that matches the
   * credential ID.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @param credentialId a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.webauthn.Credential} object
   */
  @Returns("credential")
  Credential getCredential(
      @ParamName("authenticatorId") String authenticatorId,
      @ParamName("credentialId") String credentialId);

  /**
   * Returns all the credentials stored in the given virtual authenticator.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @return a {@link java.util.List} object
   */
  @Returns("credentials")
  @ReturnTypeParameter(Credential.class)
  List<Credential> getCredentials(@ParamName("authenticatorId") String authenticatorId);

  /**
   * Removes a credential from the authenticator.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @param credentialId a {@link java.lang.String} object
   */
  void removeCredential(
      @ParamName("authenticatorId") String authenticatorId,
      @ParamName("credentialId") String credentialId);

  /**
   * Clears all the credentials from the specified device.
   *
   * @param authenticatorId a {@link java.lang.String} object
   */
  void clearCredentials(@ParamName("authenticatorId") String authenticatorId);

  /**
   * Sets whether User Verification succeeds or fails for an authenticator. The default is true.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @param isUserVerified a {@link java.lang.Boolean} object
   */
  void setUserVerified(
      @ParamName("authenticatorId") String authenticatorId,
      @ParamName("isUserVerified") Boolean isUserVerified);

  /**
   * Sets whether tests of user presence will succeed immediately (if true) or fail to resolve (if
   * false) for an authenticator. The default is true.
   *
   * @param authenticatorId a {@link java.lang.String} object
   * @param enabled a {@link java.lang.Boolean} object
   */
  void setAutomaticPresenceSimulation(
      @ParamName("authenticatorId") String authenticatorId, @ParamName("enabled") Boolean enabled);
}
