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

/**
 * Stack entry for runtime errors and assertions.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CallFrame {

  private String functionName;

  private String scriptId;

  private String url;

  private Integer lineNumber;

  private Integer columnNumber;

  /**
   * JavaScript function name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFunctionName() {
    return functionName;
  }

  /**
   * JavaScript function name.
   *
   * @param functionName a {@link java.lang.String} object
   */
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  /**
   * JavaScript script id.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * JavaScript script id.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * JavaScript script name or url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * JavaScript script name or url.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * JavaScript script line number (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * JavaScript script line number (0-based).
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * JavaScript script column number (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * JavaScript script column number (0-based).
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }
}
