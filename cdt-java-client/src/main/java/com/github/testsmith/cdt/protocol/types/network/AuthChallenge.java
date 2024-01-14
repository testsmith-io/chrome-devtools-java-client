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

/**
 * Authorization challenge for HTTP status code 401 or 407.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class AuthChallenge {

  @Optional private AuthChallengeSource source;

  private String origin;

  private String scheme;

  private String realm;

  /**
   * Source of the authentication challenge.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.AuthChallengeSource} object
   */
  public AuthChallengeSource getSource() {
    return source;
  }

  /**
   * Source of the authentication challenge.
   *
   * @param source a {@link com.github.testsmith.cdt.protocol.types.network.AuthChallengeSource}
   *     object
   */
  public void setSource(AuthChallengeSource source) {
    this.source = source;
  }

  /**
   * Origin of the challenger.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Origin of the challenger.
   *
   * @param origin a {@link java.lang.String} object
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * The authentication scheme used, such as basic or digest
   *
   * @return a {@link java.lang.String} object
   */
  public String getScheme() {
    return scheme;
  }

  /**
   * The authentication scheme used, such as basic or digest
   *
   * @param scheme a {@link java.lang.String} object
   */
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  /**
   * The realm of the challenge. May be empty.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRealm() {
    return realm;
  }

  /**
   * The realm of the challenge. May be empty.
   *
   * @param realm a {@link java.lang.String} object
   */
  public void setRealm(String realm) {
    this.realm = realm;
  }
}
