package com.github.testsmith.cdt.protocol.types.animation;

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
 * AnimationEffect instance
 *
 * @author roy
 * @version $Id: $Id
 */
public class AnimationEffect {

  private Double delay;

  private Double endDelay;

  private Double iterationStart;

  private Double iterations;

  private Double duration;

  private String direction;

  private String fill;

  @Optional private Integer backendNodeId;

  @Optional private KeyframesRule keyframesRule;

  private String easing;

  /**
   * `AnimationEffect`'s delay.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDelay() {
    return delay;
  }

  /**
   * `AnimationEffect`'s delay.
   *
   * @param delay a {@link java.lang.Double} object
   */
  public void setDelay(Double delay) {
    this.delay = delay;
  }

  /**
   * `AnimationEffect`'s end delay.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEndDelay() {
    return endDelay;
  }

  /**
   * `AnimationEffect`'s end delay.
   *
   * @param endDelay a {@link java.lang.Double} object
   */
  public void setEndDelay(Double endDelay) {
    this.endDelay = endDelay;
  }

  /**
   * `AnimationEffect`'s iteration start.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getIterationStart() {
    return iterationStart;
  }

  /**
   * `AnimationEffect`'s iteration start.
   *
   * @param iterationStart a {@link java.lang.Double} object
   */
  public void setIterationStart(Double iterationStart) {
    this.iterationStart = iterationStart;
  }

  /**
   * `AnimationEffect`'s iterations.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getIterations() {
    return iterations;
  }

  /**
   * `AnimationEffect`'s iterations.
   *
   * @param iterations a {@link java.lang.Double} object
   */
  public void setIterations(Double iterations) {
    this.iterations = iterations;
  }

  /**
   * `AnimationEffect`'s iteration duration.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * `AnimationEffect`'s iteration duration.
   *
   * @param duration a {@link java.lang.Double} object
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }

  /**
   * `AnimationEffect`'s playback direction.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDirection() {
    return direction;
  }

  /**
   * `AnimationEffect`'s playback direction.
   *
   * @param direction a {@link java.lang.String} object
   */
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   * `AnimationEffect`'s fill mode.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFill() {
    return fill;
  }

  /**
   * `AnimationEffect`'s fill mode.
   *
   * @param fill a {@link java.lang.String} object
   */
  public void setFill(String fill) {
    this.fill = fill;
  }

  /**
   * `AnimationEffect`'s target node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * `AnimationEffect`'s target node.
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

  /**
   * `AnimationEffect`'s keyframes.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.animation.KeyframesRule} object
   */
  public KeyframesRule getKeyframesRule() {
    return keyframesRule;
  }

  /**
   * `AnimationEffect`'s keyframes.
   *
   * @param keyframesRule a {@link com.github.testsmith.cdt.protocol.types.animation.KeyframesRule}
   *     object
   */
  public void setKeyframesRule(KeyframesRule keyframesRule) {
    this.keyframesRule = keyframesRule;
  }

  /**
   * `AnimationEffect`'s timing function.
   *
   * @return a {@link java.lang.String} object
   */
  public String getEasing() {
    return easing;
  }

  /**
   * `AnimationEffect`'s timing function.
   *
   * @param easing a {@link java.lang.String} object
   */
  public void setEasing(String easing) {
    this.easing = easing;
  }
}
