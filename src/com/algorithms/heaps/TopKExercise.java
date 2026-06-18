package com.algorithms.heaps;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：给定整数数组 numbers 和整数 k，找出其中最大的 k 个数，重复值分别计数。
 * 输出：按降序返回结果；k 为 0 返回空数组，k 小于 0 或大于数组长度时抛出 IllegalArgumentException。
 * 要求：维护容量为 k 的小顶堆，时间复杂度 O(n log k)，额外空间 O(k)。难度：★★☆。
 */
// 完成状态：未完成
public class TopKExercise {
    public static int[] largest(int[] numbers, int k) {
        // TODO：维护容量 k 的 PriorityQueue 小顶堆，最终再生成降序结果。
        return Todo.notImplemented("k 非法（小于 0 或大于数组长度）时抛 IllegalArgumentException");
    }

    private static void tests() {
        Checks.arrayEquals(new int[]{9, 8, 7}, largest(new int[]{3, 9, 1, 8, 2, 7}, 3));
        Checks.arrayEquals(new int[]{5}, largest(new int[]{5}, 1));
        Checks.arrayEquals(new int[]{}, largest(new int[]{2, 1}, 0));
        Checks.arrayEquals(new int[]{4, 4}, largest(new int[]{4, 1, 4}, 2));
        Checks.passed("Top K");
    }

    public static void main(String[] args) { Todo.run("Top K", TopKExercise::tests); }
}
