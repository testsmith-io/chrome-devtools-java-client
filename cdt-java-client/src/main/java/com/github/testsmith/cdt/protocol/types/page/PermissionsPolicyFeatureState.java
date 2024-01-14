package com.github.testsmith.cdt.protocol.types.page;

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

/**
 * PermissionsPolicyFeatureState class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PermissionsPolicyFeatureState {

  private PermissionsPolicyFeature feature;

  private Boolean allowed;

  @Optional private PermissionsPolicyBlockLocator locator;

  /**
   * Getter for the field <code>feature</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.PermissionsPolicyFeature} object
   */
  public PermissionsPolicyFeature getFeature() {
    return feature;
  }

  /**
   * Setter for the field <code>feature</code>.
   *
   * @param feature a {@link com.github.testsmith.cdt.protocol.types.page.PermissionsPolicyFeature}
   *     object
   */
  public void setFeature(PermissionsPolicyFeature feature) {
    this.feature = feature;
  }

  /**
   * Getter for the field <code>allowed</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAllowed() {
    return allowed;
  }

  /**
   * Setter for the field <code>allowed</code>.
   *
   * @param allowed a {@link java.lang.Boolean} object
   */
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  /**
   * Getter for the field <code>locator</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.PermissionsPolicyBlockLocator}
   *     object
   */
  public PermissionsPolicyBlockLocator getLocator() {
    return locator;
  }

  /**
   * Setter for the field <code>locator</code>.
   *
   * @param locator a {@link
   *     com.github.testsmith.cdt.protocol.types.page.PermissionsPolicyBlockLocator} object
   */
  public void setLocator(PermissionsPolicyBlockLocator locator) {
    this.locator = locator;
  }
}
