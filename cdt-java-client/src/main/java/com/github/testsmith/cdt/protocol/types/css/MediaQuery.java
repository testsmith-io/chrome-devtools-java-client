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
 * Media query descriptor.
 *
 * @author roy
 * @version $Id: $Id
 */
public class MediaQuery {

  private List<MediaQueryExpression> expressions;

  private Boolean active;

  /**
   * Array of media query expressions.
   *
   * @return a {@link java.util.List} object
   */
  public List<MediaQueryExpression> getExpressions() {
    return expressions;
  }

  /**
   * Array of media query expressions.
   *
   * @param expressions a {@link java.util.List} object
   */
  public void setExpressions(List<MediaQueryExpression> expressions) {
    this.expressions = expressions;
  }

  /**
   * Whether the media query condition is satisfied.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getActive() {
    return active;
  }

  /**
   * Whether the media query condition is satisfied.
   *
   * @param active a {@link java.lang.Boolean} object
   */
  public void setActive(Boolean active) {
    this.active = active;
  }
}
