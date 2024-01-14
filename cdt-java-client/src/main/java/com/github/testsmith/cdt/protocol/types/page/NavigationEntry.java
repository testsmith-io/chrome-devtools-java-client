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

/**
 * Navigation history entry.
 *
 * @author roy
 * @version $Id: $Id
 */
public class NavigationEntry {

  private Integer id;

  private String url;

  private String userTypedURL;

  private String title;

  private TransitionType transitionType;

  /**
   * Unique id of the navigation history entry.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getId() {
    return id;
  }

  /**
   * Unique id of the navigation history entry.
   *
   * @param id a {@link java.lang.Integer} object
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * URL of the navigation history entry.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of the navigation history entry.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * URL that the user typed in the url bar.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserTypedURL() {
    return userTypedURL;
  }

  /**
   * URL that the user typed in the url bar.
   *
   * @param userTypedURL a {@link java.lang.String} object
   */
  public void setUserTypedURL(String userTypedURL) {
    this.userTypedURL = userTypedURL;
  }

  /**
   * Title of the navigation history entry.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Title of the navigation history entry.
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Transition type.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.TransitionType} object
   */
  public TransitionType getTransitionType() {
    return transitionType;
  }

  /**
   * Transition type.
   *
   * @param transitionType a {@link com.github.testsmith.cdt.protocol.types.page.TransitionType}
   *     object
   */
  public void setTransitionType(TransitionType transitionType) {
    this.transitionType = transitionType;
  }
}
