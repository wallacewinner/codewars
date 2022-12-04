package com.codewar.training;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i <= array.length - 1; i++)
           array[i] = array[i] * -1;
        return array;
    }
}
