package com.yourtion.leetcode.easy.c0696;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().countBinarySubstrings(source));
    }

    @Test
    void countBinarySubstrings() {
        runTest("00110011", 6);
        runTest("10101", 4);
    }
}