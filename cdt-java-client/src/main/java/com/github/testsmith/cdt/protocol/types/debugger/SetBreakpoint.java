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

/**
 * SetBreakpoint class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SetBreakpoint {

  private String breakpointId;

  private Location actualLocation;

  /**
   * Id of the created breakpoint for further reference.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBreakpointId() {
    return breakpointId;
  }

  /**
   * Id of the created breakpoint for further reference.
   *
   * @param breakpointId a {@link java.lang.String} object
   */
  public void setBreakpointId(String breakpointId) {
    this.breakpointId = breakpointId;
  }

  /**
   * Location this breakpoint resolved into.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getActualLocation() {
    return actualLocation;
  }

  /**
   * Location this breakpoint resolved into.
   *
   * @param actualLocation a {@link com.github.testsmith.cdt.protocol.types.debugger.Location}
   *     object
   */
  public void setActualLocation(Location actualLocation) {
    this.actualLocation = actualLocation;
  }
}
