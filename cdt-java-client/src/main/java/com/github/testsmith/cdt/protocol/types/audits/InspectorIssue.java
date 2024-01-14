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
 * An inspector issue reported from the back-end.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InspectorIssue {

  private InspectorIssueCode code;

  private InspectorIssueDetails details;

  /**
   * Getter for the field <code>code</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssueCode} object
   */
  public InspectorIssueCode getCode() {
    return code;
  }

  /**
   * Setter for the field <code>code</code>.
   *
   * @param code a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssueCode} object
   */
  public void setCode(InspectorIssueCode code) {
    this.code = code;
  }

  /**
   * Getter for the field <code>details</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssueDetails} object
   */
  public InspectorIssueDetails getDetails() {
    return details;
  }

  /**
   * Setter for the field <code>details</code>.
   *
   * @param details a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssueDetails}
   *     object
   */
  public void setDetails(InspectorIssueDetails details) {
    this.details = details;
  }
}
