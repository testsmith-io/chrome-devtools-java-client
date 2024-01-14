package com.github.testsmith.cdt.protocol.events.network;

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
import com.github.testsmith.cdt.protocol.types.network.SignedExchangeInfo;

/**
 * Fired when a signed exchange was received over the network
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SignedExchangeReceived {

  private String requestId;

  private SignedExchangeInfo info;

  /**
   * Request identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Request identifier.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Information about the signed exchange response.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SignedExchangeInfo} object
   */
  public SignedExchangeInfo getInfo() {
    return info;
  }

  /**
   * Information about the signed exchange response.
   *
   * @param info a {@link com.github.testsmith.cdt.protocol.types.network.SignedExchangeInfo} object
   */
  public void setInfo(SignedExchangeInfo info) {
    this.info = info;
  }
}
