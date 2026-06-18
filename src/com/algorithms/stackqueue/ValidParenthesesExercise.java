package com.algorithms.stackqueue;

import com.algorithms.support.Checks;
import com.algorithms.support.Todo;

/** 难度：★☆☆。只允许 ()[]{} 六种字符。 */
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

