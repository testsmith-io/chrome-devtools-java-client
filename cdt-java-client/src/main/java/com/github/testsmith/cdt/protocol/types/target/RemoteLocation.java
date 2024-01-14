package com.github.testsmith.cdt.protocol.types.target;

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
 * RemoteLocation class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class RemoteLocation {

  private String host;

  private Integer port;

  /**
   * Getter for the field <code>host</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getHost() {
    return host;
  }

  /**
   * Setter for the field <code>host</code>.
   *
   * @param host a {@link java.lang.String} object
   */
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Getter for the field <code>port</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for the field <code>port</code>.
   *
   * @param port a {@link java.lang.Integer} object
   */
  public void setPort(Integer port) {
    this.port = port;
  }
}
