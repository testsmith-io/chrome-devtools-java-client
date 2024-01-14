package com.github.testsmith.cdt.protocol.types.accessibility;

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
 * A node in the accessibility tree.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AXNode {

  private String nodeId;

  private Boolean ignored;

  @Optional private List<AXProperty> ignoredReasons;

  @Optional private AXValue role;

  @Optional private AXValue name;

  @Optional private AXValue description;

  @Optional private AXValue value;

  @Optional private List<AXProperty> properties;

  @Optional private List<String> childIds;

  @Optional private Integer backendDOMNodeId;

  /**
   * Unique identifier for this node.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeId() {
    return nodeId;
  }

  /**
   * Unique identifier for this node.
   *
   * @param nodeId a {@link java.lang.String} object
   */
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * Whether this node is ignored for accessibility
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIgnored() {
    return ignored;
  }

  /**
   * Whether this node is ignored for accessibility
   *
   * @param ignored a {@link java.lang.Boolean} object
   */
  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }

  /**
   * Collection of reasons why this node is hidden.
   *
   * @return a {@link java.util.List} object
   */
  public List<AXProperty> getIgnoredReasons() {
    return ignoredReasons;
  }

  /**
   * Collection of reasons why this node is hidden.
   *
   * @param ignoredReasons a {@link java.util.List} object
   */
  public void setIgnoredReasons(List<AXProperty> ignoredReasons) {
    this.ignoredReasons = ignoredReasons;
  }

  /**
   * This `Node`'s role, whether explicit or implicit.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getRole() {
    return role;
  }

  /**
   * This `Node`'s role, whether explicit or implicit.
   *
   * @param role a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setRole(AXValue role) {
    this.role = role;
  }

  /**
   * The accessible name for this `Node`.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getName() {
    return name;
  }

  /**
   * The accessible name for this `Node`.
   *
   * @param name a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setName(AXValue name) {
    this.name = name;
  }

  /**
   * The accessible description for this `Node`.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getDescription() {
    return description;
  }

  /**
   * The accessible description for this `Node`.
   *
   * @param description a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue}
   *     object
   */
  public void setDescription(AXValue description) {
    this.description = description;
  }

  /**
   * The value for this `Node`.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getValue() {
    return value;
  }

  /**
   * The value for this `Node`.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setValue(AXValue value) {
    this.value = value;
  }

  /**
   * All other properties
   *
   * @return a {@link java.util.List} object
   */
  public List<AXProperty> getProperties() {
    return properties;
  }

  /**
   * All other properties
   *
   * @param properties a {@link java.util.List} object
   */
  public void setProperties(List<AXProperty> properties) {
    this.properties = properties;
  }

  /**
   * IDs for each of this node's child nodes.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getChildIds() {
    return childIds;
  }

  /**
   * IDs for each of this node's child nodes.
   *
   * @param childIds a {@link java.util.List} object
   */
  public void setChildIds(List<String> childIds) {
    this.childIds = childIds;
  }

  /**
   * The backend ID for the associated DOM node, if any.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendDOMNodeId() {
    return backendDOMNodeId;
  }

  /**
   * The backend ID for the associated DOM node, if any.
   *
   * @param backendDOMNodeId a {@link java.lang.Integer} object
   */
  public void setBackendDOMNodeId(Integer backendDOMNodeId) {
    this.backendDOMNodeId = backendDOMNodeId;
  }
}
