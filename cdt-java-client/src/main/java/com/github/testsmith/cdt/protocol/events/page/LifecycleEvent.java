package com.github.testsmith.cdt.protocol.events.page;

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
 * Fired for top level page lifecycle events such as navigation, load, paint, etc.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LifecycleEvent {

  private String frameId;

  private String loaderId;

  private String name;

  private Double timestamp;

  /**
   * Id of the frame.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Id of the frame.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Loader identifier. Empty string if the request is fetched from worker.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLoaderId() {
    return loaderId;
  }

  /**
   * Loader identifier. Empty string if the request is fetched from worker.
   *
   * @param loaderId a {@link java.lang.String} object
   */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /**
   * Getter for the field <code>name</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for the field <code>name</code>.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for the field <code>timestamp</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for the field <code>timestamp</code>.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
