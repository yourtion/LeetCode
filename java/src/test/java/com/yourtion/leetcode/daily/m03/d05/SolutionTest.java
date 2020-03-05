package com.yourtion.leetcode.daily.m03.d05;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int c, int p, String res) {
        System.out.printf("runTest: %d %d , res: %s \n", c, p, res);
        String ret = TestUtils.integerArrayToString(new Solution().distributeCandies(c, p));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void distributeCandies() {
        runTest(7, 4, "[1, 2, 3, 1]");
        runTest(10, 3, "[5, 2, 3]");
    }
}