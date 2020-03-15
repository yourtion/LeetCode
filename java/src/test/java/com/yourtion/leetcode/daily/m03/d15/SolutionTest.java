package com.yourtion.leetcode.daily.m03.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().maxAreaOfIsland(ss));
    }

    @Test
    void maxAreaOfIsland() {
        runTest("[[0,0,1,0,0,0,0,1,0,0,0,0,0]," +
                " [0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                " [0,1,1,0,1,0,0,0,0,0,0,0,0]," +
                " [0,1,0,0,1,1,0,0,1,0,1,0,0]," +
                " [0,1,0,0,1,1,0,0,1,1,1,0,0]," +
                " [0,0,0,0,0,0,0,0,0,0,1,0,0]," +
                " [0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                " [0,0,0,0,0,0,0,1,1,0,0,0,0]]", 6);
        runTest("[[0,0,0,0,0,0,0,0]]", 0);
    }
}