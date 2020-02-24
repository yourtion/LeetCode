package com.yourtion.leetcode.easy.c0405;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().toHex(source));
    }

    @Test
    void toHex() {
        runTest(26, "1a");
        runTest(-1, "ffffffff");
        runTest(0, "0");

    }
}