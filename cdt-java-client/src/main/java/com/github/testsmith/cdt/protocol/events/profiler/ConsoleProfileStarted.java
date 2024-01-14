package com.github.testsmith.cdt.protocol.events.profiler;

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
import com.github.testsmith.cdt.protocol.types.debugger.Location;

/**
 * Sent when new profile recording is started using console.profile() call.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ConsoleProfileStarted {

  private String id;

  private Location location;

  @Optional private String title;

  /**
   * Getter for the field <code>id</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * Setter for the field <code>id</code>.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Location of console.profile().
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Location of console.profile().
   *
   * @param location a {@link com.github.testsmith.cdt.protocol.types.debugger.Location} object
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Profile title passed as an argument to console.profile().
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Profile title passed as an argument to console.profile().
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }
}
