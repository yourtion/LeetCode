package com.yourtion.leetcode.easy.c0766;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().isToeplitzMatrix(ss));
    }

    @Test
    void isToeplitzMatrix() {
        runTest("[[1,2,3,4],[5,1,2,3],[9,5,1,2]]", true);
        runTest("[[1,2],[2,2]]", false);
    }
}