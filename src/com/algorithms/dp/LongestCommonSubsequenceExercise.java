package com.algorithms.dp;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：给定字符串 first 和 second，求它们最长公共子序列的长度；子序列字符顺序不变但不要求连续。
 * 输出：返回最大长度；任一字符串为空时返回 0。
 * 要求：定义二维动态规划状态并正确处理首行、首列边界，时间复杂度 O(mn)。难度：★★★。
 */
// 完成状态：未完成
public class LongestCommonSubsequenceExercise {
    public static int length(String first, String second) {
        // TODO：dp[i][j] 表示 first 前 i 个与 second 前 j 个字符的答案。
        return Todo.notImplemented("字符相等取左上角 + 1，否则取上方/左方较大值");
    }

    private static void tests() {
        Checks.equals(3, length("abcde", "ace"));
        Checks.equals(3, length("abc", "abc"));
        Checks.equals(0, length("abc", "def"));
        Checks.equals(0, length("", "abc"));
        Checks.passed("最长公共子序列");
    }

    public static void main(String[] args) { Todo.run("最长公共子序列", LongestCommonSubsequenceExercise::tests); }
}
