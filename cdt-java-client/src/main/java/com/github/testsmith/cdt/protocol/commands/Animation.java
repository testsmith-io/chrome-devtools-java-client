package com.github.testsmith.cdt.protocol.commands;

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

import com.github.testsmith.cdt.protocol.events.animation.AnimationCanceled;
import com.github.testsmith.cdt.protocol.events.animation.AnimationCreated;
import com.github.testsmith.cdt.protocol.events.animation.AnimationStarted;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;
import java.util.List;

/**
 * Animation interface.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface Animation {

  /** Disables animation domain notifications. */
  void disable();

  /** Enables animation domain notifications. */
  void enable();

  /**
   * Returns the current time of the an animation.
   *
   * @param id Id of animation.
   * @return a {@link java.lang.Double} object
   */
  @Returns("currentTime")
  Double getCurrentTime(@ParamName("id") String id);

  /**
   * Gets the playback rate of the document timeline.
   *
   * @return a {@link java.lang.Double} object
   */
  @Returns("playbackRate")
  Double getPlaybackRate();

  /**
   * Releases a set of animations to no longer be manipulated.
   *
   * @param animations List of animation ids to seek.
   */
  void releaseAnimations(@ParamName("animations") List<String> animations);

  /**
   * Gets the remote object of the Animation.
   *
   * @param animationId Animation id.
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  @Returns("remoteObject")
  RemoteObject resolveAnimation(@ParamName("animationId") String animationId);

  /**
   * Seek a set of animations to a particular time within each animation.
   *
   * @param animations List of animation ids to seek.
   * @param currentTime Set the current time of each animation.
   */
  void seekAnimations(
      @ParamName("animations") List<String> animations,
      @ParamName("currentTime") Double currentTime);

  /**
   * Sets the paused state of a set of animations.
   *
   * @param animations Animations to set the pause state of.
   * @param paused Paused state to set to.
   */
  void setPaused(
      @ParamName("animations") List<String> animations, @ParamName("paused") Boolean paused);

  /**
   * Sets the playback rate of the document timeline.
   *
   * @param playbackRate Playback rate for animations on page
   */
  void setPlaybackRate(@ParamName("playbackRate") Double playbackRate);

  /**
   * Sets the timing of an animation node.
   *
   * @param animationId Animation id.
   * @param duration Duration of the animation.
   * @param delay Delay of the animation.
   */
  void setTiming(
      @ParamName("animationId") String animationId,
      @ParamName("duration") Double duration,
      @ParamName("delay") Double delay);

  /**
   * Event for when an animation has been cancelled.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("animationCanceled")
  EventListener onAnimationCanceled(EventHandler<AnimationCanceled> eventListener);

  /**
   * Event for each animation that has been created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("animationCreated")
  EventListener onAnimationCreated(EventHandler<AnimationCreated> eventListener);

  /**
   * Event for animation that has been started.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("animationStarted")
  EventListener onAnimationStarted(EventHandler<AnimationStarted> eventListener);
}
