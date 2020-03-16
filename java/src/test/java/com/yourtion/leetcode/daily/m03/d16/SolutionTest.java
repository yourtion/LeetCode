package com.yourtion.leetcode.daily.m03.d16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().compressString(source));
    }

    @Test
    void compressString() {
        runTest("aabcccccaaa", "a2b1c5a3");
        runTest("abbccd", "abbccd");
        runTest("abbbbbbbbbbbb", "a1b12");
    }
}