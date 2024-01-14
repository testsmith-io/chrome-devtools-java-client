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
import com.github.testsmith.cdt.protocol.types.network.ClientSecurityState;
import com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus;
import com.github.testsmith.cdt.protocol.types.network.IPAddressSpace;

/**
 * Details for a CORS related issue, e.g. a warning or error related to CORS RFC1918 enforcement.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CorsIssueDetails {

  private CorsErrorStatus corsErrorStatus;

  private Boolean isWarning;

  private AffectedRequest request;

  @Optional private String initiatorOrigin;

  @Optional private IPAddressSpace resourceIPAddressSpace;

  @Optional private ClientSecurityState clientSecurityState;

  /**
   * Getter for the field <code>corsErrorStatus</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus} object
   */
  public CorsErrorStatus getCorsErrorStatus() {
    return corsErrorStatus;
  }

  /**
   * Setter for the field <code>corsErrorStatus</code>.
   *
   * @param corsErrorStatus a {@link
   *     com.github.testsmith.cdt.protocol.types.network.CorsErrorStatus} object
   */
  public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
    this.corsErrorStatus = corsErrorStatus;
  }

  /**
   * Getter for the field <code>isWarning</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsWarning() {
    return isWarning;
  }

  /**
   * Setter for the field <code>isWarning</code>.
   *
   * @param isWarning a {@link java.lang.Boolean} object
   */
  public void setIsWarning(Boolean isWarning) {
    this.isWarning = isWarning;
  }

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
   * Getter for the field <code>initiatorOrigin</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInitiatorOrigin() {
    return initiatorOrigin;
  }

  /**
   * Setter for the field <code>initiatorOrigin</code>.
   *
   * @param initiatorOrigin a {@link java.lang.String} object
   */
  public void setInitiatorOrigin(String initiatorOrigin) {
    this.initiatorOrigin = initiatorOrigin;
  }

  /**
   * Getter for the field <code>resourceIPAddressSpace</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public IPAddressSpace getResourceIPAddressSpace() {
    return resourceIPAddressSpace;
  }

  /**
   * Setter for the field <code>resourceIPAddressSpace</code>.
   *
   * @param resourceIPAddressSpace a {@link
   *     com.github.testsmith.cdt.protocol.types.network.IPAddressSpace} object
   */
  public void setResourceIPAddressSpace(IPAddressSpace resourceIPAddressSpace) {
    this.resourceIPAddressSpace = resourceIPAddressSpace;
  }

  /**
   * Getter for the field <code>clientSecurityState</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ClientSecurityState} object
   */
  public ClientSecurityState getClientSecurityState() {
    return clientSecurityState;
  }

  /**
   * Setter for the field <code>clientSecurityState</code>.
   *
   * @param clientSecurityState a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ClientSecurityState} object
   */
  public void setClientSecurityState(ClientSecurityState clientSecurityState) {
    this.clientSecurityState = clientSecurityState;
  }
}
