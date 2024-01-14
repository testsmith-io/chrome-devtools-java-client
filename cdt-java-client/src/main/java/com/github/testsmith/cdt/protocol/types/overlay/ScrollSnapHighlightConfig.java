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
 * ScrollSnapHighlightConfig class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScrollSnapHighlightConfig {

  private ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig;

  private Integer nodeId;

  /**
   * A descriptor for the highlight appearance of scroll snap containers.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.ScrollSnapContainerHighlightConfig} object
   */
  public ScrollSnapContainerHighlightConfig getScrollSnapContainerHighlightConfig() {
    return scrollSnapContainerHighlightConfig;
  }

  /**
   * A descriptor for the highlight appearance of scroll snap containers.
   *
   * @param scrollSnapContainerHighlightConfig a {@link
   *     com.github.testsmith.cdt.protocol.types.overlay.ScrollSnapContainerHighlightConfig} object
   */
  public void setScrollSnapContainerHighlightConfig(
      ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig) {
    this.scrollSnapContainerHighlightConfig = scrollSnapContainerHighlightConfig;
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
