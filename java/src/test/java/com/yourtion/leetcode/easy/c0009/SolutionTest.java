package com.yourtion.leetcode.easy.c0009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d, res: %b \n", source, res);
        assertEquals(res, new Solution().isPalindrome(source));
    }

    @Test
    void isPalindromeBase() {
        runTest(121, true);
        runTest(-121, false);
        runTest(10, false);
        runTest(12321, true);
    }

    @Test
    void isPalindrome1() {
        runTest(0, true);
        runTest(1, true);
    }
}