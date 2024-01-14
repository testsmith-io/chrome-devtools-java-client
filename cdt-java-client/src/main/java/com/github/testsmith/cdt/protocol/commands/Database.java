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

import com.github.testsmith.cdt.protocol.events.database.AddDatabase;
import com.github.testsmith.cdt.protocol.support.annotations.EventName;
import com.github.testsmith.cdt.protocol.support.annotations.Experimental;
import com.github.testsmith.cdt.protocol.support.annotations.ParamName;
import com.github.testsmith.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.testsmith.cdt.protocol.support.annotations.Returns;
import com.github.testsmith.cdt.protocol.support.types.EventHandler;
import com.github.testsmith.cdt.protocol.support.types.EventListener;
import com.github.testsmith.cdt.protocol.types.database.ExecuteSQL;
import java.util.List;

/**
 * Database interface.
 *
 * @author roy
 * @version $Id: $Id
 */
@Experimental
public interface Database {

  /** Disables database tracking, prevents database events from being sent to the client. */
  void disable();

  /** Enables database tracking, database events will now be delivered to the client. */
  void enable();

  /**
   * executeSQL.
   *
   * @param databaseId a {@link java.lang.String} object
   * @param query a {@link java.lang.String} object
   * @return a {@link com.github.testsmith.cdt.protocol.types.database.ExecuteSQL} object
   */
  ExecuteSQL executeSQL(
      @ParamName("databaseId") String databaseId, @ParamName("query") String query);

  /** @param databaseId */
  /**
   * getDatabaseTableNames.
   *
   * @param databaseId a {@link java.lang.String} object
   * @return a {@link java.util.List} object
   */
  @Returns("tableNames")
  @ReturnTypeParameter(String.class)
  List<String> getDatabaseTableNames(@ParamName("databaseId") String databaseId);

  /**
   * onAddDatabase.
   *
   * @param eventListener a {@link com.github.testsmith.cdt.protocol.support.types.EventHandler}
   *     object
   * @return a {@link com.github.testsmith.cdt.protocol.support.types.EventListener} object
   */
  @EventName("addDatabase")
  EventListener onAddDatabase(EventHandler<AddDatabase> eventListener);
}
