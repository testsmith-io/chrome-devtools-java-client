package com.github.testsmith.cdt.protocol.events.applicationcache;

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
 * ApplicationCacheStatusUpdated class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ApplicationCacheStatusUpdated {

  private String frameId;

  private String manifestURL;

  private Integer status;

  /**
   * Identifier of the frame containing document whose application cache updated status.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Identifier of the frame containing document whose application cache updated status.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

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
   * Updated application cache status.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * Updated application cache status.
   *
   * @param status a {@link java.lang.Integer} object
   */
  public void setStatus(Integer status) {
    this.status = status;
  }
}
