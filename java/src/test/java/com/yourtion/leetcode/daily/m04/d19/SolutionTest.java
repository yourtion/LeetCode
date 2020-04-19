package com.yourtion.leetcode.daily.m04.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String s1, int n1, String s2, int n2, int res) {
        System.out.printf("runTest: %s %d , %s, %d, res: %d \n", s1, n1, s2, n2, res);
        Assertions.assertEquals(res, new Solution().getMaxRepetitions(s1, n1, s2, n2));
    }

    @Test
    void getMaxRepetitions() {
        runTest("acb", 4, "ab", 2, 2);
        runTest("acbd", 5, "abc", 3, 0);
    }
}