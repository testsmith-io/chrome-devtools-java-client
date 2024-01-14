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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Information about the Frame on the page.
 *
 * @author roy
 * @version $Id: $Id
 */
public class Frame {

  private String id;

  @Optional private String parentId;

  private String loaderId;

  @Optional private String name;

  private String url;

  @Experimental @Optional private String urlFragment;

  @Experimental private String domainAndRegistry;

  private String securityOrigin;

  private String mimeType;

  @Experimental @Optional private String unreachableUrl;

  @Experimental @Optional private AdFrameType adFrameType;

  @Experimental private SecureContextType secureContextType;

  @Experimental private CrossOriginIsolatedContextType crossOriginIsolatedContextType;

  @Experimental private List<GatedAPIFeatures> gatedAPIFeatures;

  /**
   * Frame unique identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * Frame unique identifier.
   *
   * @param id a {@link java.lang.String} object
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Parent frame identifier.
   *
   * @return a {@link java.lang.String} object
   */
  public String getParentId() {
    return parentId;
  }

  /**
   * Parent frame identifier.
   *
   * @param parentId a {@link java.lang.String} object
   */
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Identifier of the loader associated with this frame.
   *
   * @return a {@link java.lang.String} object
   */
  public String getLoaderId() {
    return loaderId;
  }

  /**
   * Identifier of the loader associated with this frame.
   *
   * @param loaderId a {@link java.lang.String} object
   */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /**
   * Frame's name as specified in the tag.
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * Frame's name as specified in the tag.
   *
   * @param name a {@link java.lang.String} object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Frame document's URL without fragment.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * Frame document's URL without fragment.
   *
   * @param url a {@link java.lang.String} object
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Frame document's URL fragment including the '#'.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrlFragment() {
    return urlFragment;
  }

  /**
   * Frame document's URL fragment including the '#'.
   *
   * @param urlFragment a {@link java.lang.String} object
   */
  public void setUrlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
  }

  /**
   * Frame document's registered domain, taking the public suffixes list into account. Extracted
   * from the Frame's url. Example URLs: http://www.google.com/file.html -&gt; "google.com"
   * http://a.b.co.uk/file.html -&gt; "b.co.uk"
   *
   * @return a {@link java.lang.String} object
   */
  public String getDomainAndRegistry() {
    return domainAndRegistry;
  }

  /**
   * Frame document's registered domain, taking the public suffixes list into account. Extracted
   * from the Frame's url. Example URLs: http://www.google.com/file.html -&gt; "google.com"
   * http://a.b.co.uk/file.html -&gt; "b.co.uk"
   *
   * @param domainAndRegistry a {@link java.lang.String} object
   */
  public void setDomainAndRegistry(String domainAndRegistry) {
    this.domainAndRegistry = domainAndRegistry;
  }

  /**
   * Frame document's security origin.
   *
   * @return a {@link java.lang.String} object
   */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /**
   * Frame document's security origin.
   *
   * @param securityOrigin a {@link java.lang.String} object
   */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /**
   * Frame document's mimeType as determined by the browser.
   *
   * @return a {@link java.lang.String} object
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Frame document's mimeType as determined by the browser.
   *
   * @param mimeType a {@link java.lang.String} object
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike
   * url above, this URL may contain a fragment.
   *
   * @return a {@link java.lang.String} object
   */
  public String getUnreachableUrl() {
    return unreachableUrl;
  }

  /**
   * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike
   * url above, this URL may contain a fragment.
   *
   * @param unreachableUrl a {@link java.lang.String} object
   */
  public void setUnreachableUrl(String unreachableUrl) {
    this.unreachableUrl = unreachableUrl;
  }

  /**
   * Indicates whether this frame was tagged as an ad.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.AdFrameType} object
   */
  public AdFrameType getAdFrameType() {
    return adFrameType;
  }

  /**
   * Indicates whether this frame was tagged as an ad.
   *
   * @param adFrameType a {@link com.github.testsmith.cdt.protocol.types.page.AdFrameType} object
   */
  public void setAdFrameType(AdFrameType adFrameType) {
    this.adFrameType = adFrameType;
  }

  /**
   * Indicates whether the main document is a secure context and explains why that is the case.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.SecureContextType} object
   */
  public SecureContextType getSecureContextType() {
    return secureContextType;
  }

  /**
   * Indicates whether the main document is a secure context and explains why that is the case.
   *
   * @param secureContextType a {@link
   *     com.github.testsmith.cdt.protocol.types.page.SecureContextType} object
   */
  public void setSecureContextType(SecureContextType secureContextType) {
    this.secureContextType = secureContextType;
  }

  /**
   * Indicates whether this is a cross origin isolated context.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.page.CrossOriginIsolatedContextType}
   *     object
   */
  public CrossOriginIsolatedContextType getCrossOriginIsolatedContextType() {
    return crossOriginIsolatedContextType;
  }

  /**
   * Indicates whether this is a cross origin isolated context.
   *
   * @param crossOriginIsolatedContextType a {@link
   *     com.github.testsmith.cdt.protocol.types.page.CrossOriginIsolatedContextType} object
   */
  public void setCrossOriginIsolatedContextType(
      CrossOriginIsolatedContextType crossOriginIsolatedContextType) {
    this.crossOriginIsolatedContextType = crossOriginIsolatedContextType;
  }

  /**
   * Indicated which gated APIs / features are available.
   *
   * @return a {@link java.util.List} object
   */
  public List<GatedAPIFeatures> getGatedAPIFeatures() {
    return gatedAPIFeatures;
  }

  /**
   * Indicated which gated APIs / features are available.
   *
   * @param gatedAPIFeatures a {@link java.util.List} object
   */
  public void setGatedAPIFeatures(List<GatedAPIFeatures> gatedAPIFeatures) {
    this.gatedAPIFeatures = gatedAPIFeatures;
  }
}
