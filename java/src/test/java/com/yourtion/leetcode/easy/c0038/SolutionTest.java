package com.yourtion.leetcode.easy.c0038;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d, res: %s \n", source, res);
        assertEquals(res, new Solution().countAndSay(source));
    }

    @Test
    void countAndSay() {
        runTest(1, "1");
        runTest(2, "11");
        runTest(3, "21");
        runTest(4, "1211");
        runTest(5, "111221");
        runTest(6, "312211");
    }
}