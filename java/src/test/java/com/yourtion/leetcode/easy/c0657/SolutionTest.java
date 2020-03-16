package com.yourtion.leetcode.easy.c0657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().judgeCircle(source));
    }

    @Test
    void judgeCircle() {
        runTest("UD", true);
        runTest("LL", false);
    }
}