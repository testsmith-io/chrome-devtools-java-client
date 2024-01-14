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
import com.github.testsmith.cdt.protocol.types.page.Frame;
import com.github.testsmith.cdt.protocol.types.page.NavigationType;

/**
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FrameNavigated {

  private Frame frame;

  @Experimental private NavigationType type;

  /**
   * Frame object.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.Frame} object
   */
  public Frame getFrame() {
    return frame;
  }

  /**
   * Frame object.
   *
   * @param frame a {@link com.github.testsmith.cdt.protocol.types.page.Frame} object
   */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.NavigationType} object
   */
  public NavigationType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.page.NavigationType} object
   */
  public void setType(NavigationType type) {
    this.type = type;
  }
}
