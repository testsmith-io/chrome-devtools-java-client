package com.github.testsmith.cdt.protocol.types.profiler;

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
 * Source offset and types for a parameter or return value.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class TypeProfileEntry {

  private Integer offset;

  private List<TypeObject> types;

  /**
   * Source offset of the parameter or end of function for return values.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getOffset() {
    return offset;
  }

  /**
   * Source offset of the parameter or end of function for return values.
   *
   * @param offset a {@link java.lang.Integer} object
   */
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   * The types for this parameter or return value.
   *
   * @return a {@link java.util.List} object
   */
  public List<TypeObject> getTypes() {
    return types;
  }

  /**
   * The types for this parameter or return value.
   *
   * @param types a {@link java.util.List} object
   */
  public void setTypes(List<TypeObject> types) {
    this.types = types;
  }
}
