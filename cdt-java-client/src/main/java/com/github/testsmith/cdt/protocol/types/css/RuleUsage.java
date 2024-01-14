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
 * CSS coverage information.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RuleUsage {

  private String styleSheetId;

  private Double startOffset;

  private Double endOffset;

  private Boolean used;

  /**
   * The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet
   * rules) this rule came from.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /**
   * The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet
   * rules) this rule came from.
   *
   * @param styleSheetId a {@link java.lang.String} object
   */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }

  /**
   * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getStartOffset() {
    return startOffset;
  }

  /**
   * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
   *
   * @param startOffset a {@link java.lang.Double} object
   */
  public void setStartOffset(Double startOffset) {
    this.startOffset = startOffset;
  }

  /**
   * Offset of the end of the rule body from the beginning of the stylesheet.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEndOffset() {
    return endOffset;
  }

  /**
   * Offset of the end of the rule body from the beginning of the stylesheet.
   *
   * @param endOffset a {@link java.lang.Double} object
   */
  public void setEndOffset(Double endOffset) {
    this.endOffset = endOffset;
  }

  /**
   * Indicates whether the rule was actually used by some element in the page.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUsed() {
    return used;
  }

  /**
   * Indicates whether the rule was actually used by some element in the page.
   *
   * @param used a {@link java.lang.Boolean} object
   */
  public void setUsed(Boolean used) {
    this.used = used;
  }
}
