package com.yourtion.leetcode.daily.m04.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().myAtoi(source));
    }

    @Test
    void myAtoi() {
        runTest("42", 42);
        runTest("   -42", -42);
        runTest("4193 with words", 4193);
        runTest("words and 987", 0);
        runTest("-91283472332", -2147483648);
        runTest("+1", 1);
        runTest("+-2", 0);
        runTest("2147483648", 2147483647);
        runTest("2147483646", 2147483646);
        runTest("-2147483647", -2147483647);
    }
}