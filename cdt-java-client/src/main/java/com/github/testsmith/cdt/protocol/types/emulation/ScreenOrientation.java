package com.github.testsmith.cdt.protocol.types.emulation;

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
 * Screen orientation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScreenOrientation {

  private ScreenOrientationType type;

  private Integer angle;

  /**
   * Orientation type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.emulation.ScreenOrientationType}
   *     object
   */
  public ScreenOrientationType getType() {
    return type;
  }

  /**
   * Orientation type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.emulation.ScreenOrientationType}
   *     object
   */
  public void setType(ScreenOrientationType type) {
    this.type = type;
  }

  /**
   * Orientation angle.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getAngle() {
    return angle;
  }

  /**
   * Orientation angle.
   *
   * @param angle a {@link java.lang.Integer} object
   */
  public void setAngle(Integer angle) {
    this.angle = angle;
  }
}
