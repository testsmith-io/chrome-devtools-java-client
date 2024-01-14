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

/**
 * Viewport for capturing screenshot.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Viewport {

  private Double x;

  private Double y;

  private Double width;

  private Double height;

  private Double scale;

  /**
   * X offset in device independent pixels (dip).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getX() {
    return x;
  }

  /**
   * X offset in device independent pixels (dip).
   *
   * @param x a {@link java.lang.Double} object
   */
  public void setX(Double x) {
    this.x = x;
  }

  /**
   * Y offset in device independent pixels (dip).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getY() {
    return y;
  }

  /**
   * Y offset in device independent pixels (dip).
   *
   * @param y a {@link java.lang.Double} object
   */
  public void setY(Double y) {
    this.y = y;
  }

  /**
   * Rectangle width in device independent pixels (dip).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getWidth() {
    return width;
  }

  /**
   * Rectangle width in device independent pixels (dip).
   *
   * @param width a {@link java.lang.Double} object
   */
  public void setWidth(Double width) {
    this.width = width;
  }

  /**
   * Rectangle height in device independent pixels (dip).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getHeight() {
    return height;
  }

  /**
   * Rectangle height in device independent pixels (dip).
   *
   * @param height a {@link java.lang.Double} object
   */
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   * Page scale factor.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScale() {
    return scale;
  }

  /**
   * Page scale factor.
   *
   * @param scale a {@link java.lang.Double} object
   */
  public void setScale(Double scale) {
    this.scale = scale;
  }
}
