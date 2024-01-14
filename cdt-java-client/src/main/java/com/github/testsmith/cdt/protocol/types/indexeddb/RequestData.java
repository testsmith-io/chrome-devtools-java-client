package com.github.testsmith.cdt.protocol.types.indexeddb;

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
 * RequestData class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RequestData {

  private List<DataEntry> objectStoreDataEntries;

  private Boolean hasMore;

  /**
   * Array of object store data entries.
   *
   * @return a {@link java.util.List} object
   */
  public List<DataEntry> getObjectStoreDataEntries() {
    return objectStoreDataEntries;
  }

  /**
   * Array of object store data entries.
   *
   * @param objectStoreDataEntries a {@link java.util.List} object
   */
  public void setObjectStoreDataEntries(List<DataEntry> objectStoreDataEntries) {
    this.objectStoreDataEntries = objectStoreDataEntries;
  }

  /**
   * If true, there are more entries to fetch in the given range.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasMore() {
    return hasMore;
  }

  /**
   * If true, there are more entries to fetch in the given range.
   *
   * @param hasMore a {@link java.lang.Boolean} object
   */
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }
}
