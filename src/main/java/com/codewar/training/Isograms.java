package com.codewar.training;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
 * Example: (Input --> Output)
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moose" = false
 * isIsogram "aba" = false
 */

public class Isograms {
    public static boolean isIsogram(String str) {
         String[] letters = str.toLowerCase().split("");
         int letterLength = letters.length;
         for (int i = 0; i < letterLength; i++) {
             String letter = letters[i];
             for (int j = i + 1; j < letterLength; j++) {
                 if(letter.equals(letters[j])) return false;
             }
         }
         return true;
    }
}
