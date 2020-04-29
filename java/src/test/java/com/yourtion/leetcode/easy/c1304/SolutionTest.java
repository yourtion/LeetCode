package com.yourtion.leetcode.easy.c1304;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        int[] ret = new Solution().sumZero(source);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void sumZero() {
        runTest(5, "[-1, -2, 1, 2, 0]");
        runTest(3, "[-1, 1, 0]");
        runTest(2, "[-1, 1]");
        runTest(1, "[0]");
    }
}