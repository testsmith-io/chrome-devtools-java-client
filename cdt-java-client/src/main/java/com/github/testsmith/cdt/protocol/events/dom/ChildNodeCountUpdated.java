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
 * Fired when `Container`'s child node count has changed.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ChildNodeCountUpdated {

  private Integer nodeId;

  private Integer childNodeCount;

  /**
   * Id of the node that has changed.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Id of the node that has changed.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * New node count.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getChildNodeCount() {
    return childNodeCount;
  }

  /**
   * New node count.
   *
   * @param childNodeCount a {@link java.lang.Integer} object
   */
  public void setChildNodeCount(Integer childNodeCount) {
    this.childNodeCount = childNodeCount;
  }
}
