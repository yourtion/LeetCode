package com.yourtion.leetcode.easy.c0374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution(res).guessNumber(source));
    }

    @Test
    void guessNumber() {
        runTest(10, 6);
        runTest(100, 2);
    }
}