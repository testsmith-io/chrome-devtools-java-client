package com.github.testsmith.cdt.protocol.types.debugger;

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
import com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import com.github.testsmith.cdt.protocol.types.runtime.StackTraceId;
import java.util.List;

/**
 * SetScriptSource class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SetScriptSource {

  @Optional private List<CallFrame> callFrames;

  @Optional private Boolean stackChanged;

  @Optional private StackTrace asyncStackTrace;

  @Experimental @Optional private StackTraceId asyncStackTraceId;

  @Optional private ExceptionDetails exceptionDetails;

  /**
   * New stack trace in case editing has happened while VM was stopped.
   *
   * @return a {@link java.util.List} object
   */
  public List<CallFrame> getCallFrames() {
    return callFrames;
  }

  /**
   * New stack trace in case editing has happened while VM was stopped.
   *
   * @param callFrames a {@link java.util.List} object
   */
  public void setCallFrames(List<CallFrame> callFrames) {
    this.callFrames = callFrames;
  }

  /**
   * Whether current call stack was modified after applying the changes.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getStackChanged() {
    return stackChanged;
  }

  /**
   * Whether current call stack was modified after applying the changes.
   *
   * @param stackChanged a {@link java.lang.Boolean} object
   */
  public void setStackChanged(Boolean stackChanged) {
    this.stackChanged = stackChanged;
  }

  /**
   * Async stack trace, if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getAsyncStackTrace() {
    return asyncStackTrace;
  }

  /**
   * Async stack trace, if any.
   *
   * @param asyncStackTrace a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace}
   *     object
   */
  public void setAsyncStackTrace(StackTrace asyncStackTrace) {
    this.asyncStackTrace = asyncStackTrace;
  }

  /**
   * Async stack trace, if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTraceId} object
   */
  public StackTraceId getAsyncStackTraceId() {
    return asyncStackTraceId;
  }

  /**
   * Async stack trace, if any.
   *
   * @param asyncStackTraceId a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTraceId}
   *     object
   */
  public void setAsyncStackTraceId(StackTraceId asyncStackTraceId) {
    this.asyncStackTraceId = asyncStackTraceId;
  }

  /**
   * Exception details if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /**
   * Exception details if any.
   *
   * @param exceptionDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
