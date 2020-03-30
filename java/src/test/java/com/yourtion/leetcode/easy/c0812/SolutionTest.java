package com.yourtion.leetcode.easy.c0812;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, double res) {
        System.out.printf("runTest: %s , res: %f \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().largestTriangleArea(ss));
    }

    @Test
    void largestTriangleArea() {
        runTest("[[0,0],[0,1],[1,0],[0,2],[2,0]]", 2.0);
        runTest("[[0,1],[1,0],[2,0]]", 0.5);
    }
}