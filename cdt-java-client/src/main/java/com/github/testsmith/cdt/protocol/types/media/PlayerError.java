package com.github.testsmith.cdt.protocol.types.media;

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
 * Corresponds to kMediaError
 *
 * @author roy
 * @version $Id: $Id
 */
public class PlayerError {

  private PlayerErrorType type;

  private String errorCode;

  /**
   * Getter for the field <code>type</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.media.PlayerErrorType} object
   */
  public PlayerErrorType getType() {
    return type;
  }

  /**
   * Setter for the field <code>type</code>.
   *
   * @param type a {@link com.github.testsmith.cdt.protocol.types.media.PlayerErrorType} object
   */
  public void setType(PlayerErrorType type) {
    this.type = type;
  }

  /**
   * When this switches to using media::Status instead of PipelineStatus we can remove "errorCode"
   * and replace it with the fields from a Status instance. This also seems like a duplicate of the
   * error level enum - there is a todo bug to have that level removed and use this instead.
   * (crbug.com/1068454)
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * When this switches to using media::Status instead of PipelineStatus we can remove "errorCode"
   * and replace it with the fields from a Status instance. This also seems like a duplicate of the
   * error level enum - there is a todo bug to have that level removed and use this instead.
   * (crbug.com/1068454)
   *
   * @param errorCode a {@link java.lang.String} object
   */
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
}
