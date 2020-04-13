package com.yourtion.leetcode.easy.c0977;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().sortedSquares(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void sortedSquares() {
        runTest("[-4,-1,0,3,10]", "[0, 1, 9, 16, 100]");
        runTest("[-7,-3,2,3,11]", "[4, 9, 9, 49, 121]");
    }
}