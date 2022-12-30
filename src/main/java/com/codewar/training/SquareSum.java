package com.codewar.training;

public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int j : n) sum += j * j;
        return sum;
    }
}
