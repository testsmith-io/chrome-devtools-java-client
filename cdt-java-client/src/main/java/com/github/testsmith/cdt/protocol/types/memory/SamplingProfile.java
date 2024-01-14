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

import java.util.List;

/**
 * Array of heap profile samples.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SamplingProfile {

  private List<SamplingProfileNode> samples;

  private List<Module> modules;

  /**
   * Getter for the field <code>samples</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<SamplingProfileNode> getSamples() {
    return samples;
  }

  /**
   * Setter for the field <code>samples</code>.
   *
   * @param samples a {@link java.util.List} object
   */
  public void setSamples(List<SamplingProfileNode> samples) {
    this.samples = samples;
  }

  /**
   * Getter for the field <code>modules</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Module> getModules() {
    return modules;
  }

  /**
   * Setter for the field <code>modules</code>.
   *
   * @param modules a {@link java.util.List} object
   */
  public void setModules(List<Module> modules) {
    this.modules = modules;
  }
}
