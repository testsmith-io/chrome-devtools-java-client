package com.github.testsmith.cdt.protocol.events.dom;

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
 * Mirrors `DOMNodeRemoved` event.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ChildNodeRemoved {

  private Integer parentNodeId;

  private Integer nodeId;

  /**
   * Parent id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getParentNodeId() {
    return parentNodeId;
  }

  /**
   * Parent id.
   *
   * @param parentNodeId a {@link java.lang.Integer} object
   */
  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /**
   * Id of the node that has been removed.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Id of the node that has been removed.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
