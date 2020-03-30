package com.yourtion.leetcode.daily.m03.d30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int n, int m, int res) {
        System.out.printf("runTest: %d %d , res: %d \n", n, m, res);
        Assertions.assertEquals(res, new Solution().lastRemaining(n, m));
    }

    @Test
    void lastRemaining() {
        runTest(5, 3, 3);
        runTest(10, 17, 2);
    }
}