package com.github.testsmith.cdt.protocol.types.cachestorage;

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
 * Cache identifier.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Cache {

  private String cacheId;

  private String securityOrigin;

  private String cacheName;

  /**
   * An opaque unique id of the cache.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCacheId() {
    return cacheId;
  }

  /**
   * An opaque unique id of the cache.
   *
   * @param cacheId a {@link java.lang.String} object
   */
  public void setCacheId(String cacheId) {
    this.cacheId = cacheId;
  }

  /**
   * Security origin of the cache.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /**
   * Security origin of the cache.
   *
   * @param securityOrigin a {@link java.lang.String} object
   */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /**
   * The name of the cache.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCacheName() {
    return cacheName;
  }

  /**
   * The name of the cache.
   *
   * @param cacheName a {@link java.lang.String} object
   */
  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }
}
