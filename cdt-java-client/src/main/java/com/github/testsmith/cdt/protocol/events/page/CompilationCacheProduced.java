package com.github.testsmith.cdt.protocol.events.page;

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

/**
 * Issued for every compilation cache generated. Is only available if
 * Page.setGenerateCompilationCache is enabled.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class CompilationCacheProduced {

  private String url;

  private String data;

  /**
   * Getter for the field <code>url</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Setter for the field <code>url</code>.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Base64-encoded data (Encoded as a base64 string when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Base64-encoded data (Encoded as a base64 string when passed over JSON)
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }
}
