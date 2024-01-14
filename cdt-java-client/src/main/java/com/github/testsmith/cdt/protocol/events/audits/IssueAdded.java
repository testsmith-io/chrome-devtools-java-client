package com.github.testsmith.cdt.protocol.events.audits;

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

import com.github.testsmith.cdt.protocol.types.audits.InspectorIssue;

/**
 * IssueAdded class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class IssueAdded {

  private InspectorIssue issue;

  /**
   * Getter for the field <code>issue</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssue} object
   */
  public InspectorIssue getIssue() {
    return issue;
  }

  /**
   * Setter for the field <code>issue</code>.
   *
   * @param issue a {@link com.github.testsmith.cdt.protocol.types.audits.InspectorIssue} object
   */
  public void setIssue(InspectorIssue issue) {
    this.issue = issue;
  }
}
