package com.algorithms.linkedlist;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★★☆。Floyd 快慢指针检测环。 */
// 完成状态：未完成
public class LinkedListCycleExercise {
    static final class Node { int value; Node next; Node(int value) { this.value = value; } }

    public static boolean hasCycle(Node head) {
        // TODO：slow 每次一步、fast 每次两步；引用相同表示相遇。
        return Todo.notImplemented("循环前确认 fast 和 fast.next 非空");
    }

    private static void tests() {
        Node a = new Node(1), b = new Node(2), c = new Node(3);
        a.next = b; b.next = c;
        Checks.equals(false, hasCycle(a));
        c.next = b;
        Checks.equals(true, hasCycle(a));
        Checks.equals(false, hasCycle(null));
        Checks.passed("链表环检测");
    }

    public static void main(String[] args) { Todo.run("链表环检测", LinkedListCycleExercise::tests); }
}
