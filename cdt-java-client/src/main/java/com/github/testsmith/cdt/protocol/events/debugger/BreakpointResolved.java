package com.github.testsmith.cdt.protocol.events.debugger;

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

import com.github.testsmith.cdt.protocol.types.debugger.Location;

/**
 * Fired when breakpoint is resolved to an actual script and location.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BreakpointResolved {

  private String breakpointId;

  private Location location;

  /**
   * Breakpoint unique identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBreakpointId() {
    return breakpointId;
  }

  /**
   * Breakpoint unique identifier.
   *
   * @param breakpointId a {@link java.lang.String} object
   */
  public void setBreakpointId(String breakpointId) {
    this.breakpointId = breakpointId;
  }

  /**
   * Actual breakpoint location.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Actual breakpoint location.
   *
   * @param location a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public void setLocation(Location location) {
    this.location = location;
  }
}
