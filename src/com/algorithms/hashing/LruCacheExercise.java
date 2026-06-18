package com.algorithms.hashing;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目：实现固定容量的 LRU 缓存；访问或更新键后，该键成为最近使用项，容量超限时淘汰最久未使用项。
 * 规则：get 对不存在的键返回 null；put 更新已有键或插入新键；容量必须为正数。
 * 要求：组合哈希表和双向链表，使 get、put 的平均时间复杂度均为 O(1)。难度：★★★。
 */
// 完成状态：未完成
public class LruCacheExercise<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> index = new HashMap<>();
    private final Node<K, V> head = new Node<>(null, null);
    private final Node<K, V> tail = new Node<>(null, null);

    private static final class Node<K, V> {
        K key; V value; Node<K, V> previous; Node<K, V> next;
        Node(K key, V value) { this.key = key; this.value = value; }
    }

    public LruCacheExercise(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("容量必须为正数");
        this.capacity = capacity;
        head.next = tail; tail.previous = head;
    }

    public V get(K key) {
        // TODO：不存在返回 null；存在则移到头部并返回值。
        return Todo.notImplemented("用 index 定位节点");
    }

    public void put(K key, V value) {
        // TODO：更新已有节点或插入新节点；超容时淘汰 tail.previous。
        Todo.notImplemented("哈希表和链表必须同步更新");
    }

    private void moveToFront(Node<K, V> node) {
        // TODO：可组合 removeNode 与 addFirst 两个私有操作。
        Todo.notImplemented("先摘除，再插到 head 后面");
    }

    private static void tests() {
        LruCacheExercise<Integer, String> cache = new LruCacheExercise<>(2);
        cache.put(1, "A"); cache.put(2, "B");
        Checks.equals("A", cache.get(1));
        cache.put(3, "C");
        Checks.equals(null, cache.get(2));
        Checks.equals("C", cache.get(3));
        cache.put(1, "A2");
        Checks.equals("A2", cache.get(1));
        Checks.passed("LRU 缓存");
    }

    public static void main(String[] args) { Todo.run("LRU 缓存", LruCacheExercise::tests); }
}
