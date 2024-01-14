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
import java.util.Map;

/**
 * An object providing the result of a network resource load.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class LoadNetworkResourcePageResult {

  private Boolean success;

  @Optional private Double netError;

  @Optional private String netErrorName;

  @Optional private Double httpStatusCode;

  @Optional private String stream;

  @Optional private Map<String, Object> headers;

  /**
   * Getter for the field <code>success</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSuccess() {
    return success;
  }

  /**
   * Setter for the field <code>success</code>.
   *
   * @param success a {@link java.lang.Boolean} object
   */
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * Optional values used for error reporting.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getNetError() {
    return netError;
  }

  /**
   * Optional values used for error reporting.
   *
   * @param netError a {@link java.lang.Double} object
   */
  public void setNetError(Double netError) {
    this.netError = netError;
  }

  /**
   * Getter for the field <code>netErrorName</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetErrorName() {
    return netErrorName;
  }

  /**
   * Setter for the field <code>netErrorName</code>.
   *
   * @param netErrorName a {@link java.lang.String} object
   */
  public void setNetErrorName(String netErrorName) {
    this.netErrorName = netErrorName;
  }

  /**
   * Getter for the field <code>httpStatusCode</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Setter for the field <code>httpStatusCode</code>.
   *
   * @param httpStatusCode a {@link java.lang.Double} object
   */
  public void setHttpStatusCode(Double httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   * If successful, one of the following two fields holds the result.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStream() {
    return stream;
  }

  /**
   * If successful, one of the following two fields holds the result.
   *
   * @param stream a {@link java.lang.String} object
   */
  public void setStream(String stream) {
    this.stream = stream;
  }

  /**
   * Response headers.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * Response headers.
   *
   * @param headers a {@link java.util.Map} object
   */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }
}
