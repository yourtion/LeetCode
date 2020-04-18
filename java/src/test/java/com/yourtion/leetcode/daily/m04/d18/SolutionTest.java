package com.yourtion.leetcode.daily.m04.d18;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxArea(ss));
    }

    @Test
    void maxArea() {
        runTest("[1,8,6,2,5,4,8,3,7]", 49);
    }
}