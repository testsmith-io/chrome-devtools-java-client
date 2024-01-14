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

/**
 * Information about font variation axes for variable fonts
 *
 * @author roy
 * @version $Id: $Id
 */
public class FontVariationAxis {

  private String tag;

  private String name;

  private Double minValue;

  private Double maxValue;

  private Double defaultValue;

  /**
   * The font-variation-setting tag (a.k.a. "axis tag").
   *
   * @return a {@link java.lang.String} object
   */
  public String getTag() {
    return tag;
  }

  /**
   * The font-variation-setting tag (a.k.a. "axis tag").
   *
   * @param tag a {@link java.lang.String} object
   */
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * Human-readable variation name in the default language (normally, "en").
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Human-readable variation name in the default language (normally, "en").
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The minimum value (inclusive) the font supports for this tag.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getMinValue() {
    return minValue;
  }

  /**
   * The minimum value (inclusive) the font supports for this tag.
   *
   * @param minValue a {@link java.lang.Double} object
   */
  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  /**
   * The maximum value (inclusive) the font supports for this tag.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getMaxValue() {
    return maxValue;
  }

  /**
   * The maximum value (inclusive) the font supports for this tag.
   *
   * @param maxValue a {@link java.lang.Double} object
   */
  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * The default value.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDefaultValue() {
    return defaultValue;
  }

  /**
   * The default value.
   *
   * @param defaultValue a {@link java.lang.Double} object
   */
  public void setDefaultValue(Double defaultValue) {
    this.defaultValue = defaultValue;
  }
}
