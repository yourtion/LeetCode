package com.yourtion.leetcode.easy.c0278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int n, int res) {
        System.out.printf("runTest: %d, res: %d \n", n, res);
        Assertions.assertEquals(res, new Solution(res).firstBadVersion(n));
    }

    @Test
    void firstBadVersion() {
        runTest(5, 4);
        runTest(100, 21);
        runTest(3, 3);
    }
}