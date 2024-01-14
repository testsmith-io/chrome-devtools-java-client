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

import com.github.testsmith.cdt.protocol.events.heapprofiler.*;
import com.github.testsmith.cdt.protocol.support.annotations.*;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.heapprofiler.SamplingHeapProfile;
import com.github.testsmith.cdt.protocol.types.runtime.RemoteObject;

/**
 * HeapProfiler interface.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface HeapProfiler {

  /**
   * Enables console to refer to the node with given id via $x (see Command Line API for more
   * details $x functions).
   *
   * @param heapObjectId Heap snapshot object id to be accessible by means of $x command line API.
   */
  void addInspectedHeapObject(@ParamName("heapObjectId") String heapObjectId);

  /** collectGarbage. */
  void collectGarbage();

  /** disable. */
  void disable();

  /** enable. */
  void enable();

  /** @param objectId Identifier of the object to get heap object id for. */
  /**
   * getHeapObjectId.
   *
   * @param objectId a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  @Returns("heapSnapshotObjectId")
  String getHeapObjectId(@ParamName("objectId") String objectId);

  /** @param objectId */
  /**
   * getObjectByHeapObjectId.
   *
   * @param objectId a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  @Returns("result")
  RemoteObject getObjectByHeapObjectId(@ParamName("objectId") String objectId);

  /**
   * getObjectByHeapObjectId.
   *
   * @param objectId a {@link java.lang.String} object
   * @param objectGroup Symbolic group name that can be used to release multiple objects.
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  @Returns("result")
  RemoteObject getObjectByHeapObjectId(
      @ParamName("objectId") String objectId,
      @Optional @ParamName("objectGroup") String objectGroup);

  /**
   * getSamplingProfile.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.heapprofiler.SamplingHeapProfile}
   *     object
   */
  @Returns("profile")
  SamplingHeapProfile getSamplingProfile();

  /** startSampling. */
  void startSampling();

  /**
   * startSampling.
   *
   * @param samplingInterval Average sample interval in bytes. Poisson distribution is used for the
   *     intervals. The default value is 32768 bytes.
   */
  void startSampling(@Optional @ParamName("samplingInterval") Double samplingInterval);

  /** startTrackingHeapObjects. */
  void startTrackingHeapObjects();

  /** @param trackAllocations */
  /**
   * startTrackingHeapObjects.
   *
   * @param trackAllocations a {@link java.lang.Boolean} object
   */
  void startTrackingHeapObjects(@Optional @ParamName("trackAllocations") Boolean trackAllocations);

  /**
   * stopSampling.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.heapprofiler.SamplingHeapProfile}
   *     object
   */
  @Returns("profile")
  SamplingHeapProfile stopSampling();

  /** stopTrackingHeapObjects. */
  void stopTrackingHeapObjects();

  /**
   * stopTrackingHeapObjects.
   *
   * @param reportProgress If true 'reportHeapSnapshotProgress' events will be generated while
   *     snapshot is being taken when the tracking is stopped.
   * @param treatGlobalObjectsAsRoots a {@link java.lang.Boolean} object
   */
  void stopTrackingHeapObjects(
      @Optional @ParamName("reportProgress") Boolean reportProgress,
      @Optional @ParamName("treatGlobalObjectsAsRoots") Boolean treatGlobalObjectsAsRoots);

  /** takeHeapSnapshot. */
  void takeHeapSnapshot();

  /**
   * takeHeapSnapshot.
   *
   * @param reportProgress If true 'reportHeapSnapshotProgress' events will be generated while
   *     snapshot is being taken.
   * @param treatGlobalObjectsAsRoots If true, a raw snapshot without artifical roots will be
   *     generated
   */
  void takeHeapSnapshot(
      @Optional @ParamName("reportProgress") Boolean reportProgress,
      @Optional @ParamName("treatGlobalObjectsAsRoots") Boolean treatGlobalObjectsAsRoots);

  /**
   * onAddHeapSnapshotChunk.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("addHeapSnapshotChunk")
  EventListener onAddHeapSnapshotChunk(EventHandler<AddHeapSnapshotChunk> eventListener);

  /**
   * If heap objects tracking has been started then backend may send update for one or more
   * fragments
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("heapStatsUpdate")
  EventListener onHeapStatsUpdate(EventHandler<HeapStatsUpdate> eventListener);

  /**
   * If heap objects tracking has been started then backend regularly sends a current value for last
   * seen object id and corresponding timestamp. If the were changes in the heap since last event
   * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("lastSeenObjectId")
  EventListener onLastSeenObjectId(EventHandler<LastSeenObjectId> eventListener);

  /**
   * onReportHeapSnapshotProgress.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("reportHeapSnapshotProgress")
  EventListener onReportHeapSnapshotProgress(
      EventHandler<ReportHeapSnapshotProgress> eventListener);

  /**
   * onResetProfiles.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("resetProfiles")
  EventListener onResetProfiles(EventHandler<ResetProfiles> eventListener);
}
