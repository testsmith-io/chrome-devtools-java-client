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
 * Per-script compilation cache parameters for `Page.produceCompilationCache`
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class CompilationCacheParams {

  private String url;

  @Optional private Boolean eager;

  /**
   * The URL of the script to produce a compilation cache entry for.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The URL of the script to produce a compilation cache entry for.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A hint to the backend whether eager compilation is recommended. (the actual compilation mode
   * used is upon backend discretion).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEager() {
    return eager;
  }

  /**
   * A hint to the backend whether eager compilation is recommended. (the actual compilation mode
   * used is upon backend discretion).
   *
   * @param eager a {@link java.lang.Boolean} object
   */
  public void setEager(Boolean eager) {
    this.eager = eager;
  }
}
