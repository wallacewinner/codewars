package com.codewar.training;

import java.util.List;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 * **/

public class DetectPangram {
    public boolean check(String sentence) {
        List sentenceSplited = List.of(sentence.toLowerCase().split(""));
        List alphabet = List.of("abcdefghijklmnopqrstuvwxyz".split(""));
        return sentenceSplited.containsAll(alphabet);
    }
}
