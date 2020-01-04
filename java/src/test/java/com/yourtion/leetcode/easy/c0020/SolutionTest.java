package com.yourtion.leetcode.easy.c0020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s, res: %b \n", source, res);
        assertEquals(res, new Solution().isValid(source));
    }

    @Test
    void isValidBase() {
        runTest("", true);
        runTest("()[]{}", true);
        runTest("(]", false);
        runTest("([)]", false);
        runTest("{[]}", true);
        runTest("(])", false);
    }

    @Test
    void isValid1() {
        runTest("]", false);
        runTest("}}", false);
        runTest("]]]", false);

    }
}