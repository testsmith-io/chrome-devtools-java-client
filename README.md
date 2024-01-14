# Chrome DevTools Java Client

## Description

Chrome DevTools Java Client is a DevTools client - in Java. (: It can be used for *instrumenting, inspecting, debuging and profiling Chromium, Chrome and other Blink-based browsers.* [1]

For more information on DevTools, see https://chromedevtools.github.io/devtools-protocol/.

[v1.3.6](https://github.com/kklisura/chrome-devtools-java-client/tree/v1.3.6) tested on Google Chrome Version 67.0.3396.87. Protocol files from [dev-tools-protocol#1aa7b31ca7](https://github.com/ChromeDevTools/devtools-protocol/tree/1aa7b31ca7bba982eceea8d4bd494b27850fb0df/json)

[v2.1.0](https://github.com/kklisura/chrome-devtools-java-client/tree/v2.1.0) tested on Google Chrome Version 76.0.3809.100. Protocol files from [dev-tools-protocol#e1fb93bd76](https://github.com/ChromeDevTools/devtools-protocol/tree/e1fb93bd76f99cdf401b949757c874c579e15434/json)

[v3.0.0](https://github.com/kklisura/chrome-devtools-java-client/tree/v3.0.0) tested on Google Chrome Version 86.0.4240.111. Protocol files from [dev-tools-protocol#fcb68d10bc](https://github.com/ChromeDevTools/devtools-protocol/tree/fcb68d10bc5258ebf96121caf57200069f6e6731/json)

[v4.0.0](https://github.com/kklisura/chrome-devtools-java-client/tree/v4.0.0) tested on Google Chrome Version 90.0.4430.212. Protocol files from [dev-tools-protocol#987bbb1124](https://github.com/ChromeDevTools/devtools-protocol/tree/987bbb1124f098c7e4bca6b2f91c7e96b350a8e6/json)

[1] https://chromedevtools.github.io/devtools-protocol/.

## Usage

Add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>com.github.testsmith.cdt</groupId>
  <artifactId>cdt-java-client</artifactId>
  <version>4.0.0</version>
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

For more examples, see [examples](cdt-examples/src/main/java/com/github/kklisura/cdt/examples).

## Known-issues

### API hangs (ie when printing PDFs)

**What:** If you're using `cdt-java-client` before version `2.1.0` for printing to PDF or using API which requests large amount of data, API may hang if the requesting data exceeds 4MB.

**Why:** This is due to underlying WebSocket library having 4MB buffer for receiving data from browser.

**How to fix:** With the version `2.1.0` and above, this buffer was increased to 8MB and can be further increased if necessary by setting the appropriate [configuration property](cdt-examples/src/main/java/com/github/kklisura/cdt/examples/IncreasedIncomingBufferInTyrusExample.java).

## Debugging chrome

In order to debug chrome when using this library, set the logger `com.github.testsmith.cdt.launch.chrome.output` to `DEBUG` level. See [ChromeLoggingExample](cdt-examples/src/main/java/com/github/kklisura/cdt/examples/ChromeLoggingExample.java) for more information. Be sure to remove or turn the logger off, when done.

## Running unit tests

`make verify`

## Sonar analysis

`make sonar-analysis`

## Download latest protocol

Run following:
```
make download-latest-protocol
```

This will download `browser_protocol.json` and `js_protocol.json` (protocol definitions) from https://github.com/ChromeDevTools/devtools-protocol repo.

## Update protocol (generate Java files from protocol definitions)

Make sure you have correct or latest protocol definitions. See [Download latest protocol](#download-latest-protocol) on how to update protocol definitions to latest version.

Run following:
```
make update-protocol
```

This will build the tools for parsing and generating Java files, [cdt-java-protocol-builder](cdt-java-protocol-builder/) project. The input for this tool are protocol definitions files: `browser_protocol.json` and `js_protocol.json`. The generated Java files will be present in [cdt-java-client](cdt-java-client/) project. After building Java files, the [cdt-java-client](cdt-java-client/) will be compiled. If everything goes successfully, consider the protocol updated. :)

## Updating copyright license header

To go over each module and each source java file to update copyright license header, run:

```
make update-copyright-license-header
```

## License

Chrome DevTools Java Client is licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE.txt) for the full license text.
