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
 * ScrollSnapContainerHighlightConfig class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScrollSnapContainerHighlightConfig {

  @Optional private LineStyle snapportBorder;

  @Optional private LineStyle snapAreaBorder;

  @Optional private RGBA scrollMarginColor;

  @Optional private RGBA scrollPaddingColor;

  /**
   * The style of the snapport border (default: transparent)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getSnapportBorder() {
    return snapportBorder;
  }

  /**
   * The style of the snapport border (default: transparent)
   *
   * @param snapportBorder a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setSnapportBorder(LineStyle snapportBorder) {
    this.snapportBorder = snapportBorder;
  }

  /**
   * The style of the snap area border (default: transparent)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getSnapAreaBorder() {
    return snapAreaBorder;
  }

  /**
   * The style of the snap area border (default: transparent)
   *
   * @param snapAreaBorder a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setSnapAreaBorder(LineStyle snapAreaBorder) {
    this.snapAreaBorder = snapAreaBorder;
  }

  /**
   * The margin highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getScrollMarginColor() {
    return scrollMarginColor;
  }

  /**
   * The margin highlight fill color (default: transparent).
   *
   * @param scrollMarginColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setScrollMarginColor(RGBA scrollMarginColor) {
    this.scrollMarginColor = scrollMarginColor;
  }

  /**
   * The padding highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getScrollPaddingColor() {
    return scrollPaddingColor;
  }

  /**
   * The padding highlight fill color (default: transparent).
   *
   * @param scrollPaddingColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setScrollPaddingColor(RGBA scrollPaddingColor) {
    this.scrollPaddingColor = scrollPaddingColor;
  }
}
