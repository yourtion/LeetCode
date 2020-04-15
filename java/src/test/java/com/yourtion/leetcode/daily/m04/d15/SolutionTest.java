package com.yourtion.leetcode.daily.m04.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().updateMatrix(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

    @Test
    void updateMatrix() {
        runTest("[[0,0,0],[0,1,0],[0,0,0]]", "[[0, 0, 0],[0, 1, 0],[0, 0, 0]]");
        runTest("[[0,0,0],[0,1,0],[1,1,1]]", "[[0, 0, 0],[0, 1, 0],[1, 2, 1]]");
    }
}