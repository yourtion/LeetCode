package com.yourtion.leetcode.easy.c0371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int n1, int n2, int res) {
        System.out.printf("runTest: %d + %d, res: %d \n", n1, n2, res);
        Assertions.assertEquals(res, new Solution().getSum(n1, n2));
    }

    @Test
    void getSum() {
        runTest(1, 2, 3);
        runTest(-2, 3, 1);
    }
}