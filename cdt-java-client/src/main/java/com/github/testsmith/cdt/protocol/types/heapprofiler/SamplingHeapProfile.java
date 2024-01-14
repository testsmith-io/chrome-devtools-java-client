package com.github.testsmith.cdt.protocol.types.heapprofiler;

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

import java.util.List;

/**
 * Sampling profile.
 *
 * @author roy
 * @version $Id: $Id
 */
public class SamplingHeapProfile {

  private SamplingHeapProfileNode head;

  private List<SamplingHeapProfileSample> samples;

  /**
   * Getter for the field <code>head</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.heapprofiler.SamplingHeapProfileNode}
   *     object
   */
  public SamplingHeapProfileNode getHead() {
    return head;
  }

  /**
   * Setter for the field <code>head</code>.
   *
   * @param head a {@link
   *     com.github.testsmith.cdt.protocol.types.heapprofiler.SamplingHeapProfileNode} object
   */
  public void setHead(SamplingHeapProfileNode head) {
    this.head = head;
  }

  /**
   * Getter for the field <code>samples</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<SamplingHeapProfileSample> getSamples() {
    return samples;
  }

  /**
   * Setter for the field <code>samples</code>.
   *
   * @param samples a {@link java.util.List} object
   */
  public void setSamples(List<SamplingHeapProfileSample> samples) {
    this.samples = samples;
  }
}
