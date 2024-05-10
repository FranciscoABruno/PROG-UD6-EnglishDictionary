package com.duolingo.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.duolingo.utilities.StringUtils;

public class Dictionary {
    private Map<Character, Set<String>> wordsByInitial;

    public Dictionary() {
        wordsByInitial = new HashMap<>();
    }

    public void addWord(String word) {
        word = StringUtils.sanitize(word);
        char initial = word.charAt(0);
        wordsByInitial.putIfAbsent(initial, new HashSet<>());
        wordsByInitial.get(initial).add(word);
    }

    public boolean removeWord(String word) {
        word = StringUtils.sanitize(word);
        char initial = word.charAt(0);
        if (wordsByInitial.containsKey(initial)) {
            return wordsByInitial.get(initial).remove(word);
        }
        return false;
    }

    public boolean hasWord(String word) {
        word = StringUtils.sanitize(word);
        char initial = word.charAt(0);
        return wordsByInitial.containsKey(initial) && wordsByInitial.get(initial).contains(word);
    }

    public Set<Character> getAvailableInitials() {
        return wordsByInitial.keySet();
    }

    public Set<String> getWordsByInitial(char initial) {
        return wordsByInitial.getOrDefault(initial, new HashSet<>());
    }
}
