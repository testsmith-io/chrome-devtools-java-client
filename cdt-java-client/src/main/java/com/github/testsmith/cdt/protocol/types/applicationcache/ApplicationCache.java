package com.github.testsmith.cdt.protocol.types.applicationcache;

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

import java.util.List;

/**
 * Detailed application cache information.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ApplicationCache {

  private String manifestURL;

  private Double size;

  private Double creationTime;

  private Double updateTime;

  private List<ApplicationCacheResource> resources;

  /**
   * Manifest URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getManifestURL() {
    return manifestURL;
  }

  /**
   * Manifest URL.
   *
   * @param manifestURL a {@link java.lang.String} object
   */
  public void setManifestURL(String manifestURL) {
    this.manifestURL = manifestURL;
  }

  /**
   * Application cache size.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSize() {
    return size;
  }

  /**
   * Application cache size.
   *
   * @param size a {@link java.lang.Double} object
   */
  public void setSize(Double size) {
    this.size = size;
  }

  /**
   * Application cache creation time.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCreationTime() {
    return creationTime;
  }

  /**
   * Application cache creation time.
   *
   * @param creationTime a {@link java.lang.Double} object
   */
  public void setCreationTime(Double creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Application cache update time.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getUpdateTime() {
    return updateTime;
  }

  /**
   * Application cache update time.
   *
   * @param updateTime a {@link java.lang.Double} object
   */
  public void setUpdateTime(Double updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * Application cache resources.
   *
   * @return a {@link java.util.List} object
   */
  public List<ApplicationCacheResource> getResources() {
    return resources;
  }

  /**
   * Application cache resources.
   *
   * @param resources a {@link java.util.List} object
   */
  public void setResources(List<ApplicationCacheResource> resources) {
    this.resources = resources;
  }
}
