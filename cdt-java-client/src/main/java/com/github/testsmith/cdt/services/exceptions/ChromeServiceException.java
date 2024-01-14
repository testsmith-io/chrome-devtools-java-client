package com.github.testsmith.cdt.services.exceptions;

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
 * Chrome service exception.
 *
 * @author Kenan Klisura
 * @version $Id: $Id
 */
public class ChromeServiceException extends RuntimeException {
  /**
   * Constructor for ChromeServiceException.
   *
   * @param message a {@link java.lang.String} object
   */
  public ChromeServiceException(String message) {
    super(message);
  }

  /**
   * Constructor for ChromeServiceException.
   *
   * @param message a {@link java.lang.String} object
   * @param cause a {@link java.lang.Throwable} object
   */
  public ChromeServiceException(String message, Throwable cause) {
    super(message, cause);
  }
}