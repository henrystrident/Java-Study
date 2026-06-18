# 模块 5：树、二叉搜索树与堆

> 模块状态：未完成 (0/2 个练习已完成)
> 对应代码：`src/com/algorithms/trees/`、`src/com/algorithms/heaps/`  
> 建议顺序：`BinaryTreeExercise.java` → `TopKExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`BinaryTreeExercise.java`](../src/com/algorithms/trees/BinaryTreeExercise.java) | 未完成 |
| [`TopKExercise.java`](../src/com/algorithms/heaps/TopKExercise.java) | 未完成 |
<!-- exercise-status:end -->

树适合表达层次关系。二叉树 DFS 有前序、中序、后序三种顺序；BFS 使用队列按层访问。遍历每个节点一次，时间通常是 `O(n)`，额外空间取决于树高或最大层宽。

二叉搜索树（BST）满足左子树键值小于节点、右子树键值大于节点（重复值规则需自行约定）。平衡时操作为 `O(log n)`，退化成链时为 `O(n)`。

堆是完全二叉树。最小堆保证父节点不大于子节点，因此能在 `O(1)` 查看最小值、`O(log n)` 插入和删除。求 Top K 时，维护大小为 k 的小顶堆通常需要 `O(n log k)`。

## 遍历如何选择

- 前序（根、左、右）：适合复制树或输出结构。
- 中序（左、根、右）：遍历 BST 时得到有序序列。
- 后序（左、右、根）：适合先收集子树信息，再计算父节点。
- 层序：队列中保存下一批要访问的节点；每轮先读取队列大小即可分层。

例如下面这棵树的前序是 `[1,2,3]`，中序是 `[2,1,3]`，后序是 `[2,3,1]`，层序是 `[[1],[2,3]]`。

```text
  1
 / \
2   3
```

## Top K 为什么用小顶堆

要保留最大的 k 个数，堆顶应是“当前入选者中最小的”。新数若比堆顶大，就替换堆顶；这样最容易被淘汰的元素始终能在 `O(1)` 找到。

边界检查：空树、只有根节点、极度偏斜的树，以及 `k <= 0`、`k` 大于数组长度。
