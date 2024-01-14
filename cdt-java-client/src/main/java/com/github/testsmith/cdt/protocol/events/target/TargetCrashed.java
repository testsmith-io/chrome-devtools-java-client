package com.github.testsmith.cdt.protocol.events.target;

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
 * Issued when a target has crashed.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TargetCrashed {

  private String targetId;

  private String status;

  private Integer errorCode;

  /**
   * Getter for the field <code>targetId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTargetId() {
    return targetId;
  }

  /**
   * Setter for the field <code>targetId</code>.
   *
   * @param targetId a {@link java.lang.String} object
   */
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  /**
   * Termination status type.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatus() {
    return status;
  }

  /**
   * Termination status type.
   *
   * @param status a {@link java.lang.String} object
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Termination error code.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Termination error code.
   *
   * @param errorCode a {@link java.lang.Integer} object
   */
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }
}
