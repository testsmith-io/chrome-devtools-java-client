package com.github.testsmith.cdt.protocol.types.security;

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
 * Information about insecure content on the page.
 *
 * @author roy
 * @version $Id: $Id
 */
@Deprecated
public class InsecureContentStatus {

  private Boolean ranMixedContent;

  private Boolean displayedMixedContent;

  private Boolean containedMixedForm;

  private Boolean ranContentWithCertErrors;

  private Boolean displayedContentWithCertErrors;

  private SecurityState ranInsecureContentStyle;

  private SecurityState displayedInsecureContentStyle;

  /**
   * Always false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getRanMixedContent() {
    return ranMixedContent;
  }

  /**
   * Always false.
   *
   * @param ranMixedContent a {@link java.lang.Boolean} object
   */
  public void setRanMixedContent(Boolean ranMixedContent) {
    this.ranMixedContent = ranMixedContent;
  }

  /**
   * Always false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDisplayedMixedContent() {
    return displayedMixedContent;
  }

  /**
   * Always false.
   *
   * @param displayedMixedContent a {@link java.lang.Boolean} object
   */
  public void setDisplayedMixedContent(Boolean displayedMixedContent) {
    this.displayedMixedContent = displayedMixedContent;
  }

  /**
   * Always false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getContainedMixedForm() {
    return containedMixedForm;
  }

  /**
   * Always false.
   *
   * @param containedMixedForm a {@link java.lang.Boolean} object
   */
  public void setContainedMixedForm(Boolean containedMixedForm) {
    this.containedMixedForm = containedMixedForm;
  }

  /**
   * Always false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getRanContentWithCertErrors() {
    return ranContentWithCertErrors;
  }

  /**
   * Always false.
   *
   * @param ranContentWithCertErrors a {@link java.lang.Boolean} object
   */
  public void setRanContentWithCertErrors(Boolean ranContentWithCertErrors) {
    this.ranContentWithCertErrors = ranContentWithCertErrors;
  }

  /**
   * Always false.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDisplayedContentWithCertErrors() {
    return displayedContentWithCertErrors;
  }

  /**
   * Always false.
   *
   * @param displayedContentWithCertErrors a {@link java.lang.Boolean} object
   */
  public void setDisplayedContentWithCertErrors(Boolean displayedContentWithCertErrors) {
    this.displayedContentWithCertErrors = displayedContentWithCertErrors;
  }

  /**
   * Always set to unknown.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public SecurityState getRanInsecureContentStyle() {
    return ranInsecureContentStyle;
  }

  /**
   * Always set to unknown.
   *
   * @param ranInsecureContentStyle a {@link
   *     com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public void setRanInsecureContentStyle(SecurityState ranInsecureContentStyle) {
    this.ranInsecureContentStyle = ranInsecureContentStyle;
  }

  /**
   * Always set to unknown.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public SecurityState getDisplayedInsecureContentStyle() {
    return displayedInsecureContentStyle;
  }

  /**
   * Always set to unknown.
   *
   * @param displayedInsecureContentStyle a {@link
   *     com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public void setDisplayedInsecureContentStyle(SecurityState displayedInsecureContentStyle) {
    this.displayedInsecureContentStyle = displayedInsecureContentStyle;
  }
}
