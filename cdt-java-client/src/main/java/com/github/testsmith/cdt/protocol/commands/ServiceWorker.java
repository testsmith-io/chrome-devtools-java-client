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

import com.github.testsmith.cdt.protocol.events.serviceworker.WorkerErrorReported;
import com.github.testsmith.cdt.protocol.events.serviceworker.WorkerRegistrationUpdated;
import com.github.testsmith.cdt.protocol.events.serviceworker.WorkerVersionUpdated;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;

/**
 * ServiceWorker interface.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface ServiceWorker {

  /**
   * deliverPushMessage.
   *
   * @param origin a {@link java.lang.String} object
   * @param registrationId a {@link java.lang.String} object
   * @param data a {@link java.lang.String} object
   */
  void deliverPushMessage(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("data") String data);

  /** disable. */
  void disable();

  /**
   * dispatchSyncEvent.
   *
   * @param origin a {@link java.lang.String} object
   * @param registrationId a {@link java.lang.String} object
   * @param tag a {@link java.lang.String} object
   * @param lastChance a {@link java.lang.Boolean} object
   */
  void dispatchSyncEvent(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("tag") String tag,
      @ParamName("lastChance") Boolean lastChance);

  /**
   * dispatchPeriodicSyncEvent.
   *
   * @param origin a {@link java.lang.String} object
   * @param registrationId a {@link java.lang.String} object
   * @param tag a {@link java.lang.String} object
   */
  void dispatchPeriodicSyncEvent(
      @ParamName("origin") String origin,
      @ParamName("registrationId") String registrationId,
      @ParamName("tag") String tag);

  /** enable. */
  void enable();

  /** @param versionId */
  /**
   * inspectWorker.
   *
   * @param versionId a {@link java.lang.String} object
   */
  void inspectWorker(@ParamName("versionId") String versionId);

  /** @param forceUpdateOnPageLoad */
  /**
   * setForceUpdateOnPageLoad.
   *
   * @param forceUpdateOnPageLoad a {@link java.lang.Boolean} object
   */
  void setForceUpdateOnPageLoad(@ParamName("forceUpdateOnPageLoad") Boolean forceUpdateOnPageLoad);

  /** @param scopeURL */
  /**
   * skipWaiting.
   *
   * @param scopeURL a {@link java.lang.String} object
   */
  void skipWaiting(@ParamName("scopeURL") String scopeURL);

  /** @param scopeURL */
  /**
   * startWorker.
   *
   * @param scopeURL a {@link java.lang.String} object
   */
  void startWorker(@ParamName("scopeURL") String scopeURL);

  /** stopAllWorkers. */
  void stopAllWorkers();

  /** @param versionId */
  /**
   * stopWorker.
   *
   * @param versionId a {@link java.lang.String} object
   */
  void stopWorker(@ParamName("versionId") String versionId);

  /** @param scopeURL */
  /**
   * unregister.
   *
   * @param scopeURL a {@link java.lang.String} object
   */
  void unregister(@ParamName("scopeURL") String scopeURL);

  /** @param scopeURL */
  /**
   * updateRegistration.
   *
   * @param scopeURL a {@link java.lang.String} object
   */
  void updateRegistration(@ParamName("scopeURL") String scopeURL);

  /**
   * onWorkerErrorReported.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("workerErrorReported")
  EventListener onWorkerErrorReported(EventHandler<WorkerErrorReported> eventListener);

  /**
   * onWorkerRegistrationUpdated.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("workerRegistrationUpdated")
  EventListener onWorkerRegistrationUpdated(EventHandler<WorkerRegistrationUpdated> eventListener);

  /**
   * onWorkerVersionUpdated.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("workerVersionUpdated")
  EventListener onWorkerVersionUpdated(EventHandler<WorkerVersionUpdated> eventListener);
}
