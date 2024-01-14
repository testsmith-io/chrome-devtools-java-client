package com.github.testsmith.cdt.protocol.events.debugger;

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
import com.github.testsmith.cdt.protocol.types.debugger.CallFrame;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import com.github.testsmith.cdt.protocol.types.runtime.StackTraceId;
import java.util.List;
import java.util.Map;

/**
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Paused {

  private List<CallFrame> callFrames;

  private PausedReason reason;

  @Optional private Map<String, Object> data;

  @Optional private List<String> hitBreakpoints;

  @Optional private StackTrace asyncStackTrace;

  @Experimental @Optional private StackTraceId asyncStackTraceId;

  @Deprecated @Experimental @Optional private StackTraceId asyncCallStackTraceId;

  /**
   * Call stack the virtual machine stopped on.
   *
   * @return a {@link java.util.List} object
   */
  public List<CallFrame> getCallFrames() {
    return callFrames;
  }

  /**
   * Call stack the virtual machine stopped on.
   *
   * @param callFrames a {@link java.util.List} object
   */
  public void setCallFrames(List<CallFrame> callFrames) {
    this.callFrames = callFrames;
  }

  /**
   * Pause reason.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.events.debugger.PausedReason} object
   */
  public PausedReason getReason() {
    return reason;
  }

  /**
   * Pause reason.
   *
   * @param reason a {@link com.github.testsmith.cdt.protocol.events.debugger.PausedReason} object
   */
  public void setReason(PausedReason reason) {
    this.reason = reason;
  }

  /**
   * Object containing break-specific auxiliary properties.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getData() {
    return data;
  }

  /**
   * Object containing break-specific auxiliary properties.
   *
   * @param data a {@link java.util.Map} object
   */
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  /**
   * Hit breakpoints IDs
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getHitBreakpoints() {
    return hitBreakpoints;
  }

  /**
   * Hit breakpoints IDs
   *
   * @param hitBreakpoints a {@link java.util.List} object
   */
  public void setHitBreakpoints(List<String> hitBreakpoints) {
    this.hitBreakpoints = hitBreakpoints;
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
   * Never present, will be removed.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTraceId} object
   */
  public StackTraceId getAsyncCallStackTraceId() {
    return asyncCallStackTraceId;
  }

  /**
   * Never present, will be removed.
   *
   * @param asyncCallStackTraceId a {@link
   *     com.github.testsmith.cdt.protocol.types.runtime.StackTraceId} object
   */
  public void setAsyncCallStackTraceId(StackTraceId asyncCallStackTraceId) {
    this.asyncCallStackTraceId = asyncCallStackTraceId;
  }
}
