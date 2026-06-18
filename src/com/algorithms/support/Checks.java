package com.algorithms.support;

import java.util.Arrays;
import java.util.Objects;

public final class Checks {
    private Checks() {}

    public static void equals(Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError("期望 " + expected + "，实际 " + actual);
        }
    }

    public static void arrayEquals(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("期望 " + Arrays.toString(expected)
                    + "，实际 " + Arrays.toString(actual));
        }
    }

    public static void isTrue(boolean value, String message) {
        if (!value) throw new AssertionError(message);
    }

    public static void passed(String exercise) {
        System.out.println("✅ " + exercise + "：全部测试通过");
    }
}

