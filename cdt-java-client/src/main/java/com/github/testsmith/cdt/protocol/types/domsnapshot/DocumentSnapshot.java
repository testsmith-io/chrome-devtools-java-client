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

/**
 * Document snapshot.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DocumentSnapshot {

  private Integer documentURL;

  private Integer title;

  private Integer baseURL;

  private Integer contentLanguage;

  private Integer encodingName;

  private Integer publicId;

  private Integer systemId;

  private Integer frameId;

  private NodeTreeSnapshot nodes;

  private LayoutTreeSnapshot layout;

  private TextBoxSnapshot textBoxes;

  @Optional private Double scrollOffsetX;

  @Optional private Double scrollOffsetY;

  @Optional private Double contentWidth;

  @Optional private Double contentHeight;

  /**
   * Document URL that `Document` or `FrameOwner` node points to.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDocumentURL() {
    return documentURL;
  }

  /**
   * Document URL that `Document` or `FrameOwner` node points to.
   *
   * @param documentURL a {@link java.lang.Integer} object
   */
  public void setDocumentURL(Integer documentURL) {
    this.documentURL = documentURL;
  }

  /**
   * Document title.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getTitle() {
    return title;
  }

  /**
   * Document title.
   *
   * @param title a {@link java.lang.Integer} object
   */
  public void setTitle(Integer title) {
    this.title = title;
  }

  /**
   * Base URL that `Document` or `FrameOwner` node uses for URL completion.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBaseURL() {
    return baseURL;
  }

  /**
   * Base URL that `Document` or `FrameOwner` node uses for URL completion.
   *
   * @param baseURL a {@link java.lang.Integer} object
   */
  public void setBaseURL(Integer baseURL) {
    this.baseURL = baseURL;
  }

  /**
   * Contains the document's content language.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Contains the document's content language.
   *
   * @param contentLanguage a {@link java.lang.Integer} object
   */
  public void setContentLanguage(Integer contentLanguage) {
    this.contentLanguage = contentLanguage;
  }

  /**
   * Contains the document's character set encoding.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEncodingName() {
    return encodingName;
  }

  /**
   * Contains the document's character set encoding.
   *
   * @param encodingName a {@link java.lang.Integer} object
   */
  public void setEncodingName(Integer encodingName) {
    this.encodingName = encodingName;
  }

  /**
   * `DocumentType` node's publicId.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPublicId() {
    return publicId;
  }

  /**
   * `DocumentType` node's publicId.
   *
   * @param publicId a {@link java.lang.Integer} object
   */
  public void setPublicId(Integer publicId) {
    this.publicId = publicId;
  }

  /**
   * `DocumentType` node's systemId.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getSystemId() {
    return systemId;
  }

  /**
   * `DocumentType` node's systemId.
   *
   * @param systemId a {@link java.lang.Integer} object
   */
  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  /**
   * Frame ID for frame owner elements and also for the document node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getFrameId() {
    return frameId;
  }

  /**
   * Frame ID for frame owner elements and also for the document node.
   *
   * @param frameId a {@link java.lang.Integer} object
   */
  public void setFrameId(Integer frameId) {
    this.frameId = frameId;
  }

  /**
   * A table with dom nodes.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.NodeTreeSnapshot} object
   */
  public NodeTreeSnapshot getNodes() {
    return nodes;
  }

  /**
   * A table with dom nodes.
   *
   * @param nodes a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.NodeTreeSnapshot}
   *     object
   */
  public void setNodes(NodeTreeSnapshot nodes) {
    this.nodes = nodes;
  }

  /**
   * The nodes in the layout tree.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.LayoutTreeSnapshot} object
   */
  public LayoutTreeSnapshot getLayout() {
    return layout;
  }

  /**
   * The nodes in the layout tree.
   *
   * @param layout a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.LayoutTreeSnapshot}
   *     object
   */
  public void setLayout(LayoutTreeSnapshot layout) {
    this.layout = layout;
  }

  /**
   * The post-layout inline text nodes.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.TextBoxSnapshot} object
   */
  public TextBoxSnapshot getTextBoxes() {
    return textBoxes;
  }

  /**
   * The post-layout inline text nodes.
   *
   * @param textBoxes a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.TextBoxSnapshot}
   *     object
   */
  public void setTextBoxes(TextBoxSnapshot textBoxes) {
    this.textBoxes = textBoxes;
  }

  /**
   * Horizontal scroll offset.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetX() {
    return scrollOffsetX;
  }

  /**
   * Horizontal scroll offset.
   *
   * @param scrollOffsetX a {@link java.lang.Double} object
   */
  public void setScrollOffsetX(Double scrollOffsetX) {
    this.scrollOffsetX = scrollOffsetX;
  }

  /**
   * Vertical scroll offset.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetY() {
    return scrollOffsetY;
  }

  /**
   * Vertical scroll offset.
   *
   * @param scrollOffsetY a {@link java.lang.Double} object
   */
  public void setScrollOffsetY(Double scrollOffsetY) {
    this.scrollOffsetY = scrollOffsetY;
  }

  /**
   * Document content width.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getContentWidth() {
    return contentWidth;
  }

  /**
   * Document content width.
   *
   * @param contentWidth a {@link java.lang.Double} object
   */
  public void setContentWidth(Double contentWidth) {
    this.contentWidth = contentWidth;
  }

  /**
   * Document content height.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getContentHeight() {
    return contentHeight;
  }

  /**
   * Document content height.
   *
   * @param contentHeight a {@link java.lang.Double} object
   */
  public void setContentHeight(Double contentHeight) {
    this.contentHeight = contentHeight;
  }
}
