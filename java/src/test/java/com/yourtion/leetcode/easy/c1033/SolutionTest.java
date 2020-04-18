package com.yourtion.leetcode.easy.c1033;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int a, int b, int c, String res) {
        System.out.printf("runTest: %d %d %d , res: %s \n", a, b, c, res);
        int[] ret = new Solution().numMovesStones(a, b, c);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void numMovesStones() {
        runTest(1, 2, 5, "[1, 2]");
        runTest(4, 3, 2, "[0, 0]");
        runTest(6, 4, 2, "[1, 2]");
        runTest(3, 5, 1, "[1, 2]");
    }
}