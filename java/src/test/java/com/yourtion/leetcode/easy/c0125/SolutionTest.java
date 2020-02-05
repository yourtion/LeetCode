package com.yourtion.leetcode.easy.c0125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isPalindrome(source));
    }

    @Test
    void isPalindrome() {
        runTest("A man, a plan, a canal: Panama", true);
        runTest("", true);
        runTest("a", true);
        runTest("aa", true);
        runTest("ab", false);
        runTest("aba", true);
        runTest("abba", true);
        runTest("race a car", false);
    }
}