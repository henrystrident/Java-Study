# 模块 7：递归、回溯与贪心

> 模块状态：未完成 (0/2 个练习已完成)
> 对应代码：`src/com/algorithms/backtracking/`、`src/com/algorithms/greedy/`  
> 建议顺序：`PermutationsExercise.java` → `IntervalSchedulingExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`PermutationsExercise.java`](../src/com/algorithms/backtracking/PermutationsExercise.java) | 未完成 |
| [`IntervalSchedulingExercise.java`](../src/com/algorithms/greedy/IntervalSchedulingExercise.java) | 未完成 |
<!-- exercise-status:end -->

递归由基本情况和规模缩小的递归步骤组成。回溯是在决策树上做 DFS，模板是“选择 → 递归 → 撤销选择”。剪枝通过提前排除不可能产生答案的分支降低搜索量。

贪心算法每一步选择当前最优解。它必须有证明，常见方法是交换论证：证明任意最优解都能替换成贪心选择且不会变差。区间调度中，优先选择结束时间最早的可兼容区间可留下最大后续空间。

## 全排列决策树

对 `[1,2,3]`，第一层选择第一个数，第二层从未使用元素中选择，路径长度为 3 时复制进答案。返回上一层前必须把刚加入的元素移除，并恢复 `used`；这就是“撤销选择”。结果数量为 `3!`，生成所有结果至少需要 `O(n · n!)` 时间。

## 区间调度手算

区间 `[1,4]`、`[2,3]`、`[3,5]` 按结束时间排序后，先选 `[2,3]`，再选 `[3,5]`，能选 2 个；若先选开始最早的 `[1,4]`，只能选 1 个。这说明“看起来合理”不等于贪心选择正确，选择标准必须能证明。

## 常见错误

- 基本情况无法到达，造成无限递归。
- 保存答案时直接加入可变的 `path`，后续回溯把历史结果也改掉。
- 忘记撤销某一项状态。
- 为了排序直接修改调用者传入的区间列表。
