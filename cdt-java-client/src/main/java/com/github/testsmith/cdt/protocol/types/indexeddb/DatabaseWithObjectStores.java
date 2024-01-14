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
 * Database with an array of object stores.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DatabaseWithObjectStores {

  private String name;

  private Double version;

  private List<ObjectStore> objectStores;

  /**
   * Database name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Database name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Database version (type is not 'integer', as the standard requires the version number to be
   * 'unsigned long long')
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getVersion() {
    return version;
  }

  /**
   * Database version (type is not 'integer', as the standard requires the version number to be
   * 'unsigned long long')
   *
   * @param version a {@link java.lang.Double} object
   */
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   * Object stores in this database.
   *
   * @return a {@link java.util.List} object
   */
  public List<ObjectStore> getObjectStores() {
    return objectStores;
  }

  /**
   * Object stores in this database.
   *
   * @param objectStores a {@link java.util.List} object
   */
  public void setObjectStores(List<ObjectStore> objectStores) {
    this.objectStores = objectStores;
  }
}
