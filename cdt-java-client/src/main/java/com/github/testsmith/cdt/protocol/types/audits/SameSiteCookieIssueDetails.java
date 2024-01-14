package com.github.testsmith.cdt.protocol.types.audits;

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
 * This information is currently necessary, as the front-end has a difficult time finding a specific
 * cookie. With this, we can convey specific error information without the cookie.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SameSiteCookieIssueDetails {

  private AffectedCookie cookie;

  private List<SameSiteCookieWarningReason> cookieWarningReasons;

  private List<SameSiteCookieExclusionReason> cookieExclusionReasons;

  private SameSiteCookieOperation operation;

  @Optional private String siteForCookies;

  @Optional private String cookieUrl;

  @Optional private AffectedRequest request;

  /**
   * Getter for the field <code>cookie</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedCookie} object
   */
  public AffectedCookie getCookie() {
    return cookie;
  }

  /**
   * Setter for the field <code>cookie</code>.
   *
   * @param cookie a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedCookie} object
   */
  public void setCookie(AffectedCookie cookie) {
    this.cookie = cookie;
  }

  /**
   * Getter for the field <code>cookieWarningReasons</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<SameSiteCookieWarningReason> getCookieWarningReasons() {
    return cookieWarningReasons;
  }

  /**
   * Setter for the field <code>cookieWarningReasons</code>.
   *
   * @param cookieWarningReasons a {@link java.util.List} object
   */
  public void setCookieWarningReasons(List<SameSiteCookieWarningReason> cookieWarningReasons) {
    this.cookieWarningReasons = cookieWarningReasons;
  }

  /**
   * Getter for the field <code>cookieExclusionReasons</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<SameSiteCookieExclusionReason> getCookieExclusionReasons() {
    return cookieExclusionReasons;
  }

  /**
   * Setter for the field <code>cookieExclusionReasons</code>.
   *
   * @param cookieExclusionReasons a {@link java.util.List} object
   */
  public void setCookieExclusionReasons(
      List<SameSiteCookieExclusionReason> cookieExclusionReasons) {
    this.cookieExclusionReasons = cookieExclusionReasons;
  }

  /**
   * Optionally identifies the site-for-cookies and the cookie url, which may be used by the
   * front-end as additional context.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SameSiteCookieOperation} object
   */
  public SameSiteCookieOperation getOperation() {
    return operation;
  }

  /**
   * Optionally identifies the site-for-cookies and the cookie url, which may be used by the
   * front-end as additional context.
   *
   * @param operation a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.SameSiteCookieOperation} object
   */
  public void setOperation(SameSiteCookieOperation operation) {
    this.operation = operation;
  }

  /**
   * Getter for the field <code>siteForCookies</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSiteForCookies() {
    return siteForCookies;
  }

  /**
   * Setter for the field <code>siteForCookies</code>.
   *
   * @param siteForCookies a {@link java.lang.String} object
   */
  public void setSiteForCookies(String siteForCookies) {
    this.siteForCookies = siteForCookies;
  }

  /**
   * Getter for the field <code>cookieUrl</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCookieUrl() {
    return cookieUrl;
  }

  /**
   * Setter for the field <code>cookieUrl</code>.
   *
   * @param cookieUrl a {@link java.lang.String} object
   */
  public void setCookieUrl(String cookieUrl) {
    this.cookieUrl = cookieUrl;
  }

  /**
   * Getter for the field <code>request</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public AffectedRequest getRequest() {
    return request;
  }

  /**
   * Setter for the field <code>request</code>.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }
}
