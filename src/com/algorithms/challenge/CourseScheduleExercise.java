package com.algorithms.challenge;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★★★。prerequisites[i]={course, prerequisite}，返回一种合法顺序；有环返回空数组。 */
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
