package com.github.testsmith.cdt.protocol.types.emulation;

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
 * Used to specify User Agent Cient Hints to emulate. See https://wicg.github.io/ua-client-hints
 * Missing optional values will be filled in by the target with what it would normally use.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class UserAgentMetadata {

  @Optional private List<UserAgentBrandVersion> brands;

  @Optional private String fullVersion;

  private String platform;

  private String platformVersion;

  private String architecture;

  private String model;

  private Boolean mobile;

  /**
   * Getter for the field <code>brands</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<UserAgentBrandVersion> getBrands() {
    return brands;
  }

  /**
   * Setter for the field <code>brands</code>.
   *
   * @param brands a {@link java.util.List} object
   */
  public void setBrands(List<UserAgentBrandVersion> brands) {
    this.brands = brands;
  }

  /**
   * Getter for the field <code>fullVersion</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullVersion() {
    return fullVersion;
  }

  /**
   * Setter for the field <code>fullVersion</code>.
   *
   * @param fullVersion a {@link java.lang.String} object
   */
  public void setFullVersion(String fullVersion) {
    this.fullVersion = fullVersion;
  }

  /**
   * Getter for the field <code>platform</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPlatform() {
    return platform;
  }

  /**
   * Setter for the field <code>platform</code>.
   *
   * @param platform a {@link java.lang.String} object
   */
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   * Getter for the field <code>platformVersion</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPlatformVersion() {
    return platformVersion;
  }

  /**
   * Setter for the field <code>platformVersion</code>.
   *
   * @param platformVersion a {@link java.lang.String} object
   */
  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }

  /**
   * Getter for the field <code>architecture</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getArchitecture() {
    return architecture;
  }

  /**
   * Setter for the field <code>architecture</code>.
   *
   * @param architecture a {@link java.lang.String} object
   */
  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  /**
   * Getter for the field <code>model</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getModel() {
    return model;
  }

  /**
   * Setter for the field <code>model</code>.
   *
   * @param model a {@link java.lang.String} object
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Getter for the field <code>mobile</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getMobile() {
    return mobile;
  }

  /**
   * Setter for the field <code>mobile</code>.
   *
   * @param mobile a {@link java.lang.Boolean} object
   */
  public void setMobile(Boolean mobile) {
    this.mobile = mobile;
  }
}
