# Chrome DevTools Java Client

## Description

Chrome DevTools Java Client is a DevTools client - in Java. (: It can be used for *instrumenting, inspecting, debuging and profiling Chromium, Chrome and other Blink-based browsers.* [1]

For more information on DevTools, see https://chromedevtools.github.io/devtools-protocol/.

[v1.3.6](https://github.com/kklisura/chrome-devtools-java-client/tree/v1.3.6) tested on Google Chrome Version 67.0.3396.87. Protocol files from [dev-tools-protocol#1aa7b31ca7](https://github.com/ChromeDevTools/devtools-protocol/tree/1aa7b31ca7bba982eceea8d4bd494b27850fb0df/json)

[v2.0.0](https://github.com/kklisura/chrome-devtools-java-client/tree/v2.0.0) tested on Google Chrome Version 76.0.3809.100. Protocol files from [dev-tools-protocol#e1fb93bd76](https://github.com/ChromeDevTools/devtools-protocol/tree/e1fb93bd76f99cdf401b949757c874c579e15434/json)

[1] https://chromedevtools.github.io/devtools-protocol/.

## Usage

Add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>com.github.testsmith.cdt</groupId>
  <artifactId>cdt-java-client</artifactId>
  <version>2.1.0</version>
</dependency>
```

You can use following code, taken from, `LogRequestsExample`:

```java
package com.github.testsmith.cdt.examples;

import com.github.testsmith.cdt.launch.ChromeLauncher;
import com.github.testsmith.cdt.protocol.commands.Network;
import com.github.testsmith.cdt.protocol.commands.Page;
import com.github.testsmith.cdt.services.ChromeDevToolsService;
import com.github.testsmith.cdt.services.ChromeService;
import com.github.testsmith.cdt.services.types.ChromeTab;

/**
 * Log requests example with DevTools java client.
 *
 * <p>The following example will open chrome, create a tab with about:blank url, subscribe to
 * requestWillBeSent event and then navigate to github.com.
 *
 * @author Kenan Klisura
 */
public class LogRequestsExample {
  public static void main(String[] args) {
    // Create chrome launcher.
    final ChromeLauncher launcher = new ChromeLauncher();

    // Launch chrome either as headless (true) or regular (false).
    final ChromeService chromeService = launcher.launch(false);

    // Create empty tab ie about:blank.
    final ChromeTab tab = chromeService.createTab();

    // Get DevTools service to this tab
    final ChromeDevToolsService devToolsService = chromeService.createDevToolsService(tab);

    // Get individual commands
    final Page page = devToolsService.getPage();
    final Network network = devToolsService.getNetwork();

    // Log requests with onRequestWillBeSent event handler.
    network.onRequestWillBeSent(
        event ->
            System.out.printf(
                "request: %s %s%s",
                event.getRequest().getMethod(),
                event.getRequest().getUrl(),
                System.lineSeparator()));

    network.onLoadingFinished(
        event -> {
          // Close the tab and close the browser when loading finishes.
          chromeService.closeTab(tab);
          launcher.close();
        });

    // Enable network events.
    network.enable();

    // Navigate to github.com.
    page.navigate("http://github.com");

    devToolsService.waitUntilClosed();
  }
}
```

For more examples, see `cdt-examples`.
 
## Running unit tests

`make verify`
 
## Sonar analysis

`make sonar-analysis`

## License

Chrome DevTools Java Client is licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE.txt) for the full license text.
