package com.yourtion.leetcode.easy.c0389;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String s1, String s2, char res) {
        System.out.printf("runTest: %s %s, res: %s \n", s1, s2, res);
        Assertions.assertEquals(res, new Solution().findTheDifference(s1, s2));
    }

    @Test
    void findTheDifference() {
        runTest("abcd", "abcde", 'e');
        runTest("aaa", "caaa", 'c');
    }
}