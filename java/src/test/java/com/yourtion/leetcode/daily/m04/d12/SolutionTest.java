package com.yourtion.leetcode.daily.m04.d12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(int[] start1, int[] end1, int[] start2, int[] end2, double[] res) {
        System.out.printf("runTest: %s %s  %s %s , res: %s \n",
                Arrays.toString(start1), Arrays.toString(end1),
                Arrays.toString(start2), Arrays.toString(end2),
                Arrays.toString(res)
        );
        Assertions.assertArrayEquals(res, new Solution().intersection(start1, end1, start2, end2));
    }

    @Test
    void intersection1() {
        runTest(new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, -1}, new double[]{0.5, 0});
        runTest(new int[]{0, 0}, new int[]{3, 3}, new int[]{1, 1}, new int[]{2, 2}, new double[]{1, 1});
        runTest(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{2, 1}, new double[]{});
    }
}