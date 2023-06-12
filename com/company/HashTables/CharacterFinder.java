package com.company.HashTables;

import java.util.HashMap;
import java.util.Map;

public class CharacterFinder {
    public char findFirstNonRepeatingCharacter (String string) {
        Map<Character, Integer> charIntMap = new HashMap<>();
        char[] characters = string.toCharArray();

        for (char character : characters) {
            int count = charIntMap.getOrDefault(character, 0);
            charIntMap.put(character, count + 1);
        }

        for (char character : characters) {
            if (charIntMap.get(character) == 1) return character;
        }

        return Character.MIN_VALUE;
    }
}
