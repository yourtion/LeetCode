package com.yourtion.leetcode.easy.c0796;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String a, String b, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", a, b, res);
        Assertions.assertEquals(res, new Solution().rotateString(a, b));
    }

    @Test
    void rotateString() {
        runTest("abcde", "cdeab", true);
        runTest("abcde", "abced", false);
        runTest("abbcde", "cdeabb", true);
    }
}