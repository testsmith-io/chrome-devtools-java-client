package com.github.testsmith.cdt.protocol.types.dom;

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

/**
 * PerformSearch class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class PerformSearch {

  private String searchId;

  private Integer resultCount;

  /**
   * Unique search session identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSearchId() {
    return searchId;
  }

  /**
   * Unique search session identifier.
   *
   * @param searchId a {@link java.lang.String} object
   */
  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  /**
   * Number of search results.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getResultCount() {
    return resultCount;
  }

  /**
   * Number of search results.
   *
   * @param resultCount a {@link java.lang.Integer} object
   */
  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }
}
