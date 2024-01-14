package com.github.testsmith.cdt.protocol.types.target;

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
 * TargetInfo class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TargetInfo {

  private String targetId;

  private String type;

  private String title;

  private String url;

  private Boolean attached;

  @Optional private String openerId;

  @Experimental private Boolean canAccessOpener;

  @Experimental @Optional private String openerFrameId;

  @Experimental @Optional private String browserContextId;

  /**
   * Getter for the field <code>targetId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTargetId() {
    return targetId;
  }

  /**
   * Setter for the field <code>targetId</code>.
   *
   * @param targetId a {@link java.lang.String} object
   */
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link java.lang.String} object
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for the field <code>title</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Setter for the field <code>title</code>.
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Getter for the field <code>url</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Setter for the field <code>url</code>.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Whether the target has an attached client.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAttached() {
    return attached;
  }

  /**
   * Whether the target has an attached client.
   *
   * @param attached a {@link java.lang.Boolean} object
   */
  public void setAttached(Boolean attached) {
    this.attached = attached;
  }

  /**
   * Opener target Id
   *
   * @return a {@link java.lang.String} object
   */
  public String getOpenerId() {
    return openerId;
  }

  /**
   * Opener target Id
   *
   * @param openerId a {@link java.lang.String} object
   */
  public void setOpenerId(String openerId) {
    this.openerId = openerId;
  }

  /**
   * Whether the target has access to the originating window.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCanAccessOpener() {
    return canAccessOpener;
  }

  /**
   * Whether the target has access to the originating window.
   *
   * @param canAccessOpener a {@link java.lang.Boolean} object
   */
  public void setCanAccessOpener(Boolean canAccessOpener) {
    this.canAccessOpener = canAccessOpener;
  }

  /**
   * Frame id of originating window (is only set if target has an opener).
   *
   * @return a {@link java.lang.String} object
   */
  public String getOpenerFrameId() {
    return openerFrameId;
  }

  /**
   * Frame id of originating window (is only set if target has an opener).
   *
   * @param openerFrameId a {@link java.lang.String} object
   */
  public void setOpenerFrameId(String openerFrameId) {
    this.openerFrameId = openerFrameId;
  }

  /**
   * Getter for the field <code>browserContextId</code>.
   *
   * @return a {@link java.lang.String} object
   */
  public String getBrowserContextId() {
    return browserContextId;
  }

  /**
   * Setter for the field <code>browserContextId</code>.
   *
   * @param browserContextId a {@link java.lang.String} object
   */
  public void setBrowserContextId(String browserContextId) {
    this.browserContextId = browserContextId;
  }
}
