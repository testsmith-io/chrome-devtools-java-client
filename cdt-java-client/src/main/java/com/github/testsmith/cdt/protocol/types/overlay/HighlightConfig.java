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
 * Configuration data for the highlighting of page elements.
 *
 * @author roy
 * @version $Id: $Id
 */
public class HighlightConfig {

  @Optional private Boolean showInfo;

  @Optional private Boolean showStyles;

  @Optional private Boolean showRulers;

  @Optional private Boolean showAccessibilityInfo;

  @Optional private Boolean showExtensionLines;

  @Optional private RGBA contentColor;

  @Optional private RGBA paddingColor;

  @Optional private RGBA borderColor;

  @Optional private RGBA marginColor;

  @Optional private RGBA eventTargetColor;

  @Optional private RGBA shapeColor;

  @Optional private RGBA shapeMarginColor;

  @Optional private RGBA cssGridColor;

  @Optional private ColorFormat colorFormat;

  @Optional private GridHighlightConfig gridHighlightConfig;

  @Optional private FlexContainerHighlightConfig flexContainerHighlightConfig;

  @Optional private FlexItemHighlightConfig flexItemHighlightConfig;

  @Optional private ContrastAlgorithm contrastAlgorithm;

  /**
   * Whether the node info tooltip should be shown (default: false).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShowInfo() {
    return showInfo;
  }

  /**
   * Whether the node info tooltip should be shown (default: false).
   *
   * @param showInfo a {@link java.lang.Boolean} object
   */
  public void setShowInfo(Boolean showInfo) {
    this.showInfo = showInfo;
  }

  /**
   * Whether the node styles in the tooltip (default: false).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShowStyles() {
    return showStyles;
  }

  /**
   * Whether the node styles in the tooltip (default: false).
   *
   * @param showStyles a {@link java.lang.Boolean} object
   */
  public void setShowStyles(Boolean showStyles) {
    this.showStyles = showStyles;
  }

  /**
   * Whether the rulers should be shown (default: false).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShowRulers() {
    return showRulers;
  }

  /**
   * Whether the rulers should be shown (default: false).
   *
   * @param showRulers a {@link java.lang.Boolean} object
   */
  public void setShowRulers(Boolean showRulers) {
    this.showRulers = showRulers;
  }

  /**
   * Whether the a11y info should be shown (default: true).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShowAccessibilityInfo() {
    return showAccessibilityInfo;
  }

  /**
   * Whether the a11y info should be shown (default: true).
   *
   * @param showAccessibilityInfo a {@link java.lang.Boolean} object
   */
  public void setShowAccessibilityInfo(Boolean showAccessibilityInfo) {
    this.showAccessibilityInfo = showAccessibilityInfo;
  }

  /**
   * Whether the extension lines from node to the rulers should be shown (default: false).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShowExtensionLines() {
    return showExtensionLines;
  }

  /**
   * Whether the extension lines from node to the rulers should be shown (default: false).
   *
   * @param showExtensionLines a {@link java.lang.Boolean} object
   */
  public void setShowExtensionLines(Boolean showExtensionLines) {
    this.showExtensionLines = showExtensionLines;
  }

  /**
   * The content box highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getContentColor() {
    return contentColor;
  }

  /**
   * The content box highlight fill color (default: transparent).
   *
   * @param contentColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setContentColor(RGBA contentColor) {
    this.contentColor = contentColor;
  }

  /**
   * The padding highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getPaddingColor() {
    return paddingColor;
  }

  /**
   * The padding highlight fill color (default: transparent).
   *
   * @param paddingColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setPaddingColor(RGBA paddingColor) {
    this.paddingColor = paddingColor;
  }

  /**
   * The border highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getBorderColor() {
    return borderColor;
  }

  /**
   * The border highlight fill color (default: transparent).
   *
   * @param borderColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setBorderColor(RGBA borderColor) {
    this.borderColor = borderColor;
  }

  /**
   * The margin highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getMarginColor() {
    return marginColor;
  }

  /**
   * The margin highlight fill color (default: transparent).
   *
   * @param marginColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setMarginColor(RGBA marginColor) {
    this.marginColor = marginColor;
  }

  /**
   * The event target element highlight fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getEventTargetColor() {
    return eventTargetColor;
  }

  /**
   * The event target element highlight fill color (default: transparent).
   *
   * @param eventTargetColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setEventTargetColor(RGBA eventTargetColor) {
    this.eventTargetColor = eventTargetColor;
  }

  /**
   * The shape outside fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getShapeColor() {
    return shapeColor;
  }

  /**
   * The shape outside fill color (default: transparent).
   *
   * @param shapeColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setShapeColor(RGBA shapeColor) {
    this.shapeColor = shapeColor;
  }

  /**
   * The shape margin fill color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getShapeMarginColor() {
    return shapeMarginColor;
  }

  /**
   * The shape margin fill color (default: transparent).
   *
   * @param shapeMarginColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setShapeMarginColor(RGBA shapeMarginColor) {
    this.shapeMarginColor = shapeMarginColor;
  }

  /**
   * The grid layout color (default: transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public RGBA getCssGridColor() {
    return cssGridColor;
  }

  /**
   * The grid layout color (default: transparent).
   *
   * @param cssGridColor a {@link com.github.testsmith.cdt.protocol.types.dom.RGBA} object
   */
  public void setCssGridColor(RGBA cssGridColor) {
    this.cssGridColor = cssGridColor;
  }

  /**
   * The color format used to format color styles (default: hex).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.ColorFormat} object
   */
  public ColorFormat getColorFormat() {
    return colorFormat;
  }

  /**
   * The color format used to format color styles (default: hex).
   *
   * @param colorFormat a {@link com.github.testsmith.cdt.protocol.types.overlay.ColorFormat} object
   */
  public void setColorFormat(ColorFormat colorFormat) {
    this.colorFormat = colorFormat;
  }

  /**
   * The grid layout highlight configuration (default: all transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.GridHighlightConfig} object
   */
  public GridHighlightConfig getGridHighlightConfig() {
    return gridHighlightConfig;
  }

  /**
   * The grid layout highlight configuration (default: all transparent).
   *
   * @param gridHighlightConfig a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.GridHighlightConfig} object
   */
  public void setGridHighlightConfig(GridHighlightConfig gridHighlightConfig) {
    this.gridHighlightConfig = gridHighlightConfig;
  }

  /**
   * The flex container highlight configuration (default: all transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.FlexContainerHighlightConfig}
   *     object
   */
  public FlexContainerHighlightConfig getFlexContainerHighlightConfig() {
    return flexContainerHighlightConfig;
  }

  /**
   * The flex container highlight configuration (default: all transparent).
   *
   * @param flexContainerHighlightConfig a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.FlexContainerHighlightConfig} object
   */
  public void setFlexContainerHighlightConfig(
      FlexContainerHighlightConfig flexContainerHighlightConfig) {
    this.flexContainerHighlightConfig = flexContainerHighlightConfig;
  }

  /**
   * The flex item highlight configuration (default: all transparent).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.FlexItemHighlightConfig}
   *     object
   */
  public FlexItemHighlightConfig getFlexItemHighlightConfig() {
    return flexItemHighlightConfig;
  }

  /**
   * The flex item highlight configuration (default: all transparent).
   *
   * @param flexItemHighlightConfig a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.FlexItemHighlightConfig} object
   */
  public void setFlexItemHighlightConfig(FlexItemHighlightConfig flexItemHighlightConfig) {
    this.flexItemHighlightConfig = flexItemHighlightConfig;
  }

  /**
   * The contrast algorithm to use for the contrast ratio (default: aa).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.ContrastAlgorithm} object
   */
  public ContrastAlgorithm getContrastAlgorithm() {
    return contrastAlgorithm;
  }

  /**
   * The contrast algorithm to use for the contrast ratio (default: aa).
   *
   * @param contrastAlgorithm a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.ContrastAlgorithm} object
   */
  public void setContrastAlgorithm(ContrastAlgorithm contrastAlgorithm) {
    this.contrastAlgorithm = contrastAlgorithm;
  }
}
