package com.yourtion.leetcode.easy.c0345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().reverseVowels(source));
    }

    @Test
    void reverseVowels() {
        runTest("hello", "holle");
        runTest("leetcode", "leotcede");
        runTest("Aa", "aA");
    }
}