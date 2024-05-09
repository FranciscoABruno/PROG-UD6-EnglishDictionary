package com.duolingo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    private Map<Character, Set<String>> palabrasPorInicial;

        public Diccionario() {
        palabrasPorInicial = new HashMap<>();
    }
}
