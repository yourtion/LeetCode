package com.yourtion.leetcode.easy.c0507;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().checkPerfectNumber(source));
    }

    @Test
    void checkPerfectNumber() {
        runTest(28, true);
        runTest(1, false);
        runTest(0, false);
    }
}