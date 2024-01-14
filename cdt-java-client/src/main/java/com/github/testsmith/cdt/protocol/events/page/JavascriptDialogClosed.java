package com.github.testsmith.cdt.protocol.events.page;

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
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
 * closed.
 *
 * @author roy
 * @version $Id: $Id
 */
public class JavascriptDialogClosed {

  private Boolean result;

  private String userInput;

  /**
   * Whether dialog was confirmed.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getResult() {
    return result;
  }

  /**
   * Whether dialog was confirmed.
   *
   * @param result a {@link java.lang.Boolean} object
   */
  public void setResult(Boolean result) {
    this.result = result;
  }

  /**
   * User input in case of prompt.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserInput() {
    return userInput;
  }

  /**
   * User input in case of prompt.
   *
   * @param userInput a {@link java.lang.String} object
   */
  public void setUserInput(String userInput) {
    this.userInput = userInput;
  }
}
