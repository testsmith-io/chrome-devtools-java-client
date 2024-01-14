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
 * PrintToPDF class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PrintToPDF {

  private String data;

  @Experimental @Optional private String stream;

  /**
   * Base64-encoded pdf data. Empty if |returnAsStream| is specified. (Encoded as a base64 string
   * when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Base64-encoded pdf data. Empty if |returnAsStream| is specified. (Encoded as a base64 string
   * when passed over JSON)
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * A handle of the stream that holds resulting PDF data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStream() {
    return stream;
  }

  /**
   * A handle of the stream that holds resulting PDF data.
   *
   * @param stream a {@link java.lang.String} object
   */
  public void setStream(String stream) {
    this.stream = stream;
  }
}
