package com.github.testsmith.cdt.protocol.events.console;

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

import com.github.testsmith.cdt.protocol.types.console.ConsoleMessage;

/**
 * Issued when new console message is added.
 *
 * @author roy
 * @version $Id: $Id
 */
public class MessageAdded {

  private ConsoleMessage message;

  /**
   * Console message that has been added.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessage} object
   */
  public ConsoleMessage getMessage() {
    return message;
  }

  /**
   * Console message that has been added.
   *
   * @param message a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessage} object
   */
  public void setMessage(ConsoleMessage message) {
    this.message = message;
  }
}
