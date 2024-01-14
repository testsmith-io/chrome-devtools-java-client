package com.github.testsmith.cdt.protocol.types.runtime;

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
 * Object internal property descriptor. This property isn't normally visible in JavaScript code.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InternalPropertyDescriptor {

  private String name;

  @Optional private RemoteObject value;

  /**
   * Conventional property name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Conventional property name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value associated with the property.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getValue() {
    return value;
  }

  /**
   * The value associated with the property.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setValue(RemoteObject value) {
    this.value = value;
  }
}
