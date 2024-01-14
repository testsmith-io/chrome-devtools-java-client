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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;

/**
 * Location range within one script.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class LocationRange {

  private String scriptId;

  private ScriptPosition start;

  private ScriptPosition end;

  /**
   * Getter for the field <code>scriptId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * Setter for the field <code>scriptId</code>.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * Getter for the field <code>start</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptPosition} object
   */
  public ScriptPosition getStart() {
    return start;
  }

  /**
   * Setter for the field <code>start</code>.
   *
   * @param start a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptPosition} object
   */
  public void setStart(ScriptPosition start) {
    this.start = start;
  }

  /**
   * Getter for the field <code>end</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptPosition} object
   */
  public ScriptPosition getEnd() {
    return end;
  }

  /**
   * Setter for the field <code>end</code>.
   *
   * @param end a {@link com.github.testsmith.cdt.protocol.types.debugger.ScriptPosition} object
   */
  public void setEnd(ScriptPosition end) {
    this.end = end;
  }
}
