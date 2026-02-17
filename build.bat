@echo off
title Build Game in Java
echo 1. Test
echo 2. Debug
echo 3. Release
set /p choice=Enter number (1-3): 

if "%choice%"=="1" goto test
if "%choice%"=="2" goto debug
if "%choice%"=="3" goto release

goto end

:test
javac -d test src/*.java
jar cfm test/test-game.jar manifest.txt -C test .
goto end

:debug
javac -d debug src/*.java
jar cfm debug/debug-game.jar manifest.txt -C debug .
goto end

:release
javac -d release src/*.java
jar cfm release/game.jar manifest.txt -C release .
goto end

:end
pause
