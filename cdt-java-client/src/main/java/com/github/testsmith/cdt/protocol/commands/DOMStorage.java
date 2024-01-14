package com.github.testsmith.cdt.protocol.commands;

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

import com.github.testsmith.cdt.protocol.events.domstorage.DomStorageItemAdded;
import com.github.testsmith.cdt.protocol.events.domstorage.DomStorageItemRemoved;
import com.github.testsmith.cdt.protocol.events.domstorage.DomStorageItemUpdated;
import com.github.testsmith.cdt.protocol.events.domstorage.DomStorageItemsCleared;
import com.github.testsmith.cdt.protocol.support.annotations.*;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.domstorage.StorageId;
import java.util.List;

/**
 * Query and modify DOM storage.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface DOMStorage {

  /** @param storageId */
  /**
   * clear.
   *
   * @param storageId a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   */
  void clear(@ParamName("storageId") StorageId storageId);

  /** Disables storage tracking, prevents storage events from being sent to the client. */
  void disable();

  /** Enables storage tracking, storage events will now be delivered to the client. */
  void enable();

  /** @param storageId */
  /**
   * getDOMStorageItems.
   *
   * @param storageId a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   * @return a {@link java.util.List} object
   */
  @Returns("entries")
  @ReturnTypeParameter({List.class, String.class})
  List<List<String>> getDOMStorageItems(@ParamName("storageId") StorageId storageId);

  /**
   * removeDOMStorageItem.
   *
   * @param storageId a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   * @param key a {@link java.lang.String} object
   */
  void removeDOMStorageItem(
      @ParamName("storageId") StorageId storageId, @ParamName("key") String key);

  /**
   * setDOMStorageItem.
   *
   * @param storageId a {@link com.github.testsmith.cdt.protocol.types.domstorage.StorageId} object
   * @param key a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   */
  void setDOMStorageItem(
      @ParamName("storageId") StorageId storageId,
      @ParamName("key") String key,
      @ParamName("value") String value);

  /**
   * onDomStorageItemAdded.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("domStorageItemAdded")
  EventListener onDomStorageItemAdded(EventHandler<DomStorageItemAdded> eventListener);

  /**
   * onDomStorageItemRemoved.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("domStorageItemRemoved")
  EventListener onDomStorageItemRemoved(EventHandler<DomStorageItemRemoved> eventListener);

  /**
   * onDomStorageItemUpdated.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("domStorageItemUpdated")
  EventListener onDomStorageItemUpdated(EventHandler<DomStorageItemUpdated> eventListener);

  /**
   * onDomStorageItemsCleared.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("domStorageItemsCleared")
  EventListener onDomStorageItemsCleared(EventHandler<DomStorageItemsCleared> eventListener);
}
