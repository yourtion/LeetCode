package com.yourtion.leetcode.daily.m04.d10;

import org.junit.jupiter.api.Assertions;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().reverseWords(source));
    }

    @org.junit.jupiter.api.Test
    void reverseWords() {
        runTest("the sky is blue", "blue is sky the");
        runTest("  hello world!  ", "world! hello");
        runTest("a good   example", "example good a");
        runTest("", "");
    }
}