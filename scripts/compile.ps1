$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $PSScriptRoot
$out = Join-Path $root "out"
New-Item -ItemType Directory -Force $out | Out-Null
$sources = Get-ChildItem -Path (Join-Path $root "src") -Recurse -Filter *.java
if ($sources.Count -eq 0) { throw "No Java source files found" }
javac -encoding UTF-8 -d $out $sources.FullName
if ($LASTEXITCODE -ne 0) { throw "Compilation failed" }
Write-Host "Compilation succeeded: $($sources.Count) source files"
