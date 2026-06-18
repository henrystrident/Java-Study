package com.algorithms.arrays;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★☆☆。返回两个数的下标；无解返回 {-1, -1}。 */
public class TwoSumSortedExercise {
    public static int[] find(int[] numbers, int target) {
        // TODO：使用左右双指针，目标复杂度 O(n) 时间、O(1) 空间。
        return Todo.notImplemented("比较两端之和，过小移动 left，过大移动 right");
    }

    private static void tests() {
        Checks.arrayEquals(new int[]{0, 1}, find(new int[]{2, 7, 11, 15}, 9));
        Checks.arrayEquals(new int[]{1, 3}, find(new int[]{-3, -1, 2, 4, 8}, 3));
        Checks.arrayEquals(new int[]{-1, -1}, find(new int[]{1, 2, 4}, 8));
        Checks.arrayEquals(new int[]{0, 1}, find(new int[]{3, 3}, 6));
        Checks.passed("有序数组两数之和");
    }

    public static void main(String[] args) { Todo.run("有序数组两数之和", TwoSumSortedExercise::tests); }
}

