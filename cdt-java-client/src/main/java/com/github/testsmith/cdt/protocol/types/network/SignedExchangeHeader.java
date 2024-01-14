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
import java.util.List;
import java.util.Map;

/**
 * Information about a signed exchange header.
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#cbor-representation
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class SignedExchangeHeader {

  private String requestUrl;

  private Integer responseCode;

  private Map<String, Object> responseHeaders;

  private List<SignedExchangeSignature> signatures;

  private String headerIntegrity;

  /**
   * Signed exchange request URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestUrl() {
    return requestUrl;
  }

  /**
   * Signed exchange request URL.
   *
   * @param requestUrl a {@link java.lang.String} object
   */
  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  /**
   * Signed exchange response code.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getResponseCode() {
    return responseCode;
  }

  /**
   * Signed exchange response code.
   *
   * @param responseCode a {@link java.lang.Integer} object
   */
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Signed exchange response headers.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Signed exchange response headers.
   *
   * @param responseHeaders a {@link java.util.Map} object
   */
  public void setResponseHeaders(Map<String, Object> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * Signed exchange response signature.
   *
   * @return a {@link java.util.List} object
   */
  public List<SignedExchangeSignature> getSignatures() {
    return signatures;
  }

  /**
   * Signed exchange response signature.
   *
   * @param signatures a {@link java.util.List} object
   */
  public void setSignatures(List<SignedExchangeSignature> signatures) {
    this.signatures = signatures;
  }

  /**
   * Signed exchange header integrity hash in the form of "sha256-&lt;base64-hash-value&gt;".
   *
   * @return a {@link java.lang.String} object
   */
  public String getHeaderIntegrity() {
    return headerIntegrity;
  }

  /**
   * Signed exchange header integrity hash in the form of "sha256-&lt;base64-hash-value&gt;".
   *
   * @param headerIntegrity a {@link java.lang.String} object
   */
  public void setHeaderIntegrity(String headerIntegrity) {
    this.headerIntegrity = headerIntegrity;
  }
}
