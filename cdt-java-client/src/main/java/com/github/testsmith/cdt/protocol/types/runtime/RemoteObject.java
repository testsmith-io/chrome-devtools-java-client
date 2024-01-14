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
 * Mirror object referencing original JavaScript object.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RemoteObject {

  private RemoteObjectType type;

  @Optional private RemoteObjectSubtype subtype;

  @Optional private String className;

  @Optional private Object value;

  @Optional private String unserializableValue;

  @Optional private String description;

  @Optional private String objectId;

  @Experimental @Optional private ObjectPreview preview;

  @Experimental @Optional private CustomPreview customPreview;

  /**
   * Object type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObjectType} object
   */
  public RemoteObjectType getType() {
    return type;
  }

  /**
   * Object type.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObjectType} object
   */
  public void setType(RemoteObjectType type) {
    this.type = type;
  }

  /**
   * Object subtype hint. Specified for `object` type values only. NOTE: If you change anything
   * here, make sure to also update `subtype` in `ObjectPreview` and `PropertyPreview` below.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObjectSubtype} object
   */
  public RemoteObjectSubtype getSubtype() {
    return subtype;
  }

  /**
   * Object subtype hint. Specified for `object` type values only. NOTE: If you change anything
   * here, make sure to also update `subtype` in `ObjectPreview` and `PropertyPreview` below.
   *
   * @param subtype a {@link com.github.testsmith.cdt.protocol.types.runtime.RemoteObjectSubtype}
   *     object
   */
  public void setSubtype(RemoteObjectSubtype subtype) {
    this.subtype = subtype;
  }

  /**
   * Object class (constructor) name. Specified for `object` type values only.
   *
   * @return a {@link java.lang.String} object
   */
  public String getClassName() {
    return className;
  }

  /**
   * Object class (constructor) name. Specified for `object` type values only.
   *
   * @param className a {@link java.lang.String} object
   */
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   * Remote object value in case of primitive values or JSON values (if it was requested).
   *
   * @return a {@link java.lang.Object} object
   */
  public Object getValue() {
    return value;
  }

  /**
   * Remote object value in case of primitive values or JSON values (if it was requested).
   *
   * @param value a {@link java.lang.Object} object
   */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have `value`, but gets this
   * property.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnserializableValue() {
    return unserializableValue;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have `value`, but gets this
   * property.
   *
   * @param unserializableValue a {@link java.lang.String} object
   */
  public void setUnserializableValue(String unserializableValue) {
    this.unserializableValue = unserializableValue;
  }

  /**
   * String representation of the object.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * String representation of the object.
   *
   * @param description a {@link java.lang.String} object
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Unique object identifier (for non-primitive values).
   *
   * @return a {@link java.lang.String} object
   */
  public String getObjectId() {
    return objectId;
  }

  /**
   * Unique object identifier (for non-primitive values).
   *
   * @param objectId a {@link java.lang.String} object
   */
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  /**
   * Preview containing abbreviated property values. Specified for `object` type values only.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public ObjectPreview getPreview() {
    return preview;
  }

  /**
   * Preview containing abbreviated property values. Specified for `object` type values only.
   *
   * @param preview a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public void setPreview(ObjectPreview preview) {
    this.preview = preview;
  }

  /**
   * Getter for the field <code>customPreview</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.CustomPreview} object
   */
  public CustomPreview getCustomPreview() {
    return customPreview;
  }

  /**
   * Setter for the field <code>customPreview</code>.
   *
   * @param customPreview a {@link com.github.testsmith.cdt.protocol.types.runtime.CustomPreview}
   *     object
   */
  public void setCustomPreview(CustomPreview customPreview) {
    this.customPreview = customPreview;
  }
}
