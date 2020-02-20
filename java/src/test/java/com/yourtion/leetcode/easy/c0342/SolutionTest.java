package com.yourtion.leetcode.easy.c0342;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isPowerOfFour(source));
    }

    @Test
    void isPowerOfFour() {
        runTest(1, true);
        runTest(16, true);
        runTest(5, false);
    }
}