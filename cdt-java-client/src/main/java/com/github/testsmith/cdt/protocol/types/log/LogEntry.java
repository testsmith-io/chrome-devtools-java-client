package com.github.testsmith.cdt.protocol.types.log;

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
import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import java.util.List;

/**
 * Log entry.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LogEntry {

  private LogEntrySource source;

  private LogEntryLevel level;

  private String text;

  private Double timestamp;

  @Optional private String url;

  @Optional private Integer lineNumber;

  @Optional private StackTrace stackTrace;

  @Optional private String networkRequestId;

  @Optional private String workerId;

  @Optional private List<RemoteObject> args;

  /**
   * Log entry source.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.log.LogEntrySource} object
   */
  public LogEntrySource getSource() {
    return source;
  }

  /**
   * Log entry source.
   *
   * @param source a {@link com.github.testsmith.cdt.protocol.types.log.LogEntrySource} object
   */
  public void setSource(LogEntrySource source) {
    this.source = source;
  }

  /**
   * Log entry severity.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.log.LogEntryLevel} object
   */
  public LogEntryLevel getLevel() {
    return level;
  }

  /**
   * Log entry severity.
   *
   * @param level a {@link com.github.testsmith.cdt.protocol.types.log.LogEntryLevel} object
   */
  public void setLevel(LogEntryLevel level) {
    this.level = level;
  }

  /**
   * Logged text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Logged text.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Timestamp when this entry was added.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Timestamp when this entry was added.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * URL of the resource if known.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of the resource if known.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Line number in the resource.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number in the resource.
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * JavaScript stack trace.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /**
   * JavaScript stack trace.
   *
   * @param stackTrace a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Identifier of the network request associated with this entry.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkRequestId() {
    return networkRequestId;
  }

  /**
   * Identifier of the network request associated with this entry.
   *
   * @param networkRequestId a {@link java.lang.String} object
   */
  public void setNetworkRequestId(String networkRequestId) {
    this.networkRequestId = networkRequestId;
  }

  /**
   * Identifier of the worker associated with this entry.
   *
   * @return a {@link java.lang.String} object
   */
  public String getWorkerId() {
    return workerId;
  }

  /**
   * Identifier of the worker associated with this entry.
   *
   * @param workerId a {@link java.lang.String} object
   */
  public void setWorkerId(String workerId) {
    this.workerId = workerId;
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
}
