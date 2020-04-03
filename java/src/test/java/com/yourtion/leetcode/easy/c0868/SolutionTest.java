package com.yourtion.leetcode.easy.c0868;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().binaryGap(source));
    }

    @Test
    void binaryGap() {
        runTest(22, 2);
        runTest(5, 2);
        runTest(6, 1);
        runTest(8, 0);
    }
}