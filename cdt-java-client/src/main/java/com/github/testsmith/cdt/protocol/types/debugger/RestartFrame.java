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
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import com.github.testsmith.cdt.protocol.types.runtime.StackTraceId;
import java.util.List;

/**
 * RestartFrame class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RestartFrame {

  private List<CallFrame> callFrames;

  @Optional private StackTrace asyncStackTrace;

  @Experimental @Optional private StackTraceId asyncStackTraceId;

  /**
   * New stack trace.
   *
   * @return a {@link java.util.List} object
   */
  public List<CallFrame> getCallFrames() {
    return callFrames;
  }

  /**
   * New stack trace.
   *
   * @param callFrames a {@link java.util.List} object
   */
  public void setCallFrames(List<CallFrame> callFrames) {
    this.callFrames = callFrames;
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
}
