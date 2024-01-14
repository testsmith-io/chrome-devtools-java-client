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

import com.github.testsmith.cdt.protocol.types.runtime.CallFrame;
import java.util.List;

/**
 * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SamplingHeapProfileNode {

  private CallFrame callFrame;

  private Double selfSize;

  private Integer id;

  private List<SamplingHeapProfileNode> children;

  /**
   * Function location.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.CallFrame} object
   */
  public CallFrame getCallFrame() {
    return callFrame;
  }

  /**
   * Function location.
   *
   * @param callFrame a {@link com.github.testsmith.cdt.protocol.types.runtime.CallFrame} object
   */
  public void setCallFrame(CallFrame callFrame) {
    this.callFrame = callFrame;
  }

  /**
   * Allocations size in bytes for the node excluding children.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSelfSize() {
    return selfSize;
  }

  /**
   * Allocations size in bytes for the node excluding children.
   *
   * @param selfSize a {@link java.lang.Double} object
   */
  public void setSelfSize(Double selfSize) {
    this.selfSize = selfSize;
  }

  /**
   * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getId() {
    return id;
  }

  /**
   * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
   *
   * @param id a {@link java.lang.Integer} object
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Child nodes.
   *
   * @return a {@link java.util.List} object
   */
  public List<SamplingHeapProfileNode> getChildren() {
    return children;
  }

  /**
   * Child nodes.
   *
   * @param children a {@link java.util.List} object
   */
  public void setChildren(List<SamplingHeapProfileNode> children) {
    this.children = children;
  }
}
