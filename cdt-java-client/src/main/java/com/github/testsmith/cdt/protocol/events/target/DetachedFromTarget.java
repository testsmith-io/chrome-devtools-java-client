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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
 * issued multiple times per target if multiple sessions have been attached to it.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class DetachedFromTarget {

  private String sessionId;

  @Deprecated @Optional private String targetId;

  /**
   * Detached session identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSessionId() {
    return sessionId;
  }

  /**
   * Detached session identifier.
   *
   * @param sessionId a {@link java.lang.String} object
   */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
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
