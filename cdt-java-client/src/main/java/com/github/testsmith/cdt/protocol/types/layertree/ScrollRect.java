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

import com.github.testsmith.cdt.protocol.types.dom.Rect;

/**
 * Rectangle where scrolling happens on the main thread.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScrollRect {

  private Rect rect;

  private ScrollRectType type;

  /**
   * Rectangle itself.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public Rect getRect() {
    return rect;
  }

  /**
   * Rectangle itself.
   *
   * @param rect a {@link com.github.testsmith.cdt.protocol.types.dom.Rect} object
   */
  public void setRect(Rect rect) {
    this.rect = rect;
  }

  /**
   * Reason for rectangle to force scrolling on the main thread
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.layertree.ScrollRectType} object
   */
  public ScrollRectType getType() {
    return type;
  }

  /**
   * Reason for rectangle to force scrolling on the main thread
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.layertree.ScrollRectType} object
   */
  public void setType(ScrollRectType type) {
    this.type = type;
  }
}
