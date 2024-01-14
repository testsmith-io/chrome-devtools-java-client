package com.github.testsmith.cdt.protocol.types.profiler;

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
import java.util.List;

/**
 * Type profile data collected during runtime for a JavaScript script.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ScriptTypeProfile {

  private String scriptId;

  private String url;

  private List<TypeProfileEntry> entries;

  /**
   * JavaScript script id.
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * JavaScript script id.
   *
   * @param scriptId a {@link java.lang.String} object
   */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * JavaScript script name or url.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * JavaScript script name or url.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Type profile entries for parameters and return values of the functions in the script.
   *
   * @return a {@link java.util.List} object
   */
  public List<TypeProfileEntry> getEntries() {
    return entries;
  }

  /**
   * Type profile entries for parameters and return values of the functions in the script.
   *
   * @param entries a {@link java.util.List} object
   */
  public void setEntries(List<TypeProfileEntry> entries) {
    this.entries = entries;
  }
}
