package com.github.testsmith.cdt.protocol.events.backgroundservice;

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

import com.github.testsmith.cdt.protocol.types.backgroundservice.BackgroundServiceEvent;

/**
 * Called with all existing backgroundServiceEvents when enabled, and all new events afterwards if
 * enabled and recording.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BackgroundServiceEventReceived {

  private BackgroundServiceEvent backgroundServiceEvent;

  /**
   * Getter for the field <code>backgroundServiceEvent</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.backgroundservice.BackgroundServiceEvent} object
   */
  public BackgroundServiceEvent getBackgroundServiceEvent() {
    return backgroundServiceEvent;
  }

  /**
   * Setter for the field <code>backgroundServiceEvent</code>.
   *
   * @param backgroundServiceEvent a {@link
   *     com.github.testsmith.cdt.protocol.types.backgroundservice.BackgroundServiceEvent} object
   */
  public void setBackgroundServiceEvent(BackgroundServiceEvent backgroundServiceEvent) {
    this.backgroundServiceEvent = backgroundServiceEvent;
  }
}