package com.yourtion.leetcode.easy.c0070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d, res: %d \n", source, res);
        assertEquals(res, new Solution().climbStairs(source));
    }

    @Test
    void climbStairs() {
        runTest(1, 1);
        runTest(2, 2);
        runTest(3, 3);
        runTest(4, 5);
        runTest(5, 8);

    }
}