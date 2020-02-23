package com.yourtion.leetcode.easy.c0392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", s1, s2, res);
        Assertions.assertEquals(res, new Solution().isSubsequence(s1, s2));
    }

    @Test
    void isSubsequence() {
        runTest("abc", "ahbgdc", true);
        runTest("axc", "ahbgdc", false);
    }
}