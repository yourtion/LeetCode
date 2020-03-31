package com.yourtion.leetcode.easy.c0821;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, char c, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", source, c, res);
        int[] ret = new Solution().shortestToChar(source, c);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void shortestToChar() {
        runTest("loveleetcode", 'e', "[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]");
        runTest("aab", 'a', "[0, 0, 1]");
        runTest("aaab", 'b', "[3, 2, 1, 0]");
    }
}