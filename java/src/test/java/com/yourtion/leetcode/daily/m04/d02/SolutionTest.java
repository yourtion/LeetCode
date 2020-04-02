package com.yourtion.leetcode.daily.m04.d02;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        new Solution().gameOfLife(ss);
        String ret = TestUtils.int2dArrayToString(ss);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void gameOfLife() {
        runTest("[[0,1,0],[0,0,1],[1,1,1],[0,0,0]]", "[[0, 0, 0],[1, 0, 1],[0, 1, 1],[0, 1, 0]]");
    }
}