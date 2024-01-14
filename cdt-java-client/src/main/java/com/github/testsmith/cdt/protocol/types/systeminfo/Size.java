package com.github.testsmith.cdt.protocol.types.systeminfo;

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
 * Describes the width and height dimensions of an entity.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Size {

  private Integer width;

  private Integer height;

  /**
   * Width in pixels.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width in pixels.
   *
   * @param width a {@link java.lang.Integer} object
   */
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * Height in pixels.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height in pixels.
   *
   * @param height a {@link java.lang.Integer} object
   */
  public void setHeight(Integer height) {
    this.height = height;
  }
}
