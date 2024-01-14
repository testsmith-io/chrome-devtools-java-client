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
 * CSS rule representation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSRule {

  @Optional private String styleSheetId;

  private SelectorList selectorList;

  private StyleSheetOrigin origin;

  private CSSStyle style;

  @Optional private List<CSSMedia> media;

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
   * Rule selector data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SelectorList} object
   */
  public SelectorList getSelectorList() {
    return selectorList;
  }

  /**
   * Rule selector data.
   *
   * @param selectorList a {@link com.github.testsmith.cdt.protocol.types.css.SelectorList} object
   */
  public void setSelectorList(SelectorList selectorList) {
    this.selectorList = selectorList;
  }

  /**
   * Parent stylesheet's origin.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.StyleSheetOrigin} object
   */
  public StyleSheetOrigin getOrigin() {
    return origin;
  }

  /**
   * Parent stylesheet's origin.
   *
   * @param origin a {@link com.github.testsmith.cdt.protocol.types.css.StyleSheetOrigin} object
   */
  public void setOrigin(StyleSheetOrigin origin) {
    this.origin = origin;
  }

  /**
   * Associated style declaration.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public CSSStyle getStyle() {
    return style;
  }

  /**
   * Associated style declaration.
   *
   * @param style a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public void setStyle(CSSStyle style) {
    this.style = style;
  }

  /**
   * Media list array (for rules involving media queries). The array enumerates media queries
   * starting with the innermost one, going outwards.
   *
   * @return a {@link java.util.List} object
   */
  public List<CSSMedia> getMedia() {
    return media;
  }

  /**
   * Media list array (for rules involving media queries). The array enumerates media queries
   * starting with the innermost one, going outwards.
   *
   * @param media a {@link java.util.List} object
   */
  public void setMedia(List<CSSMedia> media) {
    this.media = media;
  }
}
