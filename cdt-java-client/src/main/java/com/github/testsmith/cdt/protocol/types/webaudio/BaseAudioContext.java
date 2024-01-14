package com.github.testsmith.cdt.protocol.types.webaudio;

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

/**
 * Protocol object for BaseAudioContext
 *
 * @author roy
 * @version $Id: $Id
 */
public class BaseAudioContext {

  private String contextId;

  private ContextType contextType;

  private ContextState contextState;

  @Optional private ContextRealtimeData realtimeData;

  private Double callbackBufferSize;

  private Double maxOutputChannelCount;

  private Double sampleRate;

  /**
   * Getter for the field <code>contextId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getContextId() {
    return contextId;
  }

  /**
   * Setter for the field <code>contextId</code>.
   *
   * @param contextId a {@link java.lang.String} object
   */
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   * Getter for the field <code>contextType</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextType} object
   */
  public ContextType getContextType() {
    return contextType;
  }

  /**
   * Setter for the field <code>contextType</code>.
   *
   * @param contextType a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextType}
   *     object
   */
  public void setContextType(ContextType contextType) {
    this.contextType = contextType;
  }

  /**
   * Getter for the field <code>contextState</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextState} object
   */
  public ContextState getContextState() {
    return contextState;
  }

  /**
   * Setter for the field <code>contextState</code>.
   *
   * @param contextState a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextState}
   *     object
   */
  public void setContextState(ContextState contextState) {
    this.contextState = contextState;
  }

  /**
   * Getter for the field <code>realtimeData</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextRealtimeData} object
   */
  public ContextRealtimeData getRealtimeData() {
    return realtimeData;
  }

  /**
   * Setter for the field <code>realtimeData</code>.
   *
   * @param realtimeData a {@link
   *     com.github.testsmith.cdt.protocol.types.webaudio.ContextRealtimeData} object
   */
  public void setRealtimeData(ContextRealtimeData realtimeData) {
    this.realtimeData = realtimeData;
  }

  /**
   * Platform-dependent callback buffer size.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCallbackBufferSize() {
    return callbackBufferSize;
  }

  /**
   * Platform-dependent callback buffer size.
   *
   * @param callbackBufferSize a {@link java.lang.Double} object
   */
  public void setCallbackBufferSize(Double callbackBufferSize) {
    this.callbackBufferSize = callbackBufferSize;
  }

  /**
   * Number of output channels supported by audio hardware in use.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getMaxOutputChannelCount() {
    return maxOutputChannelCount;
  }

  /**
   * Number of output channels supported by audio hardware in use.
   *
   * @param maxOutputChannelCount a {@link java.lang.Double} object
   */
  public void setMaxOutputChannelCount(Double maxOutputChannelCount) {
    this.maxOutputChannelCount = maxOutputChannelCount;
  }

  /**
   * Context sample rate.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getSampleRate() {
    return sampleRate;
  }

  /**
   * Context sample rate.
   *
   * @param sampleRate a {@link java.lang.Double} object
   */
  public void setSampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
  }
}
