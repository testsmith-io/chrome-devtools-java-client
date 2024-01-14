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
 * The origin's IndexedDB object store has been modified.
 *
 * @author roy
 * @version $Id: $Id
 */
public class IndexedDBContentUpdated {

  private String origin;

  private String databaseName;

  private String objectStoreName;

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
   * Database to update.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Database to update.
   *
   * @param databaseName a {@link java.lang.String} object
   */
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * ObjectStore to update.
   *
   * @return a {@link java.lang.String} object
   */
  public String getObjectStoreName() {
    return objectStoreName;
  }

  /**
   * ObjectStore to update.
   *
   * @param objectStoreName a {@link java.lang.String} object
   */
  public void setObjectStoreName(String objectStoreName) {
    this.objectStoreName = objectStoreName;
  }
}
