package com.github.testsmith.cdt.services.types;

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

import java.util.Map;

/**
 * Method invocation model.
 *
 * @author Kenan Klisura
 * @version $Id: $Id
 */
public final class MethodInvocation {
  private Long id;

  private String method;

  private Map<String, Object> params;

  /**
   * Getter for the field <code>id</code>.
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getId() {
    return id;
  }

  /**
   * Setter for the field <code>id</code>.
   *
   * @param id a {@link java.lang.Long} object
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for the field <code>method</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMethod() {
    return method;
  }

  /**
   * Setter for the field <code>method</code>.
   *
   * @param method a {@link java.lang.String} object
   */
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * Getter for the field <code>params</code>.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getParams() {
    return params;
  }

  /**
   * Setter for the field <code>params</code>.
   *
   * @param params a {@link java.util.Map} object
   */
  public void setParams(Map<String, Object> params) {
    this.params = params;
  }
}
