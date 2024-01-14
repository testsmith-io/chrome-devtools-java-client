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

/**
 * CSS keyframe rule representation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSKeyframeRule {

  @Optional private String styleSheetId;

  private StyleSheetOrigin origin;

  private Value keyText;

  private CSSStyle style;

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
   * Associated key text.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.Value} object
   */
  public Value getKeyText() {
    return keyText;
  }

  /**
   * Associated key text.
   *
   * @param keyText a {@link com.github.testsmith.cdt.protocol.types.css.Value} object
   */
  public void setKeyText(Value keyText) {
    this.keyText = keyText;
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
}
