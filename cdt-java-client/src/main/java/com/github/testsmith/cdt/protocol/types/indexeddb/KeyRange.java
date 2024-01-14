package com.github.testsmith.cdt.protocol.types.indexeddb;

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

/**
 * Key range.
 *
 * @author roy
 * @version $Id: $Id
 */
public class KeyRange {

  @Optional private Key lower;

  @Optional private Key upper;

  private Boolean lowerOpen;

  private Boolean upperOpen;

  /**
   * Lower bound.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.indexeddb.Key} object
   */
  public Key getLower() {
    return lower;
  }

  /**
   * Lower bound.
   *
   * @param lower a {@link com.github.testsmith.cdt.protocol.types.indexeddb.Key} object
   */
  public void setLower(Key lower) {
    this.lower = lower;
  }

  /**
   * Upper bound.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.indexeddb.Key} object
   */
  public Key getUpper() {
    return upper;
  }

  /**
   * Upper bound.
   *
   * @param upper a {@link com.github.testsmith.cdt.protocol.types.indexeddb.Key} object
   */
  public void setUpper(Key upper) {
    this.upper = upper;
  }

  /**
   * If true lower bound is open.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getLowerOpen() {
    return lowerOpen;
  }

  /**
   * If true lower bound is open.
   *
   * @param lowerOpen a {@link java.lang.Boolean} object
   */
  public void setLowerOpen(Boolean lowerOpen) {
    this.lowerOpen = lowerOpen;
  }

  /**
   * If true upper bound is open.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUpperOpen() {
    return upperOpen;
  }

  /**
   * If true upper bound is open.
   *
   * @param upperOpen a {@link java.lang.Boolean} object
   */
  public void setUpperOpen(Boolean upperOpen) {
    this.upperOpen = upperOpen;
  }
}
