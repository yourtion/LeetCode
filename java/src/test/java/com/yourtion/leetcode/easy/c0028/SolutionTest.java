package com.yourtion.leetcode.easy.c0028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String haystack, String needle, int res) {
        System.out.printf("runTest: %s and %s, res: %d \n", haystack, needle, res);
        assertEquals(res, new Solution().strStr(haystack, needle));
    }

    @Test
    void strStrBase() {
        runTest("hello", "ll", 2);
        runTest("aaaaa", "bba", -1);
        runTest("gyx", "", 0);
        runTest("gyx", "gyx", 0);
    }
}