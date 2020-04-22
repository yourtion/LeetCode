package com.yourtion.leetcode.easy.c1170;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    void runTest(String[] queries, String[] words, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", Arrays.toString(queries), Arrays.toString(words), res);
        int[] ret = new Solution().numSmallerByFrequency(queries, words);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void numSmallerByFrequency() {
        runTest(new String[]{"cbd"}, new String[]{"zaaaz"}, "[1]");
        runTest(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"}, "[1, 2]");
    }
}