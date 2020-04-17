package com.yourtion.leetcode.daily.m04.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canJump(ss));
    }

    @Test
    void canJump() {
        runTest("[2,3,1,1,4]", true);
        runTest("[3,2,1,0,4]", false);
    }
}