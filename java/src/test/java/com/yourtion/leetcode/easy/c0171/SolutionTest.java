package com.yourtion.leetcode.easy.c0171;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().titleToNumber(source));
    }

    @Test
    void titleToNumber() {
        runTest("A", 1);
        runTest("Z", 26);
        runTest("AB", 28);
        runTest("AZ", 52);
        runTest("AGW", 881);
    }
}