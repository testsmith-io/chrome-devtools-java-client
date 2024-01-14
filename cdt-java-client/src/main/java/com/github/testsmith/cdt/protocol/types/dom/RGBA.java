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

/**
 * A structure holding an RGBA color.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RGBA {

  private Integer r;

  private Integer g;

  private Integer b;

  @Optional private Double a;

  /**
   * The red component, in the [0-255] range.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getR() {
    return r;
  }

  /**
   * The red component, in the [0-255] range.
   *
   * @param r a {@link java.lang.Integer} object
   */
  public void setR(Integer r) {
    this.r = r;
  }

  /**
   * The green component, in the [0-255] range.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getG() {
    return g;
  }

  /**
   * The green component, in the [0-255] range.
   *
   * @param g a {@link java.lang.Integer} object
   */
  public void setG(Integer g) {
    this.g = g;
  }

  /**
   * The blue component, in the [0-255] range.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getB() {
    return b;
  }

  /**
   * The blue component, in the [0-255] range.
   *
   * @param b a {@link java.lang.Integer} object
   */
  public void setB(Integer b) {
    this.b = b;
  }

  /**
   * The alpha component, in the [0-1] range (default: 1).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getA() {
    return a;
  }

  /**
   * The alpha component, in the [0-1] range (default: 1).
   *
   * @param a a {@link java.lang.Double} object
   */
  public void setA(Double a) {
    this.a = a;
  }
}
