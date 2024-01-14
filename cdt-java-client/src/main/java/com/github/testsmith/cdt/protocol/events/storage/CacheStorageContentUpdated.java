package com.github.testsmith.cdt.protocol.events.storage;

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
 * A cache's contents have been modified.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CacheStorageContentUpdated {

  private String origin;

  private String cacheName;

  /**
   * Origin to update.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Origin to update.
   *
   * @param origin a {@link java.lang.String} object
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Name of cache in origin.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCacheName() {
    return cacheName;
  }

  /**
   * Name of cache in origin.
   *
   * @param cacheName a {@link java.lang.String} object
   */
  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }
}
