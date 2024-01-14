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

import java.util.List;

/**
 * Fired when a new window is going to be opened, via window.open(), link click, form submission,
 * etc.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WindowOpen {

  private String url;

  private String windowName;

  private List<String> windowFeatures;

  private Boolean userGesture;

  /**
   * The URL for the new window.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * The URL for the new window.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Window name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getWindowName() {
    return windowName;
  }

  /**
   * Window name.
   *
   * @param windowName a {@link java.lang.String} object
   */
  public void setWindowName(String windowName) {
    this.windowName = windowName;
  }

  /**
   * An array of enabled window features.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getWindowFeatures() {
    return windowFeatures;
  }

  /**
   * An array of enabled window features.
   *
   * @param windowFeatures a {@link java.util.List} object
   */
  public void setWindowFeatures(List<String> windowFeatures) {
    this.windowFeatures = windowFeatures;
  }

  /**
   * Whether or not it was triggered by user gesture.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getUserGesture() {
    return userGesture;
  }

  /**
   * Whether or not it was triggered by user gesture.
   *
   * @param userGesture a {@link java.lang.Boolean} object
   */
  public void setUserGesture(Boolean userGesture) {
    this.userGesture = userGesture;
  }
}
