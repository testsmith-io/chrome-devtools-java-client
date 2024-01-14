package com.github.testsmith.cdt.protocol.types.domsnapshot;

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
 * Data that is only present on rare nodes.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RareStringData {

  private List<Integer> index;

  private List<Integer> value;

  /**
   * Getter for the field <code>index</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getIndex() {
    return index;
  }

  /**
   * Setter for the field <code>index</code>.
   *
   * @param index a {@link java.util.List} object
   */
  public void setIndex(List<Integer> index) {
    this.index = index;
  }

  /**
   * Getter for the field <code>value</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getValue() {
    return value;
  }

  /**
   * Setter for the field <code>value</code>.
   *
   * @param value a {@link java.util.List} object
   */
  public void setValue(List<Integer> value) {
    this.value = value;
  }
}
