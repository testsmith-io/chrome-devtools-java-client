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

/**
 * Version class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Version {

  private String protocolVersion;

  private String product;

  private String revision;

  private String userAgent;

  private String jsVersion;

  /**
   * Protocol version.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProtocolVersion() {
    return protocolVersion;
  }

  /**
   * Protocol version.
   *
   * @param protocolVersion a {@link java.lang.String} object
   */
  public void setProtocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  /**
   * Product name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProduct() {
    return product;
  }

  /**
   * Product name.
   *
   * @param product a {@link java.lang.String} object
   */
  public void setProduct(String product) {
    this.product = product;
  }

  /**
   * Product revision.
   *
   * @return a {@link java.lang.String} object
   */
  public String getRevision() {
    return revision;
  }

  /**
   * Product revision.
   *
   * @param revision a {@link java.lang.String} object
   */
  public void setRevision(String revision) {
    this.revision = revision;
  }

  /**
   * User-Agent.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * User-Agent.
   *
   * @param userAgent a {@link java.lang.String} object
   */
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * V8 version.
   *
   * @return a {@link java.lang.String} object
   */
  public String getJsVersion() {
    return jsVersion;
  }

  /**
   * V8 version.
   *
   * @param jsVersion a {@link java.lang.String} object
   */
  public void setJsVersion(String jsVersion) {
    this.jsVersion = jsVersion;
  }
}
