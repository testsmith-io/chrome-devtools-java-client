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

import java.util.List;

/**
 * Object store.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ObjectStore {

  private String name;

  private KeyPath keyPath;

  private Boolean autoIncrement;

  private List<ObjectStoreIndex> indexes;

  /**
   * Object store name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Object store name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Object store key path.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.indexeddb.KeyPath} object
   */
  public KeyPath getKeyPath() {
    return keyPath;
  }

  /**
   * Object store key path.
   *
   * @param keyPath a {@link com.github.testsmith.cdt.protocol.types.indexeddb.KeyPath} object
   */
  public void setKeyPath(KeyPath keyPath) {
    this.keyPath = keyPath;
  }

  /**
   * If true, object store has auto increment flag set.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAutoIncrement() {
    return autoIncrement;
  }

  /**
   * If true, object store has auto increment flag set.
   *
   * @param autoIncrement a {@link java.lang.Boolean} object
   */
  public void setAutoIncrement(Boolean autoIncrement) {
    this.autoIncrement = autoIncrement;
  }

  /**
   * Indexes in this object store.
   *
   * @return a {@link java.util.List} object
   */
  public List<ObjectStoreIndex> getIndexes() {
    return indexes;
  }

  /**
   * Indexes in this object store.
   *
   * @param indexes a {@link java.util.List} object
   */
  public void setIndexes(List<ObjectStoreIndex> indexes) {
    this.indexes = indexes;
  }
}
