param([Parameter(Mandatory = $true)][string]$Source)

$ErrorActionPreference = "Stop"
$resolved = (Resolve-Path $Source).Path
$content = [System.IO.File]::ReadAllText($resolved)
$pattern = '// \u5b8c\u6210\u72b6\u6001\uff1a(\u5df2\u5b8c\u6210|\u672a\u5b8c\u6210)'
$completedMarker = [regex]::Unescape('// \u5b8c\u6210\u72b6\u6001\uff1a\u5df2\u5b8c\u6210')

if (-not [regex]::IsMatch($content, $pattern)) {
    throw "Exercise file has no completion marker: $resolved"
}

$updated = [regex]::Replace($content, $pattern, $completedMarker, 1)
if ($updated -ne $content) {
    $utf8WithoutBom = New-Object System.Text.UTF8Encoding($false)
    [System.IO.File]::WriteAllText($resolved, $updated, $utf8WithoutBom)
    Write-Host "Marked as completed: $([System.IO.Path]::GetFileName($resolved))" -ForegroundColor Green
}

$root = Split-Path -Parent $PSScriptRoot
& (Join-Path $PSScriptRoot 'sync-module-status.ps1') -Root $root
