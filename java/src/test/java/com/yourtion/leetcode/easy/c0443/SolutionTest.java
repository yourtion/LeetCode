package com.yourtion.leetcode.easy.c0443;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        char[] sArr = source.toCharArray();
        Assertions.assertEquals(res.length(), new Solution().compress(sArr));
        Assertions.assertEquals(res, new String(Arrays.copyOf(sArr, res.length())));
    }

    @Test
    void compress() {
        runTest("aabbccc", "a2b2c3");
        runTest("a", "a");
        runTest("abbbbbbbbbbbb", "ab12");
        runTest("aaaa", "a4");
        runTest("aaabbaa", "a3b2a2");
    }
}