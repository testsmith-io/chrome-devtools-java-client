package com.github.testsmith.cdt.protocol.types.profiler;

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
import com.github.testsmith.cdt.protocol.types.runtime.CallFrame;
import java.util.List;

/**
 * Profile node. Holds callsite information, execution statistics and child nodes.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ProfileNode {

  private Integer id;

  private CallFrame callFrame;

  @Optional private Integer hitCount;

  @Optional private List<Integer> children;

  @Optional private String deoptReason;

  @Optional private List<PositionTickInfo> positionTicks;

  /**
   * Unique id of the node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getId() {
    return id;
  }

  /**
   * Unique id of the node.
   *
   * @param id a {@link java.lang.Integer} object
   */
  public void setId(Integer id) {
    this.id = id;
  }

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
   * Number of samples where this node was on top of the call stack.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHitCount() {
    return hitCount;
  }

  /**
   * Number of samples where this node was on top of the call stack.
   *
   * @param hitCount a {@link java.lang.Integer} object
   */
  public void setHitCount(Integer hitCount) {
    this.hitCount = hitCount;
  }

  /**
   * Child node ids.
   *
   * @return a {@link java.util.List} object
   */
  public List<Integer> getChildren() {
    return children;
  }

  /**
   * Child node ids.
   *
   * @param children a {@link java.util.List} object
   */
  public void setChildren(List<Integer> children) {
    this.children = children;
  }

  /**
   * The reason of being not optimized. The function may be deoptimized or marked as don't optimize.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeoptReason() {
    return deoptReason;
  }

  /**
   * The reason of being not optimized. The function may be deoptimized or marked as don't optimize.
   *
   * @param deoptReason a {@link java.lang.String} object
   */
  public void setDeoptReason(String deoptReason) {
    this.deoptReason = deoptReason;
  }

  /**
   * An array of source position ticks.
   *
   * @return a {@link java.util.List} object
   */
  public List<PositionTickInfo> getPositionTicks() {
    return positionTicks;
  }

  /**
   * An array of source position ticks.
   *
   * @param positionTicks a {@link java.util.List} object
   */
  public void setPositionTicks(List<PositionTickInfo> positionTicks) {
    this.positionTicks = positionTicks;
  }
}
