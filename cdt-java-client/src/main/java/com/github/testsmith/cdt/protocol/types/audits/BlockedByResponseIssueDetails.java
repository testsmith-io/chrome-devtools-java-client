package com.github.testsmith.cdt.protocol.types.audits;

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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Details for a request that has been blocked with the BLOCKED_BY_RESPONSE code. Currently only
 * used for COEP/COOP, but may be extended to include some CSP errors in the future.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BlockedByResponseIssueDetails {

  private AffectedRequest request;

  @Optional private AffectedFrame parentFrame;

  @Optional private AffectedFrame blockedFrame;

  private BlockedByResponseReason reason;

  /**
   * Getter for the field <code>request</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public AffectedRequest getRequest() {
    return request;
  }

  /**
   * Setter for the field <code>request</code>.
   *
   * @param request a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedRequest} object
   */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  /**
   * Getter for the field <code>parentFrame</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getParentFrame() {
    return parentFrame;
  }

  /**
   * Setter for the field <code>parentFrame</code>.
   *
   * @param parentFrame a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame}
   *     object
   */
  public void setParentFrame(AffectedFrame parentFrame) {
    this.parentFrame = parentFrame;
  }

  /**
   * Getter for the field <code>blockedFrame</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getBlockedFrame() {
    return blockedFrame;
  }

  /**
   * Setter for the field <code>blockedFrame</code>.
   *
   * @param blockedFrame a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame}
   *     object
   */
  public void setBlockedFrame(AffectedFrame blockedFrame) {
    this.blockedFrame = blockedFrame;
  }

  /**
   * Getter for the field <code>reason</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.BlockedByResponseReason} object
   */
  public BlockedByResponseReason getReason() {
    return reason;
  }

  /**
   * Setter for the field <code>reason</code>.
   *
   * @param reason a {@link com.github.testsmith.cdt.protocol.types.audits.BlockedByResponseReason}
   *     object
   */
  public void setReason(BlockedByResponseReason reason) {
    this.reason = reason;
  }
}
