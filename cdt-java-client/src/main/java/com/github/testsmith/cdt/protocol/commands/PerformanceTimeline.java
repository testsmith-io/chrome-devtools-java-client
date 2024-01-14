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

import com.github.testsmith.cdt.protocol.events.performancetimeline.TimelineEventAdded;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import java.util.List;

/**
 * Reporting of performance timeline events, as specified in
 * https://w3c.github.io/performance-timeline/#dom-performanceobserver.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface PerformanceTimeline {

  /**
   * Previously buffered events would be reported before method returns. See also:
   * timelineEventAdded
   *
   * @param eventTypes The types of event to report, as specified in
   *     https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype The specified
   *     filter overrides any previous filters, passing empty filter disables recording. Note that
   *     not all types exposed to the web platform are currently supported.
   */
  void enable(@ParamName("eventTypes") List<String> eventTypes);

  /**
   * Sent when a performance timeline event is added. See reportPerformanceTimeline method.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("timelineEventAdded")
  EventListener onTimelineEventAdded(EventHandler<TimelineEventAdded> eventListener);
}
