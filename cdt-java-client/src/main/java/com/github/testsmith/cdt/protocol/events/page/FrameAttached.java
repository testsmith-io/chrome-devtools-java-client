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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.types.runtime.StackTrace;

/**
 * Fired when frame has been attached to its parent.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FrameAttached {

  private String frameId;

  private String parentFrameId;

  @Optional private StackTrace stack;

  /**
   * Id of the frame that has been attached.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Id of the frame that has been attached.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Parent frame identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getParentFrameId() {
    return parentFrameId;
  }

  /**
   * Parent frame identifier.
   *
   * @param parentFrameId a {@link java.lang.String} object
   */
  public void setParentFrameId(String parentFrameId) {
    this.parentFrameId = parentFrameId;
  }

  /**
   * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public StackTrace getStack() {
    return stack;
  }

  /**
   * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
   *
   * @param stack a {@link com.github.testsmith.cdt.protocol.types.runtime.StackTrace} object
   */
  public void setStack(StackTrace stack) {
    this.stack = stack;
  }
}
