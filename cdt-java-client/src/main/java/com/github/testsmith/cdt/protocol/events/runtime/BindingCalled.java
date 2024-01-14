package com.github.testsmith.cdt.protocol.events.runtime;

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

/**
 * Notification is issued every time when binding is called.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class BindingCalled {

  private String name;

  private String payload;

  private Integer executionContextId;

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
   * Getter for the field <code>payload</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPayload() {
    return payload;
  }

  /**
   * Setter for the field <code>payload</code>.
   *
   * @param payload a {@link java.lang.String} object
   */
  public void setPayload(String payload) {
    this.payload = payload;
  }

  /**
   * Identifier of the context where the call was made.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /**
   * Identifier of the context where the call was made.
   *
   * @param executionContextId a {@link java.lang.Integer} object
   */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }
}
