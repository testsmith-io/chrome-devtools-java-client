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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Generic font families collection.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class FontFamilies {

  @Optional private String standard;

  @Optional private String fixed;

  @Optional private String serif;

  @Optional private String sansSerif;

  @Optional private String cursive;

  @Optional private String fantasy;

  @Optional private String pictograph;

  /**
   * The standard font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStandard() {
    return standard;
  }

  /**
   * The standard font-family.
   *
   * @param standard a {@link java.lang.String} object
   */
  public void setStandard(String standard) {
    this.standard = standard;
  }

  /**
   * The fixed font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFixed() {
    return fixed;
  }

  /**
   * The fixed font-family.
   *
   * @param fixed a {@link java.lang.String} object
   */
  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  /**
   * The serif font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSerif() {
    return serif;
  }

  /**
   * The serif font-family.
   *
   * @param serif a {@link java.lang.String} object
   */
  public void setSerif(String serif) {
    this.serif = serif;
  }

  /**
   * The sansSerif font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSansSerif() {
    return sansSerif;
  }

  /**
   * The sansSerif font-family.
   *
   * @param sansSerif a {@link java.lang.String} object
   */
  public void setSansSerif(String sansSerif) {
    this.sansSerif = sansSerif;
  }

  /**
   * The cursive font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getCursive() {
    return cursive;
  }

  /**
   * The cursive font-family.
   *
   * @param cursive a {@link java.lang.String} object
   */
  public void setCursive(String cursive) {
    this.cursive = cursive;
  }

  /**
   * The fantasy font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFantasy() {
    return fantasy;
  }

  /**
   * The fantasy font-family.
   *
   * @param fantasy a {@link java.lang.String} object
   */
  public void setFantasy(String fantasy) {
    this.fantasy = fantasy;
  }

  /**
   * The pictograph font-family.
   *
   * @return a {@link java.lang.String} object
   */
  public String getPictograph() {
    return pictograph;
  }

  /**
   * The pictograph font-family.
   *
   * @param pictograph a {@link java.lang.String} object
   */
  public void setPictograph(String pictograph) {
    this.pictograph = pictograph;
  }
}
