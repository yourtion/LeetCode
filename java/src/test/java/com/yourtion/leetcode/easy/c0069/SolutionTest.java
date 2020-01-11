package com.yourtion.leetcode.easy.c0069;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d, res: %s \n", source, res);
        assertEquals(res, new Solution().mySqrt(source));
    }

    @Test
    void mySqrt() {
        runTest(4, 2);
        runTest(8, 2);

    }
}