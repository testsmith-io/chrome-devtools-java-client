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

import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.types.systeminfo.Info;
import com.github.testsmith.cdt.protocol.types.systeminfo.ProcessInfo;
import java.util.List;

/**
 * The SystemInfo domain defines methods and events for querying low-level system information.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface SystemInfo {

  /**
   * Returns information about the system.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.systeminfo.Info} object
   */
  Info getInfo();

  /**
   * Returns information about all running processes.
   *
   * @return a {@link java.util.List} object
   */
  @Returns("processInfo")
  @ReturnTypeParameter(ProcessInfo.class)
  List<ProcessInfo> getProcessInfo();
}
