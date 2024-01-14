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
import com.github.testsmith.cdt.protocol.types.network.Initiator;

/**
 * Fired upon WebTransport creation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WebTransportCreated {

  private String transportId;

  private String url;

  private Double timestamp;

  @Optional private Initiator initiator;

  /**
   * WebTransport identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTransportId() {
    return transportId;
  }

  /**
   * WebTransport identifier.
   *
   * @param transportId a {@link java.lang.String} object
   */
  public void setTransportId(String transportId) {
    this.transportId = transportId;
  }

  /**
   * WebTransport request URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * WebTransport request URL.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
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
   * Request initiator.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Initiator} object
   */
  public Initiator getInitiator() {
    return initiator;
  }

  /**
   * Request initiator.
   *
   * @param initiator a {@link com.github.testsmith.cdt.protocol.types.network.Initiator} object
   */
  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }
}
