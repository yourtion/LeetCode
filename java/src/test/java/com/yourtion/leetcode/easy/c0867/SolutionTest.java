package com.yourtion.leetcode.easy.c0867;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().transpose(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

    @Test
    void transpose() {
        runTest("[[1,2,3],[4,5,6],[7,8,9]]", "[[1, 4, 7],[2, 5, 8],[3, 6, 9]]");
        runTest("[[1,2,3],[4,5,6]]", "[[1, 4],[2, 5],[3, 6]]");
    }
}