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
import com.github.testsmith.cdt.protocol.types.network.TrustTokenOperationType;

/**
 * Fired exactly once for each Trust Token operation. Depending on the type of the operation and
 * whether the operation succeeded or failed, the event is fired before the corresponding request
 * was sent or after the response was received.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class TrustTokenOperationDone {

  private TrustTokenOperationDoneStatus status;

  private TrustTokenOperationType type;

  private String requestId;

  @Optional private String topLevelOrigin;

  @Optional private String issuerOrigin;

  @Optional private Integer issuedTokenCount;

  /**
   * Detailed success or error status of the operation. 'AlreadyExists' also signifies a successful
   * operation, as the result of the operation already exists und thus, the operation was abort
   * preemptively (e.g. a cache hit).
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.events.network.TrustTokenOperationDoneStatus} object
   */
  public TrustTokenOperationDoneStatus getStatus() {
    return status;
  }

  /**
   * Detailed success or error status of the operation. 'AlreadyExists' also signifies a successful
   * operation, as the result of the operation already exists und thus, the operation was abort
   * preemptively (e.g. a cache hit).
   *
   * @param status a {@link
   *     com.github.testsmith.cdt.protocol.events.network.TrustTokenOperationDoneStatus} object
   */
  public void setStatus(TrustTokenOperationDoneStatus status) {
    this.status = status;
  }

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenOperationType}
   *     object
   */
  public TrustTokenOperationType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenOperationType}
   *     object
   */
  public void setType(TrustTokenOperationType type) {
    this.type = type;
  }

  /**
   * Getter for the field <code>requestId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Setter for the field <code>requestId</code>.
   *
   * @param requestId a {@link java.lang.String} object
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Top level origin. The context in which the operation was attempted.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTopLevelOrigin() {
    return topLevelOrigin;
  }

  /**
   * Top level origin. The context in which the operation was attempted.
   *
   * @param topLevelOrigin a {@link java.lang.String} object
   */
  public void setTopLevelOrigin(String topLevelOrigin) {
    this.topLevelOrigin = topLevelOrigin;
  }

  /**
   * Origin of the issuer in case of a "Issuance" or "Redemption" operation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIssuerOrigin() {
    return issuerOrigin;
  }

  /**
   * Origin of the issuer in case of a "Issuance" or "Redemption" operation.
   *
   * @param issuerOrigin a {@link java.lang.String} object
   */
  public void setIssuerOrigin(String issuerOrigin) {
    this.issuerOrigin = issuerOrigin;
  }

  /**
   * The number of obtained Trust Tokens on a successful "Issuance" operation.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getIssuedTokenCount() {
    return issuedTokenCount;
  }

  /**
   * The number of obtained Trust Tokens on a successful "Issuance" operation.
   *
   * @param issuedTokenCount a {@link java.lang.Integer} object
   */
  public void setIssuedTokenCount(Integer issuedTokenCount) {
    this.issuedTokenCount = issuedTokenCount;
  }
}
