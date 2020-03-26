package com.yourtion.leetcode.easy.c0746;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minCostClimbingStairs(ss));
    }

    @Test
    void minCostClimbingStairs() {
        runTest("[10, 15, 20]", 15);
        runTest("[1, 100, 1, 1, 1, 100, 1, 1, 100, 1]", 6);
    }
}