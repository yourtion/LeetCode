package com.yourtion.leetcode.easy.c0459;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().repeatedSubstringPattern(source));
    }

    @Test
    void repeatedSubstringPattern() {
        runTest("abab", true);
        runTest("aba", false);
        runTest("abcabcabcabc", true);
    }
}