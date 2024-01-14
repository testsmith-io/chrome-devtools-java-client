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

/**
 * Backend node with a friendly name.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BackendNode {

  private Integer nodeType;

  private String nodeName;

  private Integer backendNodeId;

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
   * Getter for the field <code>backendNodeId</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * Setter for the field <code>backendNodeId</code>.
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }
}
