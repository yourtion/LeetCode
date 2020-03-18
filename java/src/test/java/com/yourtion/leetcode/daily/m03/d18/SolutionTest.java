package com.yourtion.leetcode.daily.m03.d18;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", s1, s2, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().isRectangleOverlap(s1s, s2s));
    }

    @Test
    void isRectangleOverlap() {
        runTest("[0,0,2,2]", "[1,1,3,3]", true);
        runTest("[0,0,1,1]", "[1,0,2,1]", false);
    }
}