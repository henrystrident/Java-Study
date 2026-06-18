package com.algorithms.support;

public final class Todo {
    private Todo() {}

    public static <T> T notImplemented(String hint) {
        throw new UnsupportedOperationException("TODO：" + hint);
    }

    public static void run(String name, Runnable tests) {
        try {
            tests.run();
        } catch (UnsupportedOperationException e) {
            System.err.println("📝 " + name + " 尚未完成 - " + e.getMessage());
            System.exit(2);
        }
    }
}
