package com.github.testsmith.cdt.protocol.types.page;

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
 * Error while paring app manifest.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AppManifestError {

  private String message;

  private Integer critical;

  private Integer line;

  private Integer column;

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
   * If criticial, this is a non-recoverable parse error.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCritical() {
    return critical;
  }

  /**
   * If criticial, this is a non-recoverable parse error.
   *
   * @param critical a {@link java.lang.Integer} object
   */
  public void setCritical(Integer critical) {
    this.critical = critical;
  }

  /**
   * Error line.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLine() {
    return line;
  }

  /**
   * Error line.
   *
   * @param line a {@link java.lang.Integer} object
   */
  public void setLine(Integer line) {
    this.line = line;
  }

  /**
   * Error column.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumn() {
    return column;
  }

  /**
   * Error column.
   *
   * @param column a {@link java.lang.Integer} object
   */
  public void setColumn(Integer column) {
    this.column = column;
  }
}
