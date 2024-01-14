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
import com.github.testsmith.cdt.protocol.types.dom.RGBA;

/**
 * Style information for drawing a box.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BoxStyle {

  @Optional private RGBA fillColor;

  @Optional private RGBA hatchColor;

  /**
   * The background color for the box (default: transparent)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getFillColor() {
    return fillColor;
  }

  /**
   * The background color for the box (default: transparent)
   *
   * @param fillColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setFillColor(RGBA fillColor) {
    this.fillColor = fillColor;
  }

  /**
   * The hatching color for the box (default: transparent)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getHatchColor() {
    return hatchColor;
  }

  /**
   * The hatching color for the box (default: transparent)
   *
   * @param hatchColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setHatchColor(RGBA hatchColor) {
    this.hatchColor = hatchColor;
  }
}
