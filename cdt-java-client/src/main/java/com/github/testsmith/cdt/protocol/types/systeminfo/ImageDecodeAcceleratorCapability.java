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

import java.util.List;

/**
 * Describes a supported image decoding profile with its associated minimum and maximum resolutions
 * and subsampling.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ImageDecodeAcceleratorCapability {

  private ImageType imageType;

  private Size maxDimensions;

  private Size minDimensions;

  private List<SubsamplingFormat> subsamplings;

  /**
   * Image coded, e.g. Jpeg.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.ImageType} object
   */
  public ImageType getImageType() {
    return imageType;
  }

  /**
   * Image coded, e.g. Jpeg.
   *
   * @param imageType a {@link com.github.testsmith.cdt.protocol.types.systeminfo.ImageType} object
   */
  public void setImageType(ImageType imageType) {
    this.imageType = imageType;
  }

  /**
   * Maximum supported dimensions of the image in pixels.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public Size getMaxDimensions() {
    return maxDimensions;
  }

  /**
   * Maximum supported dimensions of the image in pixels.
   *
   * @param maxDimensions a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public void setMaxDimensions(Size maxDimensions) {
    this.maxDimensions = maxDimensions;
  }

  /**
   * Minimum supported dimensions of the image in pixels.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public Size getMinDimensions() {
    return minDimensions;
  }

  /**
   * Minimum supported dimensions of the image in pixels.
   *
   * @param minDimensions a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Size} object
   */
  public void setMinDimensions(Size minDimensions) {
    this.minDimensions = minDimensions;
  }

  /**
   * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
   *
   * @return a {@link java.util.List} object
   */
  public List<SubsamplingFormat> getSubsamplings() {
    return subsamplings;
  }

  /**
   * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
   *
   * @param subsamplings a {@link java.util.List} object
   */
  public void setSubsamplings(List<SubsamplingFormat> subsamplings) {
    this.subsamplings = subsamplings;
  }
}
