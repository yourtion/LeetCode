package com.yourtion.leetcode.easy.c0883;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().projectionArea(ss));
    }

    @Test
    void projectionArea() {
        runTest("[[2]]", 5);
        runTest("[[1,2],[3,4]]", 17);
        runTest("[[1,0],[0,2]]", 8);
        runTest("[[1,1,1],[1,0,1],[1,1,1]]", 14);
        runTest("[[2,2,2],[2,1,2],[2,2,2]]", 21);
    }
}