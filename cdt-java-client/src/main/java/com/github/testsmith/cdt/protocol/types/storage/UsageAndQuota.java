package com.github.testsmith.cdt.protocol.types.storage;

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
 * UsageAndQuota class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class UsageAndQuota {

  private Double usage;

  private Double quota;

  private Boolean overrideActive;

  private List<UsageForType> usageBreakdown;

  /**
   * Storage usage (bytes).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getUsage() {
    return usage;
  }

  /**
   * Storage usage (bytes).
   *
   * @param usage a {@link java.lang.Double} object
   */
  public void setUsage(Double usage) {
    this.usage = usage;
  }

  /**
   * Storage quota (bytes).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getQuota() {
    return quota;
  }

  /**
   * Storage quota (bytes).
   *
   * @param quota a {@link java.lang.Double} object
   */
  public void setQuota(Double quota) {
    this.quota = quota;
  }

  /**
   * Whether or not the origin has an active storage quota override
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getOverrideActive() {
    return overrideActive;
  }

  /**
   * Whether or not the origin has an active storage quota override
   *
   * @param overrideActive a {@link java.lang.Boolean} object
   */
  public void setOverrideActive(Boolean overrideActive) {
    this.overrideActive = overrideActive;
  }

  /**
   * Storage usage per type (bytes).
   *
   * @return a {@link java.util.List} object
   */
  public List<UsageForType> getUsageBreakdown() {
    return usageBreakdown;
  }

  /**
   * Storage usage per type (bytes).
   *
   * @param usageBreakdown a {@link java.util.List} object
   */
  public void setUsageBreakdown(List<UsageForType> usageBreakdown) {
    this.usageBreakdown = usageBreakdown;
  }
}
