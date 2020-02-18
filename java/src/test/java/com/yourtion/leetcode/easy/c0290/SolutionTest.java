package com.yourtion.leetcode.easy.c0290;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String pattern, String str, boolean res) {
        System.out.printf("runTest: %s %s , res: %b \n", pattern, str, res);
        Assertions.assertEquals(res, new Solution().wordPattern(pattern, str));
    }

    @Test
    void wordPattern() {
        runTest("abba", "dog cat cat dog", true);
        runTest("abba", "dog cat cat fish", false);
        runTest("aaaa", "dog cat cat dog", false);
        runTest("abba", "dog dog dog dog", false);
        runTest("aaaa", "dog dog dog dog", true);
    }
}