package com.github.testsmith.cdt.protocol.types.cachestorage;

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

import java.util.List;

/**
 * Data entry.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DataEntry {

  private String requestURL;

  private String requestMethod;

  private List<Header> requestHeaders;

  private Double responseTime;

  private Integer responseStatus;

  private String responseStatusText;

  private CachedResponseType responseType;

  private List<Header> responseHeaders;

  /**
   * Request URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestURL() {
    return requestURL;
  }

  /**
   * Request URL.
   *
   * @param requestURL a {@link java.lang.String} object
   */
  public void setRequestURL(String requestURL) {
    this.requestURL = requestURL;
  }

  /**
   * Request method.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestMethod() {
    return requestMethod;
  }

  /**
   * Request method.
   *
   * @param requestMethod a {@link java.lang.String} object
   */
  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }

  /**
   * Request headers
   *
   * @return a {@link java.util.List} object
   */
  public List<Header> getRequestHeaders() {
    return requestHeaders;
  }

  /**
   * Request headers
   *
   * @param requestHeaders a {@link java.util.List} object
   */
  public void setRequestHeaders(List<Header> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  /**
   * Number of seconds since epoch.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getResponseTime() {
    return responseTime;
  }

  /**
   * Number of seconds since epoch.
   *
   * @param responseTime a {@link java.lang.Double} object
   */
  public void setResponseTime(Double responseTime) {
    this.responseTime = responseTime;
  }

  /**
   * HTTP response status code.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getResponseStatus() {
    return responseStatus;
  }

  /**
   * HTTP response status code.
   *
   * @param responseStatus a {@link java.lang.Integer} object
   */
  public void setResponseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
  }

  /**
   * HTTP response status text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getResponseStatusText() {
    return responseStatusText;
  }

  /**
   * HTTP response status text.
   *
   * @param responseStatusText a {@link java.lang.String} object
   */
  public void setResponseStatusText(String responseStatusText) {
    this.responseStatusText = responseStatusText;
  }

  /**
   * HTTP response type
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.cachestorage.CachedResponseType}
   *     object
   */
  public CachedResponseType getResponseType() {
    return responseType;
  }

  /**
   * HTTP response type
   *
   * @param responseType a {@link
   *     com.github.testsmith.cdt.protocol.types.cachestorage.CachedResponseType} object
   */
  public void setResponseType(CachedResponseType responseType) {
    this.responseType = responseType;
  }

  /**
   * Response headers
   *
   * @return a {@link java.util.List} object
   */
  public List<Header> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Response headers
   *
   * @param responseHeaders a {@link java.util.List} object
   */
  public void setResponseHeaders(List<Header> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }
}
