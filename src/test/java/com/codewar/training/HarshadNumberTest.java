package com.codewar.training;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HarshadNumberTest {
    @Test
    public void basicTest(){
        assertEquals(false, HarshadNumber.numberJoy(1997));
    }
}
