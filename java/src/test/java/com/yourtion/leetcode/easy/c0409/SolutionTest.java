package com.yourtion.leetcode.easy.c0409;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().longestPalindrome(source));
    }

    @Test
    void longestPalindrome() {
        runTest("abccccdd", 7);
        runTest("abcccCdd", 5);
        runTest("aabcdefh", 3);
        runTest("abcdef", 1);
        runTest("aabcdefhh", 5);
        runTest("", 0);
        runTest("bb", 2);
        runTest("ccc", 3);
        runTest("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez", 55);
    }
}