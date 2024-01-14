package com.github.testsmith.cdt.protocol.types.audits;

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
 * EncodedResponse class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class EncodedResponse {

  @Optional private String body;

  private Integer originalSize;

  private Integer encodedSize;

  /**
   * The encoded body as a base64 string. Omitted if sizeOnly is true. (Encoded as a base64 string
   * when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getBody() {
    return body;
  }

  /**
   * The encoded body as a base64 string. Omitted if sizeOnly is true. (Encoded as a base64 string
   * when passed over JSON)
   *
   * @param body a {@link java.lang.String} object
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Size before re-encoding.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getOriginalSize() {
    return originalSize;
  }

  /**
   * Size before re-encoding.
   *
   * @param originalSize a {@link java.lang.Integer} object
   */
  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  /**
   * Size after re-encoding.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getEncodedSize() {
    return encodedSize;
  }

  /**
   * Size after re-encoding.
   *
   * @param encodedSize a {@link java.lang.Integer} object
   */
  public void setEncodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
  }
}
