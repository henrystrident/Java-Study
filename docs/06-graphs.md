# 模块 6：图

> 模块状态：未完成 (0/2 个练习已完成)
> 对应代码：`src/com/algorithms/graphs/`  
> 建议顺序：`GraphTraversalExercise.java` → `DijkstraExercise.java`

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`GraphTraversalExercise.java`](../src/com/algorithms/graphs/GraphTraversalExercise.java) | 未完成 |
| [`DijkstraExercise.java`](../src/com/algorithms/graphs/DijkstraExercise.java) | 未完成 |
<!-- exercise-status:end -->

图由顶点和边组成，可分有向/无向、加权/无权。邻接表适合稀疏图，空间为 `O(V + E)`；邻接矩阵查询边快，但空间为 `O(V²)`。

- BFS：用队列逐层扩展，在无权图中可求最少边数路径。
- DFS：沿分支深入，适合连通性、环检测、拓扑相关问题。
- 拓扑排序：反复取入度为 0 的节点；若最终处理数少于顶点数，则存在有向环。
- Dijkstra：每次确定当前距离最小的未确定节点，适用于边权非负的最短路径问题。

遍历时通常在“入队/入栈”时标记访问，避免同一节点被重复加入。

## BFS 手算

若邻接表为 `0:[1,2]`、`1:[3]`、`2:[3]`、`3:[]`，从 0 开始：先入队 0；访问 0 后加入 1、2；访问 1 时加入 3；访问 2 时 3 已标记，不再加入。顺序为 `[0,1,2,3]`，复杂度 `O(V + E)`。

## Dijkstra 的核心

距离数组保存目前已知的最好距离，优先队列优先弹出距离最小的候选。若弹出的距离已经大于数组中的记录，说明它是旧候选，直接跳过。对边 `(u,v,w)` 做松弛：若 `dist[u] + w < dist[v]`，就更新并重新入队。

Dijkstra 不允许负权边；存在负权时，“已经最短”的节点可能后来再次变短。

## 常见错误

- 出队后才标记 BFS 节点，导致同一节点多次入队。
- 只从节点 0 遍历，却误以为访问了非连通图的全部节点。
- 邻接矩阵和邻接表的复杂度混为一谈。
- 距离相加时没有考虑整数溢出或“无穷大”值。
