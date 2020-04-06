package com.yourtion.leetcode.daily.m04.d06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String w1, String w2, int res) {
        System.out.printf("runTest: %s %s , res: %d \n", w1, w2, res);
        Assertions.assertEquals(res, new Solution().minDistance(w1, w2));
    }

    @Test
    void minDistance() {
        runTest("horse", "ros", 3);
        runTest("intention", "execution", 5);
    }
}