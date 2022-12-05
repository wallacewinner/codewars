package com.codewar.training;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareOfSquaresTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false);
        assertEquals("0 is a square number (0 * 0)",    true);
        assertEquals("3 isn't a square number", false);
        assertEquals("4 is a square number (2 * 2)",    true);
        assertEquals("25 is a square number (5 * 5)",   true);
        assertEquals("26 isn't a square number",false);
    }
}
