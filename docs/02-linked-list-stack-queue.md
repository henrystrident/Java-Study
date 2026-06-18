# 模块 2：链表、栈与队列

> 模块状态：未完成 (0/3 个练习已完成)
> 对应代码：`src/com/algorithms/linkedlist/`、`src/com/algorithms/stackqueue/`  
> 建议顺序：单链表 → 环检测 → 有效括号

<!-- exercise-status:start -->
## 练习进度

| 练习题 Java 文件 | 完成状态 |
|---|---|
| [`SinglyLinkedListExercise.java`](../src/com/algorithms/linkedlist/SinglyLinkedListExercise.java) | 未完成 |
| [`LinkedListCycleExercise.java`](../src/com/algorithms/linkedlist/LinkedListCycleExercise.java) | 未完成 |
| [`ValidParenthesesExercise.java`](../src/com/algorithms/stackqueue/ValidParenthesesExercise.java) | 未完成 |
<!-- exercise-status:end -->

## 链表

链表节点分散存储，通过引用连接。已知节点处插入/删除可达 `O(1)`，但按位置访问需要 `O(n)`。修改引用时先保存会丢失的后继节点。虚拟头节点能统一处理“头节点也被删除”的边界情况。

快慢指针常用于找中点、倒数第 k 个节点和检测环。若有环，快指针每轮走两步、慢指针走一步，最终会相遇。

## 栈与队列

栈是后进先出，适合括号匹配、表达式求值和 DFS；队列是先进先出，适合任务调度和 BFS。Java 中通常使用 `ArrayDeque`，避免旧式 `Stack`。

## 练习目标

- 实现单链表的增删查与反转。
- 用快慢指针检测环。
- 用栈验证括号序列。

## 指针操作示例

反转 `1 → 2 → 3 → null` 时，始终维护三个引用：`previous` 是已反转部分的头，`current` 是待处理节点，`next` 临时保存后继。先保存 `next`，再令 `current.next = previous`；否则后面的链会丢失。

环检测中，若快慢指针进入长度为 `c` 的环，它们每轮的相对距离缩短 1，最终一定相遇。注意比较的是节点引用，而不是节点值。

括号匹配时，遇到左括号入栈；遇到右括号时检查栈顶是否是对应左括号。扫描结束后栈也必须为空。

## 常见错误与检查点

- 更新 `head` 后忘记同步 `size`。
- 快指针前进两步前没有检查 `fast` 和 `fast.next`。
- 使用 `Stack`；本项目推荐 `ArrayDeque` 的 `push/pop/peek`。
- 只发现不匹配，却漏掉“右括号多余”或“左括号剩余”。
