package com.yourtion.leetcode.easy.c0292;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d, res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().canWinNim(source));
    }

    @Test
    void canWinNim() {
        runTest(1, true);
        runTest(2, true);
        runTest(3, true);
        runTest(4, false);
    }
}