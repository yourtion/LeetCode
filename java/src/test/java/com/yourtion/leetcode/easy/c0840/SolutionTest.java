package com.yourtion.leetcode.easy.c0840;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().numMagicSquaresInside(ss));
    }

    @Test
    void numMagicSquaresInside() {
        runTest("[[4,3,8,4],[9,5,1,9],[2,7,6,2]]", 1);
        runTest("[[4,3,8],[9,5,1],[2,7,6]]", 1);
        runTest("[[3,8,4],[5,1,9],[7,6,2]]", 0);
        runTest("[[5,5,5],[5,5,5],[5,5,5]]", 0);
        runTest("[[1,8,6],[10,5,0],[4,2,9]]", 0);
    }
}