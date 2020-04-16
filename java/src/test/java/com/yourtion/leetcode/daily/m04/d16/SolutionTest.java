package com.yourtion.leetcode.daily.m04.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().merge(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

    @Test
    void merge() {
        runTest("[[1,3],[2,6],[8,10],[15,18]]", "[[1, 6],[8, 10],[15, 18]]");
        runTest("[[1,4],[4,5]]", "[[1, 5]]");
    }
}