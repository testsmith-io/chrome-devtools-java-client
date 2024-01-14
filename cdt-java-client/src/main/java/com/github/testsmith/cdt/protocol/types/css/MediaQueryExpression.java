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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Media query expression descriptor.
 *
 * @author roy
 * @version $Id: $Id
 */
public class MediaQueryExpression {

  private Double value;

  private String unit;

  private String feature;

  @Optional private SourceRange valueRange;

  @Optional private Double computedLength;

  /**
   * Media query expression value.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getValue() {
    return value;
  }

  /**
   * Media query expression value.
   *
   * @param value a {@link java.lang.Double} object
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Media query expression units.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Media query expression units.
   *
   * @param unit a {@link java.lang.String} object
   */
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   * Media query expression feature.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFeature() {
    return feature;
  }

  /**
   * Media query expression feature.
   *
   * @param feature a {@link java.lang.String} object
   */
  public void setFeature(String feature) {
    this.feature = feature;
  }

  /**
   * The associated range of the value text in the enclosing stylesheet (if available).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public SourceRange getValueRange() {
    return valueRange;
  }

  /**
   * The associated range of the value text in the enclosing stylesheet (if available).
   *
   * @param valueRange a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public void setValueRange(SourceRange valueRange) {
    this.valueRange = valueRange;
  }

  /**
   * Computed length of media query expression (if applicable).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getComputedLength() {
    return computedLength;
  }

  /**
   * Computed length of media query expression (if applicable).
   *
   * @param computedLength a {@link java.lang.Double} object
   */
  public void setComputedLength(Double computedLength) {
    this.computedLength = computedLength;
  }
}
