package com.company;

import com.company.HashTables.CharacterFinder;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        CharacterFinder characterFinder = new CharacterFinder();
        char character = characterFinder.findFirstNonRepeatingCharacter("a green apple");
        System.out.println(character);
    }
}
