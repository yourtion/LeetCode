package com.yourtion.leetcode.easy.c0326;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isPowerOfThree(source));
    }

    @Test
    void isPowerOfThree() {
        runTest(0, false);
        runTest(1, true);
        runTest(3, true);
        runTest(6, false);
        runTest(9, true);
        runTest(45, false);
    }
}