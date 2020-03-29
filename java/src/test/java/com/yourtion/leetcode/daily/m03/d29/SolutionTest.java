package com.yourtion.leetcode.daily.m03.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().maxDistance(ss));
    }

    @Test
    void maxDistance() {
        runTest("[[1,0,1],[0,0,0],[1,0,1]]", 2);
        runTest("[[1,0,0],[0,0,0],[0,0,0]]", 4);
    }
}