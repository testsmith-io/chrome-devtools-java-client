package com.github.testsmith.cdt.protocol.types.overlay;

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
 * FlexNodeHighlightConfig class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FlexNodeHighlightConfig {

  private FlexContainerHighlightConfig flexContainerHighlightConfig;

  private Integer nodeId;

  /**
   * A descriptor for the highlight appearance of flex containers.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.overlay.FlexContainerHighlightConfig}
   *     object
   */
  public FlexContainerHighlightConfig getFlexContainerHighlightConfig() {
    return flexContainerHighlightConfig;
  }

  /**
   * A descriptor for the highlight appearance of flex containers.
   *
   * @param flexContainerHighlightConfig a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.FlexContainerHighlightConfig} object
   */
  public void setFlexContainerHighlightConfig(
      FlexContainerHighlightConfig flexContainerHighlightConfig) {
    this.flexContainerHighlightConfig = flexContainerHighlightConfig;
  }

  /**
   * Identifier of the node to highlight.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Identifier of the node to highlight.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
