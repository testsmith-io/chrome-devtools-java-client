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
 * Inherited CSS rule collection from ancestor node.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InheritedStyleEntry {

  @Optional private CSSStyle inlineStyle;

  private List<RuleMatch> matchedCSSRules;

  /**
   * The ancestor node's inline style, if any, in the style inheritance chain.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public CSSStyle getInlineStyle() {
    return inlineStyle;
  }

  /**
   * The ancestor node's inline style, if any, in the style inheritance chain.
   *
   * @param inlineStyle a {@link com.github.testsmith.cdt.protocol.types.css.CSSStyle} object
   */
  public void setInlineStyle(CSSStyle inlineStyle) {
    this.inlineStyle = inlineStyle;
  }

  /**
   * Matches of CSS rules matching the ancestor node in the style inheritance chain.
   *
   * @return a {@link java.util.List} object
   */
  public List<RuleMatch> getMatchedCSSRules() {
    return matchedCSSRules;
  }

  /**
   * Matches of CSS rules matching the ancestor node in the style inheritance chain.
   *
   * @param matchedCSSRules a {@link java.util.List} object
   */
  public void setMatchedCSSRules(List<RuleMatch> matchedCSSRules) {
    this.matchedCSSRules = matchedCSSRules;
  }
}
