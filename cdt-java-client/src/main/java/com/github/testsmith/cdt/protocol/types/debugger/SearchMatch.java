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

/**
 * Search match for resource.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SearchMatch {

  private Double lineNumber;

  private String lineContent;

  /**
   * Line number in resource content.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number in resource content.
   *
   * @param lineNumber a {@link java.lang.Double} object
   */
  public void setLineNumber(Double lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Line with match content.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLineContent() {
    return lineContent;
  }

  /**
   * Line with match content.
   *
   * @param lineContent a {@link java.lang.String} object
   */
  public void setLineContent(String lineContent) {
    this.lineContent = lineContent;
  }
}
