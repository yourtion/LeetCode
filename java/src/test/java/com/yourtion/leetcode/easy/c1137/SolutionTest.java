package com.yourtion.leetcode.easy.c1137;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().tribonacci(source));
    }

    @Test
    void tribonacci() {
        runTest(3, 2);
        runTest(4, 4);
        runTest(25, 1389537);
    }
}