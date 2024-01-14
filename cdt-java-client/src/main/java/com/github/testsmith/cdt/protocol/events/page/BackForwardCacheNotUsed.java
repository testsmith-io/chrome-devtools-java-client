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
 * Fired for failed bfcache history navigations if BackForwardCache feature is enabled. Do not
 * assume any ordering with the Page.frameNavigated event. This event is fired only for main-frame
 * history navigation where the document changes (non-same-document navigations), when bfcache
 * navigation fails.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class BackForwardCacheNotUsed {

  private String loaderId;

  private String frameId;

  /**
   * The loader id for the associated navgation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLoaderId() {
    return loaderId;
  }

  /**
   * The loader id for the associated navgation.
   *
   * @param loaderId a {@link java.lang.String} object
   */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /**
   * The frame id of the associated frame.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * The frame id of the associated frame.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
