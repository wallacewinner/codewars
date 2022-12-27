package com.codewar.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayOfDigitsTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ReverseArrayOfDigits.digitize(35231));
        assertArrayEquals(new int[] {0}, ReverseArrayOfDigits.digitize(0));
    }
}
