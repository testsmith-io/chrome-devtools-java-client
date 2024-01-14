package com.github.testsmith.cdt.protocol.types.accessibility;

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
 * AXProperty class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AXProperty {

  private AXPropertyName name;

  private AXValue value;

  /**
   * The name of this property.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXPropertyName} object
   */
  public AXPropertyName getName() {
    return name;
  }

  /**
   * The name of this property.
   *
   * @param name a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXPropertyName}
   *     object
   */
  public void setName(AXPropertyName name) {
    this.name = name;
  }

  /**
   * The value of this property.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getValue() {
    return value;
  }

  /**
   * The value of this property.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setValue(AXValue value) {
    this.value = value;
  }
}
