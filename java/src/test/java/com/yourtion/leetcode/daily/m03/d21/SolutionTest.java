package com.yourtion.leetcode.daily.m03.d21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int x, int y, int z, boolean res) {
        System.out.printf("runTest: %d %d %d , res: %b \n", x, y, z, res);
        Assertions.assertEquals(res, new Solution().canMeasureWater(x, y, z));
    }

    @Test
    void canMeasureWater() {
        runTest(3, 5, 4, true);
        runTest(2, 6, 5, false);
    }
}