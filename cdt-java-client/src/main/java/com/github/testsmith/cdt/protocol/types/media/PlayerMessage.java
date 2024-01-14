package com.github.testsmith.cdt.protocol.types.media;

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

/**
 * Have one type per entry in MediaLogRecord::Type Corresponds to kMessage
 *
 * @author roy
 * @version $Id: $Id
 */
public class PlayerMessage {

  private PlayerMessageLevel level;

  private String message;

  /**
   * Keep in sync with MediaLogMessageLevel We are currently keeping the message level 'error'
   * separate from the PlayerError type because right now they represent different things, this one
   * being a DVLOG(ERROR) style log message that gets printed based on what log level is selected in
   * the UI, and the other is a representation of a media::PipelineStatus object. Soon however we're
   * going to be moving away from using PipelineStatus for errors and introducing a new error type
   * which should hopefully let us integrate the error log level into the PlayerError type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.media.PlayerMessageLevel} object
   */
  public PlayerMessageLevel getLevel() {
    return level;
  }

  /**
   * Keep in sync with MediaLogMessageLevel We are currently keeping the message level 'error'
   * separate from the PlayerError type because right now they represent different things, this one
   * being a DVLOG(ERROR) style log message that gets printed based on what log level is selected in
   * the UI, and the other is a representation of a media::PipelineStatus object. Soon however we're
   * going to be moving away from using PipelineStatus for errors and introducing a new error type
   * which should hopefully let us integrate the error log level into the PlayerError type.
   *
   * @param level a {@link com.github.testsmith.cdt.protocol.types.media.PlayerMessageLevel} object
   */
  public void setLevel(PlayerMessageLevel level) {
    this.level = level;
  }

  /**
   * Getter for the field <code>message</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * Setter for the field <code>message</code>.
   *
   * @param message a {@link java.lang.String} object
   */
  public void setMessage(String message) {
    this.message = message;
  }
}
