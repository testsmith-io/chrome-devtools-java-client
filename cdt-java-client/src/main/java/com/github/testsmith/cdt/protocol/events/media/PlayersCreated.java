package com.github.testsmith.cdt.protocol.events.media;

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

import java.util.List;

/**
 * Called whenever a player is created, or when a new agent joins and receives a list of active
 * players. If an agent is restored, it will receive the full list of player ids and all events
 * again.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PlayersCreated {

  private List<String> players;

  /**
   * Getter for the field <code>players</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getPlayers() {
    return players;
  }

  /**
   * Setter for the field <code>players</code>.
   *
   * @param players a {@link java.util.List} object
   */
  public void setPlayers(List<String> players) {
    this.players = players;
  }
}
