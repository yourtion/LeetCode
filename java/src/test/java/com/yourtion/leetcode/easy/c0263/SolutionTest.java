package com.yourtion.leetcode.easy.c0263;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isUgly(source));
    }

    @Test
    void isUgly() {
        runTest(1, true);
        runTest(8, true);
        runTest(14, false);
        runTest(15, true);
    }
}