package com.github.testsmith.cdt.protocol.types.input;

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
import java.util.List;

/**
 * DragData class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class DragData {

  private List<DragDataItem> items;

  private Integer dragOperationsMask;

  /**
   * Getter for the field <code>items</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<DragDataItem> getItems() {
    return items;
  }

  /**
   * Setter for the field <code>items</code>.
   *
   * @param items a {@link java.util.List} object
   */
  public void setItems(List<DragDataItem> items) {
    this.items = items;
  }

  /**
   * Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDragOperationsMask() {
    return dragOperationsMask;
  }

  /**
   * Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16
   *
   * @param dragOperationsMask a {@link java.lang.Integer} object
   */
  public void setDragOperationsMask(Integer dragOperationsMask) {
    this.dragOperationsMask = dragOperationsMask;
  }
}
