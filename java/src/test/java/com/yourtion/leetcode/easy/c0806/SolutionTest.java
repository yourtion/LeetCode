package com.yourtion.leetcode.easy.c0806;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int[] widths, String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ret = new Solution().numberOfLines(widths, source);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void numberOfLines() {
        int[] w1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        runTest(w1, "abcdefghijklmnopqrstuvwxyz", "[3, 60]");
        int[] w2 = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        runTest(w2, "bbbcccdddaaa", "[2, 4]");
    }
}