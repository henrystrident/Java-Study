$ErrorActionPreference = "Continue"
$root = Split-Path -Parent $PSScriptRoot
& (Join-Path $PSScriptRoot "compile.ps1")
$exercises = Get-ChildItem -Path (Join-Path $root "src") -Recurse -Filter *Exercise.java
$passed = 0
foreach ($source in $exercises) {
    $relative = $source.FullName.Substring((Join-Path $root "src").Length + 1)
    $className = $relative.Replace("\", ".").Replace("/", ".").Replace(".java", "")
    Write-Host "`n=== $($source.BaseName) ===" -ForegroundColor Cyan
    java -cp (Join-Path $root "out") $className
    if ($LASTEXITCODE -eq 0) {
        $passed++
        & (Join-Path $PSScriptRoot "mark-completed.ps1") -Source $source.FullName
    }
}
Write-Host "`n已通过 $passed / $($exercises.Count) 个练习"
