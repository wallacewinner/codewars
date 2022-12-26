package com.codewar.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthSeriesTest {
    @Test
    public void test1() {
        assertEquals("1.57", NthSeries.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", NthSeries.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", NthSeries.seriesSum(15));
    }
}
