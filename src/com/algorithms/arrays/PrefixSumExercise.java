package com.algorithms.arrays;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：构造一个前缀和查询器，预处理给定整数数组，并回答任意闭区间 [left, right] 的元素和。
 * 输出：rangeSum 返回区间和；下标越界、left 大于 right 等非法区间应抛出 IllegalArgumentException。
 * 要求：构造时间 O(n)、额外空间 O(n)，每次查询时间 O(1)。难度：★☆☆。
 */
// 完成状态：未完成
public class PrefixSumExercise {
    private final long[] prefix;

    public PrefixSumExercise(int[] numbers) {
        // TODO：prefix 长度应比 numbers 多 1，防止 l=0 时特殊处理。
        this.prefix = Todo.notImplemented("令 prefix[i + 1] = prefix[i] + numbers[i]");
    }

    public long rangeSum(int left, int right) {
        // TODO：查询闭区间 [left, right]，非法区间抛 IllegalArgumentException。
        return Todo.notImplemented("使用两个前缀值相减");
    }

    private static void tests() {
        PrefixSumExercise sums = new PrefixSumExercise(new int[]{2, -1, 3, 5, -2});
        Checks.equals(9L, sums.rangeSum(0, 3));
        Checks.equals(7L, sums.rangeSum(2, 4));
        Checks.equals(-1L, sums.rangeSum(1, 1));
        Checks.passed("前缀和");
    }

    public static void main(String[] args) { Todo.run("前缀和", PrefixSumExercise::tests); }
}
