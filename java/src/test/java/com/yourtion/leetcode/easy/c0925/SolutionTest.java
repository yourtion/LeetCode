package com.yourtion.leetcode.easy.c0925;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String name, String typed, boolean res) {
        System.out.printf("runTest: %s %s , res: %b \n", name, typed, res);
        Assertions.assertEquals(res, new Solution().isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName() {
        runTest("alex", "aaleex", true);
        runTest("saeed", "ssaaedd", false);
        runTest("leelee", "lleeelee", true);
        runTest("laiden", "laiden", true);
        runTest("vtkgn", "vttkgnn", true);
        runTest("pyplrz", "ppyypllr", false);
    }
}