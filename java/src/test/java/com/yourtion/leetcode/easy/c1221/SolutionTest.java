package com.yourtion.leetcode.easy.c1221;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().balancedStringSplit(source));
    }

    @Test
    void balancedStringSplit() {
        runTest("RLRRLLRLRL", 4);
        runTest("RLLLLRRRLR", 3);
        runTest("LLLLRRRR", 1);
    }
}