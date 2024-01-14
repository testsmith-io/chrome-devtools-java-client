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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Represents function call argument. Either remote object id `objectId`, primitive `value`,
 * unserializable primitive value or neither of (for undefined) them should be specified.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CallArgument {

  @Optional private Object value;

  @Optional private String unserializableValue;

  @Optional private String objectId;

  /**
   * Primitive value or serializable javascript object.
   *
   * @return a {@link java.lang.Object} object
   */
  public Object getValue() {
    return value;
  }

  /**
   * Primitive value or serializable javascript object.
   *
   * @param value a {@link java.lang.Object} object
   */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * Primitive value which can not be JSON-stringified.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnserializableValue() {
    return unserializableValue;
  }

  /**
   * Primitive value which can not be JSON-stringified.
   *
   * @param unserializableValue a {@link java.lang.String} object
   */
  public void setUnserializableValue(String unserializableValue) {
    this.unserializableValue = unserializableValue;
  }

  /**
   * Remote object handle.
   *
   * @return a {@link java.lang.String} object
   */
  public String getObjectId() {
    return objectId;
  }

  /**
   * Remote object handle.
   *
   * @param objectId a {@link java.lang.String} object
   */
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }
}
