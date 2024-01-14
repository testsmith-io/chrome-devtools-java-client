package com.github.testsmith.cdt.protocol.types.performancetimeline;

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
import com.github.testsmith.cdt.protocol.types.dom.Rect;

/**
 * LayoutShiftAttribution class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LayoutShiftAttribution {

  private Rect previousRect;

  private Rect currentRect;

  @Optional private Integer nodeId;

  /**
   * Getter for the field <code>previousRect</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getPreviousRect() {
    return previousRect;
  }

  /**
   * Setter for the field <code>previousRect</code>.
   *
   * @param previousRect a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setPreviousRect(Rect previousRect) {
    this.previousRect = previousRect;
  }

  /**
   * Getter for the field <code>currentRect</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getCurrentRect() {
    return currentRect;
  }

  /**
   * Setter for the field <code>currentRect</code>.
   *
   * @param currentRect a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setCurrentRect(Rect currentRect) {
    this.currentRect = currentRect;
  }

  /**
   * Getter for the field <code>nodeId</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Setter for the field <code>nodeId</code>.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
