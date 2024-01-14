package com.github.testsmith.cdt.protocol.events.tethering;

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

/**
 * Informs that port was successfully bound and got a specified connection id.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Accepted {

  private Integer port;

  private String connectionId;

  /**
   * Port number that was successfully bound.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Port number that was successfully bound.
   *
   * @param port a {@link java.lang.Integer} object
   */
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Connection id to be used.
   *
   * @return a {@link java.lang.String} object
   */
  public String getConnectionId() {
    return connectionId;
  }

  /**
   * Connection id to be used.
   *
   * @param connectionId a {@link java.lang.String} object
   */
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }
}
