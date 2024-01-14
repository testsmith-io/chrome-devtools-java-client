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
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import java.util.List;

/**
 * Issued when console API was called.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ConsoleAPICalled {

  private ConsoleAPICalledType type;

  private List<RemoteObject> args;

  private Integer executionContextId;

  private Double timestamp;

  @Optional private StackTrace stackTrace;

  @Experimental @Optional private String context;

  /**
   * Type of the call.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.events.runtime.ConsoleAPICalledType} object
   */
  public ConsoleAPICalledType getType() {
    return type;
  }

  /**
   * Type of the call.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.events.runtime.ConsoleAPICalledType}
   *     object
   */
  public void setType(ConsoleAPICalledType type) {
    this.type = type;
  }

  /**
   * Call arguments.
   *
   * @return a {@link java.util.List} object
   */
  public List<RemoteObject> getArgs() {
    return args;
  }

  /**
   * Call arguments.
   *
   * @param args a {@link java.util.List} object
   */
  public void setArgs(List<RemoteObject> args) {
    this.args = args;
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

  /**
   * Call timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Call timestamp.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Stack trace captured when the call was made. The async stack chain is automatically reported
   * for the following call types: `assert`, `error`, `trace`, `warning`. For other types the async
   * call chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /**
   * Stack trace captured when the call was made. The async stack chain is automatically reported
   * for the following call types: `assert`, `error`, `trace`, `warning`. For other types the async
   * call chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
   *
   * @param stackTrace a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Console context descriptor for calls on non-default console context (not console.*):
   * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call on
   * named context.
   *
   * @return a {@link java.lang.String} object
   */
  public String getContext() {
    return context;
  }

  /**
   * Console context descriptor for calls on non-default console context (not console.*):
   * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call on
   * named context.
   *
   * @param context a {@link java.lang.String} object
   */
  public void setContext(String context) {
    this.context = context;
  }
}
