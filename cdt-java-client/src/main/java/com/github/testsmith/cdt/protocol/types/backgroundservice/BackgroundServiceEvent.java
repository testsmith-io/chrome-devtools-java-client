package com.github.testsmith.cdt.protocol.types.backgroundservice;

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
 * BackgroundServiceEvent class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BackgroundServiceEvent {

  private Double timestamp;

  private String origin;

  private String serviceWorkerRegistrationId;

  private ServiceName service;

  private String eventName;

  private String instanceId;

  private List<EventMetadata> eventMetadata;

  /**
   * Timestamp of the event (in seconds).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Timestamp of the event (in seconds).
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The origin this event belongs to.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * The origin this event belongs to.
   *
   * @param origin a {@link java.lang.String} object
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * The Service Worker ID that initiated the event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getServiceWorkerRegistrationId() {
    return serviceWorkerRegistrationId;
  }

  /**
   * The Service Worker ID that initiated the event.
   *
   * @param serviceWorkerRegistrationId a {@link java.lang.String} object
   */
  public void setServiceWorkerRegistrationId(String serviceWorkerRegistrationId) {
    this.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
  }

  /**
   * The Background Service this event belongs to.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName} object
   */
  public ServiceName getService() {
    return service;
  }

  /**
   * The Background Service this event belongs to.
   *
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  public void setService(ServiceName service) {
    this.service = service;
  }

  /**
   * A description of the event.
   *
   * @return a {@link java.lang.String} object
   */
  public String getEventName() {
    return eventName;
  }

  /**
   * A description of the event.
   *
   * @param eventName a {@link java.lang.String} object
   */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * An identifier that groups related events together.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * An identifier that groups related events together.
   *
   * @param instanceId a {@link java.lang.String} object
   */
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  /**
   * A list of event-specific information.
   *
   * @return a {@link java.util.List} object
   */
  public List<EventMetadata> getEventMetadata() {
    return eventMetadata;
  }

  /**
   * A list of event-specific information.
   *
   * @param eventMetadata a {@link java.util.List} object
   */
  public void setEventMetadata(List<EventMetadata> eventMetadata) {
    this.eventMetadata = eventMetadata;
  }
}
