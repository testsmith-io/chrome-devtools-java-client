package com.github.testsmith.cdt.protocol.types.debugger;

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
import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;

/**
 * Scope description.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Scope {

  private ScopeType type;

  private RemoteObject object;

  @Optional private String name;

  @Optional private Location startLocation;

  @Optional private Location endLocation;

  /**
   * Scope type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.ScopeType} object
   */
  public ScopeType getType() {
    return type;
  }

  /**
   * Scope type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.debugger.ScopeType} object
   */
  public void setType(ScopeType type) {
    this.type = type;
  }

  /**
   * Object representing the scope. For `global` and `with` scopes it represents the actual object;
   * for the rest of the scopes, it is artificial transient object enumerating scope variables as
   * its properties.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getObject() {
    return object;
  }

  /**
   * Object representing the scope. For `global` and `with` scopes it represents the actual object;
   * for the rest of the scopes, it is artificial transient object enumerating scope variables as
   * its properties.
   *
   * @param object a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setObject(RemoteObject object) {
    this.object = object;
  }

  /**
   * Getter for the field <code>name</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for the field <code>name</code>.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Location in the source code where scope starts
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getStartLocation() {
    return startLocation;
  }

  /**
   * Location in the source code where scope starts
   *
   * @param startLocation a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public void setStartLocation(Location startLocation) {
    this.startLocation = startLocation;
  }

  /**
   * Location in the source code where scope ends
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getEndLocation() {
    return endLocation;
  }

  /**
   * Location in the source code where scope ends
   *
   * @param endLocation a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public void setEndLocation(Location endLocation) {
    this.endLocation = endLocation;
  }
}
