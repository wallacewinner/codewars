package com.codewar.training;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBooleantoStringTest {
    @Test
    public void testTrue(){
        assertEquals(ConvertBooleantoString.convert(true), "true");
    }

    @Test
    public void testFalse(){
        assertEquals(ConvertBooleantoString.convert(false), "false");
    }
}
