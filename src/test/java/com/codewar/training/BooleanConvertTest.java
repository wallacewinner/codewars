package com.codewar.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanConvertTest {
    @Test
    public void testBoolToWord() {
        assertEquals(BooleanConvert.boolToWord(true),"Yes");
        assertEquals(BooleanConvert.boolToWord(false),"No");
    }
}
