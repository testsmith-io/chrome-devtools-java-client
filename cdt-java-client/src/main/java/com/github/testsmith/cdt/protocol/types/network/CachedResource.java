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

import com.github.testsmith.cdt.protocol.support.annotations.Optional;

/**
 * Information about the cached resource.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CachedResource {

  private String url;

  private ResourceType type;

  @Optional private Response response;

  private Double bodySize;

  /**
   * Resource URL. This is the url of the original network request.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Resource URL. This is the url of the original network request.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Type of this resource.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public ResourceType getType() {
    return type;
  }

  /**
   * Type of this resource.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.network.ResourceType} object
   */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /**
   * Cached response data.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public Response getResponse() {
    return response;
  }

  /**
   * Cached response data.
   *
   * @param response a {@link com.github.testsmith.cdt.protocol.types.network.Response} object
   */
  public void setResponse(Response response) {
    this.response = response;
  }

  /**
   * Cached response body size.
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getBodySize() {
    return bodySize;
  }

  /**
   * Cached response body size.
   *
   * @param bodySize a {@link java.lang.Double} object
   */
  public void setBodySize(Double bodySize) {
    this.bodySize = bodySize;
  }
}
