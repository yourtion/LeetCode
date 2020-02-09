package com.yourtion.leetcode.easy.c0190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int in = Integer.parseUnsignedInt(source, 2);
        int ret = Integer.parseUnsignedInt(res, 2);
        int out = new Solution().reverseBits(in);
        Assertions.assertEquals(ret, out);
    }

    @Test
    void reverseBits() {
        runTest("11111111111111111111111111111101", "10111111111111111111111111111111");
        runTest("11111111111111111111111111111101", "10111111111111111111111111111111");
        runTest("00000010100101000001111010011100", "00111001011110000010100101000000");
    }
}