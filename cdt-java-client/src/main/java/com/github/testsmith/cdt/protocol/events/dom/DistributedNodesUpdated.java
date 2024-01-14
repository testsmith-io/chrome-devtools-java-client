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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.types.dom.BackendNode;
import java.util.List;

/**
 * Called when distribution is changed.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class DistributedNodesUpdated {

  private Integer insertionPointId;

  private List<BackendNode> distributedNodes;

  /**
   * Insertion point where distributed nodes were updated.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getInsertionPointId() {
    return insertionPointId;
  }

  /**
   * Insertion point where distributed nodes were updated.
   *
   * @param insertionPointId a {@link java.lang.Integer} object
   */
  public void setInsertionPointId(Integer insertionPointId) {
    this.insertionPointId = insertionPointId;
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
}
