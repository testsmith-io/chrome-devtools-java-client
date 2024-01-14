package com.github.testsmith.cdt.protocol;

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

import com.github.testsmith.cdt.protocol.commands.*;
import com.github.testsmith.cdt.protocol.commands.Runtime;

/**
 * ChromeDevTools interface.
 *
 * @author roy
 * @version $Id: $Id
 */
public interface ChromeDevTools {

  /**
   * Returns the Console command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Console} object
   */
  Console getConsole();

  /**
   * Returns the Debugger command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Debugger} object
   */
  Debugger getDebugger();

  /**
   * Returns the HeapProfiler command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.HeapProfiler} object
   */
  HeapProfiler getHeapProfiler();

  /**
   * Returns the Profiler command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Profiler} object
   */
  Profiler getProfiler();

  /**
   * Returns the Runtime command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Runtime} object
   */
  Runtime getRuntime();

  /**
   * Returns the Schema command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Schema} object
   */
  Schema getSchema();

  /**
   * Returns the Accessibility command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Accessibility} object
   */
  Accessibility getAccessibility();

  /**
   * Returns the Animation command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Animation} object
   */
  Animation getAnimation();

  /**
   * Returns the ApplicationCache command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.ApplicationCache} object
   */
  ApplicationCache getApplicationCache();

  /**
   * Returns the Audits command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Audits} object
   */
  Audits getAudits();

  /**
   * Returns the BackgroundService command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.BackgroundService} object
   */
  BackgroundService getBackgroundService();

  /**
   * Returns the Browser command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Browser} object
   */
  Browser getBrowser();

  /**
   * Returns the CSS command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.CSS} object
   */
  CSS getCSS();

  /**
   * Returns the CacheStorage command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.CacheStorage} object
   */
  CacheStorage getCacheStorage();

  /**
   * Returns the Cast command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Cast} object
   */
  Cast getCast();

  /**
   * Returns the DOM command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.DOM} object
   */
  DOM getDOM();

  /**
   * Returns the DOMDebugger command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.DOMDebugger} object
   */
  DOMDebugger getDOMDebugger();

  /**
   * Returns the DOMSnapshot command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.DOMSnapshot} object
   */
  DOMSnapshot getDOMSnapshot();

  /**
   * Returns the DOMStorage command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.DOMStorage} object
   */
  DOMStorage getDOMStorage();

  /**
   * Returns the Database command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Database} object
   */
  Database getDatabase();

  /**
   * Returns the DeviceOrientation command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.DeviceOrientation} object
   */
  DeviceOrientation getDeviceOrientation();

  /**
   * Returns the Emulation command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Emulation} object
   */
  Emulation getEmulation();

  /**
   * Returns the HeadlessExperimental command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.HeadlessExperimental} object
   */
  HeadlessExperimental getHeadlessExperimental();

  /**
   * Returns the IO command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.IO} object
   */
  IO getIO();

  /**
   * Returns the IndexedDB command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.IndexedDB} object
   */
  IndexedDB getIndexedDB();

  /**
   * Returns the Input command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Input} object
   */
  Input getInput();

  /**
   * Returns the Inspector command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Inspector} object
   */
  Inspector getInspector();

  /**
   * Returns the LayerTree command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.LayerTree} object
   */
  LayerTree getLayerTree();

  /**
   * Returns the Log command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Log} object
   */
  Log getLog();

  /**
   * Returns the Memory command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Memory} object
   */
  Memory getMemory();

  /**
   * Returns the Network command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Network} object
   */
  Network getNetwork();

  /**
   * Returns the Overlay command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Overlay} object
   */
  Overlay getOverlay();

  /**
   * Returns the Page command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Page} object
   */
  Page getPage();

  /**
   * Returns the Performance command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Performance} object
   */
  Performance getPerformance();

  /**
   * Returns the PerformanceTimeline command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.PerformanceTimeline} object
   */
  PerformanceTimeline getPerformanceTimeline();

  /**
   * Returns the Security command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Security} object
   */
  Security getSecurity();

  /**
   * Returns the ServiceWorker command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.ServiceWorker} object
   */
  ServiceWorker getServiceWorker();

  /**
   * Returns the Storage command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Storage} object
   */
  Storage getStorage();

  /**
   * Returns the SystemInfo command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.SystemInfo} object
   */
  SystemInfo getSystemInfo();

  /**
   * Returns the Target command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Target} object
   */
  Target getTarget();

  /**
   * Returns the Tethering command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Tethering} object
   */
  Tethering getTethering();

  /**
   * Returns the Tracing command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Tracing} object
   */
  Tracing getTracing();

  /**
   * Returns the Fetch command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Fetch} object
   */
  Fetch getFetch();

  /**
   * Returns the WebAudio command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.WebAudio} object
   */
  WebAudio getWebAudio();

  /**
   * Returns the WebAuthn command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.WebAuthn} object
   */
  WebAuthn getWebAuthn();

  /**
   * Returns the Media command.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.commands.Media} object
   */
  Media getMedia();
}
