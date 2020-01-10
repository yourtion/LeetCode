package com.yourtion.leetcode.easy.c0067;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source1, String source2, String res) {
        System.out.printf("runTest: %s + %s, res: %s \n", source1, source2, res);
        assertEquals(res, new Solution().addBinary(source1, source2));
    }

    @Test
    void addBinary() {
        runTest("11", "1", "100");
        runTest("1010", "1011", "10101");
        runTest("0", "0", "0");
        runTest("0", "1", "1");
    }
}