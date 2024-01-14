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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.dom.Rect;
import java.util.List;

/**
 * Details of an element in the DOM tree with a LayoutObject.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LayoutTreeNode {

  private Integer domNodeIndex;

  private Rect boundingBox;

  @Optional private String layoutText;

  @Optional private List<InlineTextBox> inlineTextNodes;

  @Optional private Integer styleIndex;

  @Optional private Integer paintOrder;

  @Optional private Boolean isStackingContext;

  /**
   * The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDomNodeIndex() {
    return domNodeIndex;
  }

  /**
   * The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.
   *
   * @param domNodeIndex a {@link java.lang.Integer} object
   */
  public void setDomNodeIndex(Integer domNodeIndex) {
    this.domNodeIndex = domNodeIndex;
  }

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   *
   * @param boundingBox a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setBoundingBox(Rect boundingBox) {
    this.boundingBox = boundingBox;
  }

  /**
   * Contents of the LayoutText, if any.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLayoutText() {
    return layoutText;
  }

  /**
   * Contents of the LayoutText, if any.
   *
   * @param layoutText a {@link java.lang.String} object
   */
  public void setLayoutText(String layoutText) {
    this.layoutText = layoutText;
  }

  /**
   * The post-layout inline text nodes, if any.
   *
   * @return a {@link java.util.List} object
   */
  public List<InlineTextBox> getInlineTextNodes() {
    return inlineTextNodes;
  }

  /**
   * The post-layout inline text nodes, if any.
   *
   * @param inlineTextNodes a {@link java.util.List} object
   */
  public void setInlineTextNodes(List<InlineTextBox> inlineTextNodes) {
    this.inlineTextNodes = inlineTextNodes;
  }

  /**
   * Index into the `computedStyles` array returned by `getSnapshot`.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStyleIndex() {
    return styleIndex;
  }

  /**
   * Index into the `computedStyles` array returned by `getSnapshot`.
   *
   * @param styleIndex a {@link java.lang.Integer} object
   */
  public void setStyleIndex(Integer styleIndex) {
    this.styleIndex = styleIndex;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * getSnapshot was true.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPaintOrder() {
    return paintOrder;
  }

  /**
   * Global paint order index, which is determined by the stacking order of the nodes. Nodes that
   * are painted together will have the same index. Only provided if includePaintOrder in
   * getSnapshot was true.
   *
   * @param paintOrder a {@link java.lang.Integer} object
   */
  public void setPaintOrder(Integer paintOrder) {
    this.paintOrder = paintOrder;
  }

  /**
   * Set to true to indicate the element begins a new stacking context.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsStackingContext() {
    return isStackingContext;
  }

  /**
   * Set to true to indicate the element begins a new stacking context.
   *
   * @param isStackingContext a {@link java.lang.Boolean} object
   */
  public void setIsStackingContext(Boolean isStackingContext) {
    this.isStackingContext = isStackingContext;
  }
}
