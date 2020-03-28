package com.yourtion.leetcode.easy.c0788;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().rotatedDigits(source));
    }

    @Test
    void rotatedDigits() {
        runTest(10, 4);
        runTest(20, 9);
    }
}