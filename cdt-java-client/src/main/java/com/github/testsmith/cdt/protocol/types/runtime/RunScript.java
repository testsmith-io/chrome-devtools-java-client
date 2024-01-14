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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * RunScript class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RunScript {

  private RemoteObject result;

  @Optional private ExceptionDetails exceptionDetails;

  /**
   * Run result.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public RemoteObject getResult() {
    return result;
  }

  /**
   * Run result.
   *
   * @param result a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObject} object
   */
  public void setResult(RemoteObject result) {
    this.result = result;
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
