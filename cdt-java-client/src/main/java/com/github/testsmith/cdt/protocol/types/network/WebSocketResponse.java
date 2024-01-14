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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.Map;

/**
 * WebSocket response data.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WebSocketResponse {

  private Integer status;

  private String statusText;

  private Map<String, Object> headers;

  @Optional private String headersText;

  @Optional private Map<String, Object> requestHeaders;

  @Optional private String requestHeadersText;

  /**
   * HTTP response status code.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * HTTP response status code.
   *
   * @param status a {@link java.lang.Integer} object
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * HTTP response status text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatusText() {
    return statusText;
  }

  /**
   * HTTP response status text.
   *
   * @param statusText a {@link java.lang.String} object
   */
  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  /**
   * HTTP response headers.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * HTTP response headers.
   *
   * @param headers a {@link java.util.Map} object
   */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   * HTTP response headers text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getHeadersText() {
    return headersText;
  }

  /**
   * HTTP response headers text.
   *
   * @param headersText a {@link java.lang.String} object
   */
  public void setHeadersText(String headersText) {
    this.headersText = headersText;
  }

  /**
   * HTTP request headers.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getRequestHeaders() {
    return requestHeaders;
  }

  /**
   * HTTP request headers.
   *
   * @param requestHeaders a {@link java.util.Map} object
   */
  public void setRequestHeaders(Map<String, Object> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  /**
   * HTTP request headers text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestHeadersText() {
    return requestHeadersText;
  }

  /**
   * HTTP request headers text.
   *
   * @param requestHeadersText a {@link java.lang.String} object
   */
  public void setRequestHeadersText(String requestHeadersText) {
    this.requestHeadersText = requestHeadersText;
  }
}
