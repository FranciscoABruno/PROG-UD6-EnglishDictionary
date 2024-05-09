package com.duolingo.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.duolingo.utilities.StringUtils;

public class Diccionario {
    private Map<Character, Set<String>> palabrasPorInicial;

    public Diccionario() {
        palabrasPorInicial = new HashMap<>();
    }

}
