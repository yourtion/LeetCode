package com.yourtion.leetcode.easy.c0434;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().countSegments(source));
    }

    @Test
    void countSegments() {
        runTest("Hello, my name is John", 5);
        runTest("hello", 1);
        runTest("love live! mu'sic forever", 4);
        runTest("love live! mu'sic for-ever", 4);
        runTest(", , , ,        a, eaefa", 6);
        runTest("#@#!%^&*()_+QWERTYUIawefaef", 1);
    }
}