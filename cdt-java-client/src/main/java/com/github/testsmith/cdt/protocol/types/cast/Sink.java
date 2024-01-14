package com.github.testsmith.cdt.protocol.types.cast;

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
 * Sink class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Sink {

  private String name;

  private String id;

  @Optional private String session;

  /**
   * Getter for the field <code>name</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for the field <code>name</code>.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for the field <code>id</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * Setter for the field <code>id</code>.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Text describing the current session. Present only if there is an active session on the sink.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSession() {
    return session;
  }

  /**
   * Text describing the current session. Present only if there is an active session on the sink.
   *
   * @param session a {@link java.lang.String} object
   */
  public void setSession(String session) {
    this.session = session;
  }
}
