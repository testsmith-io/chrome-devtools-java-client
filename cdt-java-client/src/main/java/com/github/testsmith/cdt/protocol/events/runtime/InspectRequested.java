package com.github.testsmith.cdt.protocol.events.runtime;

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

import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;
import java.util.Map;

/**
 * Issued when object should be inspected (for example, as a result of inspect() command line API
 * call).
 *
 * @author roy
 * @version $Id: $Id
 */
public class InspectRequested {

  private RemoteObject object;

  private Map<String, Object> hints;

  /**
   * Getter for the field <code>object</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getObject() {
    return object;
  }

  /**
   * Setter for the field <code>object</code>.
   *
   * @param object a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setObject(RemoteObject object) {
    this.object = object;
  }

  /**
   * Getter for the field <code>hints</code>.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHints() {
    return hints;
  }

  /**
   * Setter for the field <code>hints</code>.
   *
   * @param hints a {@link java.util.Map} object
   */
  public void setHints(Map<String, Object> hints) {
    this.hints = hints;
  }
}
