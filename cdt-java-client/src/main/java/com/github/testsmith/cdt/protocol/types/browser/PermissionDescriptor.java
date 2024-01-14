package com.github.testsmith.cdt.protocol.types.browser;

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
 * Definition of PermissionDescriptor defined in the Permissions API:
 * https://w3c.github.io/permissions/#dictdef-permissiondescriptor.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PermissionDescriptor {

  private String name;

  @Optional private Boolean sysex;

  @Optional private Boolean userVisibleOnly;

  @Optional private Boolean allowWithoutSanitization;

  @Optional private Boolean panTiltZoom;

  /**
   * Name of permission. See
   * https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl
   * for valid permission names.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Name of permission. See
   * https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl
   * for valid permission names.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * For "midi" permission, may also specify sysex control.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSysex() {
    return sysex;
  }

  /**
   * For "midi" permission, may also specify sysex control.
   *
   * @param sysex a {@link java.lang.Boolean} object
   */
  public void setSysex(Boolean sysex) {
    this.sysex = sysex;
  }

  /**
   * For "push" permission, may specify userVisibleOnly. Note that userVisibleOnly = true is the
   * only currently supported type.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUserVisibleOnly() {
    return userVisibleOnly;
  }

  /**
   * For "push" permission, may specify userVisibleOnly. Note that userVisibleOnly = true is the
   * only currently supported type.
   *
   * @param userVisibleOnly a {@link java.lang.Boolean} object
   */
  public void setUserVisibleOnly(Boolean userVisibleOnly) {
    this.userVisibleOnly = userVisibleOnly;
  }

  /**
   * For "clipboard" permission, may specify allowWithoutSanitization.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAllowWithoutSanitization() {
    return allowWithoutSanitization;
  }

  /**
   * For "clipboard" permission, may specify allowWithoutSanitization.
   *
   * @param allowWithoutSanitization a {@link java.lang.Boolean} object
   */
  public void setAllowWithoutSanitization(Boolean allowWithoutSanitization) {
    this.allowWithoutSanitization = allowWithoutSanitization;
  }

  /**
   * For "camera" permission, may specify panTiltZoom.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPanTiltZoom() {
    return panTiltZoom;
  }

  /**
   * For "camera" permission, may specify panTiltZoom.
   *
   * @param panTiltZoom a {@link java.lang.Boolean} object
   */
  public void setPanTiltZoom(Boolean panTiltZoom) {
    this.panTiltZoom = panTiltZoom;
  }
}
