package com.yourtion.leetcode.daily.m03.d03;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String s1, int m, String s2, int n, String res) {
        System.out.printf("runTest: %s %s %d, res: %s \n", s1, s2, n, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        new Solution().merge(s1s, m, s2s, n);
        String ret = TestUtils.integerArrayToString(s1s);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void merge() {
        runTest("[1,2,3,0,0,0]", 3, "[2,5,6]", 3, "[1, 2, 2, 3, 5, 6]");
        runTest("[1,2,3,0,0,0,0]", 3, "[2,5,6,7]", 4, "[1, 2, 2, 3, 5, 6, 7]");
    }
}