package com.github.testsmith.cdt.protocol.events.headlessexperimental;

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
 * Issued when the target starts or stops needing BeginFrames. Deprecated. Issue beginFrame
 * unconditionally instead and use result from beginFrame to detect whether the frames were
 * suppressed.
 *
 * @author roy
 * @version $Id: $Id
 */
@Deprecated
public class NeedsBeginFramesChanged {

  private Boolean needsBeginFrames;

  /**
   * True if BeginFrames are needed, false otherwise.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getNeedsBeginFrames() {
    return needsBeginFrames;
  }

  /**
   * True if BeginFrames are needed, false otherwise.
   *
   * @param needsBeginFrames a {@link java.lang.Boolean} object
   */
  public void setNeedsBeginFrames(Boolean needsBeginFrames) {
    this.needsBeginFrames = needsBeginFrames;
  }
}
