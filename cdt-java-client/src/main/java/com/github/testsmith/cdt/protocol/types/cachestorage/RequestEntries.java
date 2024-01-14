package com.github.testsmith.cdt.protocol.types.cachestorage;

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
 * RequestEntries class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RequestEntries {

  private List<DataEntry> cacheDataEntries;

  private Double returnCount;

  /**
   * Array of object store data entries.
   *
   * @return a {@link java.util.List} object
   */
  public List<DataEntry> getCacheDataEntries() {
    return cacheDataEntries;
  }

  /**
   * Array of object store data entries.
   *
   * @param cacheDataEntries a {@link java.util.List} object
   */
  public void setCacheDataEntries(List<DataEntry> cacheDataEntries) {
    this.cacheDataEntries = cacheDataEntries;
  }

  /**
   * Count of returned entries from this storage. If pathFilter is empty, it is the count of all
   * entries from this storage.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getReturnCount() {
    return returnCount;
  }

  /**
   * Count of returned entries from this storage. If pathFilter is empty, it is the count of all
   * entries from this storage.
   *
   * @param returnCount a {@link java.lang.Double} object
   */
  public void setReturnCount(Double returnCount) {
    this.returnCount = returnCount;
  }
}
