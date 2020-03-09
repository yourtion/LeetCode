package com.yourtion.leetcode.daily.m03.d09;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProfit(ss));
    }

    @Test
    void maxProfit() {
        runTest("[7,1,5,3,6,4]", 5);
        runTest("[7,6,4,3,1]", 0);
    }
}