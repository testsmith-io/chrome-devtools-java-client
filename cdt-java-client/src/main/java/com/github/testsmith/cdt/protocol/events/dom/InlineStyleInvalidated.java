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
import java.util.List;

/**
 * Fired when `Element`'s inline style is modified via a CSS property modification.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class InlineStyleInvalidated {

  private List<Integer> nodeIds;

  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getNodeIds() {
    return nodeIds;
  }

  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   *
   * @param nodeIds a {@link java.util.List} object
   */
  public void setNodeIds(List<Integer> nodeIds) {
    this.nodeIds = nodeIds;
  }
}
