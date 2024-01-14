package com.github.testsmith.cdt.protocol.types.domsnapshot;

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

import com.github.testsmith.cdt.protocol.types.dom.Rect;

/**
 * Details of post layout rendered text positions. The exact layout should not be regarded as stable
 * and may change between versions.
 *
 * @author roy
 * @version $Id: $Id
 */
public class InlineTextBox {

  private Rect boundingBox;

  private Integer startCharacterIndex;

  private Integer numCharacters;

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
   *
   * @param boundingBox a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setBoundingBox(Rect boundingBox) {
    this.boundingBox = boundingBox;
  }

  /**
   * The starting index in characters, for this post layout textbox substring. Characters that would
   * be represented as a surrogate pair in UTF-16 have length 2.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getStartCharacterIndex() {
    return startCharacterIndex;
  }

  /**
   * The starting index in characters, for this post layout textbox substring. Characters that would
   * be represented as a surrogate pair in UTF-16 have length 2.
   *
   * @param startCharacterIndex a {@link java.lang.Integer} object
   */
  public void setStartCharacterIndex(Integer startCharacterIndex) {
    this.startCharacterIndex = startCharacterIndex;
  }

  /**
   * The number of characters in this post layout textbox substring. Characters that would be
   * represented as a surrogate pair in UTF-16 have length 2.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getNumCharacters() {
    return numCharacters;
  }

  /**
   * The number of characters in this post layout textbox substring. Characters that would be
   * represented as a surrogate pair in UTF-16 have length 2.
   *
   * @param numCharacters a {@link java.lang.Integer} object
   */
  public void setNumCharacters(Integer numCharacters) {
    this.numCharacters = numCharacters;
  }
}
