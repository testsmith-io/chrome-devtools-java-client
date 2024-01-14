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
import java.util.List;

/**
 * Properties of a web font:
 * https://www.w3.org/TR/2008/REC-CSS2-20080411/fonts.html#font-descriptions and additional
 * information such as platformFontFamily and fontVariationAxes.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FontFace {

  private String fontFamily;

  private String fontStyle;

  private String fontVariant;

  private String fontWeight;

  private String fontStretch;

  private String unicodeRange;

  private String src;

  private String platformFontFamily;

  @Optional private List<FontVariationAxis> fontVariationAxes;

  /**
   * The font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontFamily() {
    return fontFamily;
  }

  /**
   * The font-family.
   *
   * @param fontFamily a {@link java.lang.String} object
   */
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  /**
   * The font-style.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontStyle() {
    return fontStyle;
  }

  /**
   * The font-style.
   *
   * @param fontStyle a {@link java.lang.String} object
   */
  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }

  /**
   * The font-variant.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontVariant() {
    return fontVariant;
  }

  /**
   * The font-variant.
   *
   * @param fontVariant a {@link java.lang.String} object
   */
  public void setFontVariant(String fontVariant) {
    this.fontVariant = fontVariant;
  }

  /**
   * The font-weight.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontWeight() {
    return fontWeight;
  }

  /**
   * The font-weight.
   *
   * @param fontWeight a {@link java.lang.String} object
   */
  public void setFontWeight(String fontWeight) {
    this.fontWeight = fontWeight;
  }

  /**
   * The font-stretch.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontStretch() {
    return fontStretch;
  }

  /**
   * The font-stretch.
   *
   * @param fontStretch a {@link java.lang.String} object
   */
  public void setFontStretch(String fontStretch) {
    this.fontStretch = fontStretch;
  }

  /**
   * The unicode-range.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnicodeRange() {
    return unicodeRange;
  }

  /**
   * The unicode-range.
   *
   * @param unicodeRange a {@link java.lang.String} object
   */
  public void setUnicodeRange(String unicodeRange) {
    this.unicodeRange = unicodeRange;
  }

  /**
   * The src.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSrc() {
    return src;
  }

  /**
   * The src.
   *
   * @param src a {@link java.lang.String} object
   */
  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * The resolved platform font family
   *
   * @return a {@link java.lang.String} object
   */
  public String getPlatformFontFamily() {
    return platformFontFamily;
  }

  /**
   * The resolved platform font family
   *
   * @param platformFontFamily a {@link java.lang.String} object
   */
  public void setPlatformFontFamily(String platformFontFamily) {
    this.platformFontFamily = platformFontFamily;
  }

  /**
   * Available variation settings (a.k.a. "axes").
   *
   * @return a {@link java.util.List} object
   */
  public List<FontVariationAxis> getFontVariationAxes() {
    return fontVariationAxes;
  }

  /**
   * Available variation settings (a.k.a. "axes").
   *
   * @param fontVariationAxes a {@link java.util.List} object
   */
  public void setFontVariationAxes(List<FontVariationAxis> fontVariationAxes) {
    this.fontVariationAxes = fontVariationAxes;
  }
}
