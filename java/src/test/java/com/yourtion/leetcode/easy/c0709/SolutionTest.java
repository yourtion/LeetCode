package com.yourtion.leetcode.easy.c0709;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().toLowerCase(source));
    }

    @Test
    void toLowerCase() {
        runTest("Hello", "hello");
        runTest("hello", "hello");
        runTest("LOVELY", "lovely");
    }
}