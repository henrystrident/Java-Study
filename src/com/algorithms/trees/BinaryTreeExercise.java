package com.algorithms.trees;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;
import java.util.ArrayList;
import java.util.List;

/**
 * 题目：为一棵二叉树实现两种遍历：递归中序遍历，以及按深度分组的层序遍历。
 * 输出：inorder 返回“左、根、右”的扁平列表；levelOrder 返回每层一个列表；空树返回空列表。
 * 要求：每个节点只访问一次，时间复杂度 O(n)。难度：★★☆。
 */
// 完成状态：未完成
public class BinaryTreeExercise {
    public static final class Node {
        public int value; public Node left; public Node right;
        public Node(int value) { this.value = value; }
    }

    public static List<Integer> inorder(Node root) {
        // TODO：创建结果集合，通过私有递归方法填充。
        return Todo.notImplemented("顺序是左子树、节点、右子树");
    }

    private static void inorder(Node node, List<Integer> result) {
        // TODO：空节点直接返回。
        Todo.notImplemented("每个节点只访问一次");
    }

    public static List<List<Integer>> levelOrder(Node root) {
        // TODO：使用队列；每轮先记录当前队列大小，它就是该层节点数。
        return Todo.notImplemented("推荐 ArrayDeque<Node>");
    }

    private static void tests() {
        Node root = new Node(4); root.left = new Node(2); root.right = new Node(6);
        root.left.left = new Node(1); root.left.right = new Node(3); root.right.left = new Node(5);
        Checks.equals(List.of(1, 2, 3, 4, 5, 6), inorder(root));
        Checks.equals(List.of(List.of(4), List.of(2, 6), List.of(1, 3, 5)), levelOrder(root));
        Checks.equals(List.of(), inorder(null));
        Checks.passed("二叉树遍历");
    }

    public static void main(String[] args) { Todo.run("二叉树遍历", BinaryTreeExercise::tests); }
}
