package com.yourtion.leetcode.easy.c1175;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().numPrimeArrangements(source));
    }

    @Test
    void numPrimeArrangements() {
        runTest(5, 12);
        runTest(100, 682289015);
    }
}