package com.yourtion.leetcode.easy.c0367;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d, res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isPerfectSquare(source));
    }

    @Test
    void isPerfectSquare() {
        runTest(16, true);
        runTest(14, false);
        runTest(2147483647, false);
    }
}