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
import com.github.testsmith.cdt.protocol.types.dom.Node;

/**
 * Called when shadow root is pushed into the element.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ShadowRootPushed {

  private Integer hostId;

  private Node root;

  /**
   * Host element id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHostId() {
    return hostId;
  }

  /**
   * Host element id.
   *
   * @param hostId a {@link java.lang.Integer} object
   */
  public void setHostId(Integer hostId) {
    this.hostId = hostId;
  }

  /**
   * Shadow root.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public Node getRoot() {
    return root;
  }

  /**
   * Shadow root.
   *
   * @param root a {@link com.github.testsmith.cdt.protocol.types.dom.Node} object
   */
  public void setRoot(Node root) {
    this.root = root;
  }
}