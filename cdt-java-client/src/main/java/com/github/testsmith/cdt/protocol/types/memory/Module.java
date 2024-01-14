package com.github.testsmith.cdt.protocol.types.memory;

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
 * Executable module information
 *
 * @author roy
 * @version $Id: $Id
 */
public class Module {

  private String name;

  private String uuid;

  private String baseAddress;

  private Double size;

  /**
   * Name of the module.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the module.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * UUID of the module.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * UUID of the module.
   *
   * @param uuid a {@link java.lang.String} object
   */
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Base address where the module is loaded into memory. Encoded as a decimal or hexadecimal (0x
   * prefixed) string.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBaseAddress() {
    return baseAddress;
  }

  /**
   * Base address where the module is loaded into memory. Encoded as a decimal or hexadecimal (0x
   * prefixed) string.
   *
   * @param baseAddress a {@link java.lang.String} object
   */
  public void setBaseAddress(String baseAddress) {
    this.baseAddress = baseAddress;
  }

  /**
   * Size of the module in bytes.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSize() {
    return size;
  }

  /**
   * Size of the module in bytes.
   *
   * @param size a {@link java.lang.Double} object
   */
  public void setSize(Double size) {
    this.size = size;
  }
}
