package com.github.testsmith.cdt.protocol.types.network;

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
 * SecurityIsolationStatus class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SecurityIsolationStatus {

  @Optional private CrossOriginOpenerPolicyStatus coop;

  @Optional private CrossOriginEmbedderPolicyStatus coep;

  /**
   * Getter for the field <code>coop</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.CrossOriginOpenerPolicyStatus}
   *     object
   */
  public CrossOriginOpenerPolicyStatus getCoop() {
    return coop;
  }

  /**
   * Setter for the field <code>coop</code>.
   *
   * @param coop a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CrossOriginOpenerPolicyStatus} object
   */
  public void setCoop(CrossOriginOpenerPolicyStatus coop) {
    this.coop = coop;
  }

  /**
   * Getter for the field <code>coep</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CrossOriginEmbedderPolicyStatus} object
   */
  public CrossOriginEmbedderPolicyStatus getCoep() {
    return coep;
  }

  /**
   * Setter for the field <code>coep</code>.
   *
   * @param coep a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CrossOriginEmbedderPolicyStatus} object
   */
  public void setCoep(CrossOriginEmbedderPolicyStatus coep) {
    this.coep = coep;
  }
}
