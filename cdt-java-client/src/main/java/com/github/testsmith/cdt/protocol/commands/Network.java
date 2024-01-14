package com.github.testsmith.cdt.protocol.commands;

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

import com.github.testsmith.cdt.protocol.events.network.DataReceived;
import com.github.testsmith.cdt.protocol.events.network.EventSourceMessageReceived;
import com.github.testsmith.cdt.protocol.events.network.LoadingFailed;
import com.github.testsmith.cdt.protocol.events.network.LoadingFinished;
import com.github.testsmith.cdt.protocol.events.network.RequestIntercepted;
import com.github.testsmith.cdt.protocol.events.network.RequestServedFromCache;
import com.github.testsmith.cdt.protocol.events.network.RequestWillBeSent;
import com.github.testsmith.cdt.protocol.events.network.RequestWillBeSentExtraInfo;
import com.github.testsmith.cdt.protocol.events.network.ResourceChangedPriority;
import com.github.testsmith.cdt.protocol.events.network.ResponseReceived;
import com.github.testsmith.cdt.protocol.events.network.ResponseReceivedExtraInfo;
import com.github.testsmith.cdt.protocol.events.network.SignedExchangeReceived;
import com.github.testsmith.cdt.protocol.events.network.TrustTokenOperationDone;
import com.github.testsmith.cdt.protocol.events.network.WebSocketClosed;
import com.github.testsmith.cdt.protocol.events.network.WebSocketCreated;
import com.github.testsmith.cdt.protocol.events.network.WebSocketFrameError;
import com.github.testsmith.cdt.protocol.events.network.WebSocketFrameReceived;
import com.github.testsmith.cdt.protocol.events.network.WebSocketFrameSent;
import com.github.testsmith.cdt.protocol.events.network.WebSocketHandshakeResponseReceived;
import com.github.testsmith.cdt.protocol.events.network.WebSocketWillSendHandshakeRequest;
import com.github.testsmith.cdt.protocol.events.network.WebTransportClosed;
import com.github.testsmith.cdt.protocol.events.network.WebTransportConnectionEstablished;
import com.github.testsmith.cdt.protocol.events.network.WebTransportCreated;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.debugger.SearchMatch;
import com.github.testsmith.cdt.protocol.types.network.AuthChallengeResponse;
import com.github.testsmith.cdt.protocol.types.network.ConnectionType;
import com.github.testsmith.cdt.protocol.types.network.ContentEncoding;
import com.github.testsmith.cdt.protocol.types.network.Cookie;
import com.github.testsmith.cdt.protocol.types.network.CookieParam;
import com.github.testsmith.cdt.protocol.types.network.CookiePriority;
import com.github.testsmith.cdt.protocol.types.network.CookieSameSite;
import com.github.testsmith.cdt.protocol.types.network.CookieSourceScheme;
import com.github.testsmith.cdt.protocol.types.network.ErrorReason;
import com.github.testsmith.cdt.protocol.types.network.LoadNetworkResourceOptions;
import com.github.testsmith.cdt.protocol.types.network.LoadNetworkResourcePageResult;
import com.github.testsmith.cdt.protocol.types.network.RequestPattern;
import com.github.testsmith.cdt.protocol.types.network.ResponseBody;
import com.github.testsmith.cdt.protocol.types.network.ResponseBodyForInterception;
import com.github.testsmith.cdt.protocol.types.network.SecurityIsolationStatus;
import java.util.List;
import java.util.Map;

/**
 * Network domain allows tracking network activities of the page. It exposes information about http,
 * file, data and other requests and responses, their headers, bodies, timing, etc.
 *
 * @author roy
 * @version $Id: $Id
 */
public interface Network {

  /**
   * Sets a list of content encodings that will be accepted. Empty list means no encoding is
   * accepted.
   *
   * @param encodings List of accepted content encodings.
   */
  @Experimental
  void setAcceptedEncodings(@ParamName("encodings") List<ContentEncoding> encodings);

  /** Clears accepted encodings set by setAcceptedEncodings */
  @Experimental
  void clearAcceptedEncodingsOverride();

  /**
   * Tells whether clearing browser cache is supported.
   *
   * @return a {@link java.lang.Boolean} object
   */
  @Deprecated
  @Returns("result")
  Boolean canClearBrowserCache();

  /**
   * Tells whether clearing browser cookies is supported.
   *
   * @return a {@link java.lang.Boolean} object
   */
  @Deprecated
  @Returns("result")
  Boolean canClearBrowserCookies();

  /**
   * Tells whether emulation of network conditions is supported.
   *
   * @return a {@link java.lang.Boolean} object
   */
  @Deprecated
  @Returns("result")
  Boolean canEmulateNetworkConditions();

  /** Clears browser cache. */
  void clearBrowserCache();

  /** Clears browser cookies. */
  void clearBrowserCookies();

  /**
   * Response to Network.requestIntercepted which either modifies the request to continue with any
   * modifications, or blocks it, or completes it with the provided response bytes. If a network
   * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
   * event will be sent with the same InterceptionId. Deprecated, use Fetch.continueRequest,
   * Fetch.fulfillRequest and Fetch.failRequest instead.
   *
   * @param interceptionId a {@link java.lang.String} object
   */
  @Deprecated
  @Experimental
  void continueInterceptedRequest(@ParamName("interceptionId") String interceptionId);

  /**
   * Response to Network.requestIntercepted which either modifies the request to continue with any
   * modifications, or blocks it, or completes it with the provided response bytes. If a network
   * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
   * event will be sent with the same InterceptionId. Deprecated, use Fetch.continueRequest,
   * Fetch.fulfillRequest and Fetch.failRequest instead.
   *
   * @param interceptionId a {@link java.lang.String} object
   * @param errorReason If set this causes the request to fail with the given reason. Passing
   *     `Aborted` for requests marked with `isNavigationRequest` also cancels the navigation. Must
   *     not be set in response to an authChallenge.
   * @param rawResponse If set the requests completes using with the provided base64 encoded raw
   *     response, including HTTP status line and headers etc... Must not be set in response to an
   *     authChallenge. (Encoded as a base64 string when passed over JSON)
   * @param url If set the request url will be modified in a way that's not observable by page. Must
   *     not be set in response to an authChallenge.
   * @param method If set this allows the request method to be overridden. Must not be set in
   *     response to an authChallenge.
   * @param postData If set this allows postData to be set. Must not be set in response to an
   *     authChallenge.
   * @param headers If set this allows the request headers to be changed. Must not be set in
   *     response to an authChallenge.
   * @param authChallengeResponse Response to a requestIntercepted with an authChallenge. Must not
   *     be set otherwise.
   */
  @Deprecated
  @Experimental
  void continueInterceptedRequest(
      @ParamName("interceptionId") String interceptionId,
      @Optional @ParamName("errorReason") ErrorReason errorReason,
      @Optional @ParamName("rawResponse") String rawResponse,
      @Optional @ParamName("url") String url,
      @Optional @ParamName("method") String method,
      @Optional @ParamName("postData") String postData,
      @Optional @ParamName("headers") Map<String, Object> headers,
      @Optional @ParamName("authChallengeResponse") AuthChallengeResponse authChallengeResponse);

  /**
   * Deletes browser cookies with matching name and url or domain/path pair.
   *
   * @param name Name of the cookies to remove.
   */
  void deleteCookies(@ParamName("name") String name);

  /**
   * Deletes browser cookies with matching name and url or domain/path pair.
   *
   * @param name Name of the cookies to remove.
   * @param url If specified, deletes all the cookies with the given name where domain and path
   *     match provided URL.
   * @param domain If specified, deletes only cookies with the exact domain.
   * @param path If specified, deletes only cookies with the exact path.
   */
  void deleteCookies(
      @ParamName("name") String name,
      @Optional @ParamName("url") String url,
      @Optional @ParamName("domain") String domain,
      @Optional @ParamName("path") String path);

  /** Disables network tracking, prevents network events from being sent to the client. */
  void disable();

  /**
   * Activates emulation of network conditions.
   *
   * @param offline True to emulate internet disconnection.
   * @param latency Minimum latency from request sent to response headers received (ms).
   * @param downloadThroughput Maximal aggregated download throughput (bytes/sec). -1 disables
   *     download throttling.
   * @param uploadThroughput Maximal aggregated upload throughput (bytes/sec). -1 disables upload
   *     throttling.
   */
  void emulateNetworkConditions(
      @ParamName("offline") Boolean offline,
      @ParamName("latency") Double latency,
      @ParamName("downloadThroughput") Double downloadThroughput,
      @ParamName("uploadThroughput") Double uploadThroughput);

  /**
   * Activates emulation of network conditions.
   *
   * @param offline True to emulate internet disconnection.
   * @param latency Minimum latency from request sent to response headers received (ms).
   * @param downloadThroughput Maximal aggregated download throughput (bytes/sec). -1 disables
   *     download throttling.
   * @param uploadThroughput Maximal aggregated upload throughput (bytes/sec). -1 disables upload
   *     throttling.
   * @param connectionType Connection type if known.
   */
  void emulateNetworkConditions(
      @ParamName("offline") Boolean offline,
      @ParamName("latency") Double latency,
      @ParamName("downloadThroughput") Double downloadThroughput,
      @ParamName("uploadThroughput") Double uploadThroughput,
      @Optional @ParamName("connectionType") ConnectionType connectionType);

  /** Enables network tracking, network events will now be delivered to the client. */
  void enable();

  /**
   * Enables network tracking, network events will now be delivered to the client.
   *
   * @param maxTotalBufferSize Buffer size in bytes to use when preserving network payloads (XHRs,
   *     etc).
   * @param maxResourceBufferSize Per-resource buffer size in bytes to use when preserving network
   *     payloads (XHRs, etc).
   * @param maxPostDataSize Longest post body size (in bytes) that would be included in
   *     requestWillBeSent notification
   */
  void enable(
      @Experimental @Optional @ParamName("maxTotalBufferSize") Integer maxTotalBufferSize,
      @Experimental @Optional @ParamName("maxResourceBufferSize") Integer maxResourceBufferSize,
      @Optional @ParamName("maxPostDataSize") Integer maxPostDataSize);

  /**
   * Returns all browser cookies. Depending on the backend support, will return detailed cookie
   * information in the `cookies` field.
   *
   * @return a {@link java.util.List} object
   */
  @Returns("cookies")
  @ReturnTypeParameter(Cookie.class)
  List<Cookie> getAllCookies();

  /**
   * Returns the DER-encoded certificate.
   *
   * @param origin Origin to get certificate for.
   * @return a {@link java.util.List} object
   */
  @Experimental
  @Returns("tableNames")
  @ReturnTypeParameter(String.class)
  List<String> getCertificate(@ParamName("origin") String origin);

  /**
   * Returns all browser cookies for the current URL. Depending on the backend support, will return
   * detailed cookie information in the `cookies` field.
   *
   * @return a {@link java.util.List} object
   */
  @Returns("cookies")
  @ReturnTypeParameter(Cookie.class)
  List<Cookie> getCookies();

  /**
   * Returns all browser cookies for the current URL. Depending on the backend support, will return
   * detailed cookie information in the `cookies` field.
   *
   * @param urls The list of URLs for which applicable cookies will be fetched. If not specified,
   *     it's assumed to be set to the list containing the URLs of the page and all of its
   *     subframes.
   * @return a {@link java.util.List} object
   */
  @Returns("cookies")
  @ReturnTypeParameter(Cookie.class)
  List<Cookie> getCookies(@Optional @ParamName("urls") List<String> urls);

  /**
   * Returns content served for the given request.
   *
   * @param requestId Identifier of the network request to get content for.
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResponseBody} object
   */
  ResponseBody getResponseBody(@ParamName("requestId") String requestId);

  /**
   * Returns post data sent with the request. Returns an error when no data was sent with the
   * request.
   *
   * @param requestId Identifier of the network request to get content for.
   * @return a {@link java.lang.String} object
   */
  @Returns("postData")
  String getRequestPostData(@ParamName("requestId") String requestId);

  /**
   * Returns content served for the given currently intercepted request.
   *
   * @param interceptionId Identifier for the intercepted request to get body for.
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResponseBodyForInterception}
   *     object
   */
  @Experimental
  ResponseBodyForInterception getResponseBodyForInterception(
      @ParamName("interceptionId") String interceptionId);

  /**
   * Returns a handle to the stream representing the response body. Note that after this command,
   * the intercepted request can't be continued as is -- you either need to cancel it or to provide
   * the response body. The stream only supports sequential read, IO.read will fail if the position
   * is specified.
   *
   * @param interceptionId a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  @Experimental
  @Returns("stream")
  String takeResponseBodyForInterceptionAsStream(
      @ParamName("interceptionId") String interceptionId);

  /**
   * This method sends a new XMLHttpRequest which is identical to the original one. The following
   * parameters should be identical: method, url, async, request body, extra headers,
   * withCredentials attribute, user, password.
   *
   * @param requestId Identifier of XHR to replay.
   */
  @Experimental
  void replayXHR(@ParamName("requestId") String requestId);

  /**
   * Searches for given string in response content.
   *
   * @param requestId Identifier of the network response to search.
   * @param query String to search for.
   * @return a {@link java.util.List} object
   */
  @Experimental
  @Returns("result")
  @ReturnTypeParameter(SearchMatch.class)
  List<SearchMatch> searchInResponseBody(
      @ParamName("requestId") String requestId, @ParamName("query") String query);

  /**
   * Searches for given string in response content.
   *
   * @param requestId Identifier of the network response to search.
   * @param query String to search for.
   * @param caseSensitive If true, search is case sensitive.
   * @param isRegex If true, treats string parameter as regex.
   * @return a {@link java.util.List} object
   */
  @Experimental
  @Returns("result")
  @ReturnTypeParameter(SearchMatch.class)
  List<SearchMatch> searchInResponseBody(
      @ParamName("requestId") String requestId,
      @ParamName("query") String query,
      @Optional @ParamName("caseSensitive") Boolean caseSensitive,
      @Optional @ParamName("isRegex") Boolean isRegex);

  /**
   * Blocks URLs from loading.
   *
   * @param urls URL patterns to block. Wildcards ('*') are allowed.
   */
  @Experimental
  void setBlockedURLs(@ParamName("urls") List<String> urls);

  /**
   * Toggles ignoring of service worker for each request.
   *
   * @param bypass Bypass service worker and load from network.
   */
  @Experimental
  void setBypassServiceWorker(@ParamName("bypass") Boolean bypass);

  /**
   * Toggles ignoring cache for each request. If `true`, cache will not be used.
   *
   * @param cacheDisabled Cache disabled state.
   */
  void setCacheDisabled(@ParamName("cacheDisabled") Boolean cacheDisabled);

  /**
   * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
   *
   * @param name Cookie name.
   * @param value Cookie value.
   * @return a {@link java.lang.Boolean} object
   */
  @Returns("success")
  Boolean setCookie(@ParamName("name") String name, @ParamName("value") String value);

  /**
   * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
   *
   * @param name Cookie name.
   * @param value Cookie value.
   * @param url The request-URI to associate with the setting of the cookie. This value can affect
   *     the default domain, path, source port, and source scheme values of the created cookie.
   * @param domain Cookie domain.
   * @param path Cookie path.
   * @param secure True if cookie is secure.
   * @param httpOnly True if cookie is http-only.
   * @param sameSite Cookie SameSite type.
   * @param expires Cookie expiration date, session cookie if not set
   * @param priority Cookie Priority type.
   * @param sameParty True if cookie is SameParty.
   * @param sourceScheme Cookie source scheme type.
   * @param sourcePort Cookie source port. Valid values are {-1, [1, 65535]}, -1 indicates an
   *     unspecified port. An unspecified port value allows protocol clients to emulate legacy
   *     cookie scope for the port. This is a temporary ability and it will be removed in the
   *     future.
   * @return a {@link java.lang.Boolean} object
   */
  @Returns("success")
  Boolean setCookie(
      @ParamName("name") String name,
      @ParamName("value") String value,
      @Optional @ParamName("url") String url,
      @Optional @ParamName("domain") String domain,
      @Optional @ParamName("path") String path,
      @Optional @ParamName("secure") Boolean secure,
      @Optional @ParamName("httpOnly") Boolean httpOnly,
      @Optional @ParamName("sameSite") CookieSameSite sameSite,
      @Optional @ParamName("expires") Double expires,
      @Experimental @Optional @ParamName("priority") CookiePriority priority,
      @Experimental @Optional @ParamName("sameParty") Boolean sameParty,
      @Experimental @Optional @ParamName("sourceScheme") CookieSourceScheme sourceScheme,
      @Experimental @Optional @ParamName("sourcePort") Integer sourcePort);

  /**
   * Sets given cookies.
   *
   * @param cookies Cookies to be set.
   */
  void setCookies(@ParamName("cookies") List<CookieParam> cookies);

  /**
   * For testing.
   *
   * @param maxTotalSize Maximum total buffer size.
   * @param maxResourceSize Maximum per-resource size.
   */
  @Experimental
  void setDataSizeLimitsForTest(
      @ParamName("maxTotalSize") Integer maxTotalSize,
      @ParamName("maxResourceSize") Integer maxResourceSize);

  /**
   * Specifies whether to always send extra HTTP headers with the requests from this page.
   *
   * @param headers Map with extra HTTP headers.
   */
  void setExtraHTTPHeaders(@ParamName("headers") Map<String, Object> headers);

  /**
   * Specifies whether to attach a page script stack id in requests
   *
   * @param enabled Whether to attach a page script stack for debugging purpose.
   */
  @Experimental
  void setAttachDebugStack(@ParamName("enabled") Boolean enabled);

  /**
   * Sets the requests to intercept that match the provided patterns and optionally resource types.
   * Deprecated, please use Fetch.enable instead.
   *
   * @param patterns Requests matching any of these patterns will be forwarded and wait for the
   *     corresponding continueInterceptedRequest call.
   */
  @Deprecated
  @Experimental
  void setRequestInterception(@ParamName("patterns") List<RequestPattern> patterns);

  /**
   * Returns information about the COEP/COOP isolation status.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SecurityIsolationStatus}
   *     object
   */
  @Experimental
  @Returns("status")
  SecurityIsolationStatus getSecurityIsolationStatus();

  /**
   * Returns information about the COEP/COOP isolation status.
   *
   * @param frameId If no frameId is provided, the status of the target is provided.
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.SecurityIsolationStatus}
   *     object
   */
  @Experimental
  @Returns("status")
  SecurityIsolationStatus getSecurityIsolationStatus(
      @Optional @ParamName("frameId") String frameId);

  /**
   * Fetches the resource and returns the content.
   *
   * @param frameId Frame id to get the resource for.
   * @param url URL of the resource to get content for.
   * @param options Options for the request.
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.LoadNetworkResourcePageResult}
   *     object
   */
  @Experimental
  @Returns("resource")
  LoadNetworkResourcePageResult loadNetworkResource(
      @ParamName("frameId") String frameId,
      @ParamName("url") String url,
      @ParamName("options") LoadNetworkResourceOptions options);

  /**
   * Fired when data chunk was received over the network.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("dataReceived")
  EventListener onDataReceived(EventHandler<DataReceived> eventListener);

  /**
   * Fired when EventSource message is received.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("eventSourceMessageReceived")
  EventListener onEventSourceMessageReceived(
      EventHandler<EventSourceMessageReceived> eventListener);

  /**
   * Fired when HTTP request has failed to load.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("loadingFailed")
  EventListener onLoadingFailed(EventHandler<LoadingFailed> eventListener);

  /**
   * Fired when HTTP request has finished loading.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("loadingFinished")
  EventListener onLoadingFinished(EventHandler<LoadingFinished> eventListener);

  /**
   * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
   * mocked. Deprecated, use Fetch.requestPaused instead.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("requestIntercepted")
  @Deprecated
  @Experimental
  EventListener onRequestIntercepted(EventHandler<RequestIntercepted> eventListener);

  /**
   * Fired if request ended up loading from cache.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("requestServedFromCache")
  EventListener onRequestServedFromCache(EventHandler<RequestServedFromCache> eventListener);

  /**
   * Fired when page is about to send HTTP request.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("requestWillBeSent")
  EventListener onRequestWillBeSent(EventHandler<RequestWillBeSent> eventListener);

  /**
   * Fired when resource loading priority is changed
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("resourceChangedPriority")
  @Experimental
  EventListener onResourceChangedPriority(EventHandler<ResourceChangedPriority> eventListener);

  /**
   * Fired when a signed exchange was received over the network
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("signedExchangeReceived")
  @Experimental
  EventListener onSignedExchangeReceived(EventHandler<SignedExchangeReceived> eventListener);

  /**
   * Fired when HTTP response is available.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("responseReceived")
  EventListener onResponseReceived(EventHandler<ResponseReceived> eventListener);

  /**
   * Fired when WebSocket is closed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketClosed")
  EventListener onWebSocketClosed(EventHandler<WebSocketClosed> eventListener);

  /**
   * Fired upon WebSocket creation.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketCreated")
  EventListener onWebSocketCreated(EventHandler<WebSocketCreated> eventListener);

  /**
   * Fired when WebSocket message error occurs.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketFrameError")
  EventListener onWebSocketFrameError(EventHandler<WebSocketFrameError> eventListener);

  /**
   * Fired when WebSocket message is received.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketFrameReceived")
  EventListener onWebSocketFrameReceived(EventHandler<WebSocketFrameReceived> eventListener);

  /**
   * Fired when WebSocket message is sent.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketFrameSent")
  EventListener onWebSocketFrameSent(EventHandler<WebSocketFrameSent> eventListener);

  /**
   * Fired when WebSocket handshake response becomes available.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketHandshakeResponseReceived")
  EventListener onWebSocketHandshakeResponseReceived(
      EventHandler<WebSocketHandshakeResponseReceived> eventListener);

  /**
   * Fired when WebSocket is about to initiate handshake.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webSocketWillSendHandshakeRequest")
  EventListener onWebSocketWillSendHandshakeRequest(
      EventHandler<WebSocketWillSendHandshakeRequest> eventListener);

  /**
   * Fired upon WebTransport creation.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webTransportCreated")
  EventListener onWebTransportCreated(EventHandler<WebTransportCreated> eventListener);

  /**
   * Fired when WebTransport handshake is finished.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webTransportConnectionEstablished")
  EventListener onWebTransportConnectionEstablished(
      EventHandler<WebTransportConnectionEstablished> eventListener);

  /**
   * Fired when WebTransport is disposed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("webTransportClosed")
  EventListener onWebTransportClosed(EventHandler<WebTransportClosed> eventListener);

  /**
   * Fired when additional information about a requestWillBeSent event is available from the network
   * stack. Not every requestWillBeSent event will have an additional requestWillBeSentExtraInfo
   * fired for it, and there is no guarantee whether requestWillBeSent or requestWillBeSentExtraInfo
   * will be fired first for the same request.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("requestWillBeSentExtraInfo")
  @Experimental
  EventListener onRequestWillBeSentExtraInfo(
      EventHandler<RequestWillBeSentExtraInfo> eventListener);

  /**
   * Fired when additional information about a responseReceived event is available from the network
   * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for
   * it, and responseReceivedExtraInfo may be fired before or after responseReceived.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("responseReceivedExtraInfo")
  @Experimental
  EventListener onResponseReceivedExtraInfo(EventHandler<ResponseReceivedExtraInfo> eventListener);

  /**
   * Fired exactly once for each Trust Token operation. Depending on the type of the operation and
   * whether the operation succeeded or failed, the event is fired before the corresponding request
   * was sent or after the response was received.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("trustTokenOperationDone")
  @Experimental
  EventListener onTrustTokenOperationDone(EventHandler<TrustTokenOperationDone> eventListener);
}
