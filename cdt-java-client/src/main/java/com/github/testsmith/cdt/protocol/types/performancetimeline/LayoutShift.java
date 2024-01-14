package com.github.testsmith.cdt.protocol.types.performancetimeline;

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
 * See https://wicg.github.io/layout-instability/#sec-layout-shift and layout_shift.idl
 *
 * @author roy
 * @version $Id: $Id
 */
public class LayoutShift {

  private Double value;

  private Boolean hadRecentInput;

  private Double lastInputTime;

  private List<LayoutShiftAttribution> sources;

  /**
   * Score increment produced by this event.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getValue() {
    return value;
  }

  /**
   * Score increment produced by this event.
   *
   * @param value a {@link java.lang.Double} object
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Getter for the field <code>hadRecentInput</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHadRecentInput() {
    return hadRecentInput;
  }

  /**
   * Setter for the field <code>hadRecentInput</code>.
   *
   * @param hadRecentInput a {@link java.lang.Boolean} object
   */
  public void setHadRecentInput(Boolean hadRecentInput) {
    this.hadRecentInput = hadRecentInput;
  }

  /**
   * Getter for the field <code>lastInputTime</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLastInputTime() {
    return lastInputTime;
  }

  /**
   * Setter for the field <code>lastInputTime</code>.
   *
   * @param lastInputTime a {@link java.lang.Double} object
   */
  public void setLastInputTime(Double lastInputTime) {
    this.lastInputTime = lastInputTime;
  }

  /**
   * Getter for the field <code>sources</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<LayoutShiftAttribution> getSources() {
    return sources;
  }

  /**
   * Setter for the field <code>sources</code>.
   *
   * @param sources a {@link java.util.List} object
   */
  public void setSources(List<LayoutShiftAttribution> sources) {
    this.sources = sources;
  }
}
