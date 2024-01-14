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
import java.util.List;

/**
 * Chrome histogram.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class Histogram {

  private String name;

  private Integer sum;

  private Integer count;

  private List<Bucket> buckets;

  /**
   * Name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sum of sample values.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getSum() {
    return sum;
  }

  /**
   * Sum of sample values.
   *
   * @param sum a {@link java.lang.Integer} object
   */
  public void setSum(Integer sum) {
    this.sum = sum;
  }

  /**
   * Total number of samples.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Total number of samples.
   *
   * @param count a {@link java.lang.Integer} object
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Buckets.
   *
   * @return a {@link java.util.List} object
   */
  public List<Bucket> getBuckets() {
    return buckets;
  }

  /**
   * Buckets.
   *
   * @param buckets a {@link java.util.List} object
   */
  public void setBuckets(List<Bucket> buckets) {
    this.buckets = buckets;
  }
}