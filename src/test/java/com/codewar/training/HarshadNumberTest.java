package com.codewar.training;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HarshadNumberTest {
    @Test
    public void basicTest(){
        assertEquals(false, HarshadNumber.numberJoy(1997));
        assertEquals(true, HarshadNumber.numberJoy(1729));
        assertEquals(false, HarshadNumber.numberJoy(1998));
        assertEquals(false, HarshadNumber.numberJoy(18));
    }
}
