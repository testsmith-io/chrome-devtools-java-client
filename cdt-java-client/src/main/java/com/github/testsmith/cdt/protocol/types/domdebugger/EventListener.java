package com.github.testsmith.cdt.protocol.types.domdebugger;

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

/**
 * Object event listener.
 *
 * @author roy
 * @version $Id: $Id
 */
public class EventListener {

  private String type;

  private Boolean useCapture;

  private Boolean passive;

  private Boolean once;

  private String scriptId;

  private Integer lineNumber;

  private Integer columnNumber;

  @Optional private RemoteObject handler;

  @Optional private RemoteObject originalHandler;

  @Optional private Integer backendNodeId;

  /**
   * `EventListener`'s type.
   *
   * @return a {@link java.lang.String} object
   */
  public String getType() {
    return type;
  }

  /**
   * `EventListener`'s type.
   *
   * @param type a {@link java.lang.String} object
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * `EventListener`'s useCapture.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUseCapture() {
    return useCapture;
  }

  /**
   * `EventListener`'s useCapture.
   *
   * @param useCapture a {@link java.lang.Boolean} object
   */
  public void setUseCapture(Boolean useCapture) {
    this.useCapture = useCapture;
  }

  /**
   * `EventListener`'s passive flag.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPassive() {
    return passive;
  }

  /**
   * `EventListener`'s passive flag.
   *
   * @param passive a {@link java.lang.Boolean} object
   */
  public void setPassive(Boolean passive) {
    this.passive = passive;
  }

  /**
   * `EventListener`'s once flag.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getOnce() {
    return once;
  }

  /**
   * `EventListener`'s once flag.
   *
   * @param once a {@link java.lang.Boolean} object
   */
  public void setOnce(Boolean once) {
    this.once = once;
  }

  /**
   * Script id of the handler code.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * Script id of the handler code.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * Line number in the script (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number in the script (0-based).
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Column number in the script (0-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Column number in the script (0-based).
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Event handler function value.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getHandler() {
    return handler;
  }

  /**
   * Event handler function value.
   *
   * @param handler a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setHandler(RemoteObject handler) {
    this.handler = handler;
  }

  /**
   * Event original handler function value.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getOriginalHandler() {
    return originalHandler;
  }

  /**
   * Event original handler function value.
   *
   * @param originalHandler a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject}
   *     object
   */
  public void setOriginalHandler(RemoteObject originalHandler) {
    this.originalHandler = originalHandler;
  }

  /**
   * Node the listener is added to (if any).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /**
   * Node the listener is added to (if any).
   *
   * @param backendNodeId a {@link java.lang.Integer} object
   */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }
}
