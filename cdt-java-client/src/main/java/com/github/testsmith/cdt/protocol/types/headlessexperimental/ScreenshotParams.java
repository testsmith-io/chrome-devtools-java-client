package com.github.testsmith.cdt.protocol.types.headlessexperimental;

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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Encoding options for a screenshot.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ScreenshotParams {

  @Optional private ScreenshotParamsFormat format;

  @Optional private Integer quality;

  /**
   * Image compression format (defaults to png).
   *
   * @return a {@link
   *     com.github.testsmith.cdt.protocol.types.headlessexperimental.ScreenshotParamsFormat} object
   */
  public ScreenshotParamsFormat getFormat() {
    return format;
  }

  /**
   * Image compression format (defaults to png).
   *
   * @param format a {@link
   *     com.github.testsmith.cdt.protocol.types.headlessexperimental.ScreenshotParamsFormat} object
   */
  public void setFormat(ScreenshotParamsFormat format) {
    this.format = format;
  }

  /**
   * Compression quality from range [0..100] (jpeg only).
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getQuality() {
    return quality;
  }

  /**
   * Compression quality from range [0..100] (jpeg only).
   *
   * @param quality a {@link java.lang.Integer} object
   */
  public void setQuality(Integer quality) {
    this.quality = quality;
  }
}
