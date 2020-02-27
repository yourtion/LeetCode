package com.yourtion.leetcode.easy.c0441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().arrangeCoins(source));
    }

    @Test
    void arrangeCoins() {
        runTest(5, 2);
        runTest(8, 3);
        runTest(1, 1);
        runTest(15, 5);
    }
}