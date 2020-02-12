package com.yourtion.leetcode.easy.c0204;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().countPrimes(source));
    }

    @Test
    void countPrimes() {
        runTest(10, 4);
        runTest(12, 5);
        runTest(100, 25);
        runTest(2, 0);
        runTest(499979, 41537);
        runTest(1500000, 114155);
    }
}