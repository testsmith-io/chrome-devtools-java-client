package com.github.testsmith.cdt.protocol.commands;

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

import com.github.testsmith.cdt.protocol.events.css.*;
import com.github.testsmith.cdt.protocol.support.annotations.*;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.css.*;
import java.util.List;

/**
 * This domain exposes CSS read/write operations. All CSS objects (stylesheets, rules, and styles)
 * have an associated `id` used in subsequent operations on the related object. Each object type has
 * a specific `id` structure, and those are not interchangeable between objects of different kinds.
 * CSS objects can be loaded using the `get*ForNode()` calls (which accept a DOM node id). A client
 * can also keep track of stylesheets via the `styleSheetAdded`/`styleSheetRemoved` events and
 * subsequently load the required stylesheet contents using the `getStyleSheet[Text]()` methods.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface CSS {

  /**
   * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
   * position specified by `location`.
   *
   * @param styleSheetId The css style sheet identifier where a new rule should be inserted.
   * @param ruleText The text of a new rule.
   * @param location Text position of a new rule in the target style sheet.
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSRule} object
   */
  @Returns("rule")
  CSSRule addRule(
      @ParamName("styleSheetId") String styleSheetId,
      @ParamName("ruleText") String ruleText,
      @ParamName("location") SourceRange location);

  /**
   * Returns all class names from specified stylesheet.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @return a {@link java.util.List} object
   */
  @Returns("classNames")
  @ReturnTypeParameter(String.class)
  List<String> collectClassNames(@ParamName("styleSheetId") String styleSheetId);

  /**
   * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
   *
   * @param frameId Identifier of the frame where "via-inspector" stylesheet should be created.
   * @return a {@link java.lang.String} object
   */
  @Returns("styleSheetId")
  String createStyleSheet(@ParamName("frameId") String frameId);

  /** Disables the CSS agent for the given page. */
  void disable();

  /**
   * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
   * enabled until the result of this command is received.
   */
  void enable();

  /**
   * Ensures that the given node will have specified pseudo-classes whenever its style is computed
   * by the browser.
   *
   * @param nodeId The element id for which to force the pseudo state.
   * @param forcedPseudoClasses Element pseudo classes to force when computing the element's style.
   */
  void forcePseudoState(
      @ParamName("nodeId") Integer nodeId,
      @ParamName("forcedPseudoClasses") List<String> forcedPseudoClasses);

  /** @param nodeId Id of the node to get background colors for. */
  /**
   * getBackgroundColors.
   *
   * @param nodeId a {@link java.lang.Integer} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.BackgroundColors} object
   */
  BackgroundColors getBackgroundColors(@ParamName("nodeId") Integer nodeId);

  /**
   * Returns the computed style for a DOM node identified by `nodeId`.
   *
   * @param nodeId a {@link java.lang.Integer} object
   * @return a {@link java.util.List} object
   */
  @Returns("computedStyle")
  @ReturnTypeParameter(CSSComputedStyleProperty.class)
  List<CSSComputedStyleProperty> getComputedStyleForNode(@ParamName("nodeId") Integer nodeId);

  /**
   * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using
   * DOM attributes) for a DOM node identified by `nodeId`.
   *
   * @param nodeId a {@link java.lang.Integer} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.InlineStylesForNode} object
   */
  InlineStylesForNode getInlineStylesForNode(@ParamName("nodeId") Integer nodeId);

  /**
   * Returns requested styles for a DOM node identified by `nodeId`.
   *
   * @param nodeId a {@link java.lang.Integer} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.MatchedStylesForNode} object
   */
  MatchedStylesForNode getMatchedStylesForNode(@ParamName("nodeId") Integer nodeId);

  /**
   * Returns all media queries parsed by the rendering engine.
   *
   * @return a {@link java.util.List} object
   */
  @Returns("medias")
  @ReturnTypeParameter(CSSMedia.class)
  List<CSSMedia> getMediaQueries();

  /**
   * Requests information about platform fonts which we used to render child TextNodes in the given
   * node.
   *
   * @param nodeId a {@link java.lang.Integer} object
   * @return a {@link java.util.List} object
   */
  @Returns("fonts")
  @ReturnTypeParameter(PlatformFontUsage.class)
  List<PlatformFontUsage> getPlatformFontsForNode(@ParamName("nodeId") Integer nodeId);

  /**
   * Returns the current textual content for a stylesheet.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  @Returns("text")
  String getStyleSheetText(@ParamName("styleSheetId") String styleSheetId);

  /**
   * Starts tracking the given computed styles for updates. The specified array of properties
   * replaces the one previously specified. Pass empty array to disable tracking. Use
   * takeComputedStyleUpdates to retrieve the list of nodes that had properties modified. The
   * changes to computed style properties are only tracked for nodes pushed to the front-end by the
   * DOM agent. If no changes to the tracked properties occur after the node has been pushed to the
   * front-end, no updates will be issued for the node.
   *
   * @param propertiesToTrack a {@link java.util.List} object
   */
  @Experimental
  void trackComputedStyleUpdates(
      @ParamName("propertiesToTrack") List<CSSComputedStyleProperty> propertiesToTrack);

  /**
   * Polls the next batch of computed style updates.
   *
   * @return a {@link java.util.List} object
   */
  @Experimental
  @Returns("nodeIds")
  @ReturnTypeParameter(Integer.class)
  List<Integer> takeComputedStyleUpdates();

  /**
   * Find a rule with the given active property for the given node and set the new value for this
   * property
   *
   * @param nodeId The element id for which to set property.
   * @param propertyName a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   */
  void setEffectivePropertyValueForNode(
      @ParamName("nodeId") Integer nodeId,
      @ParamName("propertyName") String propertyName,
      @ParamName("value") String value);

  /**
   * Modifies the keyframe rule key text.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   * @param keyText a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.Value} object
   */
  @Returns("keyText")
  Value setKeyframeKey(
      @ParamName("styleSheetId") String styleSheetId,
      @ParamName("range") SourceRange range,
      @ParamName("keyText") String keyText);

  /**
   * Modifies the rule selector.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   * @param text a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.CSSMedia} object
   */
  @Returns("media")
  CSSMedia setMediaText(
      @ParamName("styleSheetId") String styleSheetId,
      @ParamName("range") SourceRange range,
      @ParamName("text") String text);

  /**
   * Modifies the rule selector.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @param range a {@link com.github.testsmith.cdt.protocol.types.css.SourceRange} object
   * @param selector a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.SelectorList} object
   */
  @Returns("selectorList")
  SelectorList setRuleSelector(
      @ParamName("styleSheetId") String styleSheetId,
      @ParamName("range") SourceRange range,
      @ParamName("selector") String selector);

  /**
   * Sets the new stylesheet text.
   *
   * @param styleSheetId a {@link java.lang.String} object
   * @param text a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  @Returns("sourceMapURL")
  String setStyleSheetText(
      @ParamName("styleSheetId") String styleSheetId, @ParamName("text") String text);

  /**
   * Applies specified style edits one after another in the given order.
   *
   * @param edits a {@link java.util.List} object
   * @return a {@link java.util.List} object
   */
  @Returns("styles")
  @ReturnTypeParameter(CSSStyle.class)
  List<CSSStyle> setStyleTexts(@ParamName("edits") List<StyleDeclarationEdit> edits);

  /** Enables the selector recording. */
  void startRuleUsageTracking();

  /**
   * Stop tracking rule usage and return the list of rules that were used since last call to
   * `takeCoverageDelta` (or since start of coverage instrumentation)
   *
   * @return a {@link java.util.List} object
   */
  @Returns("ruleUsage")
  @ReturnTypeParameter(RuleUsage.class)
  List<RuleUsage> stopRuleUsageTracking();

  /**
   * Obtain list of rules that became used since last call to this method (or since start of
   * coverage instrumentation)
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.css.TakeCoverageDelta} object
   */
  TakeCoverageDelta takeCoverageDelta();

  /**
   * Enables/disables rendering of local CSS fonts (enabled by default).
   *
   * @param enabled Whether rendering of local fonts is enabled.
   */
  @Experimental
  void setLocalFontsEnabled(@ParamName("enabled") Boolean enabled);

  /**
   * Fires whenever a web font is updated. A non-empty font parameter indicates a successfully
   * loaded web font
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("fontsUpdated")
  EventListener onFontsUpdated(EventHandler<FontsUpdated> eventListener);

  /**
   * Fires whenever a MediaQuery result changes (for example, after a browser window has been
   * resized.) The current implementation considers only viewport-dependent media features.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("mediaQueryResultChanged")
  EventListener onMediaQueryResultChanged(EventHandler<MediaQueryResultChanged> eventListener);

  /**
   * Fired whenever an active document stylesheet is added.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("styleSheetAdded")
  EventListener onStyleSheetAdded(EventHandler<StyleSheetAdded> eventListener);

  /**
   * Fired whenever a stylesheet is changed as a result of the client operation.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("styleSheetChanged")
  EventListener onStyleSheetChanged(EventHandler<StyleSheetChanged> eventListener);

  /**
   * Fired whenever an active document stylesheet is removed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("styleSheetRemoved")
  EventListener onStyleSheetRemoved(EventHandler<StyleSheetRemoved> eventListener);
}
