package com.codewar.training;

import java.util.List;

public class ReverseArrayOfDigits {
    public static int[] digitize(long n) {
        if (n == 0) return new int[]{0};

        long number = n;
        List<Integer> digits = new java.util.ArrayList<Integer>();

        while (number > 0) {
            int digit = (int) (number % 10);
            number /= 10;
            digits.add(digit);
        }

        int[] result = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            result[i] = digits.get(i);
        }

        return result;
    }
}
