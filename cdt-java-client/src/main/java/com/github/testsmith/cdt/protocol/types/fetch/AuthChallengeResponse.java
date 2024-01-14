package com.github.testsmith.cdt.protocol.types.fetch;

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
 * Response to an AuthChallenge.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AuthChallengeResponse {

  private AuthChallengeResponseResponse response;

  @Optional private String username;

  @Optional private String password;

  /**
   * The decision on what to do in response to the authorization challenge. Default means deferring
   * to the default behavior of the net stack, which will likely either the Cancel authentication or
   * display a popup dialog box.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.fetch.AuthChallengeResponseResponse}
   *     object
   */
  public AuthChallengeResponseResponse getResponse() {
    return response;
  }

  /**
   * The decision on what to do in response to the authorization challenge. Default means deferring
   * to the default behavior of the net stack, which will likely either the Cancel authentication or
   * display a popup dialog box.
   *
   * @param response a {@link
   *     com.github.testsmith.cdt.protocol.types.fetch.AuthChallengeResponseResponse} object
   */
  public void setResponse(AuthChallengeResponseResponse response) {
    this.response = response;
  }

  /**
   * The username to provide, possibly empty. Should only be set if response is ProvideCredentials.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUsername() {
    return username;
  }

  /**
   * The username to provide, possibly empty. Should only be set if response is ProvideCredentials.
   *
   * @param username a {@link java.lang.String} object
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * The password to provide, possibly empty. Should only be set if response is ProvideCredentials.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPassword() {
    return password;
  }

  /**
   * The password to provide, possibly empty. Should only be set if response is ProvideCredentials.
   *
   * @param password a {@link java.lang.String} object
   */
  public void setPassword(String password) {
    this.password = password;
  }
}
