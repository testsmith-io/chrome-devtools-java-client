package com.github.testsmith.cdt.protocol.types.console;

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
 * Console message.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ConsoleMessage {

  private ConsoleMessageSource source;

  private ConsoleMessageLevel level;

  private String text;

  @Optional private String url;

  @Optional private Integer line;

  @Optional private Integer column;

  /**
   * Message source.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessageSource} object
   */
  public ConsoleMessageSource getSource() {
    return source;
  }

  /**
   * Message source.
   *
   * @param source a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessageSource}
   *     object
   */
  public void setSource(ConsoleMessageSource source) {
    this.source = source;
  }

  /**
   * Message severity.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessageLevel} object
   */
  public ConsoleMessageLevel getLevel() {
    return level;
  }

  /**
   * Message severity.
   *
   * @param level a {@link com.github.testsmith.cdt.protocol.types.console.ConsoleMessageLevel}
   *     object
   */
  public void setLevel(ConsoleMessageLevel level) {
    this.level = level;
  }

  /**
   * Message text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Message text.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * URL of the message origin.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of the message origin.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Line number in the resource that generated this message (1-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getLine() {
    return line;
  }

  /**
   * Line number in the resource that generated this message (1-based).
   *
   * @param line a {@link java.lang.Integer} object
   */
  public void setLine(Integer line) {
    this.line = line;
  }

  /**
   * Column number in the resource that generated this message (1-based).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getColumn() {
    return column;
  }

  /**
   * Column number in the resource that generated this message (1-based).
   *
   * @param column a {@link java.lang.Integer} object
   */
  public void setColumn(Integer column) {
    this.column = column;
  }
}
