package com.yourtion.leetcode.easy.c0661;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        String ret = TestUtils.int2dArrayToString(new Solution().imageSmoother(ss));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void imageSmoother() {
        runTest("[[1,1,1],[1,0,1],[1,1,1]]", "[[0, 0, 0],[0, 0, 0],[0, 0, 0]]");
        runTest("[[1,1,1],[1,1,1],[1,1,1]]", "[[1, 1, 1],[1, 1, 1],[1, 1, 1]]");

    }
}