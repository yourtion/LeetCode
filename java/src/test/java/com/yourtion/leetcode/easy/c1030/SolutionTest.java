package com.yourtion.leetcode.easy.c1030;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int r, int c, int r0, int c0, String res) {
        System.out.printf("runTest: %d %d %d %d , res: %s \n", r, c, r0, c0, res);
        int[][] ret = new Solution().allCellsDistOrder(r, c, r0, c0);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

    @Test
    void allCellsDistOrder() {
        runTest(1, 2, 0, 0, "[[0, 0],[0, 1]]");
        runTest(2, 2, 0, 1, "[[0, 1],[0, 0],[1, 1],[1, 0]]");
        runTest(2, 3, 1, 2, "[[1, 2],[0, 2],[1, 1],[0, 1],[1, 0],[0, 0]]");
    }
}