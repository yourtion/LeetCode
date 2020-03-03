package com.yourtion.leetcode.easy.c0504;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().convertToBase7(source));
    }

    @Test
    void convertToBase7() {
        runTest(100, "202");
        runTest(-7, "-10");
    }
}