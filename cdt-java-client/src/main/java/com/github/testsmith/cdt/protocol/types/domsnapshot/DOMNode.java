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
import com.github.testsmith.cdt.protocol.types.dom.PseudoType;
import com.github.testsmith.cdt.protocol.types.dom.ShadowRootType;
import com.github.testsmith.cdt.protocol.types.domdebugger.EventListener;
import java.util.List;

/**
 * A Node in the DOM tree.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DOMNode {

  private Integer nodeType;

  private String nodeName;

  private String nodeValue;

  @Optional private String textValue;

  @Optional private String inputValue;

  @Optional private Boolean inputChecked;

  @Optional private Boolean optionSelected;

  private Integer backendNodeId;

  @Optional private List<Integer> childNodeIndexes;

  @Optional private List<NameValue> attributes;

  @Optional private List<Integer> pseudoElementIndexes;

  @Optional private Integer layoutNodeIndex;

  @Optional private String documentURL;

  @Optional private String baseURL;

  @Optional private String contentLanguage;

  @Optional private String documentEncoding;

  @Optional private String publicId;

  @Optional private String systemId;

  @Optional private String frameId;

  @Optional private Integer contentDocumentIndex;

  @Optional private PseudoType pseudoType;

  @Optional private ShadowRootType shadowRootType;

  @Optional private Boolean isClickable;

  @Optional private List<EventListener> eventListeners;

  @Optional private String currentSourceURL;

  @Optional private String originURL;

  @Optional private Double scrollOffsetX;

  @Optional private Double scrollOffsetY;

  /**
   * `Node`'s nodeType.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeType() {
    return nodeType;
  }

  /**
   * `Node`'s nodeType.
   *
   * @param nodeType a {@link java.lang.Integer} object
   */
  public void setNodeType(Integer nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * `Node`'s nodeName.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeName() {
    return nodeName;
  }

  /**
   * `Node`'s nodeName.
   *
   * @param nodeName a {@link java.lang.String} object
   */
  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  /**
   * `Node`'s nodeValue.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeValue() {
    return nodeValue;
  }

  /**
   * `Node`'s nodeValue.
   *
   * @param nodeValue a {@link java.lang.String} object
   */
  public void setNodeValue(String nodeValue) {
    this.nodeValue = nodeValue;
  }

  /**
   * Only set for textarea elements, contains the text value.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTextValue() {
    return textValue;
  }

  /**
   * Only set for textarea elements, contains the text value.
   *
   * @param textValue a {@link java.lang.String} object
   */
  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  /**
   * Only set for input elements, contains the input's associated text value.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInputValue() {
    return inputValue;
  }

  /**
   * Only set for input elements, contains the input's associated text value.
   *
   * @param inputValue a {@link java.lang.String} object
   */
  public void setInputValue(String inputValue) {
    this.inputValue = inputValue;
  }

  /**
   * Only set for radio and checkbox input elements, indicates if the element has been checked
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getInputChecked() {
    return inputChecked;
  }

  /**
   * Only set for radio and checkbox input elements, indicates if the element has been checked
   *
   * @param inputChecked a {@link java.lang.Boolean} object
   */
  public void setInputChecked(Boolean inputChecked) {
    this.inputChecked = inputChecked;
  }

  /**
   * Only set for option elements, indicates if the element has been selected
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getOptionSelected() {
    return optionSelected;
  }

  /**
   * Only set for option elements, indicates if the element has been selected
   *
   * @param optionSelected a {@link java.lang.Boolean} object
   */
  public void setOptionSelected(Boolean optionSelected) {
    this.optionSelected = optionSelected;
  }

  /**
   * `Node`'s id, corresponds to DOM.Node.backendNodeId.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * `Node`'s id, corresponds to DOM.Node.backendNodeId.
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

  /**
   * The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if
   * any.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getChildNodeIndexes() {
    return childNodeIndexes;
  }

  /**
   * The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if
   * any.
   *
   * @param childNodeIndexes a {@link java.util.List} object
   */
  public void setChildNodeIndexes(List<Integer> childNodeIndexes) {
    this.childNodeIndexes = childNodeIndexes;
  }

  /**
   * Attributes of an `Element` node.
   *
   * @return a {@link java.util.List} object
   */
  public List<NameValue> getAttributes() {
    return attributes;
  }

  /**
   * Attributes of an `Element` node.
   *
   * @param attributes a {@link java.util.List} object
   */
  public void setAttributes(List<NameValue> attributes) {
    this.attributes = attributes;
  }

  /**
   * Indexes of pseudo elements associated with this node in the `domNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getPseudoElementIndexes() {
    return pseudoElementIndexes;
  }

  /**
   * Indexes of pseudo elements associated with this node in the `domNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @param pseudoElementIndexes a {@link java.util.List} object
   */
  public void setPseudoElementIndexes(List<Integer> pseudoElementIndexes) {
    this.pseudoElementIndexes = pseudoElementIndexes;
  }

  /**
   * The index of the node's related layout tree node in the `layoutTreeNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLayoutNodeIndex() {
    return layoutNodeIndex;
  }

  /**
   * The index of the node's related layout tree node in the `layoutTreeNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @param layoutNodeIndex a {@link java.lang.Integer} object
   */
  public void setLayoutNodeIndex(Integer layoutNodeIndex) {
    this.layoutNodeIndex = layoutNodeIndex;
  }

  /**
   * Document URL that `Document` or `FrameOwner` node points to.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDocumentURL() {
    return documentURL;
  }

  /**
   * Document URL that `Document` or `FrameOwner` node points to.
   *
   * @param documentURL a {@link java.lang.String} object
   */
  public void setDocumentURL(String documentURL) {
    this.documentURL = documentURL;
  }

  /**
   * Base URL that `Document` or `FrameOwner` node uses for URL completion.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBaseURL() {
    return baseURL;
  }

  /**
   * Base URL that `Document` or `FrameOwner` node uses for URL completion.
   *
   * @param baseURL a {@link java.lang.String} object
   */
  public void setBaseURL(String baseURL) {
    this.baseURL = baseURL;
  }

  /**
   * Only set for documents, contains the document's content language.
   *
   * @return a {@link java.lang.String} object
   */
  public String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Only set for documents, contains the document's content language.
   *
   * @param contentLanguage a {@link java.lang.String} object
   */
  public void setContentLanguage(String contentLanguage) {
    this.contentLanguage = contentLanguage;
  }

  /**
   * Only set for documents, contains the document's character set encoding.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDocumentEncoding() {
    return documentEncoding;
  }

  /**
   * Only set for documents, contains the document's character set encoding.
   *
   * @param documentEncoding a {@link java.lang.String} object
   */
  public void setDocumentEncoding(String documentEncoding) {
    this.documentEncoding = documentEncoding;
  }

  /**
   * `DocumentType` node's publicId.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPublicId() {
    return publicId;
  }

  /**
   * `DocumentType` node's publicId.
   *
   * @param publicId a {@link java.lang.String} object
   */
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /**
   * `DocumentType` node's systemId.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSystemId() {
    return systemId;
  }

  /**
   * `DocumentType` node's systemId.
   *
   * @param systemId a {@link java.lang.String} object
   */
  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  /**
   * Frame ID for frame owner elements and also for the document node.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Frame ID for frame owner elements and also for the document node.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * The index of a frame owner element's content document in the `domNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getContentDocumentIndex() {
    return contentDocumentIndex;
  }

  /**
   * The index of a frame owner element's content document in the `domNodes` array returned by
   * `getSnapshot`, if any.
   *
   * @param contentDocumentIndex a {@link java.lang.Integer} object
   */
  public void setContentDocumentIndex(Integer contentDocumentIndex) {
    this.contentDocumentIndex = contentDocumentIndex;
  }

  /**
   * Type of a pseudo element node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.PseudoType} object
   */
  public PseudoType getPseudoType() {
    return pseudoType;
  }

  /**
   * Type of a pseudo element node.
   *
   * @param pseudoType a {@link com.github.testsmith.cdt.protocol.types.dom.PseudoType} object
   */
  public void setPseudoType(PseudoType pseudoType) {
    this.pseudoType = pseudoType;
  }

  /**
   * Shadow root type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.ShadowRootType} object
   */
  public ShadowRootType getShadowRootType() {
    return shadowRootType;
  }

  /**
   * Shadow root type.
   *
   * @param shadowRootType a {@link com.github.testsmith.cdt.protocol.types.dom.ShadowRootType}
   *     object
   */
  public void setShadowRootType(ShadowRootType shadowRootType) {
    this.shadowRootType = shadowRootType;
  }

  /**
   * Whether this DOM node responds to mouse clicks. This includes nodes that have had click event
   * listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsClickable() {
    return isClickable;
  }

  /**
   * Whether this DOM node responds to mouse clicks. This includes nodes that have had click event
   * listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.
   *
   * @param isClickable a {@link java.lang.Boolean} object
   */
  public void setIsClickable(Boolean isClickable) {
    this.isClickable = isClickable;
  }

  /**
   * Details of the node's event listeners, if any.
   *
   * @return a {@link java.util.List} object
   */
  public List<EventListener> getEventListeners() {
    return eventListeners;
  }

  /**
   * Details of the node's event listeners, if any.
   *
   * @param eventListeners a {@link java.util.List} object
   */
  public void setEventListeners(List<EventListener> eventListeners) {
    this.eventListeners = eventListeners;
  }

  /**
   * The selected url for nodes with a srcset attribute.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCurrentSourceURL() {
    return currentSourceURL;
  }

  /**
   * The selected url for nodes with a srcset attribute.
   *
   * @param currentSourceURL a {@link java.lang.String} object
   */
  public void setCurrentSourceURL(String currentSourceURL) {
    this.currentSourceURL = currentSourceURL;
  }

  /**
   * The url of the script (if any) that generates this node.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOriginURL() {
    return originURL;
  }

  /**
   * The url of the script (if any) that generates this node.
   *
   * @param originURL a {@link java.lang.String} object
   */
  public void setOriginURL(String originURL) {
    this.originURL = originURL;
  }

  /**
   * Scroll offsets, set when this node is a Document.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetX() {
    return scrollOffsetX;
  }

  /**
   * Scroll offsets, set when this node is a Document.
   *
   * @param scrollOffsetX a {@link java.lang.Double} object
   */
  public void setScrollOffsetX(Double scrollOffsetX) {
    this.scrollOffsetX = scrollOffsetX;
  }

  /**
   * Getter for the field <code>scrollOffsetY</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetY() {
    return scrollOffsetY;
  }

  /**
   * Setter for the field <code>scrollOffsetY</code>.
   *
   * @param scrollOffsetY a {@link java.lang.Double} object
   */
  public void setScrollOffsetY(Double scrollOffsetY) {
    this.scrollOffsetY = scrollOffsetY;
  }
}
