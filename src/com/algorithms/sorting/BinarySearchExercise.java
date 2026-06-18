package com.algorithms.sorting;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：给定升序整数数组 numbers（允许重复）和目标值 target，找到 target 第一次出现的位置。
 * 输出：存在时返回最左侧下标；不存在或数组为空时返回 -1。
 * 要求：使用二分查找，时间复杂度 O(log n)，额外空间复杂度 O(1)。难度：★☆☆。
 */
// 完成状态：未完成
public class BinarySearchExercise {
    public static int firstIndexOf(int[] numbers, int target) {
        // TODO：普通二分找到相等值后不要停止，继续向左收缩。
        return Todo.notImplemented("记录答案，再令 right = middle - 1");
    }

    private static void tests() {
        Checks.equals(1, firstIndexOf(new int[]{1, 2, 2, 2, 5}, 2));
        Checks.equals(0, firstIndexOf(new int[]{3}, 3));
        Checks.equals(-1, firstIndexOf(new int[]{1, 4, 7}, 2));
        Checks.equals(-1, firstIndexOf(new int[]{}, 1));
        Checks.passed("二分查找第一个位置");
    }

    public static void main(String[] args) { Todo.run("二分查找", BinarySearchExercise::tests); }
}
