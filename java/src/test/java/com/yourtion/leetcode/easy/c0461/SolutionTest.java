package com.yourtion.leetcode.easy.c0461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int s1, int s2, int res) {
        System.out.printf("runTest: %d %d , res: %d \n", s1, s2, res);
        Assertions.assertEquals(res, new Solution().hammingDistance(s1, s2));
    }

    @Test
    void hammingDistance() {
        runTest(1, 4, 2);
        runTest(2, 3, 1);
    }
}