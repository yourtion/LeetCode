package com.yourtion.leetcode.easy.c0884;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String a, String b, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", a, b, res);
        String[] ret = new Solution().uncommonFromSentences(a, b);
        Assertions.assertEquals(res, Arrays.toString(ret));
    }

    @Test
    void uncommonFromSentences() {
        runTest("this apple is sweet", "this apple is sour", "[sweet, sour]");
        runTest("apple apple", "banana", "[banana]");
        runTest("fd kss fd", "fd fd kss", "[]");
    }
}