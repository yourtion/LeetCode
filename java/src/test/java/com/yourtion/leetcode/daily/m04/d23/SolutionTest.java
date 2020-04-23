package com.yourtion.leetcode.daily.m04.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().waysToChange(source));
    }

    @Test
    void waysToChange() {
        runTest(5, 2);
        runTest(10, 4);
    }
}