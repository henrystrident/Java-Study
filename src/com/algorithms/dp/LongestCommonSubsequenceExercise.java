package com.algorithms.dp;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★★★。求两个字符串最长公共子序列的长度（不要求连续）。 */
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

