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
import com.github.testsmith.cdt.protocol.types.network.BlockedSetCookieWithReason;
import com.github.testsmith.cdt.protocol.types.network.IPAddressSpace;
import java.util.List;
import java.util.Map;

/**
 * Fired when additional information about a responseReceived event is available from the network
 * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for it,
 * and responseReceivedExtraInfo may be fired before or after responseReceived.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ResponseReceivedExtraInfo {

  private String requestId;

  private List<BlockedSetCookieWithReason> blockedCookies;

  private Map<String, Object> headers;

  private IPAddressSpace resourceIPAddressSpace;

  @Optional private String headersText;

  /**
   * Request identifier. Used to match this information to another responseReceived event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Request identifier. Used to match this information to another responseReceived event.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A list of cookies which were not stored from the response along with the corresponding reasons
   * for blocking. The cookies here may not be valid due to syntax errors, which are represented by
   * the invalid cookie line string instead of a proper cookie.
   *
   * @return a {@link java.util.List} object
   */
  public List<BlockedSetCookieWithReason> getBlockedCookies() {
    return blockedCookies;
  }

  /**
   * A list of cookies which were not stored from the response along with the corresponding reasons
   * for blocking. The cookies here may not be valid due to syntax errors, which are represented by
   * the invalid cookie line string instead of a proper cookie.
   *
   * @param blockedCookies a {@link java.util.List} object
   */
  public void setBlockedCookies(List<BlockedSetCookieWithReason> blockedCookies) {
    this.blockedCookies = blockedCookies;
  }

  /**
   * Raw response headers as they were received over the wire.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * Raw response headers as they were received over the wire.
   *
   * @param headers a {@link java.util.Map} object
   */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   * The IP address space of the resource. The address space can only be determined once the
   * transport established the connection, so we can't send it in `requestWillBeSentExtraInfo`.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public IPAddressSpace getResourceIPAddressSpace() {
    return resourceIPAddressSpace;
  }

  /**
   * The IP address space of the resource. The address space can only be determined once the
   * transport established the connection, so we can't send it in `requestWillBeSentExtraInfo`.
   *
   * @param resourceIPAddressSpace a {@link
   *     com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public void setResourceIPAddressSpace(IPAddressSpace resourceIPAddressSpace) {
    this.resourceIPAddressSpace = resourceIPAddressSpace;
  }

  /**
   * Raw response header text as it was received over the wire. The raw text may not always be
   * available, such as in the case of HTTP/2 or QUIC.
   *
   * @return a {@link java.lang.String} object
   */
  public String getHeadersText() {
    return headersText;
  }

  /**
   * Raw response header text as it was received over the wire. The raw text may not always be
   * available, such as in the case of HTTP/2 or QUIC.
   *
   * @param headersText a {@link java.lang.String} object
   */
  public void setHeadersText(String headersText) {
    this.headersText = headersText;
  }
}
