package com.github.testsmith.cdt.protocol.types.tracing;

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
import java.util.List;
import java.util.Map;

/**
 * TraceConfig class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TraceConfig {

  @Optional private TraceConfigRecordMode recordMode;

  @Optional private Boolean enableSampling;

  @Optional private Boolean enableSystrace;

  @Optional private Boolean enableArgumentFilter;

  @Optional private List<String> includedCategories;

  @Optional private List<String> excludedCategories;

  @Optional private List<String> syntheticDelays;

  @Optional private Map<String, Object> memoryDumpConfig;

  /**
   * Controls how the trace buffer stores data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.tracing.TraceConfigRecordMode} object
   */
  public TraceConfigRecordMode getRecordMode() {
    return recordMode;
  }

  /**
   * Controls how the trace buffer stores data.
   *
   * @param recordMode a {@link
   *     com.github.testsmith.cdt.protocol.types.tracing.TraceConfigRecordMode} object
   */
  public void setRecordMode(TraceConfigRecordMode recordMode) {
    this.recordMode = recordMode;
  }

  /**
   * Turns on JavaScript stack sampling.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableSampling() {
    return enableSampling;
  }

  /**
   * Turns on JavaScript stack sampling.
   *
   * @param enableSampling a {@link java.lang.Boolean} object
   */
  public void setEnableSampling(Boolean enableSampling) {
    this.enableSampling = enableSampling;
  }

  /**
   * Turns on system tracing.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableSystrace() {
    return enableSystrace;
  }

  /**
   * Turns on system tracing.
   *
   * @param enableSystrace a {@link java.lang.Boolean} object
   */
  public void setEnableSystrace(Boolean enableSystrace) {
    this.enableSystrace = enableSystrace;
  }

  /**
   * Turns on argument filter.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableArgumentFilter() {
    return enableArgumentFilter;
  }

  /**
   * Turns on argument filter.
   *
   * @param enableArgumentFilter a {@link java.lang.Boolean} object
   */
  public void setEnableArgumentFilter(Boolean enableArgumentFilter) {
    this.enableArgumentFilter = enableArgumentFilter;
  }

  /**
   * Included category filters.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getIncludedCategories() {
    return includedCategories;
  }

  /**
   * Included category filters.
   *
   * @param includedCategories a {@link java.util.List} object
   */
  public void setIncludedCategories(List<String> includedCategories) {
    this.includedCategories = includedCategories;
  }

  /**
   * Excluded category filters.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getExcludedCategories() {
    return excludedCategories;
  }

  /**
   * Excluded category filters.
   *
   * @param excludedCategories a {@link java.util.List} object
   */
  public void setExcludedCategories(List<String> excludedCategories) {
    this.excludedCategories = excludedCategories;
  }

  /**
   * Configuration to synthesize the delays in tracing.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getSyntheticDelays() {
    return syntheticDelays;
  }

  /**
   * Configuration to synthesize the delays in tracing.
   *
   * @param syntheticDelays a {@link java.util.List} object
   */
  public void setSyntheticDelays(List<String> syntheticDelays) {
    this.syntheticDelays = syntheticDelays;
  }

  /**
   * Configuration for memory dump triggers. Used only when "memory-infra" category is enabled.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getMemoryDumpConfig() {
    return memoryDumpConfig;
  }

  /**
   * Configuration for memory dump triggers. Used only when "memory-infra" category is enabled.
   *
   * @param memoryDumpConfig a {@link java.util.Map} object
   */
  public void setMemoryDumpConfig(Map<String, Object> memoryDumpConfig) {
    this.memoryDumpConfig = memoryDumpConfig;
  }
}
