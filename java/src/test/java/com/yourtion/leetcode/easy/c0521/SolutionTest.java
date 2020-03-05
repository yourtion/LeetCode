package com.yourtion.leetcode.easy.c0521;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String a, String b, int res) {
        System.out.printf("runTest: %s %s , res: %d \n", a, b, res);
        Assertions.assertEquals(res, new Solution().findLUSlength(a, b));
    }

    @Test
    void findLUSlength() {
        runTest("aba", "cdc", 3);
        runTest("abaecdc", "cdc", 7);
    }
}