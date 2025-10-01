@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem Gradle startup script for Windows
@rem ##########################################################################

set DIR=%~dp0
set GRADLE_USER_HOME=%DIR%\.gradle

java -Xmx64m -cp "%DIR%\gradle\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
