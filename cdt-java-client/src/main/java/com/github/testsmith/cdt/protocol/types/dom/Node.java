package com.github.testsmith.cdt.protocol.types.dom;

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
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes.
 * DOMNode is a base node mirror type.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Node {

  private Integer nodeId;

  @Optional private Integer parentId;

  private Integer backendNodeId;

  private Integer nodeType;

  private String nodeName;

  private String localName;

  private String nodeValue;

  @Optional private Integer childNodeCount;

  @Optional private List<Node> children;

  @Optional private List<String> attributes;

  @Optional private String documentURL;

  @Optional private String baseURL;

  @Optional private String publicId;

  @Optional private String systemId;

  @Optional private String internalSubset;

  @Optional private String xmlVersion;

  @Optional private String name;

  @Optional private String value;

  @Optional private PseudoType pseudoType;

  @Optional private ShadowRootType shadowRootType;

  @Optional private String frameId;

  @Optional private Node contentDocument;

  @Optional private List<Node> shadowRoots;

  @Optional private Node templateContent;

  @Optional private List<Node> pseudoElements;

  @Deprecated @Optional private Node importedDocument;

  @Optional private List<BackendNode> distributedNodes;

  @Optional private Boolean isSVG;

  /**
   * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend will
   * only push node with given `id` once. It is aware of all requested nodes and will only fire DOM
   * events for nodes known to the client.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend will
   * only push node with given `id` once. It is aware of all requested nodes and will only fire DOM
   * events for nodes known to the client.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * The id of the parent node if any.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getParentId() {
    return parentId;
  }

  /**
   * The id of the parent node if any.
   *
   * @param parentId a {@link java.lang.Integer} object
   */
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   * The BackendNodeId for this node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * The BackendNodeId for this node.
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

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
   * `Node`'s localName.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLocalName() {
    return localName;
  }

  /**
   * `Node`'s localName.
   *
   * @param localName a {@link java.lang.String} object
   */
  public void setLocalName(String localName) {
    this.localName = localName;
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
   * Child count for `Container` nodes.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getChildNodeCount() {
    return childNodeCount;
  }

  /**
   * Child count for `Container` nodes.
   *
   * @param childNodeCount a {@link java.lang.Integer} object
   */
  public void setChildNodeCount(Integer childNodeCount) {
    this.childNodeCount = childNodeCount;
  }

  /**
   * Child nodes of this node when requested with children.
   *
   * @return a {@link java.util.List} object
   */
  public List<Node> getChildren() {
    return children;
  }

  /**
   * Child nodes of this node when requested with children.
   *
   * @param children a {@link java.util.List} object
   */
  public void setChildren(List<Node> children) {
    this.children = children;
  }

  /**
   * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getAttributes() {
    return attributes;
  }

  /**
   * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
   *
   * @param attributes a {@link java.util.List} object
   */
  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
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
   * `DocumentType`'s publicId.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPublicId() {
    return publicId;
  }

  /**
   * `DocumentType`'s publicId.
   *
   * @param publicId a {@link java.lang.String} object
   */
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /**
   * `DocumentType`'s systemId.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSystemId() {
    return systemId;
  }

  /**
   * `DocumentType`'s systemId.
   *
   * @param systemId a {@link java.lang.String} object
   */
  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  /**
   * `DocumentType`'s internalSubset.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInternalSubset() {
    return internalSubset;
  }

  /**
   * `DocumentType`'s internalSubset.
   *
   * @param internalSubset a {@link java.lang.String} object
   */
  public void setInternalSubset(String internalSubset) {
    this.internalSubset = internalSubset;
  }

  /**
   * `Document`'s XML version in case of XML documents.
   *
   * @return a {@link java.lang.String} object
   */
  public String getXmlVersion() {
    return xmlVersion;
  }

  /**
   * `Document`'s XML version in case of XML documents.
   *
   * @param xmlVersion a {@link java.lang.String} object
   */
  public void setXmlVersion(String xmlVersion) {
    this.xmlVersion = xmlVersion;
  }

  /**
   * `Attr`'s name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * `Attr`'s name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * `Attr`'s value.
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /**
   * `Attr`'s value.
   *
   * @param value a {@link java.lang.String} object
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Pseudo element type for this node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.PseudoType} object
   */
  public PseudoType getPseudoType() {
    return pseudoType;
  }

  /**
   * Pseudo element type for this node.
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
   * Frame ID for frame owner elements.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Frame ID for frame owner elements.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Content document for frame owner elements.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public Node getContentDocument() {
    return contentDocument;
  }

  /**
   * Content document for frame owner elements.
   *
   * @param contentDocument a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public void setContentDocument(Node contentDocument) {
    this.contentDocument = contentDocument;
  }

  /**
   * Shadow root list for given element host.
   *
   * @return a {@link java.util.List} object
   */
  public List<Node> getShadowRoots() {
    return shadowRoots;
  }

  /**
   * Shadow root list for given element host.
   *
   * @param shadowRoots a {@link java.util.List} object
   */
  public void setShadowRoots(List<Node> shadowRoots) {
    this.shadowRoots = shadowRoots;
  }

  /**
   * Content document fragment for template elements.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public Node getTemplateContent() {
    return templateContent;
  }

  /**
   * Content document fragment for template elements.
   *
   * @param templateContent a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public void setTemplateContent(Node templateContent) {
    this.templateContent = templateContent;
  }

  /**
   * Pseudo elements associated with this node.
   *
   * @return a {@link java.util.List} object
   */
  public List<Node> getPseudoElements() {
    return pseudoElements;
  }

  /**
   * Pseudo elements associated with this node.
   *
   * @param pseudoElements a {@link java.util.List} object
   */
  public void setPseudoElements(List<Node> pseudoElements) {
    this.pseudoElements = pseudoElements;
  }

  /**
   * Deprecated, as the HTML Imports API has been removed (crbug.com/937746). This property used to
   * return the imported document for the HTMLImport links. The property is always undefined now.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public Node getImportedDocument() {
    return importedDocument;
  }

  /**
   * Deprecated, as the HTML Imports API has been removed (crbug.com/937746). This property used to
   * return the imported document for the HTMLImport links. The property is always undefined now.
   *
   * @param importedDocument a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public void setImportedDocument(Node importedDocument) {
    this.importedDocument = importedDocument;
  }

  /**
   * Distributed nodes for given insertion point.
   *
   * @return a {@link java.util.List} object
   */
  public List<BackendNode> getDistributedNodes() {
    return distributedNodes;
  }

  /**
   * Distributed nodes for given insertion point.
   *
   * @param distributedNodes a {@link java.util.List} object
   */
  public void setDistributedNodes(List<BackendNode> distributedNodes) {
    this.distributedNodes = distributedNodes;
  }

  /**
   * Whether the node is SVG.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsSVG() {
    return isSVG;
  }

  /**
   * Whether the node is SVG.
   *
   * @param isSVG a {@link java.lang.Boolean} object
   */
  public void setIsSVG(Boolean isSVG) {
    this.isSVG = isSVG;
  }
}
