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

import com.github.testsmith.cdt.protocol.events.media.*;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;

/**
 * This domain allows detailed inspection of media elements
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface Media {

  /** Enables the Media domain */
  void enable();

  /** Disables the Media domain. */
  void disable();

  /**
   * This can be called multiple times, and can be used to set / override / remove player
   * properties. A null propValue indicates removal.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("playerPropertiesChanged")
  EventListener onPlayerPropertiesChanged(EventHandler<PlayerPropertiesChanged> eventListener);

  /**
   * Send events as a list, allowing them to be batched on the browser for less congestion. If
   * batched, events must ALWAYS be in chronological order.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("playerEventsAdded")
  EventListener onPlayerEventsAdded(EventHandler<PlayerEventsAdded> eventListener);

  /**
   * Send a list of any messages that need to be delivered.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("playerMessagesLogged")
  EventListener onPlayerMessagesLogged(EventHandler<PlayerMessagesLogged> eventListener);

  /**
   * Send a list of any errors that need to be delivered.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("playerErrorsRaised")
  EventListener onPlayerErrorsRaised(EventHandler<PlayerErrorsRaised> eventListener);

  /**
   * Called whenever a player is created, or when a new agent joins and receives a list of active
   * players. If an agent is restored, it will receive the full list of player ids and all events
   * again.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("playersCreated")
  EventListener onPlayersCreated(EventHandler<PlayersCreated> eventListener);
}
