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

import com.github.testsmith.cdt.protocol.types.dom.Node;

/**
 * Mirrors `DOMNodeInserted` event.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ChildNodeInserted {

  private Integer parentNodeId;

  private Integer previousNodeId;

  private Node node;

  /**
   * Id of the node that has changed.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getParentNodeId() {
    return parentNodeId;
  }

  /**
   * Id of the node that has changed.
   *
   * @param parentNodeId a {@link java.lang.Integer} object
   */
  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /**
   * If of the previous siblint.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPreviousNodeId() {
    return previousNodeId;
  }

  /**
   * If of the previous siblint.
   *
   * @param previousNodeId a {@link java.lang.Integer} object
   */
  public void setPreviousNodeId(Integer previousNodeId) {
    this.previousNodeId = previousNodeId;
  }

  /**
   * Inserted node data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public Node getNode() {
    return node;
  }

  /**
   * Inserted node data.
   *
   * @param node a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public void setNode(Node node) {
    this.node = node;
  }
}
