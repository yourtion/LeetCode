package com.yourtion.leetcode.daily.m04.d08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int m, int n, int k, int res) {
        System.out.printf("runTest: %d %d %d , res: %d \n", m, n, k, res);
        Assertions.assertEquals(res, new Solution().movingCount(m, n, k));
    }

    @Test
    void movingCount() {
        runTest(2, 3, 1, 3);
        runTest(3, 1, 0, 1);
        runTest(38, 15, 9, 135);
    }
}