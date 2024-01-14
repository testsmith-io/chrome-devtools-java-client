package com.github.testsmith.cdt.protocol.events.cast;

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
 * This is fired whenever the outstanding issue/error message changes. |issueMessage| is empty if
 * there is no issue.
 *
 * @author roy
 * @version $Id: $Id
 */
public class IssueUpdated {

  private String issueMessage;

  /**
   * Getter for the field <code>issueMessage</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIssueMessage() {
    return issueMessage;
  }

  /**
   * Setter for the field <code>issueMessage</code>.
   *
   * @param issueMessage a {@link java.lang.String} object
   */
  public void setIssueMessage(String issueMessage) {
    this.issueMessage = issueMessage;
  }
}
