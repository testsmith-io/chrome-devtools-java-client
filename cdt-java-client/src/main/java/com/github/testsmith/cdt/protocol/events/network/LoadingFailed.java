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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.network.BlockedReason;
import com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus;
import com.github.testsmith.cdt.protocol.types.network.ResourceType;

/**
 * Fired when HTTP request has failed to load.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LoadingFailed {

  private String requestId;

  private Double timestamp;

  private ResourceType type;

  private String errorText;

  @Optional private Boolean canceled;

  @Optional private BlockedReason blockedReason;

  @Optional private CorsErrorStatus corsErrorStatus;

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
   * Timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Timestamp.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Resource type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getType() {
    return type;
  }

  /**
   * Resource type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /**
   * User friendly error message.
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorText() {
    return errorText;
  }

  /**
   * User friendly error message.
   *
   * @param errorText a {@link java.lang.String} object
   */
  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }

  /**
   * True if loading was canceled.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCanceled() {
    return canceled;
  }

  /**
   * True if loading was canceled.
   *
   * @param canceled a {@link java.lang.Boolean} object
   */
  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  /**
   * The reason why loading was blocked, if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.BlockedReason} object
   */
  public BlockedReason getBlockedReason() {
    return blockedReason;
  }

  /**
   * The reason why loading was blocked, if any.
   *
   * @param blockedReason a {@link com.github.testsmith.cdt.protocol.types.network.BlockedReason}
   *     object
   */
  public void setBlockedReason(BlockedReason blockedReason) {
    this.blockedReason = blockedReason;
  }

  /**
   * The reason why loading was blocked by CORS, if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus} object
   */
  public CorsErrorStatus getCorsErrorStatus() {
    return corsErrorStatus;
  }

  /**
   * The reason why loading was blocked by CORS, if any.
   *
   * @param corsErrorStatus a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus} object
   */
  public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
    this.corsErrorStatus = corsErrorStatus;
  }
}
