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

import com.github.testsmith.cdt.protocol.types.page.ClientNavigationReason;

/**
 * Fired when frame schedules a potential navigation.
 *
 * @author roy
 * @version $Id: $Id
 */
@Deprecated
public class FrameScheduledNavigation {

  private String frameId;

  private Double delay;

  private ClientNavigationReason reason;

  private String url;

  /**
   * Id of the frame that has scheduled a navigation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Id of the frame that has scheduled a navigation.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed
   * to start.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDelay() {
    return delay;
  }

  /**
   * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed
   * to start.
   *
   * @param delay a {@link java.lang.Double} object
   */
  public void setDelay(Double delay) {
    this.delay = delay;
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
   * The destination URL for the scheduled navigation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The destination URL for the scheduled navigation.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }
}
