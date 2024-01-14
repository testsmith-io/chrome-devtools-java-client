package com.github.testsmith.cdt.protocol.types.network;

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
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;

/**
 * Information about the request initiator.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Initiator {

  private InitiatorType type;

  @Optional private StackTrace stack;

  @Optional private String url;

  @Optional private Double lineNumber;

  @Optional private Double columnNumber;

  @Optional private String requestId;

  /**
   * Type of this initiator.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.InitiatorType} object
   */
  public InitiatorType getType() {
    return type;
  }

  /**
   * Type of this initiator.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.InitiatorType} object
   */
  public void setType(InitiatorType type) {
    this.type = type;
  }

  /**
   * Initiator JavaScript stack trace, set for Script only.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStack() {
    return stack;
  }

  /**
   * Initiator JavaScript stack trace, set for Script only.
   *
   * @param stack a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStack(StackTrace stack) {
    this.stack = stack;
  }

  /**
   * Initiator URL, set for Parser type or for Script type (when script is importing module) or for
   * SignedExchange type.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Initiator URL, set for Parser type or for Script type (when script is importing module) or for
   * SignedExchange type.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Initiator line number, set for Parser type or for Script type (when script is importing module)
   * (0-based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLineNumber() {
    return lineNumber;
  }

  /**
   * Initiator line number, set for Parser type or for Script type (when script is importing module)
   * (0-based).
   *
   * @param lineNumber a {@link java.lang.Double} object
   */
  public void setLineNumber(Double lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Initiator column number, set for Parser type or for Script type (when script is importing
   * module) (0-based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getColumnNumber() {
    return columnNumber;
  }

  /**
   * Initiator column number, set for Parser type or for Script type (when script is importing
   * module) (0-based).
   *
   * @param columnNumber a {@link java.lang.Double} object
   */
  public void setColumnNumber(Double columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Set if another request triggered this request (e.g. preflight).
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Set if another request triggered this request (e.g. preflight).
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
}
