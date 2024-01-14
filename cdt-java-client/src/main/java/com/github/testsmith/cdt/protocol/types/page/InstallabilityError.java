package com.github.testsmith.cdt.protocol.types.page;

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
import java.util.List;

/**
 * The installability error
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public class InstallabilityError {

  private String errorId;

  private List<InstallabilityErrorArgument> errorArguments;

  /**
   * The error id (e.g. 'manifest-missing-suitable-icon').
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorId() {
    return errorId;
  }

  /**
   * The error id (e.g. 'manifest-missing-suitable-icon').
   *
   * @param errorId a {@link java.lang.String} object
   */
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  /**
   * The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}).
   *
   * @return a {@link java.util.List} object
   */
  public List<InstallabilityErrorArgument> getErrorArguments() {
    return errorArguments;
  }

  /**
   * The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}).
   *
   * @param errorArguments a {@link java.util.List} object
   */
  public void setErrorArguments(List<InstallabilityErrorArgument> errorArguments) {
    this.errorArguments = errorArguments;
  }
}
