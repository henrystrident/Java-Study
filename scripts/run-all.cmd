@echo off
setlocal enabledelayedexpansion
call "%~dp0compile.cmd" || exit /b 1
set /a TOTAL=0
set /a PASSED=0
for /r "%~dp0..\src" %%F in (*Exercise.java) do (
  set /a TOTAL+=1
  set "SOURCE=%%~fF"
  set "CLASS=!SOURCE:*\src\=!"
  set "CLASS=!CLASS:\=.!"
  set "CLASS=!CLASS:.java=!"
  echo.
  echo === %%~nF ===
  java -cp "%~dp0..\out" !CLASS!
  if !errorlevel! equ 0 set /a PASSED+=1
)
echo.
echo Passed !PASSED! / !TOTAL! exercises.
