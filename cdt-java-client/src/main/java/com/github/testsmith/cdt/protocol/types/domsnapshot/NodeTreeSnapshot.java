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
import java.util.List;

/**
 * Table containing nodes.
 *
 * @author roy
 * @version $Id: $Id
 */
public class NodeTreeSnapshot {

  @Optional private List<Integer> parentIndex;

  @Optional private List<Integer> nodeType;

  @Optional private List<Integer> nodeName;

  @Optional private List<Integer> nodeValue;

  @Optional private List<Integer> backendNodeId;

  @Optional private List<List<Integer>> attributes;

  @Optional private RareStringData textValue;

  @Optional private RareStringData inputValue;

  @Optional private RareBooleanData inputChecked;

  @Optional private RareBooleanData optionSelected;

  @Optional private RareIntegerData contentDocumentIndex;

  @Optional private RareStringData pseudoType;

  @Optional private RareBooleanData isClickable;

  @Optional private RareStringData currentSourceURL;

  @Optional private RareStringData originURL;

  /**
   * Parent node index.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getParentIndex() {
    return parentIndex;
  }

  /**
   * Parent node index.
   *
   * @param parentIndex a {@link java.util.List} object
   */
  public void setParentIndex(List<Integer> parentIndex) {
    this.parentIndex = parentIndex;
  }

  /**
   * `Node`'s nodeType.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getNodeType() {
    return nodeType;
  }

  /**
   * `Node`'s nodeType.
   *
   * @param nodeType a {@link java.util.List} object
   */
  public void setNodeType(List<Integer> nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * `Node`'s nodeName.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getNodeName() {
    return nodeName;
  }

  /**
   * `Node`'s nodeName.
   *
   * @param nodeName a {@link java.util.List} object
   */
  public void setNodeName(List<Integer> nodeName) {
    this.nodeName = nodeName;
  }

  /**
   * `Node`'s nodeValue.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getNodeValue() {
    return nodeValue;
  }

  /**
   * `Node`'s nodeValue.
   *
   * @param nodeValue a {@link java.util.List} object
   */
  public void setNodeValue(List<Integer> nodeValue) {
    this.nodeValue = nodeValue;
  }

  /**
   * `Node`'s id, corresponds to DOM.Node.backendNodeId.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * `Node`'s id, corresponds to DOM.Node.backendNodeId.
   *
   * @param backendNodeId a {@link java.util.List} object
   */
  public void setBackendNodeId(List<Integer> backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

  /**
   * Attributes of an `Element` node. Flatten name, value pairs.
   *
   * @return a {@link java.util.List} object
   */
  public List<List<Integer>> getAttributes() {
    return attributes;
  }

  /**
   * Attributes of an `Element` node. Flatten name, value pairs.
   *
   * @param attributes a {@link java.util.List} object
   */
  public void setAttributes(List<List<Integer>> attributes) {
    this.attributes = attributes;
  }

  /**
   * Only set for textarea elements, contains the text value.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public RareStringData getTextValue() {
    return textValue;
  }

  /**
   * Only set for textarea elements, contains the text value.
   *
   * @param textValue a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData}
   *     object
   */
  public void setTextValue(RareStringData textValue) {
    this.textValue = textValue;
  }

  /**
   * Only set for input elements, contains the input's associated text value.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public RareStringData getInputValue() {
    return inputValue;
  }

  /**
   * Only set for input elements, contains the input's associated text value.
   *
   * @param inputValue a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData}
   *     object
   */
  public void setInputValue(RareStringData inputValue) {
    this.inputValue = inputValue;
  }

  /**
   * Only set for radio and checkbox input elements, indicates if the element has been checked
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public RareBooleanData getInputChecked() {
    return inputChecked;
  }

  /**
   * Only set for radio and checkbox input elements, indicates if the element has been checked
   *
   * @param inputChecked a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public void setInputChecked(RareBooleanData inputChecked) {
    this.inputChecked = inputChecked;
  }

  /**
   * Only set for option elements, indicates if the element has been selected
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public RareBooleanData getOptionSelected() {
    return optionSelected;
  }

  /**
   * Only set for option elements, indicates if the element has been selected
   *
   * @param optionSelected a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public void setOptionSelected(RareBooleanData optionSelected) {
    this.optionSelected = optionSelected;
  }

  /**
   * The index of the document in the list of the snapshot documents.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareIntegerData} object
   */
  public RareIntegerData getContentDocumentIndex() {
    return contentDocumentIndex;
  }

  /**
   * The index of the document in the list of the snapshot documents.
   *
   * @param contentDocumentIndex a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareIntegerData} object
   */
  public void setContentDocumentIndex(RareIntegerData contentDocumentIndex) {
    this.contentDocumentIndex = contentDocumentIndex;
  }

  /**
   * Type of a pseudo element node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public RareStringData getPseudoType() {
    return pseudoType;
  }

  /**
   * Type of a pseudo element node.
   *
   * @param pseudoType a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData}
   *     object
   */
  public void setPseudoType(RareStringData pseudoType) {
    this.pseudoType = pseudoType;
  }

  /**
   * Whether this DOM node responds to mouse clicks. This includes nodes that have had click event
   * listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public RareBooleanData getIsClickable() {
    return isClickable;
  }

  /**
   * Whether this DOM node responds to mouse clicks. This includes nodes that have had click event
   * listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.
   *
   * @param isClickable a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareBooleanData} object
   */
  public void setIsClickable(RareBooleanData isClickable) {
    this.isClickable = isClickable;
  }

  /**
   * The selected url for nodes with a srcset attribute.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public RareStringData getCurrentSourceURL() {
    return currentSourceURL;
  }

  /**
   * The selected url for nodes with a srcset attribute.
   *
   * @param currentSourceURL a {@link
   *     com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public void setCurrentSourceURL(RareStringData currentSourceURL) {
    this.currentSourceURL = currentSourceURL;
  }

  /**
   * The url of the script (if any) that generates this node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData} object
   */
  public RareStringData getOriginURL() {
    return originURL;
  }

  /**
   * The url of the script (if any) that generates this node.
   *
   * @param originURL a {@link com.github.testsmith.cdt.protocol.types.domsnapshot.RareStringData}
   *     object
   */
  public void setOriginURL(RareStringData originURL) {
    this.originURL = originURL;
  }
}
