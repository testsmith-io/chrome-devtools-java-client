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

import java.util.List;

/**
 * Match data for a CSS rule.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RuleMatch {

  private CSSRule rule;

  private List<Integer> matchingSelectors;

  /**
   * CSS rule in the match.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSRule} object
   */
  public CSSRule getRule() {
    return rule;
  }

  /**
   * CSS rule in the match.
   *
   * @param rule a {@link com.github.testsmith.cdt.protocol.types.css.CSSRule} object
   */
  public void setRule(CSSRule rule) {
    this.rule = rule;
  }

  /**
   * Matching selector indices in the rule's selectorList selectors (0-based).
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getMatchingSelectors() {
    return matchingSelectors;
  }

  /**
   * Matching selector indices in the rule's selectorList selectors (0-based).
   *
   * @param matchingSelectors a {@link java.util.List} object
   */
  public void setMatchingSelectors(List<Integer> matchingSelectors) {
    this.matchingSelectors = matchingSelectors;
  }
}
