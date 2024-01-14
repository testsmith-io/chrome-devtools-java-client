package com.github.testsmith.cdt.protocol.types.page;

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
 * Screencast frame metadata.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class ScreencastFrameMetadata {

  private Double offsetTop;

  private Double pageScaleFactor;

  private Double deviceWidth;

  private Double deviceHeight;

  private Double scrollOffsetX;

  private Double scrollOffsetY;

  @Optional private Double timestamp;

  /**
   * Top offset in DIP.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getOffsetTop() {
    return offsetTop;
  }

  /**
   * Top offset in DIP.
   *
   * @param offsetTop a {@link java.lang.Double} object
   */
  public void setOffsetTop(Double offsetTop) {
    this.offsetTop = offsetTop;
  }

  /**
   * Page scale factor.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getPageScaleFactor() {
    return pageScaleFactor;
  }

  /**
   * Page scale factor.
   *
   * @param pageScaleFactor a {@link java.lang.Double} object
   */
  public void setPageScaleFactor(Double pageScaleFactor) {
    this.pageScaleFactor = pageScaleFactor;
  }

  /**
   * Device screen width in DIP.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDeviceWidth() {
    return deviceWidth;
  }

  /**
   * Device screen width in DIP.
   *
   * @param deviceWidth a {@link java.lang.Double} object
   */
  public void setDeviceWidth(Double deviceWidth) {
    this.deviceWidth = deviceWidth;
  }

  /**
   * Device screen height in DIP.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getDeviceHeight() {
    return deviceHeight;
  }

  /**
   * Device screen height in DIP.
   *
   * @param deviceHeight a {@link java.lang.Double} object
   */
  public void setDeviceHeight(Double deviceHeight) {
    this.deviceHeight = deviceHeight;
  }

  /**
   * Position of horizontal scroll in CSS pixels.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetX() {
    return scrollOffsetX;
  }

  /**
   * Position of horizontal scroll in CSS pixels.
   *
   * @param scrollOffsetX a {@link java.lang.Double} object
   */
  public void setScrollOffsetX(Double scrollOffsetX) {
    this.scrollOffsetX = scrollOffsetX;
  }

  /**
   * Position of vertical scroll in CSS pixels.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getScrollOffsetY() {
    return scrollOffsetY;
  }

  /**
   * Position of vertical scroll in CSS pixels.
   *
   * @param scrollOffsetY a {@link java.lang.Double} object
   */
  public void setScrollOffsetY(Double scrollOffsetY) {
    this.scrollOffsetY = scrollOffsetY;
  }

  /**
   * Frame swap timestamp.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Frame swap timestamp.
   *
   * @param timestamp a {@link java.lang.Double} object
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
