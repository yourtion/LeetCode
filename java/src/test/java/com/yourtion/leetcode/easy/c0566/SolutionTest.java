package com.yourtion.leetcode.easy.c0566;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int r, int c, String res) {
        System.out.printf("runTest: %s %d %d , res: %s \n", source, r, c, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        String ret = TestUtils.int2dArrayToString(new Solution().matrixReshape(ss, r, c));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void matrixReshape() {
        runTest("[[1,2],[3,4]]", 1, 4, "[[1, 2, 3, 4]]");
        runTest("[[1,2],[3,4]]", 2, 4, "[[1, 2],[3, 4]]");
        runTest("[[1,2],[3,4],[5,6]]", 2, 3, "[[1, 2, 3],[4, 5, 6]]");
    }
}