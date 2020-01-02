package com.yourtion.leetcode.easy.c0007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(int source, int res) {
        assertEquals(res, new Solution().reverse(source));
    }

    @Test
    void reverseBase() {
        runTest(123, 321);
        runTest(-123, -321);
        runTest(120, 21);
    }

    @Test
    void reverse2() {
        runTest(1534236469, 0);
    }
}