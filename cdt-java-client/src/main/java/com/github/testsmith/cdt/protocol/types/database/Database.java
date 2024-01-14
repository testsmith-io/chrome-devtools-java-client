package com.github.testsmith.cdt.protocol.types.database;

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
 * Database object.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Database {

  private String id;

  private String domain;

  private String name;

  private String version;

  /**
   * Database ID.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * Database ID.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Database domain.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Database domain.
   *
   * @param domain a {@link java.lang.String} object
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }

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
   * Database version.
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /**
   * Database version.
   *
   * @param version a {@link java.lang.String} object
   */
  public void setVersion(String version) {
    this.version = version;
  }
}
