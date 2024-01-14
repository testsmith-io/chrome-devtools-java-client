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
 * Configuration data for the highlighting of Flex container elements.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FlexContainerHighlightConfig {

  @Optional private LineStyle containerBorder;

  @Optional private LineStyle lineSeparator;

  @Optional private LineStyle itemSeparator;

  @Optional private BoxStyle mainDistributedSpace;

  @Optional private BoxStyle crossDistributedSpace;

  @Optional private BoxStyle rowGapSpace;

  @Optional private BoxStyle columnGapSpace;

  @Optional private LineStyle crossAlignment;

  /**
   * The style of the container border
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getContainerBorder() {
    return containerBorder;
  }

  /**
   * The style of the container border
   *
   * @param containerBorder a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setContainerBorder(LineStyle containerBorder) {
    this.containerBorder = containerBorder;
  }

  /**
   * The style of the separator between lines
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getLineSeparator() {
    return lineSeparator;
  }

  /**
   * The style of the separator between lines
   *
   * @param lineSeparator a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public void setLineSeparator(LineStyle lineSeparator) {
    this.lineSeparator = lineSeparator;
  }

  /**
   * The style of the separator between items
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getItemSeparator() {
    return itemSeparator;
  }

  /**
   * The style of the separator between items
   *
   * @param itemSeparator a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public void setItemSeparator(LineStyle itemSeparator) {
    this.itemSeparator = itemSeparator;
  }

  /**
   * Style of content-distribution space on the main axis (justify-content).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public BoxStyle getMainDistributedSpace() {
    return mainDistributedSpace;
  }

  /**
   * Style of content-distribution space on the main axis (justify-content).
   *
   * @param mainDistributedSpace a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle}
   *     object
   */
  public void setMainDistributedSpace(BoxStyle mainDistributedSpace) {
    this.mainDistributedSpace = mainDistributedSpace;
  }

  /**
   * Style of content-distribution space on the cross axis (align-content).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public BoxStyle getCrossDistributedSpace() {
    return crossDistributedSpace;
  }

  /**
   * Style of content-distribution space on the cross axis (align-content).
   *
   * @param crossDistributedSpace a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle}
   *     object
   */
  public void setCrossDistributedSpace(BoxStyle crossDistributedSpace) {
    this.crossDistributedSpace = crossDistributedSpace;
  }

  /**
   * Style of empty space caused by row gaps (gap/row-gap).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public BoxStyle getRowGapSpace() {
    return rowGapSpace;
  }

  /**
   * Style of empty space caused by row gaps (gap/row-gap).
   *
   * @param rowGapSpace a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public void setRowGapSpace(BoxStyle rowGapSpace) {
    this.rowGapSpace = rowGapSpace;
  }

  /**
   * Style of empty space caused by columns gaps (gap/column-gap).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public BoxStyle getColumnGapSpace() {
    return columnGapSpace;
  }

  /**
   * Style of empty space caused by columns gaps (gap/column-gap).
   *
   * @param columnGapSpace a {@link com.github.testsmith.cdt.protocol.types.overlay.BoxStyle} object
   */
  public void setColumnGapSpace(BoxStyle columnGapSpace) {
    this.columnGapSpace = columnGapSpace;
  }

  /**
   * Style of the self-alignment line (align-items).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle} object
   */
  public LineStyle getCrossAlignment() {
    return crossAlignment;
  }

  /**
   * Style of the self-alignment line (align-items).
   *
   * @param crossAlignment a {@link com.github.testsmith.cdt.protocol.types.overlay.LineStyle}
   *     object
   */
  public void setCrossAlignment(LineStyle crossAlignment) {
    this.crossAlignment = crossAlignment;
  }
}
