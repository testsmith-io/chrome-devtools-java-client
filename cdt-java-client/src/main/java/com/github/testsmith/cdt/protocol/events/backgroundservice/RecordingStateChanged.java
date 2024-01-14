package com.github.testsmith.cdt.protocol.events.backgroundservice;

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

import com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName;

/**
 * Called when the recording state for the service has been updated.
 *
 * @author roy
 * @version $Id: $Id
 */
public class RecordingStateChanged {

  private Boolean isRecording;

  private ServiceName service;

  /**
   * Getter for the field <code>isRecording</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsRecording() {
    return isRecording;
  }

  /**
   * Setter for the field <code>isRecording</code>.
   *
   * @param isRecording a {@link java.lang.Boolean} object
   */
  public void setIsRecording(Boolean isRecording) {
    this.isRecording = isRecording;
  }

  /**
   * Getter for the field <code>service</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName} object
   */
  public ServiceName getService() {
    return service;
  }

  /**
   * Setter for the field <code>service</code>.
   *
   * @param service a {@link com.github.testsmith.cdt.protocol.types.backgroundservice.ServiceName}
   *     object
   */
  public void setService(ServiceName service) {
    this.service = service;
  }
}
