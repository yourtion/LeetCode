package com.yourtion.leetcode.easy.c1037;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().isBoomerang(ss));
    }

    @Test
    void isBoomerang() {
        runTest("[[1,1],[2,3],[3,2]]", true);
        runTest("[[1,1],[2,2],[3,3]]", false);
    }
}