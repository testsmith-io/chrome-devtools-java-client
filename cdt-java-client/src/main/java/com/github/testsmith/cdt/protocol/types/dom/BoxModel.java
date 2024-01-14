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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Box model.
 *
 * @author roy
 * @version $Id: $Id
 */
public class BoxModel {

  private List<Double> content;

  private List<Double> padding;

  private List<Double> border;

  private List<Double> margin;

  private Integer width;

  private Integer height;

  @Optional private ShapeOutsideInfo shapeOutside;

  /**
   * Content box
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getContent() {
    return content;
  }

  /**
   * Content box
   *
   * @param content a {@link java.util.List} object
   */
  public void setContent(List<Double> content) {
    this.content = content;
  }

  /**
   * Padding box
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getPadding() {
    return padding;
  }

  /**
   * Padding box
   *
   * @param padding a {@link java.util.List} object
   */
  public void setPadding(List<Double> padding) {
    this.padding = padding;
  }

  /**
   * Border box
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getBorder() {
    return border;
  }

  /**
   * Border box
   *
   * @param border a {@link java.util.List} object
   */
  public void setBorder(List<Double> border) {
    this.border = border;
  }

  /**
   * Margin box
   *
   * @return a {@link java.util.List} object
   */
  public List<Double> getMargin() {
    return margin;
  }

  /**
   * Margin box
   *
   * @param margin a {@link java.util.List} object
   */
  public void setMargin(List<Double> margin) {
    this.margin = margin;
  }

  /**
   * Node width
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Node width
   *
   * @param width a {@link java.lang.Integer} object
   */
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * Node height
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Node height
   *
   * @param height a {@link java.lang.Integer} object
   */
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Shape outside coordinates
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.ShapeOutsideInfo} object
   */
  public ShapeOutsideInfo getShapeOutside() {
    return shapeOutside;
  }

  /**
   * Shape outside coordinates
   *
   * @param shapeOutside a {@link com.github.testsmith.cdt.protocol.types.dom.ShapeOutsideInfo}
   *     object
   */
  public void setShapeOutside(ShapeOutsideInfo shapeOutside) {
    this.shapeOutside = shapeOutside;
  }
}
