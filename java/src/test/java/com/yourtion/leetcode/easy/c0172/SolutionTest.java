package com.yourtion.leetcode.easy.c0172;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().trailingZeroes(source));
    }

    @Test
    void trailingZeroes() {
        runTest(3, 0);
        runTest(5, 1);
        runTest(10, 2);
        runTest(30, 7);
        runTest(50, 12);
        runTest(100, 24);
        runTest(6503, 1624);
    }
}