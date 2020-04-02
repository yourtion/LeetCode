package com.yourtion.leetcode.easy.c0852;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().peakIndexInMountainArray(ss));
    }

    @Test
    void peakIndexInMountainArray() {
        runTest("[0,1,0]", 1);
        runTest("[0,2,1,0]", 1);
        runTest("[1,0]", 0);
        runTest("[0,1,2]", 2);
    }
}