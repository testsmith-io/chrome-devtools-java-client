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
 * LowTextContrastIssueDetails class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class LowTextContrastIssueDetails {

  private Integer violatingNodeId;

  private String violatingNodeSelector;

  private Double contrastRatio;

  private Double thresholdAA;

  private Double thresholdAAA;

  private String fontSize;

  private String fontWeight;

  /**
   * Getter for the field <code>violatingNodeId</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  /**
   * Setter for the field <code>violatingNodeId</code>.
   *
   * @param violatingNodeId a {@link java.lang.Integer} object
   */
  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }

  /**
   * Getter for the field <code>violatingNodeSelector</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getViolatingNodeSelector() {
    return violatingNodeSelector;
  }

  /**
   * Setter for the field <code>violatingNodeSelector</code>.
   *
   * @param violatingNodeSelector a {@link java.lang.String} object
   */
  public void setViolatingNodeSelector(String violatingNodeSelector) {
    this.violatingNodeSelector = violatingNodeSelector;
  }

  /**
   * Getter for the field <code>contrastRatio</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getContrastRatio() {
    return contrastRatio;
  }

  /**
   * Setter for the field <code>contrastRatio</code>.
   *
   * @param contrastRatio a {@link java.lang.Double} object
   */
  public void setContrastRatio(Double contrastRatio) {
    this.contrastRatio = contrastRatio;
  }

  /**
   * Getter for the field <code>thresholdAA</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getThresholdAA() {
    return thresholdAA;
  }

  /**
   * Setter for the field <code>thresholdAA</code>.
   *
   * @param thresholdAA a {@link java.lang.Double} object
   */
  public void setThresholdAA(Double thresholdAA) {
    this.thresholdAA = thresholdAA;
  }

  /**
   * Getter for the field <code>thresholdAAA</code>.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getThresholdAAA() {
    return thresholdAAA;
  }

  /**
   * Setter for the field <code>thresholdAAA</code>.
   *
   * @param thresholdAAA a {@link java.lang.Double} object
   */
  public void setThresholdAAA(Double thresholdAAA) {
    this.thresholdAAA = thresholdAAA;
  }

  /**
   * Getter for the field <code>fontSize</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontSize() {
    return fontSize;
  }

  /**
   * Setter for the field <code>fontSize</code>.
   *
   * @param fontSize a {@link java.lang.String} object
   */
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  /**
   * Getter for the field <code>fontWeight</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFontWeight() {
    return fontWeight;
  }

  /**
   * Setter for the field <code>fontWeight</code>.
   *
   * @param fontWeight a {@link java.lang.String} object
   */
  public void setFontWeight(String fontWeight) {
    this.fontWeight = fontWeight;
  }
}
