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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * An explanation of an factor contributing to the security state.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SecurityStateExplanation {

  private SecurityState securityState;

  private String title;

  private String summary;

  private String description;

  private MixedContentType mixedContentType;

  private List<String> certificate;

  @Optional private List<String> recommendations;

  /**
   * Security state representing the severity of the factor being explained.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState} object
   */
  public SecurityState getSecurityState() {
    return securityState;
  }

  /**
   * Security state representing the severity of the factor being explained.
   *
   * @param securityState a {@link com.github.testsmith.cdt.protocol.types.security.SecurityState}
   *     object
   */
  public void setSecurityState(SecurityState securityState) {
    this.securityState = securityState;
  }

  /**
   * Title describing the type of factor.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Title describing the type of factor.
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Short phrase describing the type of factor.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Short phrase describing the type of factor.
   *
   * @param summary a {@link java.lang.String} object
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Full text explanation of the factor.
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * Full text explanation of the factor.
   *
   * @param description a {@link java.lang.String} object
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of mixed content described by the explanation.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.security.MixedContentType} object
   */
  public MixedContentType getMixedContentType() {
    return mixedContentType;
  }

  /**
   * The type of mixed content described by the explanation.
   *
   * @param mixedContentType a {@link
   *     com.github.testsmith.cdt.protocol.types.security.MixedContentType} object
   */
  public void setMixedContentType(MixedContentType mixedContentType) {
    this.mixedContentType = mixedContentType;
  }

  /**
   * Page certificate.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getCertificate() {
    return certificate;
  }

  /**
   * Page certificate.
   *
   * @param certificate a {@link java.util.List} object
   */
  public void setCertificate(List<String> certificate) {
    this.certificate = certificate;
  }

  /**
   * Recommendations to fix any issues.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getRecommendations() {
    return recommendations;
  }

  /**
   * Recommendations to fix any issues.
   *
   * @param recommendations a {@link java.util.List} object
   */
  public void setRecommendations(List<String> recommendations) {
    this.recommendations = recommendations;
  }
}
