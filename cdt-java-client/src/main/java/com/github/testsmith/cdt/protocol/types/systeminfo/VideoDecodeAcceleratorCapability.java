package com.github.testsmith.cdt.protocol.types.systeminfo;

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
 * Describes a supported video decoding profile with its associated minimum and maximum resolutions.
 *
 * @author roy
 * @version $Id: $Id
 */
public class VideoDecodeAcceleratorCapability {

  private String profile;

  private Size maxResolution;

  private Size minResolution;

  /**
   * Video codec profile that is supported, e.g. VP9 Profile 2.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProfile() {
    return profile;
  }

  /**
   * Video codec profile that is supported, e.g. VP9 Profile 2.
   *
   * @param profile a {@link java.lang.String} object
   */
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /**
   * Maximum video dimensions in pixels supported for this |profile|.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public Size getMaxResolution() {
    return maxResolution;
  }

  /**
   * Maximum video dimensions in pixels supported for this |profile|.
   *
   * @param maxResolution a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public void setMaxResolution(Size maxResolution) {
    this.maxResolution = maxResolution;
  }

  /**
   * Minimum video dimensions in pixels supported for this |profile|.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public Size getMinResolution() {
    return minResolution;
  }

  /**
   * Minimum video dimensions in pixels supported for this |profile|.
   *
   * @param minResolution a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public void setMinResolution(Size minResolution) {
    this.minResolution = minResolution;
  }
}
