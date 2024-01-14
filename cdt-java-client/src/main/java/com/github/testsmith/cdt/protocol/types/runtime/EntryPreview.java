package com.github.testsmith.cdt.protocol.types.runtime;

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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * EntryPreview class.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class EntryPreview {

  @Optional private ObjectPreview key;

  private ObjectPreview value;

  /**
   * Preview of the key. Specified for map-like collection entries.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public ObjectPreview getKey() {
    return key;
  }

  /**
   * Preview of the key. Specified for map-like collection entries.
   *
   * @param key a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public void setKey(ObjectPreview key) {
    this.key = key;
  }

  /**
   * Preview of the value.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public ObjectPreview getValue() {
    return value;
  }

  /**
   * Preview of the value.
   *
   * @param value a {@link com.github.testsmith.cdt.protocol.types.runtime.ObjectPreview} object
   */
  public void setValue(ObjectPreview value) {
    this.value = value;
  }
}
