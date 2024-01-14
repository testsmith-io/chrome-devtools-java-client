package com.github.testsmith.cdt.protocol.events.runtime;

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
 * Issued when unhandled exception was revoked.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExceptionRevoked {

  private String reason;

  private Integer exceptionId;

  /**
   * Reason describing why exception was revoked.
   *
   * @return a {@link java.lang.String} object
   */
  public String getReason() {
    return reason;
  }

  /**
   * Reason describing why exception was revoked.
   *
   * @param reason a {@link java.lang.String} object
   */
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The id of revoked exception, as reported in `exceptionThrown`.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExceptionId() {
    return exceptionId;
  }

  /**
   * The id of revoked exception, as reported in `exceptionThrown`.
   *
   * @param exceptionId a {@link java.lang.Integer} object
   */
  public void setExceptionId(Integer exceptionId) {
    this.exceptionId = exceptionId;
  }
}
