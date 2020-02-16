package com.yourtion.leetcode.easy.c0242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b \n", s1, s2, res);
        Assertions.assertEquals(res, new Solution().isAnagram(s1, s2));
    }

    @Test
    void isAnagram() {
        runTest("anagram", "nagaram", true);
        runTest("tar", "car", false);
    }
}