package com.github.testsmith.cdt.protocol.types.audits;

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
 * Details for a issue arising from an SAB being instantiated in, or transferred to a context that
 * is not cross-origin isolated.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SharedArrayBufferIssueDetails {

  private SourceCodeLocation sourceCodeLocation;

  private Boolean isWarning;

  private SharedArrayBufferIssueType type;

  /**
   * Getter for the field <code>sourceCodeLocation</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SourceCodeLocation} object
   */
  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  /**
   * Setter for the field <code>sourceCodeLocation</code>.
   *
   * @param sourceCodeLocation a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.SourceCodeLocation} object
   */
  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
  }

  /**
   * Getter for the field <code>isWarning</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsWarning() {
    return isWarning;
  }

  /**
   * Setter for the field <code>isWarning</code>.
   *
   * @param isWarning a {@link java.lang.Boolean} object
   */
  public void setIsWarning(Boolean isWarning) {
    this.isWarning = isWarning;
  }

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.SharedArrayBufferIssueType}
   *     object
   */
  public SharedArrayBufferIssueType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.audits.SharedArrayBufferIssueType}
   *     object
   */
  public void setType(SharedArrayBufferIssueType type) {
    this.type = type;
  }
}
