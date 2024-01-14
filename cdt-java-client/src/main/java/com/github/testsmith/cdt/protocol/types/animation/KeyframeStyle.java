package com.github.testsmith.cdt.protocol.types.animation;

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
 * Keyframe Style
 *
 * @author roy
 * @version $Id: $Id
 */
public class KeyframeStyle {

  private String offset;

  private String easing;

  /**
   * Keyframe's time offset.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOffset() {
    return offset;
  }

  /**
   * Keyframe's time offset.
   *
   * @param offset a {@link java.lang.String} object
   */
  public void setOffset(String offset) {
    this.offset = offset;
  }

  /**
   * `AnimationEffect`'s timing function.
   *
   * @return a {@link java.lang.String} object
   */
  public String getEasing() {
    return easing;
  }

  /**
   * `AnimationEffect`'s timing function.
   *
   * @param easing a {@link java.lang.String} object
   */
  public void setEasing(String easing) {
    this.easing = easing;
  }
}
