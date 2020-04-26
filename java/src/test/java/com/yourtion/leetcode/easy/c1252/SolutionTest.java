package com.yourtion.leetcode.easy.c1252;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int n, int m, String source, int res) {
        System.out.printf("runTest: %d %d %s , res: %d \n", n, m, source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().oddCells(n, m, ss));
    }

    @Test
    void oddCells() {
        runTest(2, 3, "[[0,1],[1,1]]", 6);
        runTest(2, 2, "[[1,1],[0,0]]", 0);
    }
}