package com.algorithms.challenge;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：共有 courseCount 门课程，prerequisites[i]={course, prerequisite} 表示先学 prerequisite 才能学 course。
 * 输出：返回任意一种包含全部课程的合法学习顺序；若依赖形成环、无法完成全部课程，则返回空数组。
 * 要求：构建 prerequisite 指向 course 的有向图，使用 Kahn 拓扑排序，时间复杂度 O(V + E)。难度：★★★。
 */
// 完成状态：未完成
public class CourseScheduleExercise {
    public static int[] findOrder(int courseCount, int[][] prerequisites) {
        // TODO：构建 prerequisite -> course 邻接表及入度数组，执行 Kahn 拓扑排序。
        return Todo.notImplemented("先将所有入度为 0 的课程入队");
    }

    private static boolean isValidOrder(int[] order, int count, int[][] prerequisites) {
        if (order.length != count) return false;
        int[] position = new int[count];
        for (int i = 0; i < count; i++) position[order[i]] = i;
        for (int[] pair : prerequisites) if (position[pair[1]] >= position[pair[0]]) return false;
        return true;
    }

    private static void tests() {
        int[][] dependencies = {{1,0},{2,0},{3,1},{3,2}};
        int[] order = findOrder(4, dependencies);
        Checks.isTrue(isValidOrder(order, 4, dependencies), "返回的课程顺序不满足依赖");
        Checks.arrayEquals(new int[]{}, findOrder(2, new int[][]{{0,1},{1,0}}));
        Checks.arrayEquals(new int[]{0}, findOrder(1, new int[][]{}));
        Checks.passed("课程依赖综合题");
    }

    public static void main(String[] args) { Todo.run("课程依赖", CourseScheduleExercise::tests); }
}
