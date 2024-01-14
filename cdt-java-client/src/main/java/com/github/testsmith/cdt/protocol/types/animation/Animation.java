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
 * Animation instance.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Animation {

  private String id;

  private String name;

  private Boolean pausedState;

  private String playState;

  private Double playbackRate;

  private Double startTime;

  private Double currentTime;

  private AnimationType type;

  @Optional private AnimationEffect source;

  @Optional private String cssId;

  /**
   * `Animation`'s id.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * `Animation`'s id.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * `Animation`'s name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * `Animation`'s name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * `Animation`'s internal paused state.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPausedState() {
    return pausedState;
  }

  /**
   * `Animation`'s internal paused state.
   *
   * @param pausedState a {@link java.lang.Boolean} object
   */
  public void setPausedState(Boolean pausedState) {
    this.pausedState = pausedState;
  }

  /**
   * `Animation`'s play state.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPlayState() {
    return playState;
  }

  /**
   * `Animation`'s play state.
   *
   * @param playState a {@link java.lang.String} object
   */
  public void setPlayState(String playState) {
    this.playState = playState;
  }

  /**
   * `Animation`'s playback rate.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getPlaybackRate() {
    return playbackRate;
  }

  /**
   * `Animation`'s playback rate.
   *
   * @param playbackRate a {@link java.lang.Double} object
   */
  public void setPlaybackRate(Double playbackRate) {
    this.playbackRate = playbackRate;
  }

  /**
   * `Animation`'s start time.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getStartTime() {
    return startTime;
  }

  /**
   * `Animation`'s start time.
   *
   * @param startTime a {@link java.lang.Double} object
   */
  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }

  /**
   * `Animation`'s current time.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCurrentTime() {
    return currentTime;
  }

  /**
   * `Animation`'s current time.
   *
   * @param currentTime a {@link java.lang.Double} object
   */
  public void setCurrentTime(Double currentTime) {
    this.currentTime = currentTime;
  }

  /**
   * Animation type of `Animation`.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.animation.AnimationType} object
   */
  public AnimationType getType() {
    return type;
  }

  /**
   * Animation type of `Animation`.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.animation.AnimationType} object
   */
  public void setType(AnimationType type) {
    this.type = type;
  }

  /**
   * `Animation`'s source animation node.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.animation.AnimationEffect} object
   */
  public AnimationEffect getSource() {
    return source;
  }

  /**
   * `Animation`'s source animation node.
   *
   * @param source a {@link com.github.testsmith.cdt.protocol.types.animation.AnimationEffect}
   *     object
   */
  public void setSource(AnimationEffect source) {
    this.source = source;
  }

  /**
   * A unique ID for `Animation` representing the sources that triggered this CSS
   * animation/transition.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCssId() {
    return cssId;
  }

  /**
   * A unique ID for `Animation` representing the sources that triggered this CSS
   * animation/transition.
   *
   * @param cssId a {@link java.lang.String} object
   */
  public void setCssId(String cssId) {
    this.cssId = cssId;
  }
}
