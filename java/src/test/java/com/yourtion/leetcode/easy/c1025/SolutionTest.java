package com.yourtion.leetcode.easy.c1025;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().divisorGame(source));
    }

    @Test
    void divisorGame() {
        runTest(2, true);
        runTest(3, false);
    }
}