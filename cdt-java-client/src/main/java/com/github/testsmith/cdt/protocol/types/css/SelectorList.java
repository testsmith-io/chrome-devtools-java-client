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

import java.util.List;

/**
 * Selector list data.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SelectorList {

  private List<Value> selectors;

  private String text;

  /**
   * Selectors in the list.
   *
   * @return a {@link java.util.List} object
   */
  public List<Value> getSelectors() {
    return selectors;
  }

  /**
   * Selectors in the list.
   *
   * @param selectors a {@link java.util.List} object
   */
  public void setSelectors(List<Value> selectors) {
    this.selectors = selectors;
  }

  /**
   * Rule selector text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Rule selector text.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }
}
