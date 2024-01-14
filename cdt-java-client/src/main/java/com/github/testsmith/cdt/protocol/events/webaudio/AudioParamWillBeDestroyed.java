package com.github.testsmith.cdt.protocol.events.webaudio;

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
 * Notifies that an existing AudioParam has been destroyed.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AudioParamWillBeDestroyed {

  private String contextId;

  private String nodeId;

  private String paramId;

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
}
