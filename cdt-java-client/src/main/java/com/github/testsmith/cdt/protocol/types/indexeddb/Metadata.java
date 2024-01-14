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

/**
 * Metadata class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Metadata {

  private Double entriesCount;

  private Double keyGeneratorValue;

  /**
   * the entries count
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEntriesCount() {
    return entriesCount;
  }

  /**
   * the entries count
   *
   * @param entriesCount a {@link java.lang.Double} object
   */
  public void setEntriesCount(Double entriesCount) {
    this.entriesCount = entriesCount;
  }

  /**
   * the current value of key generator, to become the next inserted key into the object store.
   * Valid if objectStore.autoIncrement is true.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getKeyGeneratorValue() {
    return keyGeneratorValue;
  }

  /**
   * the current value of key generator, to become the next inserted key into the object store.
   * Valid if objectStore.autoIncrement is true.
   *
   * @param keyGeneratorValue a {@link java.lang.Double} object
   */
  public void setKeyGeneratorValue(Double keyGeneratorValue) {
    this.keyGeneratorValue = keyGeneratorValue;
  }
}