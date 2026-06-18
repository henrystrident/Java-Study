@echo off
setlocal
if "%~1"=="" (
  echo Usage: scripts\run.cmd ExerciseName
  exit /b 1
)
call "%~dp0compile.cmd" || exit /b 1
set "SOURCE="
for /f "delims=" %%F in ('dir /s /b "%~dp0..\src\%~1.java" 2^>nul') do set "SOURCE=%%~fF"
if not defined SOURCE (
  echo Exercise not found: %~1
  exit /b 1
)
set "CLASS=%SOURCE:*\src\=%"
set "CLASS=%CLASS:\=.%"
set "CLASS=%CLASS:.java=%"
java -cp "%~dp0..\out" %CLASS%
