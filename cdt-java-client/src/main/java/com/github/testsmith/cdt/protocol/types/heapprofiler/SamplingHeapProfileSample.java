package com.github.testsmith.cdt.protocol.types.heapprofiler;

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
 * A single sample from a sampling profile.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SamplingHeapProfileSample {

  private Double size;

  private Integer nodeId;

  private Double ordinal;

  /**
   * Allocation size in bytes attributed to the sample.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSize() {
    return size;
  }

  /**
   * Allocation size in bytes attributed to the sample.
   *
   * @param size a {@link java.lang.Double} object
   */
  public void setSize(Double size) {
    this.size = size;
  }

  /**
   * Id of the corresponding profile tree node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodeId() {
    return nodeId;
  }

  /**
   * Id of the corresponding profile tree node.
   *
   * @param nodeId a {@link java.lang.Integer} object
   */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * Time-ordered sample ordinal number. It is unique across all profiles retrieved between
   * startSampling and stopSampling.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getOrdinal() {
    return ordinal;
  }

  /**
   * Time-ordered sample ordinal number. It is unique across all profiles retrieved between
   * startSampling and stopSampling.
   *
   * @param ordinal a {@link java.lang.Double} object
   */
  public void setOrdinal(Double ordinal) {
    this.ordinal = ordinal;
  }
}
