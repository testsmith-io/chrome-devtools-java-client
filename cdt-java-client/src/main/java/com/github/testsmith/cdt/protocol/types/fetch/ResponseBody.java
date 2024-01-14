package com.github.testsmith.cdt.protocol.types.fetch;

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
 * ResponseBody class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ResponseBody {

  private String body;

  private Boolean base64Encoded;

  /**
   * Response body.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBody() {
    return body;
  }

  /**
   * Response body.
   *
   * @param body a {@link java.lang.String} object
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * True, if content was sent as base64.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getBase64Encoded() {
    return base64Encoded;
  }

  /**
   * True, if content was sent as base64.
   *
   * @param base64Encoded a {@link java.lang.Boolean} object
   */
  public void setBase64Encoded(Boolean base64Encoded) {
    this.base64Encoded = base64Encoded;
  }
}
