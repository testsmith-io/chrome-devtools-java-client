package com.github.testsmith.cdt.protocol.types.accessibility;

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
 * AXRelatedNode class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AXRelatedNode {

  private Integer backendDOMNodeId;

  @Optional private String idref;

  @Optional private String text;

  /**
   * The BackendNodeId of the related DOM node.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getBackendDOMNodeId() {
    return backendDOMNodeId;
  }

  /**
   * The BackendNodeId of the related DOM node.
   *
   * @param backendDOMNodeId a {@link java.lang.Integer} object
   */
  public void setBackendDOMNodeId(Integer backendDOMNodeId) {
    this.backendDOMNodeId = backendDOMNodeId;
  }

  /**
   * The IDRef value provided, if any.
   *
   * @return a {@link java.lang.String} object
   */
  public String getIdref() {
    return idref;
  }

  /**
   * The IDRef value provided, if any.
   *
   * @param idref a {@link java.lang.String} object
   */
  public void setIdref(String idref) {
    this.idref = idref;
  }

  /**
   * The text alternative of this node in the current context.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * The text alternative of this node in the current context.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }
}
