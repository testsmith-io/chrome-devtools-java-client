package com.github.testsmith.cdt.protocol.types.overlay;

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
 * Configuration data for the highlighting of Flex item elements.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FlexItemHighlightConfig {

  @Optional private BoxStyle baseSizeBox;

  @Optional private LineStyle baseSizeBorder;

  @Optional private LineStyle flexibilityArrow;

  /**
   * Style of the box representing the item's base size
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public BoxStyle getBaseSizeBox() {
    return baseSizeBox;
  }

  /**
   * Style of the box representing the item's base size
   *
   * @param baseSizeBox a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public void setBaseSizeBox(BoxStyle baseSizeBox) {
    this.baseSizeBox = baseSizeBox;
  }

  /**
   * Style of the border around the box representing the item's base size
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getBaseSizeBorder() {
    return baseSizeBorder;
  }

  /**
   * Style of the border around the box representing the item's base size
   *
   * @param baseSizeBorder a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setBaseSizeBorder(LineStyle baseSizeBorder) {
    this.baseSizeBorder = baseSizeBorder;
  }

  /**
   * Style of the arrow representing if the item grew or shrank
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getFlexibilityArrow() {
    return flexibilityArrow;
  }

  /**
   * Style of the arrow representing if the item grew or shrank
   *
   * @param flexibilityArrow a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setFlexibilityArrow(LineStyle flexibilityArrow) {
    this.flexibilityArrow = flexibilityArrow;
  }
}
