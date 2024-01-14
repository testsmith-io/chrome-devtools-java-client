package com.github.testsmith.cdt.protocol.types.security;

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
 * SafetyTipInfo class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SafetyTipInfo {

  private SafetyTipStatus safetyTipStatus;

  @Optional private String safeUrl;

  /**
   * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SafetyTipStatus} object
   */
  public SafetyTipStatus getSafetyTipStatus() {
    return safetyTipStatus;
  }

  /**
   * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
   *
   * @param safetyTipStatus a {@link
   *     com.github.testsmith.cdt.protocol.types.security.SafetyTipStatus} object
   */
  public void setSafetyTipStatus(SafetyTipStatus safetyTipStatus) {
    this.safetyTipStatus = safetyTipStatus;
  }

  /**
   * The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSafeUrl() {
    return safeUrl;
  }

  /**
   * The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches.
   *
   * @param safeUrl a {@link java.lang.String} object
   */
  public void setSafeUrl(String safeUrl) {
    this.safeUrl = safeUrl;
  }
}
