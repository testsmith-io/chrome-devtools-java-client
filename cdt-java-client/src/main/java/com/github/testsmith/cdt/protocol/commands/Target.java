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

import com.github.testsmith.cdt.protocol.events.target.*;
import com.github.testsmith.cdt.protocol.support.annotations.*;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.target.RemoteLocation;
import com.github.testsmith.cdt.protocol.types.target.TargetInfo;
import java.util.List;

/**
 * Supports additional targets discovery and allows to attach to them.
 *
 * @author roy
 * @version $Id: $Id
 */
public interface Target {

  /**
   * Activates (focuses) the target.
   *
   * @param targetId a {@link java.lang.String} object
   */
  void activateTarget(@ParamName("targetId") String targetId);

  /**
   * Attaches to the target with given id.
   *
   * @param targetId a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  @Returns("sessionId")
  String attachToTarget(@ParamName("targetId") String targetId);

  /**
   * Attaches to the target with given id.
   *
   * @param targetId a {@link java.lang.String} object
   * @param flatten Enables "flat" access to the session via specifying sessionId attribute in the
   *     commands. We plan to make this the default, deprecate non-flattened mode, and eventually
   *     retire it. See crbug.com/991325.
   * @return a {@link java.lang.String} object
   */
  @Returns("sessionId")
  String attachToTarget(
      @ParamName("targetId") String targetId, @Optional @ParamName("flatten") Boolean flatten);

  /**
   * Attaches to the browser target, only uses flat sessionId mode.
   *
   * @return a {@link java.lang.String} object
   */
  @Experimental
  @Returns("sessionId")
  String attachToBrowserTarget();

  /**
   * Closes the target. If the target is a page that gets closed too.
   *
   * @param targetId a {@link java.lang.String} object
   * @return a {@link java.lang.Boolean} object
   */
  @Returns("success")
  Boolean closeTarget(@ParamName("targetId") String targetId);

  /**
   * Inject object to the target's main frame that provides a communication channel with browser
   * target.
   *
   * <p>Injected object will be available as `window[bindingName]`.
   *
   * <p>The object has the follwing API: - `binding.send(json)` - a method to send messages over the
   * remote debugging protocol - `binding.onmessage = json =&gt; handleMessage(json)` - a callback
   * that will be called for the protocol notifications and command responses.
   *
   * @param targetId a {@link java.lang.String} object
   */
  @Experimental
  void exposeDevToolsProtocol(@ParamName("targetId") String targetId);

  /**
   * Inject object to the target's main frame that provides a communication channel with browser
   * target.
   *
   * <p>Injected object will be available as `window[bindingName]`.
   *
   * <p>The object has the follwing API: - `binding.send(json)` - a method to send messages over the
   * remote debugging protocol - `binding.onmessage = json =&gt; handleMessage(json)` - a callback
   * that will be called for the protocol notifications and command responses.
   *
   * @param targetId a {@link java.lang.String} object
   * @param bindingName Binding name, 'cdp' if not specified.
   */
  @Experimental
  void exposeDevToolsProtocol(
      @ParamName("targetId") String targetId,
      @Optional @ParamName("bindingName") String bindingName);

  /**
   * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
   * one.
   *
   * @return a {@link java.lang.String} object
   */
  @Experimental
  @Returns("browserContextId")
  String createBrowserContext();

  /**
   * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
   * one.
   *
   * @param disposeOnDetach If specified, disposes this context when debugging session disconnects.
   * @param proxyServer Proxy server, similar to the one passed to --proxy-server
   * @param proxyBypassList Proxy bypass list, similar to the one passed to --proxy-bypass-list
   * @return a {@link java.lang.String} object
   */
  @Experimental
  @Returns("browserContextId")
  String createBrowserContext(
      @Optional @ParamName("disposeOnDetach") Boolean disposeOnDetach,
      @Optional @ParamName("proxyServer") String proxyServer,
      @Optional @ParamName("proxyBypassList") String proxyBypassList);

  /**
   * Returns all browser contexts created with `Target.createBrowserContext` method.
   *
   * @return a {@link java.util.List} object
   */
  @Experimental
  @Returns("browserContextIds")
  @ReturnTypeParameter(String.class)
  List<String> getBrowserContexts();

  /**
   * Creates a new page.
   *
   * @param url The initial URL the page will be navigated to. An empty string indicates
   *     about:blank.
   * @return a {@link java.lang.String} object
   */
  @Returns("targetId")
  String createTarget(@ParamName("url") String url);

  /**
   * Creates a new page.
   *
   * @param url The initial URL the page will be navigated to. An empty string indicates
   *     about:blank.
   * @param width Frame width in DIP (headless chrome only).
   * @param height Frame height in DIP (headless chrome only).
   * @param browserContextId The browser context to create the page in.
   * @param enableBeginFrameControl Whether BeginFrames for this target will be controlled via
   *     DevTools (headless chrome only, not supported on MacOS yet, false by default).
   * @param newWindow Whether to create a new Window or Tab (chrome-only, false by default).
   * @param background Whether to create the target in background or foreground (chrome-only, false
   *     by default).
   * @return a {@link java.lang.String} object
   */
  @Returns("targetId")
  String createTarget(
      @ParamName("url") String url,
      @Optional @ParamName("width") Integer width,
      @Optional @ParamName("height") Integer height,
      @Optional @ParamName("browserContextId") String browserContextId,
      @Experimental @Optional @ParamName("enableBeginFrameControl") Boolean enableBeginFrameControl,
      @Optional @ParamName("newWindow") Boolean newWindow,
      @Optional @ParamName("background") Boolean background);

  /** Detaches session with given id. */
  void detachFromTarget();

  /**
   * Detaches session with given id.
   *
   * @param sessionId Session to detach.
   * @param targetId Deprecated.
   */
  void detachFromTarget(
      @Optional @ParamName("sessionId") String sessionId,
      @Deprecated @Optional @ParamName("targetId") String targetId);

  /**
   * Deletes a BrowserContext. All the belonging pages will be closed without calling their
   * beforeunload hooks.
   *
   * @param browserContextId a {@link java.lang.String} object
   */
  @Experimental
  void disposeBrowserContext(@ParamName("browserContextId") String browserContextId);

  /**
   * Returns information about a target.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.target.TargetInfo} object
   */
  @Experimental
  @Returns("targetInfo")
  TargetInfo getTargetInfo();

  /**
   * Returns information about a target.
   *
   * @param targetId a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.target.TargetInfo} object
   */
  @Experimental
  @Returns("targetInfo")
  TargetInfo getTargetInfo(@Optional @ParamName("targetId") String targetId);

  /**
   * Retrieves a list of available targets.
   *
   * @return a {@link java.util.List} object
   */
  @Returns("targetInfos")
  @ReturnTypeParameter(TargetInfo.class)
  List<TargetInfo> getTargets();

  /**
   * Sends protocol message over session with given id. Consider using flat mode instead; see
   * commands attachToTarget, setAutoAttach, and crbug.com/991325.
   *
   * @param message a {@link java.lang.String} object
   */
  @Deprecated
  void sendMessageToTarget(@ParamName("message") String message);

  /**
   * Sends protocol message over session with given id. Consider using flat mode instead; see
   * commands attachToTarget, setAutoAttach, and crbug.com/991325.
   *
   * @param message a {@link java.lang.String} object
   * @param sessionId Identifier of the session.
   * @param targetId Deprecated.
   */
  @Deprecated
  void sendMessageToTarget(
      @ParamName("message") String message,
      @Optional @ParamName("sessionId") String sessionId,
      @Deprecated @Optional @ParamName("targetId") String targetId);

  /**
   * Controls whether to automatically attach to new targets which are considered to be related to
   * this one. When turned on, attaches to all existing related targets as well. When turned off,
   * automatically detaches from all currently attached targets.
   *
   * @param autoAttach Whether to auto-attach to related targets.
   * @param waitForDebuggerOnStart Whether to pause new targets when attaching to them. Use
   *     `Runtime.runIfWaitingForDebugger` to run paused targets.
   */
  @Experimental
  void setAutoAttach(
      @ParamName("autoAttach") Boolean autoAttach,
      @ParamName("waitForDebuggerOnStart") Boolean waitForDebuggerOnStart);

  /**
   * Controls whether to automatically attach to new targets which are considered to be related to
   * this one. When turned on, attaches to all existing related targets as well. When turned off,
   * automatically detaches from all currently attached targets.
   *
   * @param autoAttach Whether to auto-attach to related targets.
   * @param waitForDebuggerOnStart Whether to pause new targets when attaching to them. Use
   *     `Runtime.runIfWaitingForDebugger` to run paused targets.
   * @param flatten Enables "flat" access to the session via specifying sessionId attribute in the
   *     commands. We plan to make this the default, deprecate non-flattened mode, and eventually
   *     retire it. See crbug.com/991325.
   */
  @Experimental
  void setAutoAttach(
      @ParamName("autoAttach") Boolean autoAttach,
      @ParamName("waitForDebuggerOnStart") Boolean waitForDebuggerOnStart,
      @Optional @ParamName("flatten") Boolean flatten);

  /**
   * Controls whether to discover available targets and notify via
   * `targetCreated/targetInfoChanged/targetDestroyed` events.
   *
   * @param discover Whether to discover available targets.
   */
  void setDiscoverTargets(@ParamName("discover") Boolean discover);

  /**
   * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
   * `true`.
   *
   * @param locations List of remote locations.
   */
  @Experimental
  void setRemoteLocations(@ParamName("locations") List<RemoteLocation> locations);

  /**
   * Issued when attached to target because of auto-attach or `attachToTarget` command.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("attachedToTarget")
  @Experimental
  EventListener onAttachedToTarget(EventHandler<AttachedToTarget> eventListener);

  /**
   * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
   * issued multiple times per target if multiple sessions have been attached to it.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("detachedFromTarget")
  @Experimental
  EventListener onDetachedFromTarget(EventHandler<DetachedFromTarget> eventListener);

  /**
   * Notifies about a new protocol message received from the session (as reported in
   * `attachedToTarget` event).
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("receivedMessageFromTarget")
  EventListener onReceivedMessageFromTarget(EventHandler<ReceivedMessageFromTarget> eventListener);

  /**
   * Issued when a possible inspection target is created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("targetCreated")
  EventListener onTargetCreated(EventHandler<TargetCreated> eventListener);

  /**
   * Issued when a target is destroyed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("targetDestroyed")
  EventListener onTargetDestroyed(EventHandler<TargetDestroyed> eventListener);

  /**
   * Issued when a target has crashed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("targetCrashed")
  EventListener onTargetCrashed(EventHandler<TargetCrashed> eventListener);

  /**
   * Issued when some information about a target has changed. This only happens between
   * `targetCreated` and `targetDestroyed`.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("targetInfoChanged")
  EventListener onTargetInfoChanged(EventHandler<TargetInfoChanged> eventListener);
}
