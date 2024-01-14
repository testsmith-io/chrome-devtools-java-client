package com.github.testsmith.cdt.protocol.types.input;

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
 * DragDataItem class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class DragDataItem {

  private String mimeType;

  private String data;

  @Optional private String title;

  @Optional private String baseURL;

  /**
   * Mime type of the dragged data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Mime type of the dragged data.
   *
   * @param mimeType a {@link java.lang.String} object
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Depending of the value of `mimeType`, it contains the dragged link, text, HTML markup or any
   * other data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Depending of the value of `mimeType`, it contains the dragged link, text, HTML markup or any
   * other data.
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Title associated with a link. Only valid when `mimeType` == "text/uri-list".
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Title associated with a link. Only valid when `mimeType` == "text/uri-list".
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Stores the base URL for the contained markup. Only valid when `mimeType` == "text/html".
   *
   * @return a {@link java.lang.String} object
   */
  public String getBaseURL() {
    return baseURL;
  }

  /**
   * Stores the base URL for the contained markup. Only valid when `mimeType` == "text/html".
   *
   * @param baseURL a {@link java.lang.String} object
   */
  public void setBaseURL(String baseURL) {
    this.baseURL = baseURL;
  }
}
