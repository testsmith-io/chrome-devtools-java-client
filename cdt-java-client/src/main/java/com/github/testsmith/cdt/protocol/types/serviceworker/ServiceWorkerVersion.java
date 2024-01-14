package com.github.testsmith.cdt.protocol.types.serviceworker;

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
import java.util.List;

/**
 * ServiceWorker version.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ServiceWorkerVersion {

  private String versionId;

  private String registrationId;

  private String scriptURL;

  private ServiceWorkerVersionRunningStatus runningStatus;

  private ServiceWorkerVersionStatus status;

  @Optional private Double scriptLastModified;

  @Optional private Double scriptResponseTime;

  @Optional private List<String> controlledClients;

  @Optional private String targetId;

  /**
   * Getter for the field <code>versionId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersionId() {
    return versionId;
  }

  /**
   * Setter for the field <code>versionId</code>.
   *
   * @param versionId a {@link java.lang.String} object
   */
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  /**
   * Getter for the field <code>registrationId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegistrationId() {
    return registrationId;
  }

  /**
   * Setter for the field <code>registrationId</code>.
   *
   * @param registrationId a {@link java.lang.String} object
   */
  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  /**
   * Getter for the field <code>scriptURL</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptURL() {
    return scriptURL;
  }

  /**
   * Setter for the field <code>scriptURL</code>.
   *
   * @param scriptURL a {@link java.lang.String} object
   */
  public void setScriptURL(String scriptURL) {
    this.scriptURL = scriptURL;
  }

  /**
   * Getter for the field <code>runningStatus</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.serviceworker.ServiceWorkerVersionRunningStatus}
   *     object
   */
  public ServiceWorkerVersionRunningStatus getRunningStatus() {
    return runningStatus;
  }

  /**
   * Setter for the field <code>runningStatus</code>.
   *
   * @param runningStatus a {@link
   *     com.github.testsmith.cdt.protocol.types.serviceworker.ServiceWorkerVersionRunningStatus}
   *     object
   */
  public void setRunningStatus(ServiceWorkerVersionRunningStatus runningStatus) {
    this.runningStatus = runningStatus;
  }

  /**
   * Getter for the field <code>status</code>.
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.serviceworker.ServiceWorkerVersionStatus} object
   */
  public ServiceWorkerVersionStatus getStatus() {
    return status;
  }

  /**
   * Setter for the field <code>status</code>.
   *
   * @param status a {@link
   *     com.github.testsmith.cdt.protocol.types.serviceworker.ServiceWorkerVersionStatus} object
   */
  public void setStatus(ServiceWorkerVersionStatus status) {
    this.status = status;
  }

  /**
   * The Last-Modified header value of the main script.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScriptLastModified() {
    return scriptLastModified;
  }

  /**
   * The Last-Modified header value of the main script.
   *
   * @param scriptLastModified a {@link java.lang.Double} object
   */
  public void setScriptLastModified(Double scriptLastModified) {
    this.scriptLastModified = scriptLastModified;
  }

  /**
   * The time at which the response headers of the main script were received from the server. For
   * cached script it is the last time the cache entry was validated.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScriptResponseTime() {
    return scriptResponseTime;
  }

  /**
   * The time at which the response headers of the main script were received from the server. For
   * cached script it is the last time the cache entry was validated.
   *
   * @param scriptResponseTime a {@link java.lang.Double} object
   */
  public void setScriptResponseTime(Double scriptResponseTime) {
    this.scriptResponseTime = scriptResponseTime;
  }

  /**
   * Getter for the field <code>controlledClients</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getControlledClients() {
    return controlledClients;
  }

  /**
   * Setter for the field <code>controlledClients</code>.
   *
   * @param controlledClients a {@link java.util.List} object
   */
  public void setControlledClients(List<String> controlledClients) {
    this.controlledClients = controlledClients;
  }

  /**
   * Getter for the field <code>targetId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTargetId() {
    return targetId;
  }

  /**
   * Setter for the field <code>targetId</code>.
   *
   * @param targetId a {@link java.lang.String} object
   */
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }
}
