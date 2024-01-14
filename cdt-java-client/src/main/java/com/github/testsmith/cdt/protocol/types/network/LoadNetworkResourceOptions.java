package com.github.testsmith.cdt.protocol.types.network;

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
 * An options object that may be extended later to better support CORS, CORB and streaming.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class LoadNetworkResourceOptions {

  private Boolean disableCache;

  private Boolean includeCredentials;

  /**
   * Getter for the field <code>disableCache</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDisableCache() {
    return disableCache;
  }

  /**
   * Setter for the field <code>disableCache</code>.
   *
   * @param disableCache a {@link java.lang.Boolean} object
   */
  public void setDisableCache(Boolean disableCache) {
    this.disableCache = disableCache;
  }

  /**
   * Getter for the field <code>includeCredentials</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeCredentials() {
    return includeCredentials;
  }

  /**
   * Setter for the field <code>includeCredentials</code>.
   *
   * @param includeCredentials a {@link java.lang.Boolean} object
   */
  public void setIncludeCredentials(Boolean includeCredentials) {
    this.includeCredentials = includeCredentials;
  }
}
