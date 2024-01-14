package com.github.testsmith.cdt.protocol.types.css;

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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * ShorthandEntry class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ShorthandEntry {

  private String name;

  private String value;

  @Optional private Boolean important;

  /**
   * Shorthand name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Shorthand name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Shorthand value.
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /**
   * Shorthand value.
   *
   * @param value a {@link java.lang.String} object
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Whether the property has "!important" annotation (implies `false` if absent).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getImportant() {
    return important;
  }

  /**
   * Whether the property has "!important" annotation (implies `false` if absent).
   *
   * @param important a {@link java.lang.Boolean} object
   */
  public void setImportant(Boolean important) {
    this.important = important;
  }
}
