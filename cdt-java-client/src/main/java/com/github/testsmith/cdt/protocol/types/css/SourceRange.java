package com.github.testsmith.cdt.protocol.types.css;

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
 * Text range within a resource. All numbers are zero-based.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SourceRange {

  private Integer startLine;

  private Integer startColumn;

  private Integer endLine;

  private Integer endColumn;

  /**
   * Start line of range.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStartLine() {
    return startLine;
  }

  /**
   * Start line of range.
   *
   * @param startLine a {@link java.lang.Integer} object
   */
  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }

  /**
   * Start column of range (inclusive).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStartColumn() {
    return startColumn;
  }

  /**
   * Start column of range (inclusive).
   *
   * @param startColumn a {@link java.lang.Integer} object
   */
  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }

  /**
   * End line of range
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEndLine() {
    return endLine;
  }

  /**
   * End line of range
   *
   * @param endLine a {@link java.lang.Integer} object
   */
  public void setEndLine(Integer endLine) {
    this.endLine = endLine;
  }

  /**
   * End column of range (exclusive).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEndColumn() {
    return endColumn;
  }

  /**
   * End column of range (exclusive).
   *
   * @param endColumn a {@link java.lang.Integer} object
   */
  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }
}
