package com.dmdev.util;

public final class StringUtils {
    private static final String EMPTY = "";

    private StringUtils() {
    }

    public static String trim(String value) {
        return value == null ? EMPTY : value.trim();
    }
}
