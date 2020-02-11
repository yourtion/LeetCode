package com.yourtion.leetcode.easy.c0202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isHappy(source));
    }

    @Test
    void isHappy() {
        runTest(19, true);
        runTest(68, true);
        runTest(1, true);
        runTest(2, false);
        runTest(3, false);
        runTest(4, false);
        runTest(5, false);
        runTest(6, false);
        runTest(7, true);
        runTest(8, false);
        runTest(9, false);
    }
}