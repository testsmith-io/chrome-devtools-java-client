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
 * A cookie which was not stored from a response with the corresponding reason.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class BlockedSetCookieWithReason {

  private List<SetCookieBlockedReason> blockedReasons;

  private String cookieLine;

  @Optional private Cookie cookie;

  /**
   * The reason(s) this cookie was blocked.
   *
   * @return a {@link java.util.List} object
   */
  public List<SetCookieBlockedReason> getBlockedReasons() {
    return blockedReasons;
  }

  /**
   * The reason(s) this cookie was blocked.
   *
   * @param blockedReasons a {@link java.util.List} object
   */
  public void setBlockedReasons(List<SetCookieBlockedReason> blockedReasons) {
    this.blockedReasons = blockedReasons;
  }

  /**
   * The string representing this individual cookie as it would appear in the header. This is not
   * the entire "cookie" or "set-cookie" header which could have multiple cookies.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCookieLine() {
    return cookieLine;
  }

  /**
   * The string representing this individual cookie as it would appear in the header. This is not
   * the entire "cookie" or "set-cookie" header which could have multiple cookies.
   *
   * @param cookieLine a {@link java.lang.String} object
   */
  public void setCookieLine(String cookieLine) {
    this.cookieLine = cookieLine;
  }

  /**
   * The cookie object which represents the cookie which was not stored. It is optional because
   * sometimes complete cookie information is not available, such as in the case of parsing errors.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Cookie} object
   */
  public Cookie getCookie() {
    return cookie;
  }

  /**
   * The cookie object which represents the cookie which was not stored. It is optional because
   * sometimes complete cookie information is not available, such as in the case of parsing errors.
   *
   * @param cookie a {@link com.github.testsmith.cdt.protocol.types.network.Cookie} object
   */
  public void setCookie(Cookie cookie) {
    this.cookie = cookie;
  }
}
