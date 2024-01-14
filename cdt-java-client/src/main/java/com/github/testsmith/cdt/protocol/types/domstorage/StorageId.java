package com.github.testsmith.cdt.protocol.types.domstorage;

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
 * DOM Storage identifier.
 *
 * @author roy
 * @version $Id: $Id
 */
public class StorageId {

  private String securityOrigin;

  private Boolean isLocalStorage;

  /**
   * Security origin for the storage.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /**
   * Security origin for the storage.
   *
   * @param securityOrigin a {@link java.lang.String} object
   */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /**
   * Whether the storage is local storage (not session storage).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsLocalStorage() {
    return isLocalStorage;
  }

  /**
   * Whether the storage is local storage (not session storage).
   *
   * @param isLocalStorage a {@link java.lang.Boolean} object
   */
  public void setIsLocalStorage(Boolean isLocalStorage) {
    this.isLocalStorage = isLocalStorage;
  }
}
