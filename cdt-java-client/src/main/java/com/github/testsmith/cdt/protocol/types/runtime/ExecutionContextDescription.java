package com.github.testsmith.cdt.protocol.types.runtime;

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
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.Map;

/**
 * Description of an isolated world.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExecutionContextDescription {

  private Integer id;

  private String origin;

  private String name;

  @Experimental private String uniqueId;

  @Optional private Map<String, Object> auxData;

  /**
   * Unique id of the execution context. It can be used to specify in which execution context script
   * evaluation should be performed.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getId() {
    return id;
  }

  /**
   * Unique id of the execution context. It can be used to specify in which execution context script
   * evaluation should be performed.
   *
   * @param id a {@link java.lang.Integer} object
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Execution context origin.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Execution context origin.
   *
   * @param origin a {@link java.lang.String} object
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Human readable name describing given context.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Human readable name describing given context.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A system-unique execution context identifier. Unlike the id, this is unique accross multiple
   * processes, so can be reliably used to identify specific context while backend performs a
   * cross-process navigation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUniqueId() {
    return uniqueId;
  }

  /**
   * A system-unique execution context identifier. Unlike the id, this is unique accross multiple
   * processes, so can be reliably used to identify specific context while backend performs a
   * cross-process navigation.
   *
   * @param uniqueId a {@link java.lang.String} object
   */
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  /**
   * Embedder-specific auxiliary data.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getAuxData() {
    return auxData;
  }

  /**
   * Embedder-specific auxiliary data.
   *
   * @param auxData a {@link java.util.Map} object
   */
  public void setAuxData(Map<String, Object> auxData) {
    this.auxData = auxData;
  }
}
