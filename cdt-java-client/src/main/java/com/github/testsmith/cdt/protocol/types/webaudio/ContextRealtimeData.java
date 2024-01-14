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

/**
 * Fields in AudioContext that change in real-time.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ContextRealtimeData {

  private Double currentTime;

  private Double renderCapacity;

  private Double callbackIntervalMean;

  private Double callbackIntervalVariance;

  /**
   * The current context time in second in BaseAudioContext.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCurrentTime() {
    return currentTime;
  }

  /**
   * The current context time in second in BaseAudioContext.
   *
   * @param currentTime a {@link java.lang.Double} object
   */
  public void setCurrentTime(Double currentTime) {
    this.currentTime = currentTime;
  }

  /**
   * The time spent on rendering graph divided by render quantum duration, and multiplied by 100.
   * 100 means the audio renderer reached the full capacity and glitch may occur.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getRenderCapacity() {
    return renderCapacity;
  }

  /**
   * The time spent on rendering graph divided by render quantum duration, and multiplied by 100.
   * 100 means the audio renderer reached the full capacity and glitch may occur.
   *
   * @param renderCapacity a {@link java.lang.Double} object
   */
  public void setRenderCapacity(Double renderCapacity) {
    this.renderCapacity = renderCapacity;
  }

  /**
   * A running mean of callback interval.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCallbackIntervalMean() {
    return callbackIntervalMean;
  }

  /**
   * A running mean of callback interval.
   *
   * @param callbackIntervalMean a {@link java.lang.Double} object
   */
  public void setCallbackIntervalMean(Double callbackIntervalMean) {
    this.callbackIntervalMean = callbackIntervalMean;
  }

  /**
   * A running variance of callback interval.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getCallbackIntervalVariance() {
    return callbackIntervalVariance;
  }

  /**
   * A running variance of callback interval.
   *
   * @param callbackIntervalVariance a {@link java.lang.Double} object
   */
  public void setCallbackIntervalVariance(Double callbackIntervalVariance) {
    this.callbackIntervalVariance = callbackIntervalVariance;
  }
}
