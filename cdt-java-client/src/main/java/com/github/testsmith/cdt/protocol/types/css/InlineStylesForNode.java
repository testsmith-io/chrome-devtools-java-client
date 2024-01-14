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
 * InlineStylesForNode class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InlineStylesForNode {

  @Optional private CSSStyle inlineStyle;

  @Optional private CSSStyle attributesStyle;

  /**
   * Inline style for the specified DOM node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public CSSStyle getInlineStyle() {
    return inlineStyle;
  }

  /**
   * Inline style for the specified DOM node.
   *
   * @param inlineStyle a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public void setInlineStyle(CSSStyle inlineStyle) {
    this.inlineStyle = inlineStyle;
  }

  /**
   * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public CSSStyle getAttributesStyle() {
    return attributesStyle;
  }

  /**
   * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
   *
   * @param attributesStyle a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public void setAttributesStyle(CSSStyle attributesStyle) {
    this.attributesStyle = attributesStyle;
  }
}
