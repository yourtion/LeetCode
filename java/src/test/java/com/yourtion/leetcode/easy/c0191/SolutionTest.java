package com.yourtion.leetcode.easy.c0191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int in = Integer.parseUnsignedInt(source, 2);
        Assertions.assertEquals(res, new Solution().hammingWeight(in));
    }

    @Test
    void hammingWeight() {
        runTest("00000000000000000000000000001011", 3);
        runTest("00000000000000000000000010000000", 1);
        runTest("11111111111111111111111111111101", 31);
    }
}