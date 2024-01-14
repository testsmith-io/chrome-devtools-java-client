package com.github.testsmith.cdt.protocol.events.cast;

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

import com.github.testsmith.cdt.protocol.types.cast.Sink;
import java.util.List;

/**
 * This is fired whenever the list of available sinks changes. A sink is a device or a software
 * surface that you can cast to.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SinksUpdated {

  private List<Sink> sinks;

  /**
   * Getter for the field <code>sinks</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Sink> getSinks() {
    return sinks;
  }

  /**
   * Setter for the field <code>sinks</code>.
   *
   * @param sinks a {@link java.util.List} object
   */
  public void setSinks(List<Sink> sinks) {
    this.sinks = sinks;
  }
}
