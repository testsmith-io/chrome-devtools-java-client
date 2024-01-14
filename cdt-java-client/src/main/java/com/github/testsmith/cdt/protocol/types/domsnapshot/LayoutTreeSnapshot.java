package com.github.testsmith.cdt.protocol.types.domsnapshot;

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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Table of details of an element in the DOM tree with a LayoutObject.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LayoutTreeSnapshot {

  private List<Integer> nodeIndex;

  private List<List<Integer>> styles;

  private List<List<Double>> bounds;

  private List<Integer> text;

  private RareBooleanData stackingContexts;

  @Optional private List<Integer> paintOrders;

  @Optional private List<List<Double>> offsetRects;

  @Optional private List<List<Double>> scrollRects;

  @Optional private List<List<Double>> clientRects;

  @Experimental @Optional private List<Integer> blendedBackgroundColors;

  @Experimental @Optional private List<Double> textColorOpacities;

  /**
   * Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getNodeIndex() {
    return nodeIndex;
  }

  /**
   * Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.
   *
   * @param nodeIndex a {@link java.util.List} object
   */
  public void setNodeIndex(List<Integer> nodeIndex) {
    this.nodeIndex = nodeIndex;
  }

  /**
   * Array of indexes specifying computed style strings, filtered according to the `computedStyles`
   * parameter passed to `captureSnapshot`.
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Integer>> getStyles() {
    return styles;
  }

  /**
   * Array of indexes specifying computed style strings, filtered according to the `computedStyles`
   * parameter passed to `captureSnapshot`.
   *
   * @param styles a {@link java.util.List} object
   */
  public void setStyles(List<List<Integer>> styles) {
    this.styles = styles;
  }

  /**
   * The absolute position bounding box.
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Double>> getBounds() {
    return bounds;
  }

  /**
   * The absolute position bounding box.
   *
   * @param bounds a {@link java.util.List} object
   */
  public void setBounds(List<List<Double>> bounds) {
    this.bounds = bounds;
  }

  /**
   * Contents of the LayoutText, if any.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getText() {
    return text;
  }

  /**
   * Contents of the LayoutText, if any.
   *
   * @param text a {@link java.util.List} object
   */
  public void setText(List<Integer> text) {
    this.text = text;
  }

  /**
   * Stacking context information.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public RareBooleanData getStackingContexts() {
    return stackingContexts;
  }

  /**
   * Stacking context information.
   *
   * @param stackingContexts a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public void setStackingContexts(RareBooleanData stackingContexts) {
    this.stackingContexts = stackingContexts;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * captureSnapshot was true.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getPaintOrders() {
    return paintOrders;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * captureSnapshot was true.
   *
   * @param paintOrders a {@link java.util.List} object
   */
  public void setPaintOrders(List<Integer> paintOrders) {
    this.paintOrders = paintOrders;
  }

  /**
   * The offset rect of nodes. Only available when includeDOMRects is set to true
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Double>> getOffsetRects() {
    return offsetRects;
  }

  /**
   * The offset rect of nodes. Only available when includeDOMRects is set to true
   *
   * @param offsetRects a {@link java.util.List} object
   */
  public void setOffsetRects(List<List<Double>> offsetRects) {
    this.offsetRects = offsetRects;
  }

  /**
   * The scroll rect of nodes. Only available when includeDOMRects is set to true
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Double>> getScrollRects() {
    return scrollRects;
  }

  /**
   * The scroll rect of nodes. Only available when includeDOMRects is set to true
   *
   * @param scrollRects a {@link java.util.List} object
   */
  public void setScrollRects(List<List<Double>> scrollRects) {
    this.scrollRects = scrollRects;
  }

  /**
   * The client rect of nodes. Only available when includeDOMRects is set to true
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Double>> getClientRects() {
    return clientRects;
  }

  /**
   * The client rect of nodes. Only available when includeDOMRects is set to true
   *
   * @param clientRects a {@link java.util.List} object
   */
  public void setClientRects(List<List<Double>> clientRects) {
    this.clientRects = clientRects;
  }

  /**
   * The list of background colors that are blended with colors of overlapping elements.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getBlendedBackgroundColors() {
    return blendedBackgroundColors;
  }

  /**
   * The list of background colors that are blended with colors of overlapping elements.
   *
   * @param blendedBackgroundColors a {@link java.util.List} object
   */
  public void setBlendedBackgroundColors(List<Integer> blendedBackgroundColors) {
    this.blendedBackgroundColors = blendedBackgroundColors;
  }

  /**
   * The list of computed text opacities.
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getTextColorOpacities() {
    return textColorOpacities;
  }

  /**
   * The list of computed text opacities.
   *
   * @param textColorOpacities a {@link java.util.List} object
   */
  public void setTextColorOpacities(List<Double> textColorOpacities) {
    this.textColorOpacities = textColorOpacities;
  }
}
