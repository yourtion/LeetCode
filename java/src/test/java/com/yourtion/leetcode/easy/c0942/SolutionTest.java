package com.yourtion.leetcode.easy.c0942;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ret = new Solution().diStringMatch(source);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void diStringMatch() {
        runTest("IDID", "[0, 4, 1, 3, 2]");
        runTest("III", "[0, 1, 2, 3]");
        runTest("DDI", "[3, 2, 0, 1]");
    }
}