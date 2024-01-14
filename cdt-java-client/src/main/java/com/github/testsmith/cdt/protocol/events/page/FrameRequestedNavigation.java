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
import com.github.testsmith.cdt.protocol.types.page.ClientNavigationDisposition;
import com.github.testsmith.cdt.protocol.types.page.ClientNavigationReason;

/**
 * Fired when a renderer-initiated navigation is requested. Navigation may still be cancelled after
 * the event is issued.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class FrameRequestedNavigation {

  private String frameId;

  private ClientNavigationReason reason;

  private String url;

  private ClientNavigationDisposition disposition;

  /**
   * Id of the frame that is being navigated.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Id of the frame that is being navigated.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * The reason for the navigation.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.ClientNavigationReason} object
   */
  public ClientNavigationReason getReason() {
    return reason;
  }

  /**
   * The reason for the navigation.
   *
   * @param reason a {@link com.github.testsmith.cdt.protocol.types.page.ClientNavigationReason}
   *     object
   */
  public void setReason(ClientNavigationReason reason) {
    this.reason = reason;
  }

  /**
   * The destination URL for the requested navigation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The destination URL for the requested navigation.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The disposition for the navigation.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.ClientNavigationDisposition}
   *     object
   */
  public ClientNavigationDisposition getDisposition() {
    return disposition;
  }

  /**
   * The disposition for the navigation.
   *
   * @param disposition a {@link
   *     com.github.testsmith.cdt.protocol.types.page.ClientNavigationDisposition} object
   */
  public void setDisposition(ClientNavigationDisposition disposition) {
    this.disposition = disposition;
  }
}
