# Java 数据结构与算法学习项目

这是一个面向 Java 17 的渐进式练习项目。它不依赖第三方库：每道题都是一个可编译、可运行、带自测用例的 Java 文件。

## 课程地图：讲义和代码在哪里

每一行就是一个学习单元。先打开“讲义”，再进入“源码目录”完成练习；类名与 `.java` 文件名相同。

| 模块 | 讲义 | 源码目录 | 练习文件 |
|---|---|---|---|
| 1. 复杂度与数组 | [01-complexity-arrays.md](docs/01-complexity-arrays.md) | `src/com/algorithms/arrays/` | `TwoSumSortedExercise.java`、`PrefixSumExercise.java` |
| 2. 链表、栈与队列 | [02-linked-list-stack-queue.md](docs/02-linked-list-stack-queue.md) | `src/com/algorithms/linkedlist/`、`src/com/algorithms/stackqueue/` | `SinglyLinkedListExercise.java`、`LinkedListCycleExercise.java`、`ValidParenthesesExercise.java` |
| 3. 哈希与缓存 | [03-hashing.md](docs/03-hashing.md) | `src/com/algorithms/hashing/` | `LruCacheExercise.java` |
| 4. 查找与排序 | [04-searching-sorting.md](docs/04-searching-sorting.md) | `src/com/algorithms/sorting/` | `BinarySearchExercise.java`、`MergeSortExercise.java` |
| 5. 树与堆 | [05-trees-heaps.md](docs/05-trees-heaps.md) | `src/com/algorithms/trees/`、`src/com/algorithms/heaps/` | `BinaryTreeExercise.java`、`TopKExercise.java` |
| 6. 图 | [06-graphs.md](docs/06-graphs.md) | `src/com/algorithms/graphs/` | `GraphTraversalExercise.java`、`DijkstraExercise.java` |
| 7. 递归、回溯与贪心 | [07-recursion-backtracking-greedy.md](docs/07-recursion-backtracking-greedy.md) | `src/com/algorithms/backtracking/`、`src/com/algorithms/greedy/` | `PermutationsExercise.java`、`IntervalSchedulingExercise.java` |
| 8. 动态规划 | [08-dynamic-programming.md](docs/08-dynamic-programming.md) | `src/com/algorithms/dp/` | `KnapsackExercise.java`、`LongestCommonSubsequenceExercise.java` |
| 9. 综合挑战 | [09-comprehensive.md](docs/09-comprehensive.md) | `src/com/algorithms/challenge/` | `CourseScheduleExercise.java` |

详细顺序和检查点见 [学习路线](docs/00-study-guide.md)。

## 开始使用

推荐在 PowerShell 或 CMD 中使用无需调整执行策略的入口：

```powershell
.\scripts\compile.cmd
.\scripts\run.cmd BinarySearchExercise
```

也可以运行全部练习；尚未完成的题会显示 `TODO`，不会中断后续题目：

```powershell
.\scripts\run-all.cmd
```

也可以直接使用 `javac`：

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
java -cp out com.algorithms.sorting.BinarySearchExercise
```

项目也保留了对应 `.ps1` 脚本；若本机允许执行 PowerShell 脚本，可直接使用。

## 做题方式

1. 阅读对应 `docs` 讲义，先手算示例。
2. 打开练习文件，只修改标有 `TODO` 的方法。
3. 运行该练习，根据自测失败信息修正。
4. 补充边界测试：空输入、单元素、重复元素、极值。
5. 在方法注释中写出时间、空间复杂度，再进入下一题。

每个练习文件的类声明上方都有 `// 完成状态：未完成` 标记。使用 `run.cmd`、`run.ps1`、`run-all.cmd` 或 `run-all.ps1` 运行时，只要该练习的全部自测通过，脚本就会自动将它更新为 `// 完成状态：已完成`；TODO 或测试失败不会被标记为完成。

每篇模块讲义的标题下方也会显示模块状态和练习进度表。运行脚本后，表格中对应 Java 文件的状态以及模块总进度都会自动同步；只有全部练习都通过时，模块才标记为“已完成”。

所有练习初始状态均可编译。未实现的方法会调用 `Todo.notImplemented()`；完成方法时删掉这一行并写入实现。

## 项目结构

```text
docs/       按 01～09 编号排列的分模块讲义
src/com/algorithms/
  arrays/、linkedlist/、graphs/ ...  按算法主题分类的 Java 练习
  support/                           自测与 TODO 辅助代码，不是练习
scripts/    编译和运行脚本
out/        编译产物（执行脚本后生成）
```

## 练习清单

当前包含 17 道主练习、19 个 Java 源文件和 10 篇 Markdown 文档。星级只表示本课程内的相对难度。建议先自行增加测试，再补全实现；这样能更早发现你对边界条件的理解是否准确。
