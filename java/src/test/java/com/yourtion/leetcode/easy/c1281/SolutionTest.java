package com.yourtion.leetcode.easy.c1281;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().subtractProductAndSum(source));
    }

    @Test
    void subtractProductAndSum() {
        runTest(234, 15);
        runTest(4421, 21);
    }
}