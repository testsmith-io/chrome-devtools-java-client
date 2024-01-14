package com.github.testsmith.cdt.protocol.types.network;

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
import java.util.List;

/**
 * Information about a signed exchange response.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SignedExchangeInfo {

  private Response outerResponse;

  @Optional private SignedExchangeHeader header;

  @Optional private SecurityDetails securityDetails;

  @Optional private List<SignedExchangeError> errors;

  /**
   * The outer response of signed HTTP exchange which was received from network.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public Response getOuterResponse() {
    return outerResponse;
  }

  /**
   * The outer response of signed HTTP exchange which was received from network.
   *
   * @param outerResponse a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public void setOuterResponse(Response outerResponse) {
    this.outerResponse = outerResponse;
  }

  /**
   * Information about the signed exchange header.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SignedExchangeHeader} object
   */
  public SignedExchangeHeader getHeader() {
    return header;
  }

  /**
   * Information about the signed exchange header.
   *
   * @param header a {@link com.github.testsmith.cdt.protocol.types.network.SignedExchangeHeader}
   *     object
   */
  public void setHeader(SignedExchangeHeader header) {
    this.header = header;
  }

  /**
   * Security details for the signed exchange header.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SecurityDetails} object
   */
  public SecurityDetails getSecurityDetails() {
    return securityDetails;
  }

  /**
   * Security details for the signed exchange header.
   *
   * @param securityDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.network.SecurityDetails} object
   */
  public void setSecurityDetails(SecurityDetails securityDetails) {
    this.securityDetails = securityDetails;
  }

  /**
   * Errors occurred while handling the signed exchagne.
   *
   * @return a {@link java.util.List} object
   */
  public List<SignedExchangeError> getErrors() {
    return errors;
  }

  /**
   * Errors occurred while handling the signed exchagne.
   *
   * @param errors a {@link java.util.List} object
   */
  public void setErrors(List<SignedExchangeError> errors) {
    this.errors = errors;
  }
}
