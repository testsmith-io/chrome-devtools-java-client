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
 * Data for a simple selector (these are delimited by commas in a selector list).
 *
 * @author roy
 * @version $Id: $Id
 */
public class Value {

  private String text;

  @Optional private SourceRange range;

  /**
   * Value text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Value text.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Value range in the underlying resource (if available).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public SourceRange getRange() {
    return range;
  }

  /**
   * Value range in the underlying resource (if available).
   *
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public void setRange(SourceRange range) {
    this.range = range;
  }
}
