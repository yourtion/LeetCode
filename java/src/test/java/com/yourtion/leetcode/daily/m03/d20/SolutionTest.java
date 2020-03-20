package com.yourtion.leetcode.daily.m03.d20;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().getLeastNumbers(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void getLeastNumbers() {
        runTest("[3,2,1]", 2, "[1, 2]");
        runTest("[0,1,2,1]", 1, "[0]");
    }
}