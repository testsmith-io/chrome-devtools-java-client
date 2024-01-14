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
 * RareBooleanData class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RareBooleanData {

  private List<Integer> index;

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
}
