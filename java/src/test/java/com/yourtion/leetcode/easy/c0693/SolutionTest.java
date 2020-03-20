package com.yourtion.leetcode.easy.c0693;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().hasAlternatingBits(source));
    }

    @Test
    void hasAlternatingBits() {
        runTest(5, true);
        runTest(7, false);
        runTest(11, false);
    }
}