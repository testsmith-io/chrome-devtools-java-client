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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;
import java.util.Map;

/**
 * Provides information about the GPU(s) on the system.
 *
 * @author roy
 * @version $Id: $Id
 */
public class GPUInfo {

  private List<GPUDevice> devices;

  @Optional private Map<String, Object> auxAttributes;

  @Optional private Map<String, Object> featureStatus;

  private List<String> driverBugWorkarounds;

  private List<VideoDecodeAcceleratorCapability> videoDecoding;

  private List<VideoEncodeAcceleratorCapability> videoEncoding;

  private List<ImageDecodeAcceleratorCapability> imageDecoding;

  /**
   * The graphics devices on the system. Element 0 is the primary GPU.
   *
   * @return a {@link java.util.List} object
   */
  public List<GPUDevice> getDevices() {
    return devices;
  }

  /**
   * The graphics devices on the system. Element 0 is the primary GPU.
   *
   * @param devices a {@link java.util.List} object
   */
  public void setDevices(List<GPUDevice> devices) {
    this.devices = devices;
  }

  /**
   * An optional dictionary of additional GPU related attributes.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getAuxAttributes() {
    return auxAttributes;
  }

  /**
   * An optional dictionary of additional GPU related attributes.
   *
   * @param auxAttributes a {@link java.util.Map} object
   */
  public void setAuxAttributes(Map<String, Object> auxAttributes) {
    this.auxAttributes = auxAttributes;
  }

  /**
   * An optional dictionary of graphics features and their status.
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, Object> getFeatureStatus() {
    return featureStatus;
  }

  /**
   * An optional dictionary of graphics features and their status.
   *
   * @param featureStatus a {@link java.util.Map} object
   */
  public void setFeatureStatus(Map<String, Object> featureStatus) {
    this.featureStatus = featureStatus;
  }

  /**
   * An optional array of GPU driver bug workarounds.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getDriverBugWorkarounds() {
    return driverBugWorkarounds;
  }

  /**
   * An optional array of GPU driver bug workarounds.
   *
   * @param driverBugWorkarounds a {@link java.util.List} object
   */
  public void setDriverBugWorkarounds(List<String> driverBugWorkarounds) {
    this.driverBugWorkarounds = driverBugWorkarounds;
  }

  /**
   * Supported accelerated video decoding capabilities.
   *
   * @return a {@link java.util.List} object
   */
  public List<VideoDecodeAcceleratorCapability> getVideoDecoding() {
    return videoDecoding;
  }

  /**
   * Supported accelerated video decoding capabilities.
   *
   * @param videoDecoding a {@link java.util.List} object
   */
  public void setVideoDecoding(List<VideoDecodeAcceleratorCapability> videoDecoding) {
    this.videoDecoding = videoDecoding;
  }

  /**
   * Supported accelerated video encoding capabilities.
   *
   * @return a {@link java.util.List} object
   */
  public List<VideoEncodeAcceleratorCapability> getVideoEncoding() {
    return videoEncoding;
  }

  /**
   * Supported accelerated video encoding capabilities.
   *
   * @param videoEncoding a {@link java.util.List} object
   */
  public void setVideoEncoding(List<VideoEncodeAcceleratorCapability> videoEncoding) {
    this.videoEncoding = videoEncoding;
  }

  /**
   * Supported accelerated image decoding capabilities.
   *
   * @return a {@link java.util.List} object
   */
  public List<ImageDecodeAcceleratorCapability> getImageDecoding() {
    return imageDecoding;
  }

  /**
   * Supported accelerated image decoding capabilities.
   *
   * @param imageDecoding a {@link java.util.List} object
   */
  public void setImageDecoding(List<ImageDecodeAcceleratorCapability> imageDecoding) {
    this.imageDecoding = imageDecoding;
  }
}
