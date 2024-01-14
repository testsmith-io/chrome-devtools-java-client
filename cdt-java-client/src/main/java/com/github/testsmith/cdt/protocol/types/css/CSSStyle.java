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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * CSS style representation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSStyle {

  @Optional private String styleSheetId;

  private List<CSSProperty> cssProperties;

  private List<ShorthandEntry> shorthandEntries;

  @Optional private String cssText;

  @Optional private SourceRange range;

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
   * CSS properties in the style.
   *
   * @return a {@link java.util.List} object
   */
  public List<CSSProperty> getCssProperties() {
    return cssProperties;
  }

  /**
   * CSS properties in the style.
   *
   * @param cssProperties a {@link java.util.List} object
   */
  public void setCssProperties(List<CSSProperty> cssProperties) {
    this.cssProperties = cssProperties;
  }

  /**
   * Computed values for all shorthands found in the style.
   *
   * @return a {@link java.util.List} object
   */
  public List<ShorthandEntry> getShorthandEntries() {
    return shorthandEntries;
  }

  /**
   * Computed values for all shorthands found in the style.
   *
   * @param shorthandEntries a {@link java.util.List} object
   */
  public void setShorthandEntries(List<ShorthandEntry> shorthandEntries) {
    this.shorthandEntries = shorthandEntries;
  }

  /**
   * Style declaration text (if available).
   *
   * @return a {@link java.lang.String} object
   */
  public String getCssText() {
    return cssText;
  }

  /**
   * Style declaration text (if available).
   *
   * @param cssText a {@link java.lang.String} object
   */
  public void setCssText(String cssText) {
    this.cssText = cssText;
  }

  /**
   * Style declaration range in the enclosing stylesheet (if available).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public SourceRange getRange() {
    return range;
  }

  /**
   * Style declaration range in the enclosing stylesheet (if available).
   *
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public void setRange(SourceRange range) {
    this.range = range;
  }
}
