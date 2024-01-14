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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.page.DialogType;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
 * open.
 *
 * @author roy
 * @version $Id: $Id
 */
public class JavascriptDialogOpening {

  private String url;

  private String message;

  private DialogType type;

  private Boolean hasBrowserHandler;

  @Optional private String defaultPrompt;

  /**
   * Frame url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Frame url.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Message that will be displayed by the dialog.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * Message that will be displayed by the dialog.
   *
   * @param message a {@link java.lang.String} object
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Dialog type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.DialogType} object
   */
  public DialogType getType() {
    return type;
  }

  /**
   * Dialog type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.page.DialogType} object
   */
  public void setType(DialogType type) {
    this.type = type;
  }

  /**
   * True iff browser is capable showing or acting on the given dialog. When browser has no dialog
   * handler for given target, calling alert while Page domain is engaged will stall the page
   * execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasBrowserHandler() {
    return hasBrowserHandler;
  }

  /**
   * True iff browser is capable showing or acting on the given dialog. When browser has no dialog
   * handler for given target, calling alert while Page domain is engaged will stall the page
   * execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
   *
   * @param hasBrowserHandler a {@link java.lang.Boolean} object
   */
  public void setHasBrowserHandler(Boolean hasBrowserHandler) {
    this.hasBrowserHandler = hasBrowserHandler;
  }

  /**
   * Default dialog prompt.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDefaultPrompt() {
    return defaultPrompt;
  }

  /**
   * Default dialog prompt.
   *
   * @param defaultPrompt a {@link java.lang.String} object
   */
  public void setDefaultPrompt(String defaultPrompt) {
    this.defaultPrompt = defaultPrompt;
  }
}
