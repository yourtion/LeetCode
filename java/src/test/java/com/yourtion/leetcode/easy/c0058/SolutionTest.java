package com.yourtion.leetcode.easy.c0058;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s, res: %d \n", source, res);
        assertEquals(res, new Solution().lengthOfLastWord(source));
    }

    @Test
    void lengthOfLastWord() {
        runTest("Hello World", 5);
        runTest("", 0);
        runTest(" ", 0);
    }
}