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
 * Describes a supported video encoding profile with its associated maximum resolution and maximum
 * framerate.
 *
 * @author roy
 * @version $Id: $Id
 */
public class VideoEncodeAcceleratorCapability {

  private String profile;

  private Size maxResolution;

  private Integer maxFramerateNumerator;

  private Integer maxFramerateDenominator;

  /**
   * Video codec profile that is supported, e.g H264 Main.
   *
   * @return a {@link java.lang.String} object
   */
  public String getProfile() {
    return profile;
  }

  /**
   * Video codec profile that is supported, e.g H264 Main.
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
   * Maximum encoding framerate in frames per second supported for this |profile|, as fraction's
   * numerator and denominator, e.g. 24/1 fps, 24000/1001 fps, etc.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getMaxFramerateNumerator() {
    return maxFramerateNumerator;
  }

  /**
   * Maximum encoding framerate in frames per second supported for this |profile|, as fraction's
   * numerator and denominator, e.g. 24/1 fps, 24000/1001 fps, etc.
   *
   * @param maxFramerateNumerator a {@link java.lang.Integer} object
   */
  public void setMaxFramerateNumerator(Integer maxFramerateNumerator) {
    this.maxFramerateNumerator = maxFramerateNumerator;
  }

  /**
   * Getter for the field <code>maxFramerateDenominator</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getMaxFramerateDenominator() {
    return maxFramerateDenominator;
  }

  /**
   * Setter for the field <code>maxFramerateDenominator</code>.
   *
   * @param maxFramerateDenominator a {@link java.lang.Integer} object
   */
  public void setMaxFramerateDenominator(Integer maxFramerateDenominator) {
    this.maxFramerateDenominator = maxFramerateDenominator;
  }
}
