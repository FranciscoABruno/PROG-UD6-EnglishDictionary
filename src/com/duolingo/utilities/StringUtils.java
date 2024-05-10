package com.duolingo.utilities;

public class StringUtils {
    public static String sanitize(String word) {
        // Quita los espacios iniciales y finales y convierte a minúsculas
        return word.trim().toLowerCase();
    }
}
