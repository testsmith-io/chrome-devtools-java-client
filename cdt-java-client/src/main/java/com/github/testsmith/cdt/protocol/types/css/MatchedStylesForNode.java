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
 * MatchedStylesForNode class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class MatchedStylesForNode {

  @Optional private CSSStyle inlineStyle;

  @Optional private CSSStyle attributesStyle;

  @Optional private List<RuleMatch> matchedCSSRules;

  @Optional private List<PseudoElementMatches> pseudoElements;

  @Optional private List<InheritedStyleEntry> inherited;

  @Optional private List<CSSKeyframesRule> cssKeyframesRules;

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

  /**
   * CSS rules matching this node, from all applicable stylesheets.
   *
   * @return a {@link java.util.List} object
   */
  public List<RuleMatch> getMatchedCSSRules() {
    return matchedCSSRules;
  }

  /**
   * CSS rules matching this node, from all applicable stylesheets.
   *
   * @param matchedCSSRules a {@link java.util.List} object
   */
  public void setMatchedCSSRules(List<RuleMatch> matchedCSSRules) {
    this.matchedCSSRules = matchedCSSRules;
  }

  /**
   * Pseudo style matches for this node.
   *
   * @return a {@link java.util.List} object
   */
  public List<PseudoElementMatches> getPseudoElements() {
    return pseudoElements;
  }

  /**
   * Pseudo style matches for this node.
   *
   * @param pseudoElements a {@link java.util.List} object
   */
  public void setPseudoElements(List<PseudoElementMatches> pseudoElements) {
    this.pseudoElements = pseudoElements;
  }

  /**
   * A chain of inherited styles (from the immediate node parent up to the DOM tree root).
   *
   * @return a {@link java.util.List} object
   */
  public List<InheritedStyleEntry> getInherited() {
    return inherited;
  }

  /**
   * A chain of inherited styles (from the immediate node parent up to the DOM tree root).
   *
   * @param inherited a {@link java.util.List} object
   */
  public void setInherited(List<InheritedStyleEntry> inherited) {
    this.inherited = inherited;
  }

  /**
   * A list of CSS keyframed animations matching this node.
   *
   * @return a {@link java.util.List} object
   */
  public List<CSSKeyframesRule> getCssKeyframesRules() {
    return cssKeyframesRules;
  }

  /**
   * A list of CSS keyframed animations matching this node.
   *
   * @param cssKeyframesRules a {@link java.util.List} object
   */
  public void setCssKeyframesRules(List<CSSKeyframesRule> cssKeyframesRules) {
    this.cssKeyframesRules = cssKeyframesRules;
  }
}
