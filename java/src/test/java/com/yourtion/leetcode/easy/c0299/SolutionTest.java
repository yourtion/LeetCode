package com.yourtion.leetcode.easy.c0299;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String secret, String guess, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", secret, guess, res);
        Assertions.assertEquals(res, new Solution().getHint(secret, guess));
    }

    @Test
    void getHint() {
        runTest("1807", "7810", "1A3B");
        runTest("1123", "0111", "1A1B");
        runTest("1123", "0131", "1A2B");
        runTest("1123", "9383", "1A0B");
        runTest("1123", "4444", "0A0B");
    }
}