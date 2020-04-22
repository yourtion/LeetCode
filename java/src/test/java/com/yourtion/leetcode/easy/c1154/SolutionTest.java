package com.yourtion.leetcode.easy.c1154;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().dayOfYear(source));
    }

    @Test
    void dayOfYear() {
        runTest("2019-01-09", 9);
        runTest("2019-02-10", 41);
        runTest("2003-03-01", 60);
        runTest("2004-03-01", 61);
        runTest("2016-02-29", 60);
    }
}