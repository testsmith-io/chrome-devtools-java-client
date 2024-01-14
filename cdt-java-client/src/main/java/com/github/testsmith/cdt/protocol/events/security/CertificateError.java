package com.github.testsmith.cdt.protocol.events.security;

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
 * There is a certificate error. If overriding certificate errors is enabled, then it should be
 * handled with the `handleCertificateError` command. Note: this event does not fire if the
 * certificate error has been allowed internally. Only one client per target should override
 * certificate errors at the same time.
 *
 * @author roy
 * @version $Id: $Id
 */
@Deprecated
public class CertificateError {

  private Integer eventId;

  private String errorType;

  private String requestURL;

  /**
   * The ID of the event.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEventId() {
    return eventId;
  }

  /**
   * The ID of the event.
   *
   * @param eventId a {@link java.lang.Integer} object
   */
  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  /**
   * The type of the error.
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorType() {
    return errorType;
  }

  /**
   * The type of the error.
   *
   * @param errorType a {@link java.lang.String} object
   */
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  /**
   * The url that was requested.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestURL() {
    return requestURL;
  }

  /**
   * The url that was requested.
   *
   * @param requestURL a {@link java.lang.String} object
   */
  public void setRequestURL(String requestURL) {
    this.requestURL = requestURL;
  }
}
