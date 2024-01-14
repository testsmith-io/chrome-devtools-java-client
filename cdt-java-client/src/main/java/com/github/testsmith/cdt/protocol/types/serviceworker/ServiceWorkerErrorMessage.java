package com.github.testsmith.cdt.protocol.types.serviceworker;

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
 * ServiceWorker error message.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ServiceWorkerErrorMessage {

  private String errorMessage;

  private String registrationId;

  private String versionId;

  private String sourceURL;

  private Integer lineNumber;

  private Integer columnNumber;

  /**
   * Getter for the field <code>errorMessage</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Setter for the field <code>errorMessage</code>.
   *
   * @param errorMessage a {@link java.lang.String} object
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Getter for the field <code>registrationId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegistrationId() {
    return registrationId;
  }

  /**
   * Setter for the field <code>registrationId</code>.
   *
   * @param registrationId a {@link java.lang.String} object
   */
  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  /**
   * Getter for the field <code>versionId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersionId() {
    return versionId;
  }

  /**
   * Setter for the field <code>versionId</code>.
   *
   * @param versionId a {@link java.lang.String} object
   */
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  /**
   * Getter for the field <code>sourceURL</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceURL() {
    return sourceURL;
  }

  /**
   * Setter for the field <code>sourceURL</code>.
   *
   * @param sourceURL a {@link java.lang.String} object
   */
  public void setSourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
  }

  /**
   * Getter for the field <code>lineNumber</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Setter for the field <code>lineNumber</code>.
   *
   * @param lineNumber a {@link java.lang.Integer} object
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Getter for the field <code>columnNumber</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /**
   * Setter for the field <code>columnNumber</code>.
   *
   * @param columnNumber a {@link java.lang.Integer} object
   */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }
}
