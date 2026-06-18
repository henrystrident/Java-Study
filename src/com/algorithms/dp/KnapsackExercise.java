package com.algorithms.dp;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：给定每件物品的重量 weights、价值 values 和背包容量 capacity，求可获得的最大总价值。
 * 规则：每件物品最多选择一次；两数组长度必须相同，容量不得为负；容量为 0 时结果为 0。
 * 要求：使用一维动态规划并倒序遍历容量，时间 O(物品数 × 容量)，空间 O(容量)。难度：★★☆。
 */
// 完成状态：未完成
public class KnapsackExercise {
    public static int maxValue(int[] weights, int[] values, int capacity) {
        // TODO：校验数组等长和非负容量；使用一维 dp，容量倒序更新。
        return Todo.notImplemented("dp[c] = max(dp[c], dp[c-weight] + value)");
    }

    private static void tests() {
        Checks.equals(9, maxValue(new int[]{2, 3, 4}, new int[]{4, 5, 6}, 5));
        Checks.equals(0, maxValue(new int[]{1}, new int[]{10}, 0));
        Checks.equals(6, maxValue(new int[]{2, 2}, new int[]{6, 5}, 2));
        Checks.passed("0/1 背包");
    }

    public static void main(String[] args) { Todo.run("0/1 背包", KnapsackExercise::tests); }
}
