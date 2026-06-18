package com.algorithms.greedy;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.List;

/** 难度：★★☆。选择数量最多的互不重叠半开区间 [start,end)。 */
// 完成状态：未完成
public class IntervalSchedulingExercise {
    public record Interval(int start, int end) {
        public Interval { if (end < start) throw new IllegalArgumentException("结束不能早于开始"); }
    }

    public static List<Interval> selectMaximum(List<Interval> intervals) {
        // TODO：不要修改调用者列表；复制后按结束时间升序排序并贪心选择。
        return Todo.notImplemented("新区间 start >= 上一个 end 时兼容");
    }

    private static void tests() {
        List<Interval> result = selectMaximum(List.of(
                new Interval(1, 4), new Interval(3, 5), new Interval(0, 6),
                new Interval(5, 7), new Interval(8, 9), new Interval(5, 9)));
        Checks.equals(List.of(new Interval(1, 4), new Interval(5, 7), new Interval(8, 9)), result);
        Checks.equals(List.of(), selectMaximum(List.of()));
        Checks.passed("区间调度");
    }

    public static void main(String[] args) { Todo.run("区间调度", IntervalSchedulingExercise::tests); }
}
