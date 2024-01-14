package com.github.testsmith.cdt.protocol.types.page;

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

import com.github.testsmith.cdt.protocol.types.dom.Rect;

/**
 * LayoutMetrics class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LayoutMetrics {

  @Deprecated private LayoutViewport layoutViewport;

  @Deprecated private VisualViewport visualViewport;

  @Deprecated private Rect contentSize;

  private LayoutViewport cssLayoutViewport;

  private VisualViewport cssVisualViewport;

  private Rect cssContentSize;

  /**
   * Deprecated metrics relating to the layout viewport. Can be in DP or in CSS pixels depending on
   * the `enable-use-zoom-for-dsf` flag. Use `cssLayoutViewport` instead.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.LayoutViewport} object
   */
  public LayoutViewport getLayoutViewport() {
    return layoutViewport;
  }

  /**
   * Deprecated metrics relating to the layout viewport. Can be in DP or in CSS pixels depending on
   * the `enable-use-zoom-for-dsf` flag. Use `cssLayoutViewport` instead.
   *
   * @param layoutViewport a {@link com.github.testsmith.cdt.protocol.types.page.LayoutViewport}
   *     object
   */
  public void setLayoutViewport(LayoutViewport layoutViewport) {
    this.layoutViewport = layoutViewport;
  }

  /**
   * Deprecated metrics relating to the visual viewport. Can be in DP or in CSS pixels depending on
   * the `enable-use-zoom-for-dsf` flag. Use `cssVisualViewport` instead.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.VisualViewport} object
   */
  public VisualViewport getVisualViewport() {
    return visualViewport;
  }

  /**
   * Deprecated metrics relating to the visual viewport. Can be in DP or in CSS pixels depending on
   * the `enable-use-zoom-for-dsf` flag. Use `cssVisualViewport` instead.
   *
   * @param visualViewport a {@link com.github.testsmith.cdt.protocol.types.page.VisualViewport}
   *     object
   */
  public void setVisualViewport(VisualViewport visualViewport) {
    this.visualViewport = visualViewport;
  }

  /**
   * Deprecated size of scrollable area. Can be in DP or in CSS pixels depending on the
   * `enable-use-zoom-for-dsf` flag. Use `cssContentSize` instead.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getContentSize() {
    return contentSize;
  }

  /**
   * Deprecated size of scrollable area. Can be in DP or in CSS pixels depending on the
   * `enable-use-zoom-for-dsf` flag. Use `cssContentSize` instead.
   *
   * @param contentSize a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setContentSize(Rect contentSize) {
    this.contentSize = contentSize;
  }

  /**
   * Metrics relating to the layout viewport in CSS pixels.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.LayoutViewport} object
   */
  public LayoutViewport getCssLayoutViewport() {
    return cssLayoutViewport;
  }

  /**
   * Metrics relating to the layout viewport in CSS pixels.
   *
   * @param cssLayoutViewport a {@link com.github.testsmith.cdt.protocol.types.page.LayoutViewport}
   *     object
   */
  public void setCssLayoutViewport(LayoutViewport cssLayoutViewport) {
    this.cssLayoutViewport = cssLayoutViewport;
  }

  /**
   * Metrics relating to the visual viewport in CSS pixels.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.VisualViewport} object
   */
  public VisualViewport getCssVisualViewport() {
    return cssVisualViewport;
  }

  /**
   * Metrics relating to the visual viewport in CSS pixels.
   *
   * @param cssVisualViewport a {@link com.github.testsmith.cdt.protocol.types.page.VisualViewport}
   *     object
   */
  public void setCssVisualViewport(VisualViewport cssVisualViewport) {
    this.cssVisualViewport = cssVisualViewport;
  }

  /**
   * Size of scrollable area in CSS pixels.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getCssContentSize() {
    return cssContentSize;
  }

  /**
   * Size of scrollable area in CSS pixels.
   *
   * @param cssContentSize a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setCssContentSize(Rect cssContentSize) {
    this.cssContentSize = cssContentSize;
  }
}
