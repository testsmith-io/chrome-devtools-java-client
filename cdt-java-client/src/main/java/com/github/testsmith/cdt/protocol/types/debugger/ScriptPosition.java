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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;

/**
 * Location in the source code.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ScriptPosition {

  private Integer lineNumber;

  private Integer columnNumber;

  /**
   * Getter for the field <code>lineNumber</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Setter for the field <code>lineNumber</code>.
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Getter for the field <code>columnNumber</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Setter for the field <code>columnNumber</code>.
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }
}
