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

/**
 * ClientSecurityState class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ClientSecurityState {

  private Boolean initiatorIsSecureContext;

  private IPAddressSpace initiatorIPAddressSpace;

  private PrivateNetworkRequestPolicy privateNetworkRequestPolicy;

  /**
   * Getter for the field <code>initiatorIsSecureContext</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getInitiatorIsSecureContext() {
    return initiatorIsSecureContext;
  }

  /**
   * Setter for the field <code>initiatorIsSecureContext</code>.
   *
   * @param initiatorIsSecureContext a {@link java.lang.Boolean} object
   */
  public void setInitiatorIsSecureContext(Boolean initiatorIsSecureContext) {
    this.initiatorIsSecureContext = initiatorIsSecureContext;
  }

  /**
   * Getter for the field <code>initiatorIPAddressSpace</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public IPAddressSpace getInitiatorIPAddressSpace() {
    return initiatorIPAddressSpace;
  }

  /**
   * Setter for the field <code>initiatorIPAddressSpace</code>.
   *
   * @param initiatorIPAddressSpace a {@link
   *     com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public void setInitiatorIPAddressSpace(IPAddressSpace initiatorIPAddressSpace) {
    this.initiatorIPAddressSpace = initiatorIPAddressSpace;
  }

  /**
   * Getter for the field <code>privateNetworkRequestPolicy</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.PrivateNetworkRequestPolicy}
   *     object
   */
  public PrivateNetworkRequestPolicy getPrivateNetworkRequestPolicy() {
    return privateNetworkRequestPolicy;
  }

  /**
   * Setter for the field <code>privateNetworkRequestPolicy</code>.
   *
   * @param privateNetworkRequestPolicy a {@link
   *     com.github.testsmith.cdt.protocol.types.network.PrivateNetworkRequestPolicy} object
   */
  public void setPrivateNetworkRequestPolicy(
      PrivateNetworkRequestPolicy privateNetworkRequestPolicy) {
    this.privateNetworkRequestPolicy = privateNetworkRequestPolicy;
  }
}
