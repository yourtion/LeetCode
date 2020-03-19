package com.yourtion.leetcode.easy.c0686;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String a, String b, int res) {
        System.out.printf("runTest: %s %s, res: %d \n", a, b, res);
        Assertions.assertEquals(res, new Solution().repeatedStringMatch(a, b));
    }

    @Test
    void repeatedStringMatch() {
        runTest("abcd", "cdabcdab", 3);
        runTest("abc", "dabc", -1);
        runTest("a", "aa", 2);
        runTest("aaaaaaaaaaaaaaaaaaaaaab", "ba", 2);
    }
}