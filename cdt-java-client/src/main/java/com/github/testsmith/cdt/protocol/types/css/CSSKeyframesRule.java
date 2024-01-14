package com.github.testsmith.cdt.protocol.types.css;

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
 * CSS keyframes rule representation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSKeyframesRule {

  private Value animationName;

  private List<CSSKeyframeRule> keyframes;

  /**
   * Animation name.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.Value} object
   */
  public Value getAnimationName() {
    return animationName;
  }

  /**
   * Animation name.
   *
   * @param animationName a {@link com.github.testsmith.cdt.protocol.types.css.Value} object
   */
  public void setAnimationName(Value animationName) {
    this.animationName = animationName;
  }

  /**
   * List of keyframes.
   *
   * @return a {@link java.util.List} object
   */
  public List<CSSKeyframeRule> getKeyframes() {
    return keyframes;
  }

  /**
   * List of keyframes.
   *
   * @param keyframes a {@link java.util.List} object
   */
  public void setKeyframes(List<CSSKeyframeRule> keyframes) {
    this.keyframes = keyframes;
  }
}