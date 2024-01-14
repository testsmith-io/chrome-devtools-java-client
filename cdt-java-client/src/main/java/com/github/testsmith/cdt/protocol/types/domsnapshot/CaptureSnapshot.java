package com.github.testsmith.cdt.protocol.types.domsnapshot;

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
 * CaptureSnapshot class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CaptureSnapshot {

  private List<DocumentSnapshot> documents;

  private List<String> strings;

  /**
   * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
   *
   * @return a {@link java.util.List} object
   */
  public List<DocumentSnapshot> getDocuments() {
    return documents;
  }

  /**
   * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
   *
   * @param documents a {@link java.util.List} object
   */
  public void setDocuments(List<DocumentSnapshot> documents) {
    this.documents = documents;
  }

  /**
   * Shared string table that all string properties refer to with indexes.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getStrings() {
    return strings;
  }

  /**
   * Shared string table that all string properties refer to with indexes.
   *
   * @param strings a {@link java.util.List} object
   */
  public void setStrings(List<String> strings) {
    this.strings = strings;
  }
}
