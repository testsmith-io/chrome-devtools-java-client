package com.github.testsmith.cdt.protocol.types.io;

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
 * Read class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Read {

  @Optional private Boolean base64Encoded;

  private String data;

  private Boolean eof;

  /**
   * Set if the data is base64-encoded
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getBase64Encoded() {
    return base64Encoded;
  }

  /**
   * Set if the data is base64-encoded
   *
   * @param base64Encoded a {@link java.lang.Boolean} object
   */
  public void setBase64Encoded(Boolean base64Encoded) {
    this.base64Encoded = base64Encoded;
  }

  /**
   * Data that were read.
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Data that were read.
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Set if the end-of-file condition occurred while reading.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEof() {
    return eof;
  }

  /**
   * Set if the end-of-file condition occurred while reading.
   *
   * @param eof a {@link java.lang.Boolean} object
   */
  public void setEof(Boolean eof) {
    this.eof = eof;
  }
}
