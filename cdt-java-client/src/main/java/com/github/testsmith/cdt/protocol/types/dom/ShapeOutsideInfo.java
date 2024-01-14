package com.github.testsmith.cdt.protocol.types.dom;

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
 * CSS Shape Outside details.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ShapeOutsideInfo {

  private List<Double> bounds;

  private List<Object> shape;

  private List<Object> marginShape;

  /**
   * Shape bounds
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getBounds() {
    return bounds;
  }

  /**
   * Shape bounds
   *
   * @param bounds a {@link java.util.List} object
   */
  public void setBounds(List<Double> bounds) {
    this.bounds = bounds;
  }

  /**
   * Shape coordinate details
   *
   * @return a {@link java.util.List} object
   */
  public List<Object> getShape() {
    return shape;
  }

  /**
   * Shape coordinate details
   *
   * @param shape a {@link java.util.List} object
   */
  public void setShape(List<Object> shape) {
    this.shape = shape;
  }

  /**
   * Margin shape bounds
   *
   * @return a {@link java.util.List} object
   */
  public List<Object> getMarginShape() {
    return marginShape;
  }

  /**
   * Margin shape bounds
   *
   * @param marginShape a {@link java.util.List} object
   */
  public void setMarginShape(List<Object> marginShape) {
    this.marginShape = marginShape;
  }
}
