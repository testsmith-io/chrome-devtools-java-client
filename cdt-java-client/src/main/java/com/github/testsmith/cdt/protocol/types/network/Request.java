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
import com.github.testsmith.cdt.protocol.types.security.MixedContentType;
import java.util.List;
import java.util.Map;

/**
 * HTTP request data.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Request {

  private String url;

  @Optional private String urlFragment;

  private String method;

  private Map<String, Object> headers;

  @Optional private String postData;

  @Optional private Boolean hasPostData;

  @Experimental @Optional private List<PostDataEntry> postDataEntries;

  @Optional private MixedContentType mixedContentType;

  private ResourcePriority initialPriority;

  private RequestReferrerPolicy referrerPolicy;

  @Optional private Boolean isLinkPreload;

  @Experimental @Optional private TrustTokenParams trustTokenParams;

  /**
   * Request URL (without fragment).
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Request URL (without fragment).
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Fragment of the requested URL starting with hash, if present.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrlFragment() {
    return urlFragment;
  }

  /**
   * Fragment of the requested URL starting with hash, if present.
   *
   * @param urlFragment a {@link java.lang.String} object
   */
  public void setUrlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
  }

  /**
   * HTTP request method.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMethod() {
    return method;
  }

  /**
   * HTTP request method.
   *
   * @param method a {@link java.lang.String} object
   */
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * HTTP request headers.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * HTTP request headers.
   *
   * @param headers a {@link java.util.Map} object
   */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   * HTTP POST request data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPostData() {
    return postData;
  }

  /**
   * HTTP POST request data.
   *
   * @param postData a {@link java.lang.String} object
   */
  public void setPostData(String postData) {
    this.postData = postData;
  }

  /**
   * True when the request has POST data. Note that postData might still be omitted when this flag
   * is true when the data is too long.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasPostData() {
    return hasPostData;
  }

  /**
   * True when the request has POST data. Note that postData might still be omitted when this flag
   * is true when the data is too long.
   *
   * @param hasPostData a {@link java.lang.Boolean} object
   */
  public void setHasPostData(Boolean hasPostData) {
    this.hasPostData = hasPostData;
  }

  /**
   * Request body elements. This will be converted from base64 to binary
   *
   * @return a {@link java.util.List} object
   */
  public List<PostDataEntry> getPostDataEntries() {
    return postDataEntries;
  }

  /**
   * Request body elements. This will be converted from base64 to binary
   *
   * @param postDataEntries a {@link java.util.List} object
   */
  public void setPostDataEntries(List<PostDataEntry> postDataEntries) {
    this.postDataEntries = postDataEntries;
  }

  /**
   * The mixed content type of the request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.MixedContentType} object
   */
  public MixedContentType getMixedContentType() {
    return mixedContentType;
  }

  /**
   * The mixed content type of the request.
   *
   * @param mixedContentType a {@link
   *     com.github.testsmith.cdt.protocol.types.security.MixedContentType} object
   */
  public void setMixedContentType(MixedContentType mixedContentType) {
    this.mixedContentType = mixedContentType;
  }

  /**
   * Priority of the resource request at the time request is sent.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourcePriority} object
   */
  public ResourcePriority getInitialPriority() {
    return initialPriority;
  }

  /**
   * Priority of the resource request at the time request is sent.
   *
   * @param initialPriority a {@link
   *     com.github.testsmith.cdt.protocol.types.network.ResourcePriority} object
   */
  public void setInitialPriority(ResourcePriority initialPriority) {
    this.initialPriority = initialPriority;
  }

  /**
   * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.RequestReferrerPolicy} object
   */
  public RequestReferrerPolicy getReferrerPolicy() {
    return referrerPolicy;
  }

  /**
   * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
   *
   * @param referrerPolicy a {@link
   *     com.github.testsmith.cdt.protocol.types.network.RequestReferrerPolicy} object
   */
  public void setReferrerPolicy(RequestReferrerPolicy referrerPolicy) {
    this.referrerPolicy = referrerPolicy;
  }

  /**
   * Whether is loaded via link preload.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsLinkPreload() {
    return isLinkPreload;
  }

  /**
   * Whether is loaded via link preload.
   *
   * @param isLinkPreload a {@link java.lang.Boolean} object
   */
  public void setIsLinkPreload(Boolean isLinkPreload) {
    this.isLinkPreload = isLinkPreload;
  }

  /**
   * Set for requests when the TrustToken API is used. Contains the parameters passed by the
   * developer (e.g. via "fetch") as understood by the backend.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.TrustTokenParams} object
   */
  public TrustTokenParams getTrustTokenParams() {
    return trustTokenParams;
  }

  /**
   * Set for requests when the TrustToken API is used. Contains the parameters passed by the
   * developer (e.g. via "fetch") as understood by the backend.
   *
   * @param trustTokenParams a {@link
   *     com.github.testsmith.cdt.protocol.types.network.TrustTokenParams} object
   */
  public void setTrustTokenParams(TrustTokenParams trustTokenParams) {
    this.trustTokenParams = trustTokenParams;
  }
}