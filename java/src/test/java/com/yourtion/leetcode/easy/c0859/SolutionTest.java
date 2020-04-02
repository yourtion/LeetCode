package com.yourtion.leetcode.easy.c0859;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String a, String b, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", a, b, res);
        Assertions.assertEquals(res, new Solution().buddyStrings(a, b));
    }

    @Test
    void buddyStrings() {
        runTest("ab", "ba", true);
        runTest("ab", "ab", false);
        runTest("aa", "aa", true);
        runTest("aaaaaaabc", "aaaaaaacb", true);
        runTest("", "aa", false);
        runTest("abcaa", "abcbb", false);
    }
}