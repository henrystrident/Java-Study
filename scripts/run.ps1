param([Parameter(Mandatory = $true)][string]$Exercise)
$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $PSScriptRoot
& (Join-Path $PSScriptRoot "compile.ps1")
$source = Get-ChildItem -Path (Join-Path $root "src") -Recurse -Filter "$Exercise.java" | Select-Object -First 1
if (-not $source) { throw "找不到练习：$Exercise" }
$relative = $source.FullName.Substring((Join-Path $root "src").Length + 1)
$className = $relative.Replace("\", ".").Replace("/", ".").Replace(".java", "")
java -cp (Join-Path $root "out") $className

