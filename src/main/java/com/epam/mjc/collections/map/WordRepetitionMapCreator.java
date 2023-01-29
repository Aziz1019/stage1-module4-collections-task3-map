package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if(sentence.isEmpty() || sentence.isBlank()) {
            return Map.of();
        }
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (wordRepetitionMap.containsKey(word)) {
                wordRepetitionMap.put(word, wordRepetitionMap.get(word) + 1);
            } else {
                wordRepetitionMap.put(word, 1);
            }
        }
        return wordRepetitionMap;
    }
}
