package com.yourtion.leetcode.easy.c0231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().isPowerOfTwo(source));
    }

    @Test
    void isPowerOfTwo() {
        runTest(1, true);
        runTest(16, true);
        runTest(218, false);
        runTest(0, false);
        runTest(-16, false);
        runTest(1073741825, false);
        runTest(2147483646, false);
    }
}