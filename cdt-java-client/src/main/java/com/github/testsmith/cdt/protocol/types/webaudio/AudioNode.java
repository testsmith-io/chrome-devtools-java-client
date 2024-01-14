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
 * Protocol object for AudioNode
 *
 * @author roy
 * @version $Id: $Id
 */
public class AudioNode {

  private String nodeId;

  private String contextId;

  private String nodeType;

  private Double numberOfInputs;

  private Double numberOfOutputs;

  private Double channelCount;

  private ChannelCountMode channelCountMode;

  private ChannelInterpretation channelInterpretation;

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
   * Getter for the field <code>nodeType</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeType() {
    return nodeType;
  }

  /**
   * Setter for the field <code>nodeType</code>.
   *
   * @param nodeType a {@link java.lang.String} object
   */
  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * Getter for the field <code>numberOfInputs</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getNumberOfInputs() {
    return numberOfInputs;
  }

  /**
   * Setter for the field <code>numberOfInputs</code>.
   *
   * @param numberOfInputs a {@link java.lang.Double} object
   */
  public void setNumberOfInputs(Double numberOfInputs) {
    this.numberOfInputs = numberOfInputs;
  }

  /**
   * Getter for the field <code>numberOfOutputs</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getNumberOfOutputs() {
    return numberOfOutputs;
  }

  /**
   * Setter for the field <code>numberOfOutputs</code>.
   *
   * @param numberOfOutputs a {@link java.lang.Double} object
   */
  public void setNumberOfOutputs(Double numberOfOutputs) {
    this.numberOfOutputs = numberOfOutputs;
  }

  /**
   * Getter for the field <code>channelCount</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getChannelCount() {
    return channelCount;
  }

  /**
   * Setter for the field <code>channelCount</code>.
   *
   * @param channelCount a {@link java.lang.Double} object
   */
  public void setChannelCount(Double channelCount) {
    this.channelCount = channelCount;
  }

  /**
   * Getter for the field <code>channelCountMode</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ChannelCountMode} object
   */
  public ChannelCountMode getChannelCountMode() {
    return channelCountMode;
  }

  /**
   * Setter for the field <code>channelCountMode</code>.
   *
   * @param channelCountMode a {@link
   *     com.github.testsmith.cdt.protocol.types.webaudio.ChannelCountMode} object
   */
  public void setChannelCountMode(ChannelCountMode channelCountMode) {
    this.channelCountMode = channelCountMode;
  }

  /**
   * Getter for the field <code>channelInterpretation</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ChannelInterpretation} object
   */
  public ChannelInterpretation getChannelInterpretation() {
    return channelInterpretation;
  }

  /**
   * Setter for the field <code>channelInterpretation</code>.
   *
   * @param channelInterpretation a {@link
   *     com.github.testsmith.cdt.protocol.types.webaudio.ChannelInterpretation} object
   */
  public void setChannelInterpretation(ChannelInterpretation channelInterpretation) {
    this.channelInterpretation = channelInterpretation;
  }
}
