package com.yourtion.leetcode.easy.c1317;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        int[] ret = new Solution().getNoZeroIntegers(source);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void getNoZeroIntegers() {
        runTest(2, "[1, 1]");
        runTest(11, "[2, 9]");
        runTest(10000, "[1, 9999]");
        runTest(69, "[1, 68]");
        runTest(1010, "[11, 999]");
    }
}