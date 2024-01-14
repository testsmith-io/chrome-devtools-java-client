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
import com.github.testsmith.cdt.protocol.types.debugger.ScriptLanguage;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;
import java.util.Map;

/**
 * Fired when virtual machine fails to parse the script.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScriptFailedToParse {

  private String scriptId;

  private String url;

  private Integer startLine;

  private Integer startColumn;

  private Integer endLine;

  private Integer endColumn;

  private Integer executionContextId;

  private String hash;

  @Optional private Map<String, Object> executionContextAuxData;

  @Optional private String sourceMapURL;

  @Optional private Boolean hasSourceURL;

  @Optional private Boolean isModule;

  @Optional private Integer length;

  @Experimental @Optional private StackTrace stackTrace;

  @Experimental @Optional private Integer codeOffset;

  @Experimental @Optional private ScriptLanguage scriptLanguage;

  @Experimental @Optional private String embedderName;

  /**
   * Identifier of the script parsed.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * Identifier of the script parsed.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * URL or name of the script parsed (if any).
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL or name of the script parsed (if any).
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Line offset of the script within the resource with given URL (for script tags).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStartLine() {
    return startLine;
  }

  /**
   * Line offset of the script within the resource with given URL (for script tags).
   *
   * @param startLine a {@link java.lang.Integer} object
   */
  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }

  /**
   * Column offset of the script within the resource with given URL.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStartColumn() {
    return startColumn;
  }

  /**
   * Column offset of the script within the resource with given URL.
   *
   * @param startColumn a {@link java.lang.Integer} object
   */
  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }

  /**
   * Last line of the script.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEndLine() {
    return endLine;
  }

  /**
   * Last line of the script.
   *
   * @param endLine a {@link java.lang.Integer} object
   */
  public void setEndLine(Integer endLine) {
    this.endLine = endLine;
  }

  /**
   * Length of the last line of the script.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEndColumn() {
    return endColumn;
  }

  /**
   * Length of the last line of the script.
   *
   * @param endColumn a {@link java.lang.Integer} object
   */
  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }

  /**
   * Specifies script creation context.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /**
   * Specifies script creation context.
   *
   * @param executionContextId a {@link java.lang.Integer} object
   */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }

  /**
   * Content hash of the script.
   *
   * @return a {@link java.lang.String} object
   */
  public String getHash() {
    return hash;
  }

  /**
   * Content hash of the script.
   *
   * @param hash a {@link java.lang.String} object
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Embedder-specific auxiliary data.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getExecutionContextAuxData() {
    return executionContextAuxData;
  }

  /**
   * Embedder-specific auxiliary data.
   *
   * @param executionContextAuxData a {@link java.util.Map} object
   */
  public void setExecutionContextAuxData(Map<String, Object> executionContextAuxData) {
    this.executionContextAuxData = executionContextAuxData;
  }

  /**
   * URL of source map associated with script (if any).
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceMapURL() {
    return sourceMapURL;
  }

  /**
   * URL of source map associated with script (if any).
   *
   * @param sourceMapURL a {@link java.lang.String} object
   */
  public void setSourceMapURL(String sourceMapURL) {
    this.sourceMapURL = sourceMapURL;
  }

  /**
   * True, if this script has sourceURL.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasSourceURL() {
    return hasSourceURL;
  }

  /**
   * True, if this script has sourceURL.
   *
   * @param hasSourceURL a {@link java.lang.Boolean} object
   */
  public void setHasSourceURL(Boolean hasSourceURL) {
    this.hasSourceURL = hasSourceURL;
  }

  /**
   * True, if this script is ES6 module.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsModule() {
    return isModule;
  }

  /**
   * True, if this script is ES6 module.
   *
   * @param isModule a {@link java.lang.Boolean} object
   */
  public void setIsModule(Boolean isModule) {
    this.isModule = isModule;
  }

  /**
   * This script length.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLength() {
    return length;
  }

  /**
   * This script length.
   *
   * @param length a {@link java.lang.Integer} object
   */
  public void setLength(Integer length) {
    this.length = length;
  }

  /**
   * JavaScript top stack frame of where the script parsed event was triggered if available.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStackTrace() {
    return stackTrace;
  }

  /**
   * JavaScript top stack frame of where the script parsed event was triggered if available.
   *
   * @param stackTrace a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStackTrace(StackTrace stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * If the scriptLanguage is WebAssembly, the code section offset in the module.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getCodeOffset() {
    return codeOffset;
  }

  /**
   * If the scriptLanguage is WebAssembly, the code section offset in the module.
   *
   * @param codeOffset a {@link java.lang.Integer} object
   */
  public void setCodeOffset(Integer codeOffset) {
    this.codeOffset = codeOffset;
  }

  /**
   * The language of the script.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptLanguage} object
   */
  public ScriptLanguage getScriptLanguage() {
    return scriptLanguage;
  }

  /**
   * The language of the script.
   *
   * @param scriptLanguage a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptLanguage}
   *     object
   */
  public void setScriptLanguage(ScriptLanguage scriptLanguage) {
    this.scriptLanguage = scriptLanguage;
  }

  /**
   * The name the embedder supplied for this script.
   *
   * @return a {@link java.lang.String} object
   */
  public String getEmbedderName() {
    return embedderName;
  }

  /**
   * The name the embedder supplied for this script.
   *
   * @param embedderName a {@link java.lang.String} object
   */
  public void setEmbedderName(String embedderName) {
    this.embedderName = embedderName;
  }
}
