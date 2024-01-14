package com.github.testsmith.cdt.protocol.types.indexeddb;

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
 * Object store index.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ObjectStoreIndex {

  private String name;

  private KeyPath keyPath;

  private Boolean unique;

  private Boolean multiEntry;

  /**
   * Index name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Index name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Index key path.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.indexeddb.KeyPath} object
   */
  public KeyPath getKeyPath() {
    return keyPath;
  }

  /**
   * Index key path.
   *
   * @param keyPath a {@link com.github.testsmith.cdt.protocol.types.indexeddb.KeyPath} object
   */
  public void setKeyPath(KeyPath keyPath) {
    this.keyPath = keyPath;
  }

  /**
   * If true, index is unique.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUnique() {
    return unique;
  }

  /**
   * If true, index is unique.
   *
   * @param unique a {@link java.lang.Boolean} object
   */
  public void setUnique(Boolean unique) {
    this.unique = unique;
  }

  /**
   * If true, index allows multiple entries for a key.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getMultiEntry() {
    return multiEntry;
  }

  /**
   * If true, index allows multiple entries for a key.
   *
   * @param multiEntry a {@link java.lang.Boolean} object
   */
  public void setMultiEntry(Boolean multiEntry) {
    this.multiEntry = multiEntry;
  }
}
