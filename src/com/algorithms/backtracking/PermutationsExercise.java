package com.algorithms.backtracking;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.List;

/**
 * 题目：给定一个元素互不相同的整数数组 numbers，生成由全部元素组成的所有排列。
 * 输出：返回所有排列的列表；空数组应返回包含一个空排列的列表，而不是空结果。
 * 要求：使用回溯和 used 状态，保存答案时复制当前路径。难度：★★☆。
 */
// 完成状态：未完成
public class PermutationsExercise {
    public static List<List<Integer>> generate(int[] numbers) {
        // TODO：创建结果、路径和 used 数组，调用回溯方法。
        return Todo.notImplemented("空数组应有一个空排列，而不是零个排列");
    }

    private static void backtrack(int[] numbers, boolean[] used,
                                  List<Integer> path, List<List<Integer>> result) {
        // TODO：路径满时复制快照；循环尝试未使用元素，递归后撤销。
        Todo.notImplemented("result.add(new ArrayList<>(path))");
    }

    private static void tests() {
        List<List<Integer>> result = generate(new int[]{1, 2, 3});
        Checks.equals(6, result.size());
        Checks.isTrue(result.contains(List.of(1, 2, 3)), "缺少排列 [1, 2, 3]");
        Checks.isTrue(result.contains(List.of(3, 2, 1)), "缺少排列 [3, 2, 1]");
        Checks.equals(List.of(List.of()), generate(new int[]{}));
        Checks.passed("全排列");
    }

    public static void main(String[] args) { Todo.run("全排列", PermutationsExercise::tests); }
}
