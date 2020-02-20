package com.yourtion.leetcode.easy.c0344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        char[] ss = source.toCharArray();
        new Solution().reverseString(ss);
        char[] ret = res.toCharArray();
        Assertions.assertArrayEquals(ret, ss);
    }

    @Test
    void reverseString() {
        runTest("hello", "olleh");
        runTest("Hannah", "hannaH");
    }
}