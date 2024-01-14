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

/**
 * Fired when HTTP request has finished loading.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LoadingFinished {

  private String requestId;

  private Double timestamp;

  private Double encodedDataLength;

  @Optional private Boolean shouldReportCorbBlocking;

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
   * Total number of bytes received for this request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEncodedDataLength() {
    return encodedDataLength;
  }

  /**
   * Total number of bytes received for this request.
   *
   * @param encodedDataLength a {@link java.lang.Double} object
   */
  public void setEncodedDataLength(Double encodedDataLength) {
    this.encodedDataLength = encodedDataLength;
  }

  /**
   * Set when 1) response was blocked by Cross-Origin Read Blocking and also 2) this needs to be
   * reported to the DevTools console.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getShouldReportCorbBlocking() {
    return shouldReportCorbBlocking;
  }

  /**
   * Set when 1) response was blocked by Cross-Origin Read Blocking and also 2) this needs to be
   * reported to the DevTools console.
   *
   * @param shouldReportCorbBlocking a {@link java.lang.Boolean} object
   */
  public void setShouldReportCorbBlocking(Boolean shouldReportCorbBlocking) {
    this.shouldReportCorbBlocking = shouldReportCorbBlocking;
  }
}
