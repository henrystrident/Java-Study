package com.algorithms.arrays;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★☆☆。构建一次后，区间和查询应为 O(1)。 */
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
