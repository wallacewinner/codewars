package com.codewar.training;

import org.junit.Assert;
import org.junit.Test;

public class SumOfOddNumbersTest {
    @Test
    public void test1(){
        Assert.assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        Assert.assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }
}
