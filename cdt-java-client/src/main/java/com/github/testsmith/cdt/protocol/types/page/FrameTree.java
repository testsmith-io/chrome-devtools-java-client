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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Information about the Frame hierarchy.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FrameTree {

  private Frame frame;

  @Optional private List<FrameTree> childFrames;

  /**
   * Frame information for this tree item.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.Frame} object
   */
  public Frame getFrame() {
    return frame;
  }

  /**
   * Frame information for this tree item.
   *
   * @param frame a {@link com.github.testsmith.cdt.protocol.types.page.Frame} object
   */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  /**
   * Child frames.
   *
   * @return a {@link java.util.List} object
   */
  public List<FrameTree> getChildFrames() {
    return childFrames;
  }

  /**
   * Child frames.
   *
   * @param childFrames a {@link java.util.List} object
   */
  public void setChildFrames(List<FrameTree> childFrames) {
    this.childFrames = childFrames;
  }
}
