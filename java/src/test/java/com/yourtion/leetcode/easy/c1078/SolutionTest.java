package com.yourtion.leetcode.easy.c1078;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String text, String first, String second, String res) {
        System.out.printf("runTest: %s , %s %s , res: %s \n", text, first, second, res);
        String[] ret = new Solution().findOcurrences(text, first, second);
        Assertions.assertEquals(res, Arrays.toString(ret));
    }

    @Test
    void findOcurrences() {
        runTest("alice is a good girl she is a good student", "a", "good", "[girl, student]");
        runTest("we will we will rock you", "we", "will", "[we, rock]");
    }
}