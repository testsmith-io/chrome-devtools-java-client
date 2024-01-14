package com.github.testsmith.cdt.protocol.types.database;

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
import java.util.List;

/**
 * ExecuteSQL class.
 *
 * @author roy
 * @version $Id: $Id
 */
public class ExecuteSQL {

  @Optional private List<String> columnNames;

  @Optional private List<Object> values;

  @Optional private Error sqlError;

  /**
   * Getter for the field <code>columnNames</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<String> getColumnNames() {
    return columnNames;
  }

  /**
   * Setter for the field <code>columnNames</code>.
   *
   * @param columnNames a {@link java.util.List} object
   */
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  /**
   * Getter for the field <code>values</code>.
   *
   * @return a {@link java.util.List} object
   */
  public List<Object> getValues() {
    return values;
  }

  /**
   * Setter for the field <code>values</code>.
   *
   * @param values a {@link java.util.List} object
   */
  public void setValues(List<Object> values) {
    this.values = values;
  }

  /**
   * Getter for the field <code>sqlError</code>.
   *
   * @return a {@link com.github.testsmith.cdt.protocol.types.database.Error} object
   */
  public Error getSqlError() {
    return sqlError;
  }

  /**
   * Setter for the field <code>sqlError</code>.
   *
   * @param sqlError a {@link com.github.testsmith.cdt.protocol.types.database.Error} object
   */
  public void setSqlError(Error sqlError) {
    this.sqlError = sqlError;
  }
}
