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
 * Protocol object for AudioParam
 *
 * @author roy
 * @version $Id: $Id
 */
public class AudioParam {

  private String paramId;

  private String nodeId;

  private String contextId;

  private String paramType;

  private AutomationRate rate;

  private Double defaultValue;

  private Double minValue;

  private Double maxValue;

  /**
   * Getter for the field <code>paramId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getParamId() {
    return paramId;
  }

  /**
   * Setter for the field <code>paramId</code>.
   *
   * @param paramId a {@link java.lang.String} object
   */
  public void setParamId(String paramId) {
    this.paramId = paramId;
  }

  /**
   * Getter for the field <code>nodeId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeId() {
    return nodeId;
  }

  /**
   * Setter for the field <code>nodeId</code>.
   *
   * @param nodeId a {@link java.lang.String} object
   */
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

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
   * Getter for the field <code>paramType</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getParamType() {
    return paramType;
  }

  /**
   * Setter for the field <code>paramType</code>.
   *
   * @param paramType a {@link java.lang.String} object
   */
  public void setParamType(String paramType) {
    this.paramType = paramType;
  }

  /**
   * Getter for the field <code>rate</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.AutomationRate} object
   */
  public AutomationRate getRate() {
    return rate;
  }

  /**
   * Setter for the field <code>rate</code>.
   *
   * @param rate a {@link com.github.testsmith.cdt.protocol.types.webaudio.AutomationRate} object
   */
  public void setRate(AutomationRate rate) {
    this.rate = rate;
  }

  /**
   * Getter for the field <code>defaultValue</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDefaultValue() {
    return defaultValue;
  }

  /**
   * Setter for the field <code>defaultValue</code>.
   *
   * @param defaultValue a {@link java.lang.Double} object
   */
  public void setDefaultValue(Double defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Getter for the field <code>minValue</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getMinValue() {
    return minValue;
  }

  /**
   * Setter for the field <code>minValue</code>.
   *
   * @param minValue a {@link java.lang.Double} object
   */
  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  /**
   * Getter for the field <code>maxValue</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getMaxValue() {
    return maxValue;
  }

  /**
   * Setter for the field <code>maxValue</code>.
   *
   * @param maxValue a {@link java.lang.Double} object
   */
  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }
}
