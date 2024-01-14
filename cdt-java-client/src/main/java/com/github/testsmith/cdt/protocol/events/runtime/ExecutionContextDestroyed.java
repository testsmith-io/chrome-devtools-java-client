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

/**
 * Issued when execution context is destroyed.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExecutionContextDestroyed {

  private Integer executionContextId;

  /**
   * Id of the destroyed context
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /**
   * Id of the destroyed context
   *
   * @param executionContextId a {@link java.lang.Integer} object
   */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }
}