package com.yourtion.leetcode.daily.m03.d25;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().surfaceArea(ss));
    }

    @Test
    void surfaceArea() {
        runTest("[[2]]", 10);
        runTest("[[1,2],[3,4]]", 34);
        runTest("[[1,0],[0,2]]", 16);
        runTest("[[1,1,1],[1,0,1],[1,1,1]]", 32);
        runTest("[[2,2,2],[2,1,2],[2,2,2]]", 46);
    }
}