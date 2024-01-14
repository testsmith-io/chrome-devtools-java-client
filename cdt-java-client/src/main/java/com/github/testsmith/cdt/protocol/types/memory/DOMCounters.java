package com.github.testsmith.cdt.protocol.types.memory;

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
 * DOMCounters class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DOMCounters {

  private Integer documents;

  private Integer nodes;

  private Integer jsEventListeners;

  /**
   * Getter for the field <code>documents</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDocuments() {
    return documents;
  }

  /**
   * Setter for the field <code>documents</code>.
   *
   * @param documents a {@link java.lang.Integer} object
   */
  public void setDocuments(Integer documents) {
    this.documents = documents;
  }

  /**
   * Getter for the field <code>nodes</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNodes() {
    return nodes;
  }

  /**
   * Setter for the field <code>nodes</code>.
   *
   * @param nodes a {@link java.lang.Integer} object
   */
  public void setNodes(Integer nodes) {
    this.nodes = nodes;
  }

  /**
   * Getter for the field <code>jsEventListeners</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getJsEventListeners() {
    return jsEventListeners;
  }

  /**
   * Setter for the field <code>jsEventListeners</code>.
   *
   * @param jsEventListeners a {@link java.lang.Integer} object
   */
  public void setJsEventListeners(Integer jsEventListeners) {
    this.jsEventListeners = jsEventListeners;
  }
}
