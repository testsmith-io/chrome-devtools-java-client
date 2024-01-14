package com.github.testsmith.cdt.protocol.types.layertree;

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
 * Sticky position constraints.
 *
 * @author roy
 * @version $Id: $Id
 */
public class StickyPositionConstraint {

  private Rect stickyBoxRect;

  private Rect containingBlockRect;

  @Optional private String nearestLayerShiftingStickyBox;

  @Optional private String nearestLayerShiftingContainingBlock;

  /**
   * Layout rectangle of the sticky element before being shifted
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getStickyBoxRect() {
    return stickyBoxRect;
  }

  /**
   * Layout rectangle of the sticky element before being shifted
   *
   * @param stickyBoxRect a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setStickyBoxRect(Rect stickyBoxRect) {
    this.stickyBoxRect = stickyBoxRect;
  }

  /**
   * Layout rectangle of the containing block of the sticky element
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getContainingBlockRect() {
    return containingBlockRect;
  }

  /**
   * Layout rectangle of the containing block of the sticky element
   *
   * @param containingBlockRect a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setContainingBlockRect(Rect containingBlockRect) {
    this.containingBlockRect = containingBlockRect;
  }

  /**
   * The nearest sticky layer that shifts the sticky box
   *
   * @return a {@link java.lang.String} object
   */
  public String getNearestLayerShiftingStickyBox() {
    return nearestLayerShiftingStickyBox;
  }

  /**
   * The nearest sticky layer that shifts the sticky box
   *
   * @param nearestLayerShiftingStickyBox a {@link java.lang.String} object
   */
  public void setNearestLayerShiftingStickyBox(String nearestLayerShiftingStickyBox) {
    this.nearestLayerShiftingStickyBox = nearestLayerShiftingStickyBox;
  }

  /**
   * The nearest sticky layer that shifts the containing block
   *
   * @return a {@link java.lang.String} object
   */
  public String getNearestLayerShiftingContainingBlock() {
    return nearestLayerShiftingContainingBlock;
  }

  /**
   * The nearest sticky layer that shifts the containing block
   *
   * @param nearestLayerShiftingContainingBlock a {@link java.lang.String} object
   */
  public void setNearestLayerShiftingContainingBlock(String nearestLayerShiftingContainingBlock) {
    this.nearestLayerShiftingContainingBlock = nearestLayerShiftingContainingBlock;
  }
}
