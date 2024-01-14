package com.github.testsmith.cdt.protocol.types.performancetimeline;

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
 * See https://github.com/WICG/LargestContentfulPaint and largest_contentful_paint.idl
 *
 * @author roy
 * @version $Id: $Id
 */
public class LargestContentfulPaint {

  private Double renderTime;

  private Double loadTime;

  private Double size;

  @Optional private String elementId;

  @Optional private String url;

  @Optional private Integer nodeId;

  /**
   * Getter for the field <code>renderTime</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getRenderTime() {
    return renderTime;
  }

  /**
   * Setter for the field <code>renderTime</code>.
   *
   * @param renderTime a {@link java.lang.Double} object
   */
  public void setRenderTime(Double renderTime) {
    this.renderTime = renderTime;
  }

  /**
   * Getter for the field <code>loadTime</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLoadTime() {
    return loadTime;
  }

  /**
   * Setter for the field <code>loadTime</code>.
   *
   * @param loadTime a {@link java.lang.Double} object
   */
  public void setLoadTime(Double loadTime) {
    this.loadTime = loadTime;
  }

  /**
   * The number of pixels being painted.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSize() {
    return size;
  }

  /**
   * The number of pixels being painted.
   *
   * @param size a {@link java.lang.Double} object
   */
  public void setSize(Double size) {
    this.size = size;
  }

  /**
   * The id attribute of the element, if available.
   *
   * @return a {@link java.lang.String} object
   */
  public String getElementId() {
    return elementId;
  }

  /**
   * The id attribute of the element, if available.
   *
   * @param elementId a {@link java.lang.String} object
   */
  public void setElementId(String elementId) {
    this.elementId = elementId;
  }

  /**
   * The URL of the image (may be trimmed).
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The URL of the image (may be trimmed).
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for the field <code>nodeId</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Setter for the field <code>nodeId</code>.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
