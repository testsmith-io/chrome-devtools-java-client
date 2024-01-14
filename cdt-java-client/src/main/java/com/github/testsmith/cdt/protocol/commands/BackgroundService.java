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

import com.github.testsmith.cdt.protocol.events.backgroundservice.BackgroundServiceEventReceived;
import com.github.testsmith.cdt.protocol.events.backgroundservice.RecordingStateChanged;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName;

/**
 * Defines events for background web platform features.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface BackgroundService {

  /**
   * Enables event updates for the service.
   *
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  void startObserving(@ParamName("service") ServiceName service);

  /**
   * Disables event updates for the service.
   *
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  void stopObserving(@ParamName("service") ServiceName service);

  /**
   * Set the recording state for the service.
   *
   * @param shouldRecord a {@link java.lang.Boolean} object
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  void setRecording(
      @ParamName("shouldRecord") Boolean shouldRecord, @ParamName("service") ServiceName service);

  /**
   * Clears all stored data for the service.
   *
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  void clearEvents(@ParamName("service") ServiceName service);

  /**
   * Called when the recording state for the service has been updated.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("recordingStateChanged")
  EventListener onRecordingStateChanged(EventHandler<RecordingStateChanged> eventListener);

  /**
   * Called with all existing backgroundServiceEvents when enabled, and all new events afterwards if
   * enabled and recording.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("backgroundServiceEventReceived")
  EventListener onBackgroundServiceEventReceived(
      EventHandler<BackgroundServiceEventReceived> eventListener);
}
