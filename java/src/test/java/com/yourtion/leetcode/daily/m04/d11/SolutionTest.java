package com.yourtion.leetcode.daily.m04.d11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int k, int n, int res) {
        System.out.printf("runTest: %d %d, res: %d \n", k, n, res);
        Assertions.assertEquals(res, new Solution().superEggDrop(k, n));
    }

    @Test
    void superEggDrop() {
        runTest(1, 2, 2);
        runTest(2, 6, 3);
        runTest(3, 14, 4);
    }
}