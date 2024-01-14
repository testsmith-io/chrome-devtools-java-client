package com.github.testsmith.cdt.protocol.types.layertree;

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
 * Serialized fragment of layer picture along with its offset within the layer.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PictureTile {

  private Double x;

  private Double y;

  private String picture;

  /**
   * Offset from owning layer left boundary
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getX() {
    return x;
  }

  /**
   * Offset from owning layer left boundary
   *
   * @param x a {@link java.lang.Double} object
   */
  public void setX(Double x) {
    this.x = x;
  }

  /**
   * Offset from owning layer top boundary
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getY() {
    return y;
  }

  /**
   * Offset from owning layer top boundary
   *
   * @param y a {@link java.lang.Double} object
   */
  public void setY(Double y) {
    this.y = y;
  }

  /**
   * Base64-encoded snapshot data. (Encoded as a base64 string when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getPicture() {
    return picture;
  }

  /**
   * Base64-encoded snapshot data. (Encoded as a base64 string when passed over JSON)
   *
   * @param picture a {@link java.lang.String} object
   */
  public void setPicture(String picture) {
    this.picture = picture;
  }
}
