package com.github.testsmith.cdt.protocol.events.dom;

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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;

/**
 * Called when a pseudo element is removed from an element.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PseudoElementRemoved {

  private Integer parentId;

  private Integer pseudoElementId;

  /**
   * Pseudo element's parent element id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getParentId() {
    return parentId;
  }

  /**
   * Pseudo element's parent element id.
   *
   * @param parentId a {@link java.lang.Integer} object
   */
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   * The removed pseudo element id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPseudoElementId() {
    return pseudoElementId;
  }

  /**
   * The removed pseudo element id.
   *
   * @param pseudoElementId a {@link java.lang.Integer} object
   */
  public void setPseudoElementId(Integer pseudoElementId) {
    this.pseudoElementId = pseudoElementId;
  }
}
