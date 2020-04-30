package com.yourtion.leetcode.easy.c1323;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().maximum69Number(source));
    }

    @Test
    void maximum69Number() {
        runTest(9669, 9969);
        runTest(9996, 9999);
        runTest(9999, 9999);
    }
}