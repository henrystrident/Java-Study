package com.algorithms.sorting;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★☆☆。在升序数组中返回 target 的第一个下标，无则返回 -1。 */
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
