package com.yourtion.leetcode.easy.c0482;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s \n", source, k, res);
        Assertions.assertEquals(res, new Solution().licenseKeyFormatting(source, k));
    }

    @Test
    void licenseKeyFormatting() {
        runTest("5F3Z-2e-9-w", 4, "5F3Z-2E9W");
        runTest("2-5g-3-J", 2, "2-5G-3J");
        runTest("2-4A0r7-4k", 4, "24A0-R74K");
        runTest("--a-a-a-a--", 2, "AA-AA");
    }
}