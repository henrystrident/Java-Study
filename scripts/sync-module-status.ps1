param([string]$Root)

$ErrorActionPreference = "Stop"
if (-not $Root) {
    $Root = Split-Path -Parent $PSScriptRoot
}

$modules = @(
    @{ Doc = 'docs/01-complexity-arrays.md'; Exercises = @(
        'src/com/algorithms/arrays/TwoSumSortedExercise.java',
        'src/com/algorithms/arrays/PrefixSumExercise.java') },
    @{ Doc = 'docs/02-linked-list-stack-queue.md'; Exercises = @(
        'src/com/algorithms/linkedlist/SinglyLinkedListExercise.java',
        'src/com/algorithms/linkedlist/LinkedListCycleExercise.java',
        'src/com/algorithms/stackqueue/ValidParenthesesExercise.java') },
    @{ Doc = 'docs/03-hashing.md'; Exercises = @(
        'src/com/algorithms/hashing/LruCacheExercise.java') },
    @{ Doc = 'docs/04-searching-sorting.md'; Exercises = @(
        'src/com/algorithms/sorting/BinarySearchExercise.java',
        'src/com/algorithms/sorting/MergeSortExercise.java') },
    @{ Doc = 'docs/05-trees-heaps.md'; Exercises = @(
        'src/com/algorithms/trees/BinaryTreeExercise.java',
        'src/com/algorithms/heaps/TopKExercise.java') },
    @{ Doc = 'docs/06-graphs.md'; Exercises = @(
        'src/com/algorithms/graphs/GraphTraversalExercise.java',
        'src/com/algorithms/graphs/DijkstraExercise.java') },
    @{ Doc = 'docs/07-recursion-backtracking-greedy.md'; Exercises = @(
        'src/com/algorithms/backtracking/PermutationsExercise.java',
        'src/com/algorithms/greedy/IntervalSchedulingExercise.java') },
    @{ Doc = 'docs/08-dynamic-programming.md'; Exercises = @(
        'src/com/algorithms/dp/KnapsackExercise.java',
        'src/com/algorithms/dp/LongestCommonSubsequenceExercise.java') },
    @{ Doc = 'docs/09-comprehensive.md'; Exercises = @(
        'src/com/algorithms/challenge/CourseScheduleExercise.java') }
)

$statusPattern = '> \u6a21\u5757\u72b6\u6001\uff1a.*'
$completedPattern = '// \u5b8c\u6210\u72b6\u6001\uff1a\u5df2\u5b8c\u6210'
$tablePattern = '(?s)<!-- exercise-status:start -->.*?<!-- exercise-status:end -->'
$statusLabel = [regex]::Unescape('> \u6a21\u5757\u72b6\u6001\uff1a')
$completedLabel = [regex]::Unescape('\u5df2\u5b8c\u6210')
$incompleteLabel = [regex]::Unescape('\u672a\u5b8c\u6210')
$exerciseLabel = [regex]::Unescape('\u4e2a\u7ec3\u4e60\u5df2\u5b8c\u6210')
$progressHeading = [regex]::Unescape('\u7ec3\u4e60\u8fdb\u5ea6')
$fileHeading = [regex]::Unescape('\u7ec3\u4e60\u9898 Java \u6587\u4ef6')
$stateHeading = [regex]::Unescape('\u5b8c\u6210\u72b6\u6001')
$utf8WithoutBom = New-Object System.Text.UTF8Encoding($false)
$newLine = [Environment]::NewLine

foreach ($module in $modules) {
    $completed = 0
    $rows = @()

    foreach ($relativeExercise in $module.Exercises) {
        $exercisePath = Join-Path $Root $relativeExercise
        if (-not (Test-Path $exercisePath)) {
            throw "Exercise file not found: $exercisePath"
        }

        $sourceContent = [System.IO.File]::ReadAllText($exercisePath)
        $isCompleted = [regex]::IsMatch($sourceContent, $completedPattern)
        $rowStatus = if ($isCompleted) { $completedLabel } else { $incompleteLabel }
        if ($isCompleted) { $completed++ }
        $fileName = [System.IO.Path]::GetFileName($exercisePath)
        $linkTarget = '../' + $relativeExercise.Replace('\\', '/')
        $rows += "| [``$fileName``]($linkTarget) | $rowStatus |"
    }

    $total = $module.Exercises.Count
    $label = if ($total -gt 0 -and $completed -eq $total) { $completedLabel } else { $incompleteLabel }
    $statusLine = "$statusLabel$label ($completed/$total $exerciseLabel)"
    $tableLines = @(
        '<!-- exercise-status:start -->',
        "## $progressHeading",
        '',
        "| $fileHeading | $stateHeading |",
        '|---|---|'
    ) + $rows + @('<!-- exercise-status:end -->')
    $table = $tableLines -join $newLine

    $docPath = Join-Path $Root $module.Doc
    $docContent = [System.IO.File]::ReadAllText($docPath)
    if (-not [regex]::IsMatch($docContent, $statusPattern)) {
        throw "Module document has no status marker: $docPath"
    }
    if (-not [regex]::IsMatch($docContent, $tablePattern)) {
        throw "Module document has no exercise table markers: $docPath"
    }

    $updated = [regex]::Replace($docContent, $statusPattern, $statusLine, 1)
    $updated = [regex]::Replace($updated, $tablePattern, $table, 1)
    if ($updated -ne $docContent) {
        [System.IO.File]::WriteAllText($docPath, $updated, $utf8WithoutBom)
    }
}
