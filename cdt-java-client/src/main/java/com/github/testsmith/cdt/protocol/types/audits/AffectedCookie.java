package com.github.testsmith.cdt.protocol.types.audits;

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
 * Information about a cookie that is affected by an inspector issue.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AffectedCookie {

  private String name;

  private String path;

  private String domain;

  /**
   * The following three properties uniquely identify a cookie
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * The following three properties uniquely identify a cookie
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for the field <code>path</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * Setter for the field <code>path</code>.
   *
   * @param path a {@link java.lang.String} object
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Getter for the field <code>domain</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for the field <code>domain</code>.
   *
   * @param domain a {@link java.lang.String} object
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }
}
