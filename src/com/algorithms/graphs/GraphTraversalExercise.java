package com.algorithms.graphs;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.ArrayList;
import java.util.List;

/**
 * 题目：给定图的邻接表 graph 和起点 start，使用广度优先搜索返回从起点可达节点的访问顺序。
 * 规则：邻居按邻接表中的原顺序访问；不可达节点不出现在结果中；start 非法时抛出 IllegalArgumentException。
 * 要求：节点入队时标记，时间复杂度 O(V + E)，额外空间 O(V)。难度：★★☆。
 */
// 完成状态：未完成
public class GraphTraversalExercise {
    public static List<Integer> bfs(List<List<Integer>> graph, int start) {
        // TODO：校验 start，用队列遍历；节点入队时立刻标记 visited。
        return Todo.notImplemented("复杂度应为 O(V + E)");
    }

    public static List<List<Integer>> undirectedGraph(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

    private static void tests() {
        List<List<Integer>> graph = undirectedGraph(6,
                new int[][]{{0,1},{0,2},{1,3},{2,4},{3,4}});
        Checks.equals(List.of(0, 1, 2, 3, 4), bfs(graph, 0));
        Checks.equals(List.of(5), bfs(graph, 5));
        Checks.passed("图的 BFS");
    }

    public static void main(String[] args) { Todo.run("图的 BFS", GraphTraversalExercise::tests); }
}
