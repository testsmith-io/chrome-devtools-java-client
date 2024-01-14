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
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.network.BlockedCookieWithReason;
import com.github.testsmith.cdt.protocol.types.network.ClientSecurityState;
import java.util.List;
import java.util.Map;

/**
 * Fired when additional information about a requestWillBeSent event is available from the network
 * stack. Not every requestWillBeSent event will have an additional requestWillBeSentExtraInfo fired
 * for it, and there is no guarantee whether requestWillBeSent or requestWillBeSentExtraInfo will be
 * fired first for the same request.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class RequestWillBeSentExtraInfo {

  private String requestId;

  private List<BlockedCookieWithReason> associatedCookies;

  private Map<String, Object> headers;

  @Optional private ClientSecurityState clientSecurityState;

  /**
   * Request identifier. Used to match this information to an existing requestWillBeSent event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Request identifier. Used to match this information to an existing requestWillBeSent event.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   *
   * @return a {@link java.util.List} object
   */
  public List<BlockedCookieWithReason> getAssociatedCookies() {
    return associatedCookies;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   *
   * @param associatedCookies a {@link java.util.List} object
   */
  public void setAssociatedCookies(List<BlockedCookieWithReason> associatedCookies) {
    this.associatedCookies = associatedCookies;
  }

  /**
   * Raw request headers as they will be sent over the wire.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * Raw request headers as they will be sent over the wire.
   *
   * @param headers a {@link java.util.Map} object
   */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   * The client security state set for the request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ClientSecurityState} object
   */
  public ClientSecurityState getClientSecurityState() {
    return clientSecurityState;
  }

  /**
   * The client security state set for the request.
   *
   * @param clientSecurityState a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ClientSecurityState} object
   */
  public void setClientSecurityState(ClientSecurityState clientSecurityState) {
    this.clientSecurityState = clientSecurityState;
  }
}
