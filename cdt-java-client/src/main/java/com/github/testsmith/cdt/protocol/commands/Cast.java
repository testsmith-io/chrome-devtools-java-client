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

import com.github.testsmith.cdt.protocol.events.cast.IssueUpdated;
import com.github.testsmith.cdt.protocol.events.cast.SinksUpdated;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.Optional;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;

/**
 * A domain for interacting with Cast, Presentation API, and Remote Playback API functionalities.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface Cast {

  /**
   * Starts observing for sinks that can be used for tab mirroring, and if set, sinks compatible
   * with |presentationUrl| as well. When sinks are found, a |sinksUpdated| event is fired. Also
   * starts observing for issue messages. When an issue is added or removed, an |issueUpdated| event
   * is fired.
   */
  void enable();

  /**
   * Starts observing for sinks that can be used for tab mirroring, and if set, sinks compatible
   * with |presentationUrl| as well. When sinks are found, a |sinksUpdated| event is fired. Also
   * starts observing for issue messages. When an issue is added or removed, an |issueUpdated| event
   * is fired.
   *
   * @param presentationUrl a {@link java.lang.String} object
   */
  void enable(@Optional @ParamName("presentationUrl") String presentationUrl);

  /** Stops observing for sinks and issues. */
  void disable();

  /**
   * Sets a sink to be used when the web page requests the browser to choose a sink via Presentation
   * API, Remote Playback API, or Cast SDK.
   *
   * @param sinkName a {@link java.lang.String} object
   */
  void setSinkToUse(@ParamName("sinkName") String sinkName);

  /**
   * Starts mirroring the tab to the sink.
   *
   * @param sinkName a {@link java.lang.String} object
   */
  void startTabMirroring(@ParamName("sinkName") String sinkName);

  /**
   * Stops the active Cast session on the sink.
   *
   * @param sinkName a {@link java.lang.String} object
   */
  void stopCasting(@ParamName("sinkName") String sinkName);

  /**
   * This is fired whenever the list of available sinks changes. A sink is a device or a software
   * surface that you can cast to.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("sinksUpdated")
  EventListener onSinksUpdated(EventHandler<SinksUpdated> eventListener);

  /**
   * This is fired whenever the outstanding issue/error message changes. |issueMessage| is empty if
   * there is no issue.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("issueUpdated")
  EventListener onIssueUpdated(EventHandler<IssueUpdated> eventListener);
}
