package com.github.testsmith.cdt.protocol.events.heapprofiler;

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
 * ReportHeapSnapshotProgress class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ReportHeapSnapshotProgress {

  private Integer done;

  private Integer total;

  @Optional private Boolean finished;

  /**
   * Getter for the field <code>done</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getDone() {
    return done;
  }

  /**
   * Setter for the field <code>done</code>.
   *
   * @param done a {@link java.lang.Integer} object
   */
  public void setDone(Integer done) {
    this.done = done;
  }

  /**
   * Getter for the field <code>total</code>.
   *
   * @return a {@link java.lang.Integer} object
   */
  public Integer getTotal() {
    return total;
  }

  /**
   * Setter for the field <code>total</code>.
   *
   * @param total a {@link java.lang.Integer} object
   */
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Getter for the field <code>finished</code>.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFinished() {
    return finished;
  }

  /**
   * Setter for the field <code>finished</code>.
   *
   * @param finished a {@link java.lang.Boolean} object
   */
  public void setFinished(Boolean finished) {
    this.finished = finished;
  }
}
