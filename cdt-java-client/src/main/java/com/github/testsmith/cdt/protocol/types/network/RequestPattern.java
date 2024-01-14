package com.github.testsmith.cdt.protocol.types.network;

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
 * Request pattern for interception.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class RequestPattern {

  @Optional private String urlPattern;

  @Optional private ResourceType resourceType;

  @Optional private InterceptionStage interceptionStage;

  /**
   * Wildcards ('*' -&gt; zero or more, '?' -&gt; exactly one) are allowed. Escape character is
   * backslash. Omitting is equivalent to "*".
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrlPattern() {
    return urlPattern;
  }

  /**
   * Wildcards ('*' -&gt; zero or more, '?' -&gt; exactly one) are allowed. Escape character is
   * backslash. Omitting is equivalent to "*".
   *
   * @param urlPattern a {@link java.lang.String} object
   */
  public void setUrlPattern(String urlPattern) {
    this.urlPattern = urlPattern;
  }

  /**
   * If set, only requests for matching resource types will be intercepted.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getResourceType() {
    return resourceType;
  }

  /**
   * If set, only requests for matching resource types will be intercepted.
   *
   * @param resourceType a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType}
   *     object
   */
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Stage at which to begin intercepting requests. Default is Request.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.InterceptionStage} object
   */
  public InterceptionStage getInterceptionStage() {
    return interceptionStage;
  }

  /**
   * Stage at which to begin intercepting requests. Default is Request.
   *
   * @param interceptionStage a {@link
   *     com.github.testsmith.cdt.protocol.types.network.InterceptionStage} object
   */
  public void setInterceptionStage(InterceptionStage interceptionStage) {
    this.interceptionStage = interceptionStage;
  }
}
