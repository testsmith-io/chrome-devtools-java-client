package com.github.testsmith.cdt.protocol.types.schema;

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
 * Description of the protocol domain.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Domain {

  private String name;

  private String version;

  /**
   * Domain name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Domain name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Domain version.
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /**
   * Domain version.
   *
   * @param version a {@link java.lang.String} object
   */
  public void setVersion(String version) {
    this.version = version;
  }
}
