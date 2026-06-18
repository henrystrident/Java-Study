package com.algorithms.sorting;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：使用归并排序将整数数组 numbers 按非降序排列，结果直接写回原数组。
 * 规则：正确处理空数组、单元素、负数与重复元素；相等时优先取左半区元素以保持稳定性。
 * 要求：时间复杂度 O(n log n)，只创建一个 O(n) 临时数组并在递归中共享。难度：★★☆。
 */
// 完成状态：未完成
public class MergeSortExercise {
    public static void sort(int[] numbers) {
        // TODO：创建一次临时数组并调用递归方法。
        Todo.notImplemented("长度小于 2 时无需处理");
    }

    private static void sort(int[] a, int[] temp, int left, int right) {
        // TODO：拆成两半，分别排序后合并。
        Todo.notImplemented("递归出口是 left >= right");
    }

    private static void merge(int[] a, int[] temp, int left, int middle, int right) {
        // TODO：用两个指针合并 [left,middle] 与 [middle+1,right]。
        Todo.notImplemented("相等时优先取左侧可保持稳定性");
    }

    private static void tests() {
        int[] a = {5, 1, 4, 2, 8, 2}; sort(a);
        Checks.arrayEquals(new int[]{1, 2, 2, 4, 5, 8}, a);
        int[] b = {}; sort(b); Checks.arrayEquals(new int[]{}, b);
        int[] c = {-1}; sort(c); Checks.arrayEquals(new int[]{-1}, c);
        Checks.passed("归并排序");
    }

    public static void main(String[] args) { Todo.run("归并排序", MergeSortExercise::tests); }
}
