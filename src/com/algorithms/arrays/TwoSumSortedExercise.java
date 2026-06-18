package com.algorithms.arrays;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★☆☆。返回两个数的下标；无解返回 {-1, -1}。 */
// 完成状态：已完成
public class TwoSumSortedExercise {
    public static int[] find(int[] numbers, int target) {
        // 使用左右双指针，时间复杂度 O(n)，额外空间复杂度 O(1)。
        int index_start = 0;
        int index_end = numbers.length-1;
        while(index_start<index_end){
            int sum = numbers[index_end]+numbers[index_start];
            switch (Integer.compare(sum, target)){
                case -1 -> index_start++;
                case 1 -> index_end--;
                case 0 -> {
                    return new int[] {index_start,index_end};
                }
            }
        }
        return new int[] {-1,-1};
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
