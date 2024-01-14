package com.github.testsmith.cdt.utils;

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

import static org.easymock.EasyMock.*;

import com.github.testsmith.cdt.protocol.support.types.EventListener;
import java.io.Closeable;
import java.io.IOException;
import org.junit.Test;

/**
 * Created by Kenan Klisura on 01/02/2018.
 *
 * @author Kenan Klisura
 */
public class ChromeDevToolsUtilsTest {
  @Test
  public void testCloseQuietly() throws IOException {
    Closeable closeable = mock(Closeable.class);
    Closeable closeableWithException = mock(Closeable.class);

    closeable.close();

    closeableWithException.close();
    expectLastCall().andThrow(new IOException());

    replay(closeable, closeableWithException);

    ChromeDevToolsUtils.closeQuietly(null);
    ChromeDevToolsUtils.closeQuietly(closeable);
    ChromeDevToolsUtils.closeQuietly(closeableWithException);

    verify(closeable, closeableWithException);
  }

  @Test
  public void testWaitForEvent() {
    EventListener eventListener = mock(EventListener.class);

    eventListener.unsubscribe();

    replay(eventListener);

    ChromeDevToolsUtils.waitForEvent(
        eventHandler -> {
          eventHandler.onEvent(null);
          return eventListener;
        });

    verify(eventListener);
  }
}
