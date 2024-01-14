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

import com.github.testsmith.cdt.protocol.events.webaudio.*;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.webaudio.ContextRealtimeData;

/**
 * This domain allows inspection of Web Audio API. https://webaudio.github.io/web-audio-api/
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface WebAudio {

  /** Enables the WebAudio domain and starts sending context lifetime events. */
  void enable();

  /** Disables the WebAudio domain. */
  void disable();

  /**
   * Fetch the realtime data from the registered contexts.
   *
   * @param contextId a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.webaudio.ContextRealtimeData} object
   */
  @Returns("realtimeData")
  ContextRealtimeData getRealtimeData(@ParamName("contextId") String contextId);

  /**
   * Notifies that a new BaseAudioContext has been created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("contextCreated")
  EventListener onContextCreated(EventHandler<ContextCreated> eventListener);

  /**
   * Notifies that an existing BaseAudioContext will be destroyed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("contextWillBeDestroyed")
  EventListener onContextWillBeDestroyed(EventHandler<ContextWillBeDestroyed> eventListener);

  /**
   * Notifies that existing BaseAudioContext has changed some properties (id stays the same)..
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("contextChanged")
  EventListener onContextChanged(EventHandler<ContextChanged> eventListener);

  /**
   * Notifies that the construction of an AudioListener has finished.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioListenerCreated")
  EventListener onAudioListenerCreated(EventHandler<AudioListenerCreated> eventListener);

  /**
   * Notifies that a new AudioListener has been created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioListenerWillBeDestroyed")
  EventListener onAudioListenerWillBeDestroyed(
      EventHandler<AudioListenerWillBeDestroyed> eventListener);

  /**
   * Notifies that a new AudioNode has been created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioNodeCreated")
  EventListener onAudioNodeCreated(EventHandler<AudioNodeCreated> eventListener);

  /**
   * Notifies that an existing AudioNode has been destroyed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioNodeWillBeDestroyed")
  EventListener onAudioNodeWillBeDestroyed(EventHandler<AudioNodeWillBeDestroyed> eventListener);

  /**
   * Notifies that a new AudioParam has been created.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioParamCreated")
  EventListener onAudioParamCreated(EventHandler<AudioParamCreated> eventListener);

  /**
   * Notifies that an existing AudioParam has been destroyed.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("audioParamWillBeDestroyed")
  EventListener onAudioParamWillBeDestroyed(EventHandler<AudioParamWillBeDestroyed> eventListener);

  /**
   * Notifies that two AudioNodes are connected.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("nodesConnected")
  EventListener onNodesConnected(EventHandler<NodesConnected> eventListener);

  /**
   * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the
   * outgoing connections from the source are disconnected.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("nodesDisconnected")
  EventListener onNodesDisconnected(EventHandler<NodesDisconnected> eventListener);

  /**
   * Notifies that an AudioNode is connected to an AudioParam.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("nodeParamConnected")
  EventListener onNodeParamConnected(EventHandler<NodeParamConnected> eventListener);

  /**
   * Notifies that an AudioNode is disconnected to an AudioParam.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("nodeParamDisconnected")
  EventListener onNodeParamDisconnected(EventHandler<NodeParamDisconnected> eventListener);
}
