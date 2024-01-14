package com.github.testsmith.cdt.protocol.types.profiler;

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
 * TakePreciseCoverage class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TakePreciseCoverage {

  private List<ScriptCoverage> result;

  private Double timestamp;

  /**
   * Coverage data for the current isolate.
   *
   * @return a {@link java.util.List} object
   */
  public List<ScriptCoverage> getResult() {
    return result;
  }

  /**
   * Coverage data for the current isolate.
   *
   * @param result a {@link java.util.List} object
   */
  public void setResult(List<ScriptCoverage> result) {
    this.result = result;
  }

  /**
   * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
