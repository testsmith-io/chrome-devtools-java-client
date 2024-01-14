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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.types.memory.DOMCounters;
import com.github.testsmith.cdt.protocol.types.memory.PressureLevel;
import com.github.testsmith.cdt.protocol.types.memory.SamplingProfile;

/**
 * Memory interface.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface Memory {

  /**
   * getDOMCounters.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.memory.DOMCounters} object
   */
  DOMCounters getDOMCounters();

  /** prepareForLeakDetection. */
  void prepareForLeakDetection();

  /** Simulate OomIntervention by purging V8 memory. */
  void forciblyPurgeJavaScriptMemory();

  /**
   * Enable/disable suppressing memory pressure notifications in all processes.
   *
   * @param suppressed If true, memory pressure notifications will be suppressed.
   */
  void setPressureNotificationsSuppressed(@ParamName("suppressed") Boolean suppressed);

  /**
   * Simulate a memory pressure notification in all processes.
   *
   * @param level Memory pressure level of the notification.
   */
  void simulatePressureNotification(@ParamName("level") PressureLevel level);

  /** Start collecting native memory profile. */
  void startSampling();

  /**
   * Start collecting native memory profile.
   *
   * @param samplingInterval Average number of bytes between samples.
   * @param suppressRandomness Do not randomize intervals between samples.
   */
  void startSampling(
      @Optional @ParamName("samplingInterval") Integer samplingInterval,
      @Optional @ParamName("suppressRandomness") Boolean suppressRandomness);

  /** Stop collecting native memory profile. */
  void stopSampling();

  /**
   * Retrieve native memory allocations profile collected since renderer process startup.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.memory.SamplingProfile} object
   */
  @Returns("profile")
  SamplingProfile getAllTimeSamplingProfile();

  /**
   * Retrieve native memory allocations profile collected since browser process startup.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.memory.SamplingProfile} object
   */
  @Returns("profile")
  SamplingProfile getBrowserSamplingProfile();

  /**
   * Retrieve native memory allocations profile collected since last `startSampling` call.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.memory.SamplingProfile} object
   */
  @Returns("profile")
  SamplingProfile getSamplingProfile();
}
