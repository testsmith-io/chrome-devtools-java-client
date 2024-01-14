package com.github.testsmith.cdt.protocol.events.domstorage;

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

import com.github.testsmith.cdt.protocol.types.domstorage.StorageId;

/**
 * DomStorageItemAdded class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class DomStorageItemAdded {

  private StorageId storageId;

  private String key;

  private String newValue;

  /**
   * Getter for the field <code>storageId</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   */
  public StorageId getStorageId() {
    return storageId;
  }

  /**
   * Setter for the field <code>storageId</code>.
   *
   * @param storageId a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   */
  public void setStorageId(StorageId storageId) {
    this.storageId = storageId;
  }

  /**
   * Getter for the field <code>key</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * Setter for the field <code>key</code>.
   *
   * @param key a {@link java.lang.String} object
   */
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Getter for the field <code>newValue</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getNewValue() {
    return newValue;
  }

  /**
   * Setter for the field <code>newValue</code>.
   *
   * @param newValue a {@link java.lang.String} object
   */
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }
}
