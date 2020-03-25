package com.yourtion.leetcode.easy.c0733;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int sr, int sc, int newColor, String res) {
        System.out.printf("runTest: %s %d %d %d, res: %s \n", source, sr, sc, newColor, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().floodFill(ss, sr, sc, newColor);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

    @Test
    void floodFill() {
        runTest("[[0,0,0],[0,1,1]]", 1, 1, 1, "[[0, 0, 0],[0, 1, 1]]");
        runTest("[[1,1,1],[1,1,0],[1,0,1]]", 1, 1, 2, "[[2, 2, 2],[2, 2, 0],[2, 0, 1]]");
        runTest("[[1,1,1],[1,3,0],[1,3,1]]", 2, 2, 3, "[[1, 1, 1],[1, 3, 0],[1, 3, 3]]");

    }
}