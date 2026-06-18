# 模块 1：复杂度、数组与字符串

> 模块状态：未完成 (1/2 个练习已完成)
> 对应代码：`src/com/algorithms/arrays/`  
> 建议顺序：`TwoSumSortedExercise.java` → `PrefixSumExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`TwoSumSortedExercise.java`](../src/com/algorithms/arrays/TwoSumSortedExercise.java) | 已完成 |
| [`PrefixSumExercise.java`](../src/com/algorithms/arrays/PrefixSumExercise.java) | 未完成 |
<!-- exercise-status:end -->

## 复杂度

时间复杂度描述输入规模 `n` 增长时操作次数的数量级。常见顺序为 `O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2^n)`。分析循环时关注执行次数；分析递归时关注递归树的深度和分支数。空间复杂度统计算法额外占用的空间，通常不含输入本身。

## 数组

数组使用连续内存，按下标访问是 `O(1)`，中间插入和删除需要移动元素，通常为 `O(n)`。常用技巧：

- 双指针：两个索引协同移动，将部分二重循环降为线性扫描。
- 滑动窗口：维护连续区间以及区间内的统计量。
- 前缀和：令 `prefix[i + 1] = prefix[i] + nums[i]`，区间 `[l, r]` 的和为 `prefix[r + 1] - prefix[l]`。

## 练习目标

- `TwoSumSortedExercise`：理解有序数组上的左右双指针。
- `PrefixSumExercise`：构建前缀和并回答多次区间查询。

## 手算示例

有序数组 `[1, 2, 4, 7, 11]`，目标值为 `9`。左右指针先指向 `1` 和 `11`，和太大便右移；得到 `1 + 7 = 8`，和太小便左移；最终 `2 + 7 = 9`。每一步至少排除一个元素，因此只扫描一次。

数组 `[2, -1, 3, 5]` 的前缀和（首位补 0）是 `[0, 2, 1, 4, 9]`。区间 `[1, 3]` 的和为 `prefix[4] - prefix[1] = 7`。

## 写代码前先回答

- 双指针为什么依赖“数组有序”？
- `prefix` 为什么要比原数组多一个元素？
- 空数组、找不到答案、`left > right` 分别如何处理？

## 常见错误

- 用两层循环做有序两数之和，忽略了有序性提供的单调信息。
- 前缀和查询写成 `prefix[right] - prefix[left]`，产生一位偏差。
- 把算法使用的额外空间与输入数组本身混在一起计算。
