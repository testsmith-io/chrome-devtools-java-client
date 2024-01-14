package com.github.testsmith.cdt.protocol.types.css;

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
 * CSS stylesheet metainformation.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSStyleSheetHeader {

  private String styleSheetId;

  private String frameId;

  private String sourceURL;

  @Optional private String sourceMapURL;

  private StyleSheetOrigin origin;

  private String title;

  @Optional private Integer ownerNode;

  private Boolean disabled;

  @Optional private Boolean hasSourceURL;

  private Boolean isInline;

  private Boolean isMutable;

  private Boolean isConstructed;

  private Double startLine;

  private Double startColumn;

  private Double length;

  private Double endLine;

  private Double endColumn;

  /**
   * The stylesheet identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /**
   * The stylesheet identifier.
   *
   * @param styleSheetId a {@link java.lang.String} object
   */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }

  /**
   * Owner frame identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * Owner frame identifier.
   *
   * @param frameId a {@link java.lang.String} object
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Stylesheet resource URL.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceURL() {
    return sourceURL;
  }

  /**
   * Stylesheet resource URL.
   *
   * @param sourceURL a {@link java.lang.String} object
   */
  public void setSourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
  }

  /**
   * URL of source map associated with the stylesheet (if any).
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceMapURL() {
    return sourceMapURL;
  }

  /**
   * URL of source map associated with the stylesheet (if any).
   *
   * @param sourceMapURL a {@link java.lang.String} object
   */
  public void setSourceMapURL(String sourceMapURL) {
    this.sourceMapURL = sourceMapURL;
  }

  /**
   * Stylesheet origin.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.StyleSheetOrigin} object
   */
  public StyleSheetOrigin getOrigin() {
    return origin;
  }

  /**
   * Stylesheet origin.
   *
   * @param origin a {@link com.github.testsmith.cdt.protocol.types.css.StyleSheetOrigin} object
   */
  public void setOrigin(StyleSheetOrigin origin) {
    this.origin = origin;
  }

  /**
   * Stylesheet title.
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * Stylesheet title.
   *
   * @param title a {@link java.lang.String} object
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The backend id for the owner node of the stylesheet.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getOwnerNode() {
    return ownerNode;
  }

  /**
   * The backend id for the owner node of the stylesheet.
   *
   * @param ownerNode a {@link java.lang.Integer} object
   */
  public void setOwnerNode(Integer ownerNode) {
    this.ownerNode = ownerNode;
  }

  /**
   * Denotes whether the stylesheet is disabled.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDisabled() {
    return disabled;
  }

  /**
   * Denotes whether the stylesheet is disabled.
   *
   * @param disabled a {@link java.lang.Boolean} object
   */
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  /**
   * Whether the sourceURL field value comes from the sourceURL comment.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getHasSourceURL() {
    return hasSourceURL;
  }

  /**
   * Whether the sourceURL field value comes from the sourceURL comment.
   *
   * @param hasSourceURL a {@link java.lang.Boolean} object
   */
  public void setHasSourceURL(Boolean hasSourceURL) {
    this.hasSourceURL = hasSourceURL;
  }

  /**
   * Whether this stylesheet is created for STYLE tag by parser. This flag is not set for
   * document.written STYLE tags.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsInline() {
    return isInline;
  }

  /**
   * Whether this stylesheet is created for STYLE tag by parser. This flag is not set for
   * document.written STYLE tags.
   *
   * @param isInline a {@link java.lang.Boolean} object
   */
  public void setIsInline(Boolean isInline) {
    this.isInline = isInline;
  }

  /**
   * Whether this stylesheet is mutable. Inline stylesheets become mutable after they have been
   * modified via CSSOM API. &lt;link&gt; element's stylesheets become mutable only if DevTools
   * modifies them. Constructed stylesheets (new CSSStyleSheet()) are mutable immediately after
   * creation.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsMutable() {
    return isMutable;
  }

  /**
   * Whether this stylesheet is mutable. Inline stylesheets become mutable after they have been
   * modified via CSSOM API. &lt;link&gt; element's stylesheets become mutable only if DevTools
   * modifies them. Constructed stylesheets (new CSSStyleSheet()) are mutable immediately after
   * creation.
   *
   * @param isMutable a {@link java.lang.Boolean} object
   */
  public void setIsMutable(Boolean isMutable) {
    this.isMutable = isMutable;
  }

  /**
   * Whether this stylesheet is a constructed stylesheet (created using new CSSStyleSheet()).
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsConstructed() {
    return isConstructed;
  }

  /**
   * Whether this stylesheet is a constructed stylesheet (created using new CSSStyleSheet()).
   *
   * @param isConstructed a {@link java.lang.Boolean} object
   */
  public void setIsConstructed(Boolean isConstructed) {
    this.isConstructed = isConstructed;
  }

  /**
   * Line offset of the stylesheet within the resource (zero based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getStartLine() {
    return startLine;
  }

  /**
   * Line offset of the stylesheet within the resource (zero based).
   *
   * @param startLine a {@link java.lang.Double} object
   */
  public void setStartLine(Double startLine) {
    this.startLine = startLine;
  }

  /**
   * Column offset of the stylesheet within the resource (zero based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getStartColumn() {
    return startColumn;
  }

  /**
   * Column offset of the stylesheet within the resource (zero based).
   *
   * @param startColumn a {@link java.lang.Double} object
   */
  public void setStartColumn(Double startColumn) {
    this.startColumn = startColumn;
  }

  /**
   * Size of the content (in characters).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getLength() {
    return length;
  }

  /**
   * Size of the content (in characters).
   *
   * @param length a {@link java.lang.Double} object
   */
  public void setLength(Double length) {
    this.length = length;
  }

  /**
   * Line offset of the end of the stylesheet within the resource (zero based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEndLine() {
    return endLine;
  }

  /**
   * Line offset of the end of the stylesheet within the resource (zero based).
   *
   * @param endLine a {@link java.lang.Double} object
   */
  public void setEndLine(Double endLine) {
    this.endLine = endLine;
  }

  /**
   * Column offset of the end of the stylesheet within the resource (zero based).
   *
   * @return a {@link java.lang.Double} object
   */
  public Double getEndColumn() {
    return endColumn;
  }

  /**
   * Column offset of the end of the stylesheet within the resource (zero based).
   *
   * @param endColumn a {@link java.lang.Double} object
   */
  public void setEndColumn(Double endColumn) {
    this.endColumn = endColumn;
  }
}
