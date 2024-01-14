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
 * Coverage data for a JavaScript function.
 *
 * @author roy
 * @version $Id: $Id
 */
public class FunctionCoverage {

  private String functionName;

  private List<CoverageRange> ranges;

  private Boolean isBlockCoverage;

  /**
   * JavaScript function name.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFunctionName() {
    return functionName;
  }

  /**
   * JavaScript function name.
   *
   * @param functionName a {@link java.lang.String} object
   */
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  /**
   * Source ranges inside the function with coverage data.
   *
   * @return a {@link java.util.List} object
   */
  public List<CoverageRange> getRanges() {
    return ranges;
  }

  /**
   * Source ranges inside the function with coverage data.
   *
   * @param ranges a {@link java.util.List} object
   */
  public void setRanges(List<CoverageRange> ranges) {
    this.ranges = ranges;
  }

  /**
   * Whether coverage data for this function has block granularity.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsBlockCoverage() {
    return isBlockCoverage;
  }

  /**
   * Whether coverage data for this function has block granularity.
   *
   * @param isBlockCoverage a {@link java.lang.Boolean} object
   */
  public void setIsBlockCoverage(Boolean isBlockCoverage) {
    this.isBlockCoverage = isBlockCoverage;
  }
}
