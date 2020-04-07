package com.yourtion.leetcode.easy.c0908;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().smallestRangeI(ss, k));
    }

    @Test
    void smallestRangeI() {
        runTest("[1]", 0, 0);
        runTest("[0,10]", 2, 6);
        runTest("[1,3,6]", 3, 0);
    }
}