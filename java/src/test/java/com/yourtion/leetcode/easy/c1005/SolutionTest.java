package com.yourtion.leetcode.easy.c1005;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().largestSumAfterKNegations(ss, k));
    }

    @Test
    void largestSumAfterKNegations() {
        runTest("[4,2,3]", 1, 5);
        runTest("[3,-1,0,2]", 3, 6);
        runTest("[2,-3,-1,5,-4]", 2, 13);
    }
}