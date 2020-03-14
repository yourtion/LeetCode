package com.yourtion.leetcode.easy.c0633;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().judgeSquareSum(source));
    }

    @Test
    void judgeSquareSum() {
        runTest(5, true);
        runTest(3, false);
        runTest(4, true);
        runTest(1, true);
        runTest(6, false);
        runTest(2147482647, false);
    }
}