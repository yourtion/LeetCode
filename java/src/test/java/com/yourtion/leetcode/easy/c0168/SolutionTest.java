package com.yourtion.leetcode.easy.c0168;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().convertToTitle(source));
    }

    @Test
    void convertToTitle() {
        runTest(1, "A");
        runTest(2, "B");
        runTest(3, "C");
        runTest(26, "Z");
        runTest(27, "AA");
        runTest(28, "AB");
        runTest(52, "AZ");
        runTest(881, "AGW");
    }
}