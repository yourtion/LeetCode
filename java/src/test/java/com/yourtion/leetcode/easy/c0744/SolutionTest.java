package com.yourtion.leetcode.easy.c0744;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, char c, char res) {
        System.out.printf("runTest: %s %c, res: %c \n", source, c, res);
        Assertions.assertEquals(res, new Solution().nextGreatestLetter(source.toCharArray(), c));
    }

    @Test
    void nextGreatestLetter() {
        runTest("abc", 'z', 'a');
        runTest("cfj", 'a', 'c');
        runTest("cfj", 'c', 'f');
        runTest("cfj", 'd', 'f');
        runTest("cfj", 'g', 'j');
        runTest("cfj", 'j', 'c');
        runTest("cfj", 'k', 'c');
        runTest("mzcfj", 'n', 'z');
        runTest("eeekqqqvvy", 'n', 'q');
        runTest("eeekqqqvvy", 'o', 'q');

    }
}