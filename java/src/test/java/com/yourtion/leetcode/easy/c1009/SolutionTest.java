package com.yourtion.leetcode.easy.c1009;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().bitwiseComplement(source));
    }

    @Test
    void bitwiseComplement() {
        runTest(5, 2);
        runTest(7, 0);
        runTest(10, 5);
    }
}