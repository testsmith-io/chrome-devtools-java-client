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

import com.github.testsmith.cdt.protocol.types.dom.PseudoType;
import java.util.List;

/**
 * CSS rule collection for a single pseudo style.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PseudoElementMatches {

  private PseudoType pseudoType;

  private List<RuleMatch> matches;

  /**
   * Pseudo element type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.PseudoType} object
   */
  public PseudoType getPseudoType() {
    return pseudoType;
  }

  /**
   * Pseudo element type.
   *
   * @param pseudoType a {@link com.github.testsmith.cdt.protocol.types.dom.PseudoType} object
   */
  public void setPseudoType(PseudoType pseudoType) {
    this.pseudoType = pseudoType;
  }

  /**
   * Matches of CSS rules applicable to the pseudo style.
   *
   * @return a {@link java.util.List} object
   */
  public List<RuleMatch> getMatches() {
    return matches;
  }

  /**
   * Matches of CSS rules applicable to the pseudo style.
   *
   * @param matches a {@link java.util.List} object
   */
  public void setMatches(List<RuleMatch> matches) {
    this.matches = matches;
  }
}
