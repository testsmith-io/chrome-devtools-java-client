package com.github.testsmith.cdt.protocol.events.applicationcache;

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
 * NetworkStateUpdated class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class NetworkStateUpdated {

  private Boolean isNowOnline;

  /**
   * Getter for the field <code>isNowOnline</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsNowOnline() {
    return isNowOnline;
  }

  /**
   * Setter for the field <code>isNowOnline</code>.
   *
   * @param isNowOnline a {@link java.lang.Boolean} object
   */
  public void setIsNowOnline(Boolean isNowOnline) {
    this.isNowOnline = isNowOnline;
  }
}
