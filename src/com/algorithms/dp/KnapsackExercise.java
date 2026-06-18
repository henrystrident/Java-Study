package com.algorithms.dp;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★★☆。0/1 背包：每件物品最多选择一次。 */
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
