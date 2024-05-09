package com.duolingo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    private Map<Character, Set<String>> palabrasPorInicial;

    public Dictionary() {
        palabrasPorInicial = new HashMap<>();
    }

}
