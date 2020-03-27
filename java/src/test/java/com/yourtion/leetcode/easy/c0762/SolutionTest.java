package com.yourtion.leetcode.easy.c0762;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int l, int r, int res) {
        System.out.printf("runTest: %d %d , res: %d \n", l, r, res);
        Assertions.assertEquals(res, new Solution().countPrimeSetBits(l, r));
    }

    @Test
    void countPrimeSetBits() {
        runTest(6, 10, 4);
        runTest(10, 15, 5);
    }
}