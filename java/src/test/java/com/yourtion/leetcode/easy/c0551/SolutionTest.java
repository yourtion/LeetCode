package com.yourtion.leetcode.easy.c0551;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().checkRecord(source));
    }

    @Test
    void checkRecord() {
        runTest("PPALLP", true);
        runTest("PPALLL", false);
    }
}