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

/**
 * NodeForLocation class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class NodeForLocation {

  private Integer backendNodeId;

  private String frameId;

  @Optional private Integer nodeId;

  /**
   * Resulting node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * Resulting node.
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

  /**
   * Frame this node belongs to.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Frame this node belongs to.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Id of the node at given coordinates, only when enabled and requested document.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Id of the node at given coordinates, only when enabled and requested document.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
