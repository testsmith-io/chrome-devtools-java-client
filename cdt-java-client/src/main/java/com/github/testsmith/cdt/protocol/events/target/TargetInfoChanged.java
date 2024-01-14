package com.github.testsmith.cdt.protocol.events.target;

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

import com.github.testsmith.cdt.protocol.types.target.TargetInfo;

/**
 * Issued when some information about a target has changed. This only happens between
 * `targetCreated` and `targetDestroyed`.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TargetInfoChanged {

  private TargetInfo targetInfo;

  /**
   * Getter for the field <code>targetInfo</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.target.TargetInfo} object
   */
  public TargetInfo getTargetInfo() {
    return targetInfo;
  }

  /**
   * Setter for the field <code>targetInfo</code>.
   *
   * @param targetInfo a {@link com.github.testsmith.cdt.protocol.types.target.TargetInfo} object
   */
  public void setTargetInfo(TargetInfo targetInfo) {
    this.targetInfo = targetInfo;
  }
}