package com.github.testsmith.cdt.protocol.types.runtime;

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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This
 * allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class StackTraceId {

  private String id;

  @Optional private String debuggerId;

  /**
   * Getter for the field <code>id</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * Setter for the field <code>id</code>.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for the field <code>debuggerId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDebuggerId() {
    return debuggerId;
  }

  /**
   * Setter for the field <code>debuggerId</code>.
   *
   * @param debuggerId a {@link java.lang.String} object
   */
  public void setDebuggerId(String debuggerId) {
    this.debuggerId = debuggerId;
  }
}
