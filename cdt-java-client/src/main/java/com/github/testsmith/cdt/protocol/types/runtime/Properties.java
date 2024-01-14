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
import java.util.List;

/**
 * Properties class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Properties {

  private List<PropertyDescriptor> result;

  @Optional private List<InternalPropertyDescriptor> internalProperties;

  @Experimental @Optional private List<PrivatePropertyDescriptor> privateProperties;

  @Optional private ExceptionDetails exceptionDetails;

  /**
   * Object properties.
   *
   * @return a {@link java.util.List} object
   */
  public List<PropertyDescriptor> getResult() {
    return result;
  }

  /**
   * Object properties.
   *
   * @param result a {@link java.util.List} object
   */
  public void setResult(List<PropertyDescriptor> result) {
    this.result = result;
  }

  /**
   * Internal object properties (only of the element itself).
   *
   * @return a {@link java.util.List} object
   */
  public List<InternalPropertyDescriptor> getInternalProperties() {
    return internalProperties;
  }

  /**
   * Internal object properties (only of the element itself).
   *
   * @param internalProperties a {@link java.util.List} object
   */
  public void setInternalProperties(List<InternalPropertyDescriptor> internalProperties) {
    this.internalProperties = internalProperties;
  }

  /**
   * Object private properties.
   *
   * @return a {@link java.util.List} object
   */
  public List<PrivatePropertyDescriptor> getPrivateProperties() {
    return privateProperties;
  }

  /**
   * Object private properties.
   *
   * @param privateProperties a {@link java.util.List} object
   */
  public void setPrivateProperties(List<PrivatePropertyDescriptor> privateProperties) {
    this.privateProperties = privateProperties;
  }

  /**
   * Exception details.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /**
   * Exception details.
   *
   * @param exceptionDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
