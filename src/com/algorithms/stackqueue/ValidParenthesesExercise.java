package com.algorithms.stackqueue;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/**
 * 题目：给定一个只包含 ()[]{} 六种字符的字符串，判断所有括号是否类型匹配且闭合顺序正确。
 * 输出：合法返回 true，否则返回 false；空字符串视为合法。
 * 要求：使用栈完成一次扫描，时间复杂度 O(n)，额外空间复杂度 O(n)。难度：★☆☆。
 */
// 完成状态：未完成
public class ValidParenthesesExercise {
    public static boolean isValid(String text) {
        // TODO：用 ArrayDeque<Character> 保存尚未匹配的左括号。
        return Todo.notImplemented("遇到右括号时，栈不能为空且栈顶类型匹配");
    }

    private static void tests() {
        Checks.equals(true, isValid("()[]{}"));
        Checks.equals(true, isValid("{[()]}"));
        Checks.equals(false, isValid("([)]"));
        Checks.equals(false, isValid("("));
        Checks.equals(true, isValid(""));
        Checks.passed("有效括号");
    }

    public static void main(String[] args) { Todo.run("有效括号", ValidParenthesesExercise::tests); }
}
