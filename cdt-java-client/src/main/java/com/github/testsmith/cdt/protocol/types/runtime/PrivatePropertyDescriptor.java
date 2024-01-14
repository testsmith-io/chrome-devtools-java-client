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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Object private field descriptor.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PrivatePropertyDescriptor {

  private String name;

  @Optional private RemoteObject value;

  @Optional private RemoteObject get;

  @Optional private RemoteObject set;

  /**
   * Private property name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Private property name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value associated with the private property.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getValue() {
    return value;
  }

  /**
   * The value associated with the private property.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setValue(RemoteObject value) {
    this.value = value;
  }

  /**
   * A function which serves as a getter for the private property, or `undefined` if there is no
   * getter (accessor descriptors only).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getGet() {
    return get;
  }

  /**
   * A function which serves as a getter for the private property, or `undefined` if there is no
   * getter (accessor descriptors only).
   *
   * @param get a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setGet(RemoteObject get) {
    this.get = get;
  }

  /**
   * A function which serves as a setter for the private property, or `undefined` if there is no
   * setter (accessor descriptors only).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getSet() {
    return set;
  }

  /**
   * A function which serves as a setter for the private property, or `undefined` if there is no
   * setter (accessor descriptors only).
   *
   * @param set a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setSet(RemoteObject set) {
    this.set = set;
  }
}
