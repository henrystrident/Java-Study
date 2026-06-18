# 模块 4：查找与排序

> 模块状态：未完成 (0/2 个练习已完成)
> 对应代码：`src/com/algorithms/sorting/`  
> 建议顺序：`BinarySearchExercise.java` → `MergeSortExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`BinarySearchExercise.java`](../src/com/algorithms/sorting/BinarySearchExercise.java) | 未完成 |
| [`MergeSortExercise.java`](../src/com/algorithms/sorting/MergeSortExercise.java) | 未完成 |
<!-- exercise-status:end -->

## 二分查找

二分查找要求搜索空间具有单调性。最重要的是统一区间定义。若使用闭区间 `[left, right]`，循环条件是 `left <= right`；若使用半开区间 `[left, right)`，循环条件是 `left < right`。

## 排序

| 算法 | 平均时间 | 最坏时间 | 额外空间 | 稳定 |
|---|---:|---:|---:|---|
| 插入排序 | O(n²) | O(n²) | O(1) | 是 |
| 归并排序 | O(n log n) | O(n log n) | O(n) | 是 |
| 快速排序 | O(n log n) | O(n²) | O(log n) 平均递归栈 | 否 |
| 堆排序 | O(n log n) | O(n log n) | O(1) | 否 |

归并排序的核心是不变量：两个子区间已有序，线性合并即可。快速排序通过分区让枢轴左侧不大于它、右侧不小于它，再递归处理两边。

## 二分手算

在 `[1, 2, 2, 2, 5]` 中找第一个 2。命中中间位置后不能立刻返回，因为左边仍可能有 2；先记录答案，再令 `right = middle - 1`。最终得到索引 1。

计算中点建议写成 `left + (right - left) / 2`。每轮开始前，用一句话写清搜索区间包含哪些候选答案，这会决定循环条件和边界更新。

## 归并排序过程

`[4, 1, 3, 2]` 先拆到单元素，再得到两个有序段 `[1, 4]` 与 `[2, 3]`，最后用双指针合并为 `[1, 2, 3, 4]`。临时数组只创建一次并在递归中复用。

## 常见错误

- 区间定义是闭区间，却使用半开区间的循环条件。
- 递归没有在 `left >= right` 时停止。
- 合并后忘记把临时数组复制回原数组。
- 比较相等元素时取右半边，意外破坏归并排序的稳定性。
