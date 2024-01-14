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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * A single source for a computed AX property.
 *
 * @author roy
 * @version $Id: $Id
 */
public class AXValueSource {

  private AXValueSourceType type;

  @Optional private AXValue value;

  @Optional private String attribute;

  @Optional private AXValue attributeValue;

  @Optional private Boolean superseded;

  @Optional private AXValueNativeSourceType nativeSource;

  @Optional private AXValue nativeSourceValue;

  @Optional private Boolean invalid;

  @Optional private String invalidReason;

  /**
   * What type of source this is.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValueSourceType}
   *     object
   */
  public AXValueSourceType getType() {
    return type;
  }

  /**
   * What type of source this is.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValueSourceType}
   *     object
   */
  public void setType(AXValueSourceType type) {
    this.type = type;
  }

  /**
   * The value of this property source.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getValue() {
    return value;
  }

  /**
   * The value of this property source.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setValue(AXValue value) {
    this.value = value;
  }

  /**
   * The name of the relevant attribute, if any.
   *
   * @return a {@link java.lang.String} object
   */
  public String getAttribute() {
    return attribute;
  }

  /**
   * The name of the relevant attribute, if any.
   *
   * @param attribute a {@link java.lang.String} object
   */
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  /**
   * The value of the relevant attribute, if any.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getAttributeValue() {
    return attributeValue;
  }

  /**
   * The value of the relevant attribute, if any.
   *
   * @param attributeValue a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue}
   *     object
   */
  public void setAttributeValue(AXValue attributeValue) {
    this.attributeValue = attributeValue;
  }

  /**
   * Whether this source is superseded by a higher priority source.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getSuperseded() {
    return superseded;
  }

  /**
   * Whether this source is superseded by a higher priority source.
   *
   * @param superseded a {@link java.lang.Boolean} object
   */
  public void setSuperseded(Boolean superseded) {
    this.superseded = superseded;
  }

  /**
   * The native markup source for this value, e.g. a &lt;label&gt; element.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValueNativeSourceType}
   *     object
   */
  public AXValueNativeSourceType getNativeSource() {
    return nativeSource;
  }

  /**
   * The native markup source for this value, e.g. a &lt;label&gt; element.
   *
   * @param nativeSource a {@link
   *     com.github.testsmith.cdt.protocol.types.accessibility.AXValueNativeSourceType} object
   */
  public void setNativeSource(AXValueNativeSourceType nativeSource) {
    this.nativeSource = nativeSource;
  }

  /**
   * The value, such as a node or node list, of the native source.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public AXValue getNativeSourceValue() {
    return nativeSourceValue;
  }

  /**
   * The value, such as a node or node list, of the native source.
   *
   * @param nativeSourceValue a {@link
   *     com.github.testsmith.cdt.protocol.types.accessibility.AXValue} object
   */
  public void setNativeSourceValue(AXValue nativeSourceValue) {
    this.nativeSourceValue = nativeSourceValue;
  }

  /**
   * Whether the value for this property is invalid.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getInvalid() {
    return invalid;
  }

  /**
   * Whether the value for this property is invalid.
   *
   * @param invalid a {@link java.lang.Boolean} object
   */
  public void setInvalid(Boolean invalid) {
    this.invalid = invalid;
  }

  /**
   * Reason for the value being invalid, if it is.
   *
   * @return a {@link java.lang.String} object
   */
  public String getInvalidReason() {
    return invalidReason;
  }

  /**
   * Reason for the value being invalid, if it is.
   *
   * @param invalidReason a {@link java.lang.String} object
   */
  public void setInvalidReason(String invalidReason) {
    this.invalidReason = invalidReason;
  }
}
