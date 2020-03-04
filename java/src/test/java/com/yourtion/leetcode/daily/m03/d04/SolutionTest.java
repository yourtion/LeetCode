package com.yourtion.leetcode.daily.m03.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().orangesRotting(ss));
    }

    @Test
    void orangesRotting() {
        runTest("[[2,1,1],[1,1,0],[0,1,1]]", 4);
        runTest("[[2,1,1],[0,1,1],[1,0,1]]", -1);
        runTest("[[0,2]]", 0);
        runTest("[[1,2]]", 1);
        runTest("[[1],[2],[2]]", 1);
        runTest("[[1],[1],[1],[1]]", -1);
        runTest("[[2],[2],[1],[0],[1],[1]]", -1);
    }
}