package com.codewar.training;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareOfSquaresTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals(false, SquareOfSquares.isSquare(-1));
        assertEquals(true,   SquareOfSquares.isSquare(0));
        assertEquals(false,  SquareOfSquares.isSquare(3));
        assertEquals(true,   SquareOfSquares.isSquare(4));
        assertEquals(true,   SquareOfSquares.isSquare(25));
        assertEquals(false,  SquareOfSquares.isSquare(26));
    }
}
