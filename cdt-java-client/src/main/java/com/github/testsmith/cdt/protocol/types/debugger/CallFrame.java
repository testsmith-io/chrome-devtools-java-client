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
import java.util.List;

/**
 * JavaScript call frame. Array of call frames form the call stack.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CallFrame {

  private String callFrameId;

  private String functionName;

  @Optional private Location functionLocation;

  private Location location;

  private String url;

  private List<Scope> scopeChain;

  private RemoteObject that;

  @Optional private RemoteObject returnValue;

  /**
   * Call frame identifier. This identifier is only valid while the virtual machine is paused.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCallFrameId() {
    return callFrameId;
  }

  /**
   * Call frame identifier. This identifier is only valid while the virtual machine is paused.
   *
   * @param callFrameId a {@link java.lang.String} object
   */
  public void setCallFrameId(String callFrameId) {
    this.callFrameId = callFrameId;
  }

  /**
   * Name of the JavaScript function called on this call frame.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFunctionName() {
    return functionName;
  }

  /**
   * Name of the JavaScript function called on this call frame.
   *
   * @param functionName a {@link java.lang.String} object
   */
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  /**
   * Location in the source code.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getFunctionLocation() {
    return functionLocation;
  }

  /**
   * Location in the source code.
   *
   * @param functionLocation a {@link com.github.testsmith.cdt.protocol.types.debugger.Location}
   *     object
   */
  public void setFunctionLocation(Location functionLocation) {
    this.functionLocation = functionLocation;
  }

  /**
   * Location in the source code.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Location in the source code.
   *
   * @param location a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * JavaScript script name or url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * JavaScript script name or url.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Scope chain for this call frame.
   *
   * @return a {@link java.util.List} object
   */
  public List<Scope> getScopeChain() {
    return scopeChain;
  }

  /**
   * Scope chain for this call frame.
   *
   * @param scopeChain a {@link java.util.List} object
   */
  public void setScopeChain(List<Scope> scopeChain) {
    this.scopeChain = scopeChain;
  }

  /**
   * `this` object for this call frame.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getThat() {
    return that;
  }

  /**
   * `this` object for this call frame.
   *
   * @param that a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setThat(RemoteObject that) {
    this.that = that;
  }

  /**
   * The value being returned, if the function is at return point.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getReturnValue() {
    return returnValue;
  }

  /**
   * The value being returned, if the function is at return point.
   *
   * @param returnValue a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject}
   *     object
   */
  public void setReturnValue(RemoteObject returnValue) {
    this.returnValue = returnValue;
  }
}
