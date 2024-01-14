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
import java.util.List;

/**
 * AppManifest class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AppManifest {

  private String url;

  private List<AppManifestError> errors;

  @Optional private String data;

  @Experimental @Optional private AppManifestParsedProperties parsed;

  /**
   * Manifest location.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Manifest location.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for the field <code>errors</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<AppManifestError> getErrors() {
    return errors;
  }

  /**
   * Setter for the field <code>errors</code>.
   *
   * @param errors a {@link java.util.List} object
   */
  public void setErrors(List<AppManifestError> errors) {
    this.errors = errors;
  }

  /**
   * Manifest content.
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Manifest content.
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Parsed manifest properties
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.AppManifestParsedProperties}
   *     object
   */
  public AppManifestParsedProperties getParsed() {
    return parsed;
  }

  /**
   * Parsed manifest properties
   *
   * @param parsed a {@link
   *     com.github.testsmith.cdt.protocol.types.page.AppManifestParsedProperties} object
   */
  public void setParsed(AppManifestParsedProperties parsed) {
    this.parsed = parsed;
  }
}
