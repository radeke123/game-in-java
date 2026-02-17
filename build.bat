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

del /Q test\*.class

echo @echo off > test/run.bat
echo java -jar test-game.jar >> test/run.bat
echo pause >> test/run.bat
goto end

:debug
javac -d debug src/*.java
jar cfm debug/debug-game.jar manifest.txt -C debug .

del /Q debug\*.class

echo @echo off > debug/run.bat
echo java -jar debug-game.jar >> debug/run.bat
echo pause >> debug/run.bat
goto end

:release
javac -d release src/*.java
jar cfm release/game.jar manifest.txt -C release .

del /Q release\*.class

echo @echo off > release/run.bat
echo java -jar game.jar >> release/run.bat
echo pause >> release/run.bat
goto end

:end
pause
