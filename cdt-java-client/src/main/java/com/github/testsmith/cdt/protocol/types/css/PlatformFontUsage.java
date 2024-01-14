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
 * Information about amount of glyphs that were rendered with given font.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PlatformFontUsage {

  private String familyName;

  private Boolean isCustomFont;

  private Double glyphCount;

  /**
   * Font's family name reported by platform.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFamilyName() {
    return familyName;
  }

  /**
   * Font's family name reported by platform.
   *
   * @param familyName a {@link java.lang.String} object
   */
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  /**
   * Indicates if the font was downloaded or resolved locally.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsCustomFont() {
    return isCustomFont;
  }

  /**
   * Indicates if the font was downloaded or resolved locally.
   *
   * @param isCustomFont a {@link java.lang.Boolean} object
   */
  public void setIsCustomFont(Boolean isCustomFont) {
    this.isCustomFont = isCustomFont;
  }

  /**
   * Amount of glyphs that were rendered with this font.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getGlyphCount() {
    return glyphCount;
  }

  /**
   * Amount of glyphs that were rendered with this font.
   *
   * @param glyphCount a {@link java.lang.Double} object
   */
  public void setGlyphCount(Double glyphCount) {
    this.glyphCount = glyphCount;
  }
}
