package com.github.testsmith.cdt.protocol.types.page;

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
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;

/**
 * Information about the Resource on the page.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class FrameResource {

  private String url;

  private ResourceType type;

  private String mimeType;

  @Optional private Double lastModified;

  @Optional private Double contentSize;

  @Optional private Boolean failed;

  @Optional private Boolean canceled;

  /**
   * Resource URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Resource URL.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Type of this resource.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getType() {
    return type;
  }

  /**
   * Type of this resource.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /**
   * Resource mimeType as determined by the browser.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Resource mimeType as determined by the browser.
   *
   * @param mimeType a {@link java.lang.String} object
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * last-modified timestamp as reported by server.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLastModified() {
    return lastModified;
  }

  /**
   * last-modified timestamp as reported by server.
   *
   * @param lastModified a {@link java.lang.Double} object
   */
  public void setLastModified(Double lastModified) {
    this.lastModified = lastModified;
  }

  /**
   * Resource content size.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getContentSize() {
    return contentSize;
  }

  /**
   * Resource content size.
   *
   * @param contentSize a {@link java.lang.Double} object
   */
  public void setContentSize(Double contentSize) {
    this.contentSize = contentSize;
  }

  /**
   * True if the resource failed to load.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFailed() {
    return failed;
  }

  /**
   * True if the resource failed to load.
   *
   * @param failed a {@link java.lang.Boolean} object
   */
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  /**
   * True if the resource was canceled during loading.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCanceled() {
    return canceled;
  }

  /**
   * True if the resource was canceled during loading.
   *
   * @param canceled a {@link java.lang.Boolean} object
   */
  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }
}
