package com.github.testsmith.cdt.protocol.events.webaudio;

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
 * Notifies that two AudioNodes are connected.
 *
 * @author roy
 * @version $Id: $Id
 */
public class NodesConnected {

  private String contextId;

  private String sourceId;

  private String destinationId;

  @Optional private Double sourceOutputIndex;

  @Optional private Double destinationInputIndex;

  /**
   * Getter for the field <code>contextId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getContextId() {
    return contextId;
  }

  /**
   * Setter for the field <code>contextId</code>.
   *
   * @param contextId a {@link java.lang.String} object
   */
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   * Getter for the field <code>sourceId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceId() {
    return sourceId;
  }

  /**
   * Setter for the field <code>sourceId</code>.
   *
   * @param sourceId a {@link java.lang.String} object
   */
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  /**
   * Getter for the field <code>destinationId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDestinationId() {
    return destinationId;
  }

  /**
   * Setter for the field <code>destinationId</code>.
   *
   * @param destinationId a {@link java.lang.String} object
   */
  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  /**
   * Getter for the field <code>sourceOutputIndex</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSourceOutputIndex() {
    return sourceOutputIndex;
  }

  /**
   * Setter for the field <code>sourceOutputIndex</code>.
   *
   * @param sourceOutputIndex a {@link java.lang.Double} object
   */
  public void setSourceOutputIndex(Double sourceOutputIndex) {
    this.sourceOutputIndex = sourceOutputIndex;
  }

  /**
   * Getter for the field <code>destinationInputIndex</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDestinationInputIndex() {
    return destinationInputIndex;
  }

  /**
   * Setter for the field <code>destinationInputIndex</code>.
   *
   * @param destinationInputIndex a {@link java.lang.Double} object
   */
  public void setDestinationInputIndex(Double destinationInputIndex) {
    this.destinationInputIndex = destinationInputIndex;
  }
}
