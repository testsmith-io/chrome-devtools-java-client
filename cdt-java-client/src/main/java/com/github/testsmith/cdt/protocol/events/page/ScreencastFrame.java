package com.github.testsmith.cdt.protocol.events.page;

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
import com.github.testsmith.cdt.protocol.types.page.ScreencastFrameMetadata;

/**
 * Compressed image data requested by the `startScreencast`.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ScreencastFrame {

  private String data;

  private ScreencastFrameMetadata metadata;

  private Integer sessionId;

  /**
   * Base64-encoded compressed image. (Encoded as a base64 string when passed over JSON)
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * Base64-encoded compressed image. (Encoded as a base64 string when passed over JSON)
   *
   * @param data a {@link java.lang.String} object
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Screencast frame metadata.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.ScreencastFrameMetadata} object
   */
  public ScreencastFrameMetadata getMetadata() {
    return metadata;
  }

  /**
   * Screencast frame metadata.
   *
   * @param metadata a {@link com.github.testsmith.cdt.protocol.types.page.ScreencastFrameMetadata}
   *     object
   */
  public void setMetadata(ScreencastFrameMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Frame number.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getSessionId() {
    return sessionId;
  }

  /**
   * Frame number.
   *
   * @param sessionId a {@link java.lang.Integer} object
   */
  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }
}
