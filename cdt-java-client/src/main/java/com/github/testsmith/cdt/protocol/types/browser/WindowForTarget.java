package com.github.testsmith.cdt.protocol.types.browser;

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
 * WindowForTarget class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class WindowForTarget {

  private Integer windowId;

  private Bounds bounds;

  /**
   * Browser window id.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getWindowId() {
    return windowId;
  }

  /**
   * Browser window id.
   *
   * @param windowId a {@link java.lang.Integer} object
   */
  public void setWindowId(Integer windowId) {
    this.windowId = windowId;
  }

  /**
   * Bounds information of the window. When window state is 'minimized', the restored window
   * position and size are returned.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.browser.Bounds} object
   */
  public Bounds getBounds() {
    return bounds;
  }

  /**
   * Bounds information of the window. When window state is 'minimized', the restored window
   * position and size are returned.
   *
   * @param bounds a {@link com.github.testsmith.cdt.protocol.types.browser.Bounds} object
   */
  public void setBounds(Bounds bounds) {
    this.bounds = bounds;
  }
}
