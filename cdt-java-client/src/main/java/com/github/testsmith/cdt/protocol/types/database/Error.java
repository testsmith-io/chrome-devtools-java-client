package com.github.testsmith.cdt.protocol.types.database;

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
 * Database error.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Error {

  private String message;

  private Integer code;

  /**
   * Error message.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * Error message.
   *
   * @param message a {@link java.lang.String} object
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Error code.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Error code.
   *
   * @param code a {@link java.lang.Integer} object
   */
  public void setCode(Integer code) {
    this.code = code;
  }
}
