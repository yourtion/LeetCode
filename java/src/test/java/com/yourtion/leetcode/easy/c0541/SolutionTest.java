package com.yourtion.leetcode.easy.c0541;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s \n", source, k, res);
        Assertions.assertEquals(res, new Solution().reverseStr(source, k));
    }

    @Test
    void reverseStr() {
        runTest("abcdefg", 2, "bacdfeg");
        runTest("abcdefgh", 3, "cbadefhg");
        runTest("abcdefg", 3, "cbadefg");
        runTest("abcdefgh", 1, "abcdefgh");
    }
}