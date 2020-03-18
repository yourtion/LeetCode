package com.yourtion.leetcode.easy.c0680;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().validPalindrome(source));
    }

    @Test
    void validPalindrome() {
        runTest("aba", true);
        runTest("abca", true);
        runTest("abcd", false);
        runTest("abcddcnba", true);
        runTest("abc", false);
        runTest("tebbem", false);
        runTest("ebcbbececabbacecbbcbe", true);
        runTest("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga", true);
    }
}