package com.yourtion.leetcode.daily.m04.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().trap(ss));
    }

    @Test
    void trap() {
        runTest("[0,1,0,2,1,0,1,3,2,1,2,1]", 6);
        runTest("[0,1,0,2,1,0,1,3,2,1,2,3]", 9);
    }
}