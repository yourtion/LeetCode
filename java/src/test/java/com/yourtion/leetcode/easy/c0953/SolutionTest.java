package com.yourtion.leetcode.easy.c0953;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String order, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", source, order, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().isAlienSorted(ss, order));
    }

    @Test
    void isAlienSorted() {
        runTest("hello,leetcode", "hlabcdefgijkmnopqrstuvwxyz", true);
        runTest("word,world,row", "worldabcefghijkmnpqstuvxyz", false);
        runTest("kuvp,q", "ngxlkthsjuoqcpavbfdermiywz", true);
        runTest("apple,app", "abcdefghijklmnopqrstuvwxyz", false);
    }
}