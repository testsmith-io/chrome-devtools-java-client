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

/**
 * Timing information for the request.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ResourceTiming {

  private Double requestTime;

  private Double proxyStart;

  private Double proxyEnd;

  private Double dnsStart;

  private Double dnsEnd;

  private Double connectStart;

  private Double connectEnd;

  private Double sslStart;

  private Double sslEnd;

  @Experimental private Double workerStart;

  @Experimental private Double workerReady;

  @Experimental private Double workerFetchStart;

  @Experimental private Double workerRespondWithSettled;

  private Double sendStart;

  private Double sendEnd;

  @Experimental private Double pushStart;

  @Experimental private Double pushEnd;

  private Double receiveHeadersEnd;

  /**
   * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
   * milliseconds relatively to this requestTime.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getRequestTime() {
    return requestTime;
  }

  /**
   * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
   * milliseconds relatively to this requestTime.
   *
   * @param requestTime a {@link java.lang.Double} object
   */
  public void setRequestTime(Double requestTime) {
    this.requestTime = requestTime;
  }

  /**
   * Started resolving proxy.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getProxyStart() {
    return proxyStart;
  }

  /**
   * Started resolving proxy.
   *
   * @param proxyStart a {@link java.lang.Double} object
   */
  public void setProxyStart(Double proxyStart) {
    this.proxyStart = proxyStart;
  }

  /**
   * Finished resolving proxy.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getProxyEnd() {
    return proxyEnd;
  }

  /**
   * Finished resolving proxy.
   *
   * @param proxyEnd a {@link java.lang.Double} object
   */
  public void setProxyEnd(Double proxyEnd) {
    this.proxyEnd = proxyEnd;
  }

  /**
   * Started DNS address resolve.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDnsStart() {
    return dnsStart;
  }

  /**
   * Started DNS address resolve.
   *
   * @param dnsStart a {@link java.lang.Double} object
   */
  public void setDnsStart(Double dnsStart) {
    this.dnsStart = dnsStart;
  }

  /**
   * Finished DNS address resolve.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDnsEnd() {
    return dnsEnd;
  }

  /**
   * Finished DNS address resolve.
   *
   * @param dnsEnd a {@link java.lang.Double} object
   */
  public void setDnsEnd(Double dnsEnd) {
    this.dnsEnd = dnsEnd;
  }

  /**
   * Started connecting to the remote host.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getConnectStart() {
    return connectStart;
  }

  /**
   * Started connecting to the remote host.
   *
   * @param connectStart a {@link java.lang.Double} object
   */
  public void setConnectStart(Double connectStart) {
    this.connectStart = connectStart;
  }

  /**
   * Connected to the remote host.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getConnectEnd() {
    return connectEnd;
  }

  /**
   * Connected to the remote host.
   *
   * @param connectEnd a {@link java.lang.Double} object
   */
  public void setConnectEnd(Double connectEnd) {
    this.connectEnd = connectEnd;
  }

  /**
   * Started SSL handshake.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSslStart() {
    return sslStart;
  }

  /**
   * Started SSL handshake.
   *
   * @param sslStart a {@link java.lang.Double} object
   */
  public void setSslStart(Double sslStart) {
    this.sslStart = sslStart;
  }

  /**
   * Finished SSL handshake.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSslEnd() {
    return sslEnd;
  }

  /**
   * Finished SSL handshake.
   *
   * @param sslEnd a {@link java.lang.Double} object
   */
  public void setSslEnd(Double sslEnd) {
    this.sslEnd = sslEnd;
  }

  /**
   * Started running ServiceWorker.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWorkerStart() {
    return workerStart;
  }

  /**
   * Started running ServiceWorker.
   *
   * @param workerStart a {@link java.lang.Double} object
   */
  public void setWorkerStart(Double workerStart) {
    this.workerStart = workerStart;
  }

  /**
   * Finished Starting ServiceWorker.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWorkerReady() {
    return workerReady;
  }

  /**
   * Finished Starting ServiceWorker.
   *
   * @param workerReady a {@link java.lang.Double} object
   */
  public void setWorkerReady(Double workerReady) {
    this.workerReady = workerReady;
  }

  /**
   * Started fetch event.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWorkerFetchStart() {
    return workerFetchStart;
  }

  /**
   * Started fetch event.
   *
   * @param workerFetchStart a {@link java.lang.Double} object
   */
  public void setWorkerFetchStart(Double workerFetchStart) {
    this.workerFetchStart = workerFetchStart;
  }

  /**
   * Settled fetch event respondWith promise.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWorkerRespondWithSettled() {
    return workerRespondWithSettled;
  }

  /**
   * Settled fetch event respondWith promise.
   *
   * @param workerRespondWithSettled a {@link java.lang.Double} object
   */
  public void setWorkerRespondWithSettled(Double workerRespondWithSettled) {
    this.workerRespondWithSettled = workerRespondWithSettled;
  }

  /**
   * Started sending request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSendStart() {
    return sendStart;
  }

  /**
   * Started sending request.
   *
   * @param sendStart a {@link java.lang.Double} object
   */
  public void setSendStart(Double sendStart) {
    this.sendStart = sendStart;
  }

  /**
   * Finished sending request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSendEnd() {
    return sendEnd;
  }

  /**
   * Finished sending request.
   *
   * @param sendEnd a {@link java.lang.Double} object
   */
  public void setSendEnd(Double sendEnd) {
    this.sendEnd = sendEnd;
  }

  /**
   * Time the server started pushing request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getPushStart() {
    return pushStart;
  }

  /**
   * Time the server started pushing request.
   *
   * @param pushStart a {@link java.lang.Double} object
   */
  public void setPushStart(Double pushStart) {
    this.pushStart = pushStart;
  }

  /**
   * Time the server finished pushing request.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getPushEnd() {
    return pushEnd;
  }

  /**
   * Time the server finished pushing request.
   *
   * @param pushEnd a {@link java.lang.Double} object
   */
  public void setPushEnd(Double pushEnd) {
    this.pushEnd = pushEnd;
  }

  /**
   * Finished receiving response headers.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getReceiveHeadersEnd() {
    return receiveHeadersEnd;
  }

  /**
   * Finished receiving response headers.
   *
   * @param receiveHeadersEnd a {@link java.lang.Double} object
   */
  public void setReceiveHeadersEnd(Double receiveHeadersEnd) {
    this.receiveHeadersEnd = receiveHeadersEnd;
  }
}
