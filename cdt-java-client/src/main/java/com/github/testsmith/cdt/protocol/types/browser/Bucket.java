package com.github.testsmith.cdt.protocol.types.browser;

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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;

/**
 * Chrome histogram bucket.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class Bucket {

  private Integer low;

  private Integer high;

  private Integer count;

  /**
   * Minimum value (inclusive).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLow() {
    return low;
  }

  /**
   * Minimum value (inclusive).
   *
   * @param low a {@link java.lang.Integer} object
   */
  public void setLow(Integer low) {
    this.low = low;
  }

  /**
   * Maximum value (exclusive).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHigh() {
    return high;
  }

  /**
   * Maximum value (exclusive).
   *
   * @param high a {@link java.lang.Integer} object
   */
  public void setHigh(Integer high) {
    this.high = high;
  }

  /**
   * Number of samples.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Number of samples.
   *
   * @param count a {@link java.lang.Integer} object
   */
  public void setCount(Integer count) {
    this.count = count;
  }
}
