package com.yourtion.leetcode.daily.m04.d01;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ret = new Solution().maxDepthAfterSplit(source);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void maxDepthAfterSplit() {
        runTest("(()())", "[1, 0, 0, 0, 0, 1]");
        runTest("()(())()", "[1, 1, 1, 0, 0, 1, 1, 1]");
    }
}