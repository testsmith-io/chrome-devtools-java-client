package com.github.testsmith.cdt.protocol.events.security;

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
import com.github.testsmith.cdt.protocol.types.security.VisibleSecurityState;

/**
 * The security state of the page changed.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class VisibleSecurityStateChanged {

  private VisibleSecurityState visibleSecurityState;

  /**
   * Security state information about the page.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.VisibleSecurityState} object
   */
  public VisibleSecurityState getVisibleSecurityState() {
    return visibleSecurityState;
  }

  /**
   * Security state information about the page.
   *
   * @param visibleSecurityState a {@link
   *     com.github.testsmith.cdt.protocol.types.security.VisibleSecurityState} object
   */
  public void setVisibleSecurityState(VisibleSecurityState visibleSecurityState) {
    this.visibleSecurityState = visibleSecurityState;
  }
}
