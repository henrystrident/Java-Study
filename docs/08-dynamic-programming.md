# 模块 8：动态规划

> 模块状态：未完成 (0/2 个练习已完成)
> 对应代码：`src/com/algorithms/dp/`  
> 建议顺序：`KnapsackExercise.java` → `LongestCommonSubsequenceExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`KnapsackExercise.java`](../src/com/algorithms/dp/KnapsackExercise.java) | 未完成 |
| [`LongestCommonSubsequenceExercise.java`](../src/com/algorithms/dp/LongestCommonSubsequenceExercise.java) | 未完成 |
<!-- exercise-status:end -->

动态规划适用于重叠子问题和最优子结构。设计顺序：

1. 定义状态：`dp[...]` 精确表示什么。
2. 写出选择和状态转移。
3. 确定初始值、非法状态与遍历顺序。
4. 从依赖关系判断能否压缩空间。

0/1 背包中，`dp[c]` 可表示容量不超过 c 时的最大价值。每件物品只能使用一次，因此容量必须倒序遍历。最长公共子序列中，若字符相等则继承左上角加一，否则取上方与左方最大值。

不要从“套模板”开始；先写出状态含义，绝大多数下标错误都会更容易暴露。

## 0/1 背包示例

容量 4，物品重量 `[2,3]`、价值 `[3,4]`。初始 `dp=[0,0,0,0,0]`。处理重量 2 时从容量 4 倒序更新，得到 `[0,0,3,3,3]`；处理重量 3 后得到 `[0,0,3,4,4]`。倒序保证当前物品不会在同一轮被重复使用。

## LCS 示例

比较 `abc` 和 `ac`：当字符相等时，`dp[i][j] = dp[i-1][j-1] + 1`；不等时，取 `dp[i-1][j]` 与 `dp[i][j-1]` 的较大值。最终最长公共子序列长度为 2。

## 写转移前的四句话

1. `dp[i]` 或 `dp[i][j]` 的中文含义是什么？
2. 当前状态由哪些更小状态得到？
3. 第一行、第一列或容量 0 表示什么？
4. 遍历顺序是否保证依赖项已经计算，并避免重复使用？

常见错误是只写公式不写状态语义、0/1 背包容量正序更新，以及把“子序列”误当成必须连续的“子串”。
