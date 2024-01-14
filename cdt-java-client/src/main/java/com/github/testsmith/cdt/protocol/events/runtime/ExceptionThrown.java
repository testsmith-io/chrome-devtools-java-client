package com.github.testsmith.cdt.protocol.events.runtime;

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

import com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails;

/**
 * Issued when exception was thrown and unhandled.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExceptionThrown {

  private Double timestamp;

  private ExceptionDetails exceptionDetails;

  /**
   * Timestamp of the exception.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Timestamp of the exception.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for the field <code>exceptionDetails</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /**
   * Setter for the field <code>exceptionDetails</code>.
   *
   * @param exceptionDetails a {@link
   *     com.github.testsmith.cdt.protocol.types.runtime.ExceptionDetails} object
   */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
