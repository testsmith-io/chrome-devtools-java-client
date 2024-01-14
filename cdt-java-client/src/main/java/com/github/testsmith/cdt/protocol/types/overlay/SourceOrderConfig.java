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

import com.github.testsmith.cdt.protocol.types.dom.RGBA;

/**
 * Configuration data for drawing the source order of an elements children.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SourceOrderConfig {

  private RGBA parentOutlineColor;

  private RGBA childOutlineColor;

  /**
   * the color to outline the givent element in.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getParentOutlineColor() {
    return parentOutlineColor;
  }

  /**
   * the color to outline the givent element in.
   *
   * @param parentOutlineColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setParentOutlineColor(RGBA parentOutlineColor) {
    this.parentOutlineColor = parentOutlineColor;
  }

  /**
   * the color to outline the child elements in.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getChildOutlineColor() {
    return childOutlineColor;
  }

  /**
   * the color to outline the child elements in.
   *
   * @param childOutlineColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setChildOutlineColor(RGBA childOutlineColor) {
    this.childOutlineColor = childOutlineColor;
  }
}
