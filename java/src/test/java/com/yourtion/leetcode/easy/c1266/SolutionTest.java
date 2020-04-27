package com.yourtion.leetcode.easy.c1266;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().minTimeToVisitAllPoints(ss));
    }

    @Test
    void minTimeToVisitAllPoints() {
        runTest("[[1,1],[3,4],[-1,0]]", 7);
        runTest("[[3,2],[-2,2]]", 5);
    }
}