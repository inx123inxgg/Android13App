#!/bin/sh
##############################################################################
## Gradle start up script for UN*X
##############################################################################

DIR="$( cd "$( dirname "$0" )" && pwd )"
GRADLE_USER_HOME="${GRADLE_USER_HOME:-$DIR/.gradle}"

exec java -Xmx64m -cp "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
