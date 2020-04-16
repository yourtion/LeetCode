package com.yourtion.leetcode.easy.c1021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().removeOuterParentheses(source));
    }

    @Test
    void removeOuterParentheses() {
        runTest("(()())(())", "()()()");
        runTest("(()())(())(()(()))", "()()()()(())");
        runTest("()()", "");
    }
}