package com.algorithms.heaps;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★★☆。返回最大的 k 个数，结果按降序排列。 */
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

