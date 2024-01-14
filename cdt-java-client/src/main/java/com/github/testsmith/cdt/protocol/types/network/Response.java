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
import com.github.testsmith.cdt.protocol.types.security.SecurityState;
import java.util.Map;

/**
 * HTTP response data.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Response {

  private String url;

  private Integer status;

  private String statusText;

  private Map<String, Object> headers;

  @Optional private String headersText;

  private String mimeType;

  @Optional private Map<String, Object> requestHeaders;

  @Optional private String requestHeadersText;

  private Boolean connectionReused;

  private Double connectionId;

  @Optional private String remoteIPAddress;

  @Optional private Integer remotePort;

  @Optional private Boolean fromDiskCache;

  @Optional private Boolean fromServiceWorker;

  @Optional private Boolean fromPrefetchCache;

  private Double encodedDataLength;

  @Optional private ResourceTiming timing;

  @Optional private ServiceWorkerResponseSource serviceWorkerResponseSource;

  @Optional private Double responseTime;

  @Optional private String cacheStorageCacheName;

  @Optional private String protocol;

  private SecurityState securityState;

  @Optional private SecurityDetails securityDetails;

  /**
   * Response URL. This URL can be different from CachedResource.url in case of redirect.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Response URL. This URL can be different from CachedResource.url in case of redirect.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

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
   * Resource mimeType as determined by the browser.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Resource mimeType as determined by the browser.
   *
   * @param mimeType a {@link java.lang.String} object
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Refined HTTP request headers that were actually transmitted over the network.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getRequestHeaders() {
    return requestHeaders;
  }

  /**
   * Refined HTTP request headers that were actually transmitted over the network.
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

  /**
   * Specifies whether physical connection was actually reused for this request.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getConnectionReused() {
    return connectionReused;
  }

  /**
   * Specifies whether physical connection was actually reused for this request.
   *
   * @param connectionReused a {@link java.lang.Boolean} object
   */
  public void setConnectionReused(Boolean connectionReused) {
    this.connectionReused = connectionReused;
  }

  /**
   * Physical connection id that was actually used for this request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getConnectionId() {
    return connectionId;
  }

  /**
   * Physical connection id that was actually used for this request.
   *
   * @param connectionId a {@link java.lang.Double} object
   */
  public void setConnectionId(Double connectionId) {
    this.connectionId = connectionId;
  }

  /**
   * Remote IP address.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRemoteIPAddress() {
    return remoteIPAddress;
  }

  /**
   * Remote IP address.
   *
   * @param remoteIPAddress a {@link java.lang.String} object
   */
  public void setRemoteIPAddress(String remoteIPAddress) {
    this.remoteIPAddress = remoteIPAddress;
  }

  /**
   * Remote port.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getRemotePort() {
    return remotePort;
  }

  /**
   * Remote port.
   *
   * @param remotePort a {@link java.lang.Integer} object
   */
  public void setRemotePort(Integer remotePort) {
    this.remotePort = remotePort;
  }

  /**
   * Specifies that the request was served from the disk cache.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFromDiskCache() {
    return fromDiskCache;
  }

  /**
   * Specifies that the request was served from the disk cache.
   *
   * @param fromDiskCache a {@link java.lang.Boolean} object
   */
  public void setFromDiskCache(Boolean fromDiskCache) {
    this.fromDiskCache = fromDiskCache;
  }

  /**
   * Specifies that the request was served from the ServiceWorker.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFromServiceWorker() {
    return fromServiceWorker;
  }

  /**
   * Specifies that the request was served from the ServiceWorker.
   *
   * @param fromServiceWorker a {@link java.lang.Boolean} object
   */
  public void setFromServiceWorker(Boolean fromServiceWorker) {
    this.fromServiceWorker = fromServiceWorker;
  }

  /**
   * Specifies that the request was served from the prefetch cache.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFromPrefetchCache() {
    return fromPrefetchCache;
  }

  /**
   * Specifies that the request was served from the prefetch cache.
   *
   * @param fromPrefetchCache a {@link java.lang.Boolean} object
   */
  public void setFromPrefetchCache(Boolean fromPrefetchCache) {
    this.fromPrefetchCache = fromPrefetchCache;
  }

  /**
   * Total number of bytes received for this request so far.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEncodedDataLength() {
    return encodedDataLength;
  }

  /**
   * Total number of bytes received for this request so far.
   *
   * @param encodedDataLength a {@link java.lang.Double} object
   */
  public void setEncodedDataLength(Double encodedDataLength) {
    this.encodedDataLength = encodedDataLength;
  }

  /**
   * Timing information for the given request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceTiming} object
   */
  public ResourceTiming getTiming() {
    return timing;
  }

  /**
   * Timing information for the given request.
   *
   * @param timing a {@link com.github.testsmith.cdt.protocol.types.network.ResourceTiming} object
   */
  public void setTiming(ResourceTiming timing) {
    this.timing = timing;
  }

  /**
   * Response source of response from ServiceWorker.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ServiceWorkerResponseSource}
   *     object
   */
  public ServiceWorkerResponseSource getServiceWorkerResponseSource() {
    return serviceWorkerResponseSource;
  }

  /**
   * Response source of response from ServiceWorker.
   *
   * @param serviceWorkerResponseSource a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ServiceWorkerResponseSource} object
   */
  public void setServiceWorkerResponseSource(
      ServiceWorkerResponseSource serviceWorkerResponseSource) {
    this.serviceWorkerResponseSource = serviceWorkerResponseSource;
  }

  /**
   * The time at which the returned response was generated.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getResponseTime() {
    return responseTime;
  }

  /**
   * The time at which the returned response was generated.
   *
   * @param responseTime a {@link java.lang.Double} object
   */
  public void setResponseTime(Double responseTime) {
    this.responseTime = responseTime;
  }

  /**
   * Cache Storage Cache Name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCacheStorageCacheName() {
    return cacheStorageCacheName;
  }

  /**
   * Cache Storage Cache Name.
   *
   * @param cacheStorageCacheName a {@link java.lang.String} object
   */
  public void setCacheStorageCacheName(String cacheStorageCacheName) {
    this.cacheStorageCacheName = cacheStorageCacheName;
  }

  /**
   * Protocol used to fetch this request.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Protocol used to fetch this request.
   *
   * @param protocol a {@link java.lang.String} object
   */
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Security state of the request resource.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public SecurityState getSecurityState() {
    return securityState;
  }

  /**
   * Security state of the request resource.
   *
   * @param securityState a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState}
   *     object
   */
  public void setSecurityState(SecurityState securityState) {
    this.securityState = securityState;
  }

  /**
   * Security details for the request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SecurityDetails} object
   */
  public SecurityDetails getSecurityDetails() {
    return securityDetails;
  }

  /**
   * Security details for the request.
   *
   * @param securityDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.network.SecurityDetails} object
   */
  public void setSecurityDetails(SecurityDetails securityDetails) {
    this.securityDetails = securityDetails;
  }
}
