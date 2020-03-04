package com.yourtion.leetcode.easy.c0509;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().fib(source));
    }

    @Test
    void fib() {
        runTest(0, 0);
        runTest(1, 1);
        runTest(2, 1);
        runTest(3, 2);
        runTest(4, 3);
    }
}