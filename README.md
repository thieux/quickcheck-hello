# QuickTheories hello world in Java

This project is an experiment on property-based testing paradigm.

Copied from the `junit5-gradle-consumer` project demonstrates how to run tests based on
JUnit Jupiter milestones using Gradle with the help of a very basic Gradle plugin
for the JUnit Platform.

## Executing Tests on the JUnit Platform

Once the JUnit Platform Gradle plugin has been applied and configured, you have a new
`junitPlatformTest` task at your disposal.

Invoking `gradlew clean junitPlatformTest` (or `gradlew clean test`) from the command
line will execute all tests within the project whose class names match the pattern
`^.*Tests?$`. This will result in output similar to the following:

```
:junitPlatformTest

Test run finished after 86 ms
[         6 containers found      ]
[         0 containers skipped    ]
[         6 containers started    ]
[         0 containers aborted    ]
[         6 containers successful ]
[         0 containers failed     ]
[         5 tests found           ]
[         1 tests skipped         ]
[         4 tests started         ]
[         0 tests aborted         ]
[         4 tests successful      ]
[         0 tests failed          ]

:test SKIPPED

BUILD SUCCESSFUL
```
