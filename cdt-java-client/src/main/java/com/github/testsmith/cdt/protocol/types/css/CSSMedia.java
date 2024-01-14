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
import java.util.List;

/**
 * CSS media rule descriptor.
 *
 * @author roy
 * @version $Id: $Id
 */
public class CSSMedia {

  private String text;

  private CSSMediaSource source;

  @Optional private String sourceURL;

  @Optional private SourceRange range;

  @Optional private String styleSheetId;

  @Optional private List<MediaQuery> mediaList;

  /**
   * Media query text.
   *
   * @return a {@link java.lang.String} object
   */
  public String getText() {
    return text;
  }

  /**
   * Media query text.
   *
   * @param text a {@link java.lang.String} object
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if specified
   * by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked stylesheet's
   * LINK tag, "inlineSheet" if specified by a "media" attribute in an inline stylesheet's STYLE
   * tag.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSMediaSource} object
   */
  public CSSMediaSource getSource() {
    return source;
  }

  /**
   * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if specified
   * by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked stylesheet's
   * LINK tag, "inlineSheet" if specified by a "media" attribute in an inline stylesheet's STYLE
   * tag.
   *
   * @param source a {@link com.github.testsmith.cdt.protocol.types.css.CSSMediaSource} object
   */
  public void setSource(CSSMediaSource source) {
    this.source = source;
  }

  /**
   * URL of the document containing the media query description.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSourceURL() {
    return sourceURL;
  }

  /**
   * URL of the document containing the media query description.
   *
   * @param sourceURL a {@link java.lang.String} object
   */
  public void setSourceURL(String sourceURL) {
    this.sourceURL = sourceURL;
  }

  /**
   * The associated rule (@media or @import) header range in the enclosing stylesheet (if
   * available).
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public SourceRange getRange() {
    return range;
  }

  /**
   * The associated rule (@media or @import) header range in the enclosing stylesheet (if
   * available).
   *
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   */
  public void setRange(SourceRange range) {
    this.range = range;
  }

  /**
   * Identifier of the stylesheet containing this object (if exists).
   *
   * @return a {@link java.lang.String} object
   */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /**
   * Identifier of the stylesheet containing this object (if exists).
   *
   * @param styleSheetId a {@link java.lang.String} object
   */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }

  /**
   * Array of media queries.
   *
   * @return a {@link java.util.List} object
   */
  public List<MediaQuery> getMediaList() {
    return mediaList;
  }

  /**
   * Array of media queries.
   *
   * @param mediaList a {@link java.util.List} object
   */
  public void setMediaList(List<MediaQuery> mediaList) {
    this.mediaList = mediaList;
  }
}
