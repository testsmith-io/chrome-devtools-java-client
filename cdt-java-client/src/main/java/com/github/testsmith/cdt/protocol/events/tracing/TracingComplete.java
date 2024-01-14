package com.github.testsmith.cdt.protocol.events.tracing;

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
import com.github.testsmith.cdt.protocol.types.tracing.StreamCompression;
import com.github.testsmith.cdt.protocol.types.tracing.StreamFormat;

/**
 * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
 * delivered via dataCollected events.
 *
 * @author roy
 * @version $Id: $Id
 */
public class TracingComplete {

  private Boolean dataLossOccurred;

  @Optional private String stream;

  @Optional private StreamFormat traceFormat;

  @Optional private StreamCompression streamCompression;

  /**
   * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
   * buffer wrapped around.
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getDataLossOccurred() {
    return dataLossOccurred;
  }

  /**
   * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
   * buffer wrapped around.
   *
   * @param dataLossOccurred a {@link java.lang.Boolean} object
   */
  public void setDataLossOccurred(Boolean dataLossOccurred) {
    this.dataLossOccurred = dataLossOccurred;
  }

  /**
   * A handle of the stream that holds resulting trace data.
   *
   * @return a {@link java.lang.String} object
   */
  public String getStream() {
    return stream;
  }

  /**
   * A handle of the stream that holds resulting trace data.
   *
   * @param stream a {@link java.lang.String} object
   */
  public void setStream(String stream) {
    this.stream = stream;
  }

  /**
   * Trace data format of returned stream.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.tracing.StreamFormat} object
   */
  public StreamFormat getTraceFormat() {
    return traceFormat;
  }

  /**
   * Trace data format of returned stream.
   *
   * @param traceFormat a {@link com.github.testsmith.cdt.protocol.types.tracing.StreamFormat}
   *     object
   */
  public void setTraceFormat(StreamFormat traceFormat) {
    this.traceFormat = traceFormat;
  }

  /**
   * Compression format of returned stream.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.tracing.StreamCompression} object
   */
  public StreamCompression getStreamCompression() {
    return streamCompression;
  }

  /**
   * Compression format of returned stream.
   *
   * @param streamCompression a {@link
   *     com.github.testsmith.cdt.protocol.types.tracing.StreamCompression} object
   */
  public void setStreamCompression(StreamCompression streamCompression) {
    this.streamCompression = streamCompression;
  }
}
