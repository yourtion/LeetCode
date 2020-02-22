package com.yourtion.leetcode.easy.c0383;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String ransomNote, String magazine, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", ransomNote, magazine, res);
        Assertions.assertEquals(res, new Solution().canConstruct(ransomNote, magazine));
    }

    @Test
    void canConstruct() {
        runTest("a", "b", false);
        runTest("aa", "ab", false);
        runTest("aa", "aab", true);
    }
}