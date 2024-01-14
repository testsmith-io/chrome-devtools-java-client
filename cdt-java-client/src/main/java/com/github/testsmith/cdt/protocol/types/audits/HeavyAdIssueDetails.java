package com.github.testsmith.cdt.protocol.types.audits;

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
 * HeavyAdIssueDetails class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class HeavyAdIssueDetails {

  private HeavyAdResolutionStatus resolution;

  private HeavyAdReason reason;

  private AffectedFrame frame;

  /**
   * The resolution status, either blocking the content or warning.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.HeavyAdResolutionStatus} object
   */
  public HeavyAdResolutionStatus getResolution() {
    return resolution;
  }

  /**
   * The resolution status, either blocking the content or warning.
   *
   * @param resolution a {@link
   *     com.github.testsmith.cdt.protocol.types.audits.HeavyAdResolutionStatus} object
   */
  public void setResolution(HeavyAdResolutionStatus resolution) {
    this.resolution = resolution;
  }

  /**
   * The reason the ad was blocked, total network or cpu or peak cpu.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.HeavyAdReason} object
   */
  public HeavyAdReason getReason() {
    return reason;
  }

  /**
   * The reason the ad was blocked, total network or cpu or peak cpu.
   *
   * @param reason a {@link com.github.testsmith.cdt.protocol.types.audits.HeavyAdReason} object
   */
  public void setReason(HeavyAdReason reason) {
    this.reason = reason;
  }

  /**
   * The frame that was blocked.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public AffectedFrame getFrame() {
    return frame;
  }

  /**
   * The frame that was blocked.
   *
   * @param frame a {@link com.github.testsmith.cdt.protocol.types.audits.AffectedFrame} object
   */
  public void setFrame(AffectedFrame frame) {
    this.frame = frame;
  }
}
