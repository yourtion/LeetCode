package com.yourtion.leetcode.easy.c0520;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().detectCapitalUse(source));
    }

    @Test
    void detectCapitalUse() {
        runTest("USA", true);
        runTest("leetcode", true);
        runTest("Usa", true);
        runTest("UsA", false);
        runTest("FlaG", false);
        runTest("FFFFFFFFFFFFFFFFFFFFf", false);
    }
}