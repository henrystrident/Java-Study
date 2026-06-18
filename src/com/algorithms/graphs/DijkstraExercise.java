package com.algorithms.graphs;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.List;

/** 难度：★★★。非负权有向图的单源最短路；不可达距离为 Long.MAX_VALUE。 */
public class DijkstraExercise {
    public record Edge(int to, int weight) {
        public Edge { if (weight < 0) throw new IllegalArgumentException("Dijkstra 不允许负权边"); }
    }

    public static long[] shortestPaths(List<List<Edge>> graph, int source) {
        // TODO：距离数组初始化为无穷；优先队列保存 (节点,当前距离)。
        return Todo.notImplemented("弹出的旧距离若大于 dist[node]，应跳过");
    }

    private static void tests() {
        List<List<Edge>> graph = List.of(
                List.of(new Edge(1, 4), new Edge(2, 1)),
                List.of(new Edge(3, 1)),
                List.of(new Edge(1, 2), new Edge(3, 5)),
                List.of(), List.of());
        long[] d = shortestPaths(graph, 0);
        Checks.equals(0L, d[0]); Checks.equals(3L, d[1]); Checks.equals(1L, d[2]);
        Checks.equals(4L, d[3]); Checks.equals(Long.MAX_VALUE, d[4]);
        Checks.passed("Dijkstra 最短路");
    }

    public static void main(String[] args) { Todo.run("Dijkstra", DijkstraExercise::tests); }
}

