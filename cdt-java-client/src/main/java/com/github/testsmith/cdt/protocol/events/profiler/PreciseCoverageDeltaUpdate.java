package com.github.testsmith.cdt.protocol.events.profiler;

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
import com.github.testsmith.cdt.protocol.types.profiler.ScriptCoverage;
import java.util.List;

/**
 * Reports coverage delta since the last poll (either from an event like this, or from
 * `takePreciseCoverage` for the current isolate. May only be sent if precise code coverage has been
 * started. This event can be trigged by the embedder to, for example, trigger collection of
 * coverage data immediatelly at a certain point in time.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class PreciseCoverageDeltaUpdate {

  private Double timestamp;

  private String occassion;

  private List<ScriptCoverage> result;

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

  /**
   * Identifier for distinguishing coverage events.
   *
   * @return a {@link java.lang.String} object
   */
  public String getOccassion() {
    return occassion;
  }

  /**
   * Identifier for distinguishing coverage events.
   *
   * @param occassion a {@link java.lang.String} object
   */
  public void setOccassion(String occassion) {
    this.occassion = occassion;
  }

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
}
