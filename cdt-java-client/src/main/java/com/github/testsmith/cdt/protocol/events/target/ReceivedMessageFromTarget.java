package com.github.testsmith.cdt.protocol.events.target;

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
 * Notifies about a new protocol message received from the session (as reported in
 * `attachedToTarget` event).
 *
 * @author roy
 * @version $Id: $Id
 */
public class ReceivedMessageFromTarget {

  private String sessionId;

  private String message;

  @Deprecated @Optional private String targetId;

  /**
   * Identifier of a session which sends a message.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSessionId() {
    return sessionId;
  }

  /**
   * Identifier of a session which sends a message.
   *
   * @param sessionId a {@link java.lang.String} object
   */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
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

  /**
   * Deprecated.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTargetId() {
    return targetId;
  }

  /**
   * Deprecated.
   *
   * @param targetId a {@link java.lang.String} object
   */
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }
}
