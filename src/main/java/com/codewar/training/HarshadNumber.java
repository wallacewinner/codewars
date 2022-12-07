package com.codewar.training;

/**
 * Positive integers that are divisible exactly by the sum of their digits are called Harshad numbers.
 * The first few Harshad numbers are: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, ...
 * We are interested in Harshad numbers where the product of its digit sum s and s with the digits reversed,
 * gives the original number n. For example consider number 1729:
 * its digit sum, s = 1 + 7 + 2 + 9 = 19
 * reversing s = 91
 * and 19 * 91 = 1729 --> the number that we started with.
 * Complete the function which tests if a positive integer n is Harshad number,
 * and returns True if the product of its digit sum and its digit sum reversed equals n; otherwise return False.
 */
public class HarshadNumber {

    public static boolean numberJoy(Integer value){
        int digitSum = 0;
        for (String number : value.toString().split("")) {
            digitSum += Integer.valueOf(number);
        }
        int digitSumReversed = (reverseNumber(digitSum));
        return(digitSum * digitSumReversed == value);
    }

    private static int reverseNumber(int value){
        int dec,unit = 0;
        dec = value % 10;
        if(value / 10 != 0) {
            dec = dec * 10;
        }

        unit = (value / 10) % 10;
        if((value / 10) % 10 > 1){
            dec = dec * 10;
            unit = unit * 10;
        }

        return (dec + unit);
    }
}
