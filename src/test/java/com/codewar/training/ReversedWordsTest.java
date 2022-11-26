package com.codewar.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedWordsTest {
    // TODO: Replace examples and use TDD development by writing your own tests
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReversedWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReversedWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReversedWords.reverseWords("The world is nice"));
    }
}
