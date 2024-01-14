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

/**
 * Fired when frame no longer has a scheduled navigation.
 *
 * @author roy
 * @version $Id: $Id
 */
@Deprecated
public class FrameClearedScheduledNavigation {

  private String frameId;

  /**
   * Id of the frame that has cleared its scheduled navigation.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Id of the frame that has cleared its scheduled navigation.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
