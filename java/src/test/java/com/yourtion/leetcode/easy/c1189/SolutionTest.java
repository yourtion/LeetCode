package com.yourtion.leetcode.easy.c1189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().maxNumberOfBalloons(source));
    }

    @Test
    void maxNumberOfBalloons() {
        runTest("nlaebolko", 1);
        runTest("loonbalxballpoon", 2);
        runTest("leetcode", 0);
    }
}