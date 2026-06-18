# Java 数据结构与算法学习项目

这是一个面向 Java 17 的渐进式练习项目。它不依赖第三方库：每道题都是一个可编译、可运行、带自测用例的 Java 文件。

## 课程路线

| 阶段 | 模块 | 重点 | 练习 |
|---|---|---|---|
| 1 | 复杂度与数组 | Big-O、双指针、前缀和 | `TwoSumSortedExercise`、`PrefixSumExercise` |
| 2 | 链表 | 指针操作、快慢指针 | `SinglyLinkedListExercise`、`LinkedListCycleExercise` |
| 3 | 栈、队列、哈希 | LIFO/FIFO、哈希思想 | `ValidParenthesesExercise`、`LruCacheExercise` |
| 4 | 查找与排序 | 二分、归并、快排 | `BinarySearchExercise`、`MergeSortExercise` |
| 5 | 树与堆 | 遍历、BST、优先队列 | `BinaryTreeExercise`、`TopKExercise` |
| 6 | 图 | BFS、DFS、拓扑排序、最短路 | `GraphTraversalExercise`、`DijkstraExercise` |
| 7 | 递归、回溯、贪心 | 搜索树、剪枝、局部最优 | `PermutationsExercise`、`IntervalSchedulingExercise` |
| 8 | 动态规划 | 状态、转移、边界、空间优化 | `KnapsackExercise`、`LongestCommonSubsequenceExercise` |
| 9 | 综合挑战 | 多种结构与算法组合 | `CourseScheduleExercise` |

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

所有练习初始状态均可编译。未实现的方法会调用 `Todo.notImplemented()`；完成方法时删掉这一行并写入实现。

## 项目结构

```text
docs/       分模块讲义
src/        可运行的 Java 练习
scripts/    编译和运行脚本
out/        编译产物（执行脚本后生成）
```

## 练习清单

当前包含 17 道主练习、19 个 Java 源文件和 10 篇 Markdown 文档。星级只表示本课程内的相对难度。建议先自行增加测试，再补全实现；这样能更早发现你对边界条件的理解是否准确。
