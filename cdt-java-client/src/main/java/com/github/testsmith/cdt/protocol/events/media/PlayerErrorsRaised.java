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

import com.github.testsmith.cdt.protocol.types.media.PlayerError;
import java.util.List;

/**
 * Send a list of any errors that need to be delivered.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PlayerErrorsRaised {

  private String playerId;

  private List<PlayerError> errors;

  /**
   * Getter for the field <code>playerId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPlayerId() {
    return playerId;
  }

  /**
   * Setter for the field <code>playerId</code>.
   *
   * @param playerId a {@link java.lang.String} object
   */
  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  /**
   * Getter for the field <code>errors</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<PlayerError> getErrors() {
    return errors;
  }

  /**
   * Setter for the field <code>errors</code>.
   *
   * @param errors a {@link java.util.List} object
   */
  public void setErrors(List<PlayerError> errors) {
    this.errors = errors;
  }
}
