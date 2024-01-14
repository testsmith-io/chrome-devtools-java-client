package com.github.testsmith.cdt.protocol.types.debugger;

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
 * BreakLocation class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BreakLocation {

  private String scriptId;

  private Integer lineNumber;

  @Optional private Integer columnNumber;

  @Optional private BreakLocationType type;

  /**
   * Script identifier as reported in the `Debugger.scriptParsed`.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * Script identifier as reported in the `Debugger.scriptParsed`.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * Line number in the script (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number in the script (0-based).
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Column number in the script (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Column number in the script (0-based).
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.BreakLocationType} object
   */
  public BreakLocationType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.debugger.BreakLocationType} object
   */
  public void setType(BreakLocationType type) {
    this.type = type;
  }
}
