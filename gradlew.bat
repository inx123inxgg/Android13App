@echo off
:: Gradle wrapper batch script
set DIR=%~dp0
java -jar "%DIR%\gradle\wrapper\gradle-wrapper.jar" %*
