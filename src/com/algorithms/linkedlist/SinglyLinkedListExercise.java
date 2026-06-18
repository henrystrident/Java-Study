package com.algorithms.linkedlist;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：实现一个泛型单链表，完成头插、尾插、删除头节点、原地反转和查询元素数量。
 * 规则：空链表执行 removeFirst 时抛出 IllegalStateException；每次增删后 size 必须准确。
 * 要求：addFirst 和 removeFirst 为 O(1)，reverse 为 O(n)，反转时不得创建新链表。难度：★★☆。
 */
// 完成状态：未完成
public class SinglyLinkedListExercise<E> {
    private Node<E> head;
    private int size;

    private static final class Node<E> {
        E value;
        Node<E> next;
        Node(E value) { this.value = value; }
    }

    public void addFirst(E value) {
        // TODO：新节点指向旧 head，再更新 head 和 size。
        Todo.notImplemented("头插法应为 O(1)");
    }

    public void addLast(E value) {
        // TODO：处理空链表，否则找到尾节点。
        Todo.notImplemented("尾插法在当前结构中为 O(n)");
    }

    public E removeFirst() {
        // TODO：空链表抛 IllegalStateException；否则更新 head 和 size。
        return Todo.notImplemented("先保存 head.value");
    }

    public void reverse() {
        // TODO：用 previous/current/next 三个引用原地反转。
        Todo.notImplemented("重连前先保存 current.next");
    }

    public int size() { return size; }

    @Override public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (Node<E> node = head; node != null; node = node.next) {
            if (result.length() > 1) result.append(", ");
            result.append(node.value);
        }
        return result.append(']').toString();
    }

    private static void tests() {
        SinglyLinkedListExercise<Integer> list = new SinglyLinkedListExercise<>();
        list.addFirst(2); list.addFirst(1); list.addLast(3);
        Checks.equals("[1, 2, 3]", list.toString());
        Checks.equals(3, list.size());
        Checks.equals(1, list.removeFirst());
        list.reverse();
        Checks.equals("[3, 2]", list.toString());
        Checks.equals(2, list.size());
        Checks.passed("单链表");
    }

    public static void main(String[] args) { Todo.run("单链表", SinglyLinkedListExercise::tests); }
}
