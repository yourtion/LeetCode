package com.yourtion.leetcode.easy.c0844;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s, String t, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", s, t, res);
        Assertions.assertEquals(res, new Solution().backspaceCompare(s, t));
    }

    @Test
    void backspaceCompare() {
        runTest("ab#c", "ad#c", true);
        runTest("ab##", "c#d#", true);
        runTest("a##c", "#a#c", true);
        runTest("a#c", "b", false);
    }
}