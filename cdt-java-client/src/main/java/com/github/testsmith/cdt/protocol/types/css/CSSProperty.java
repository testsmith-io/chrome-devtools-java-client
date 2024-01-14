package com.github.testsmith.cdt.protocol.types.css;

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
 * CSS property declaration data.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSProperty {

  private String name;

  private String value;

  @Optional private Boolean important;

  @Optional private Boolean implicit;

  @Optional private String text;

  @Optional private Boolean parsedOk;

  @Optional private Boolean disabled;

  @Optional private SourceRange range;

  /**
   * The property name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * The property name.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The property value.
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /**
   * The property value.
   *
   * @param value a {@link java.lang.String} object
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Whether the property has "!important" annotation (implies `false` if absent).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getImportant() {
    return important;
  }

  /**
   * Whether the property has "!important" annotation (implies `false` if absent).
   *
   * @param important a {@link java.lang.Boolean} object
   */
  public void setImportant(Boolean important) {
    this.important = important;
  }

  /**
   * Whether the property is implicit (implies `false` if absent).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getImplicit() {
    return implicit;
  }

  /**
   * Whether the property is implicit (implies `false` if absent).
   *
   * @param implicit a {@link java.lang.Boolean} object
   */
  public void setImplicit(Boolean implicit) {
    this.implicit = implicit;
  }

  /**
   * The full property text as specified in the style.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * The full property text as specified in the style.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Whether the property is understood by the browser (implies `true` if absent).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getParsedOk() {
    return parsedOk;
  }

  /**
   * Whether the property is understood by the browser (implies `true` if absent).
   *
   * @param parsedOk a {@link java.lang.Boolean} object
   */
  public void setParsedOk(Boolean parsedOk) {
    this.parsedOk = parsedOk;
  }

  /**
   * Whether the property is disabled by the user (present for source-based properties only).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDisabled() {
    return disabled;
  }

  /**
   * Whether the property is disabled by the user (present for source-based properties only).
   *
   * @param disabled a {@link java.lang.Boolean} object
   */
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  /**
   * The entire property range in the enclosing style declaration (if available).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public SourceRange getRange() {
    return range;
  }

  /**
   * The entire property range in the enclosing style declaration (if available).
   *
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public void setRange(SourceRange range) {
    this.range = range;
  }
}
