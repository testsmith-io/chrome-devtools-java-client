package com.github.testsmith.cdt.protocol.types.runtime;

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
 * PropertyPreview class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PropertyPreview {

  private String name;

  private PropertyPreviewType type;

  @Optional private String value;

  @Optional private ObjectPreview valuePreview;

  @Optional private PropertyPreviewSubtype subtype;

  /**
   * Property name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Property name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Object type. Accessor means that the property itself is an accessor property.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.PropertyPreviewType} object
   */
  public PropertyPreviewType getType() {
    return type;
  }

  /**
   * Object type. Accessor means that the property itself is an accessor property.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.runtime.PropertyPreviewType}
   *     object
   */
  public void setType(PropertyPreviewType type) {
    this.type = type;
  }

  /**
   * User-friendly property value string.
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /**
   * User-friendly property value string.
   *
   * @param value a {@link java.lang.String} object
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Nested value preview.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public ObjectPreview getValuePreview() {
    return valuePreview;
  }

  /**
   * Nested value preview.
   *
   * @param valuePreview a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview}
   *     object
   */
  public void setValuePreview(ObjectPreview valuePreview) {
    this.valuePreview = valuePreview;
  }

  /**
   * Object subtype hint. Specified for `object` type values only.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.PropertyPreviewSubtype} object
   */
  public PropertyPreviewSubtype getSubtype() {
    return subtype;
  }

  /**
   * Object subtype hint. Specified for `object` type values only.
   *
   * @param subtype a {@link com.github.testsmith.cdt.protocol.types.runtime.PropertyPreviewSubtype}
   *     object
   */
  public void setSubtype(PropertyPreviewSubtype subtype) {
    this.subtype = subtype;
  }
}
