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
 * Style information for drawing a line.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LineStyle {

  @Optional private RGBA color;

  @Optional private LineStylePattern pattern;

  /**
   * The color of the line (default: transparent)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getColor() {
    return color;
  }

  /**
   * The color of the line (default: transparent)
   *
   * @param color a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setColor(RGBA color) {
    this.color = color;
  }

  /**
   * The line pattern (default: solid)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStylePattern} object
   */
  public LineStylePattern getPattern() {
    return pattern;
  }

  /**
   * The line pattern (default: solid)
   *
   * @param pattern a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStylePattern}
   *     object
   */
  public void setPattern(LineStylePattern pattern) {
    this.pattern = pattern;
  }
}
