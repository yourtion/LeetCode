package com.yourtion.leetcode.easy.c0415;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, String res) {
        System.out.printf("runTest: %s + %s , res: %s \n", s1, s2, res);
        Assertions.assertEquals(res, new Solution().addStrings(s1, s2));
    }

    @Test
    void addStrings() {
        runTest("1", "2", "3");
        runTest("1", "9", "10");
        runTest("123456", "54", "123510");
    }
}