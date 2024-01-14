package com.github.testsmith.cdt.protocol.types.runtime;

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
 * Detailed information about exception (or error) that was thrown during script compilation or
 * execution.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExceptionDetails {

  private Integer exceptionId;

  private String text;

  private Integer lineNumber;

  private Integer columnNumber;

  @Optional private String scriptId;

  @Optional private String url;

  @Optional private StackTrace stackTrace;

  @Optional private RemoteObject exception;

  @Optional private Integer executionContextId;

  /**
   * Exception id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExceptionId() {
    return exceptionId;
  }

  /**
   * Exception id.
   *
   * @param exceptionId a {@link java.lang.Integer} object
   */
  public void setExceptionId(Integer exceptionId) {
    this.exceptionId = exceptionId;
  }

  /**
   * Exception text, which should be used together with exception object when available.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Exception text, which should be used together with exception object when available.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Line number of the exception location (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number of the exception location (0-based).
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Column number of the exception location (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Column number of the exception location (0-based).
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Script ID of the exception location.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * Script ID of the exception location.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * URL of the exception location, to be used when the script was not reported.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of the exception location, to be used when the script was not reported.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * JavaScript stack trace if available.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /**
   * JavaScript stack trace if available.
   *
   * @param stackTrace a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Exception object if available.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getException() {
    return exception;
  }

  /**
   * Exception object if available.
   *
   * @param exception a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setException(RemoteObject exception) {
    this.exception = exception;
  }

  /**
   * Identifier of the context where exception happened.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /**
   * Identifier of the context where exception happened.
   *
   * @param executionContextId a {@link java.lang.Integer} object
   */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }
}
