package com.github.testsmith.cdt.protocol.types.serviceworker;

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
 * ServiceWorker registration.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ServiceWorkerRegistration {

  private String registrationId;

  private String scopeURL;

  private Boolean isDeleted;

  /**
   * Getter for the field <code>registrationId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegistrationId() {
    return registrationId;
  }

  /**
   * Setter for the field <code>registrationId</code>.
   *
   * @param registrationId a {@link java.lang.String} object
   */
  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  /**
   * Getter for the field <code>scopeURL</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScopeURL() {
    return scopeURL;
  }

  /**
   * Setter for the field <code>scopeURL</code>.
   *
   * @param scopeURL a {@link java.lang.String} object
   */
  public void setScopeURL(String scopeURL) {
    this.scopeURL = scopeURL;
  }

  /**
   * Getter for the field <code>isDeleted</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * Setter for the field <code>isDeleted</code>.
   *
   * @param isDeleted a {@link java.lang.Boolean} object
   */
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }
}
