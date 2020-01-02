package com.yourtion.leetcode.easy.c0013;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s, res: %d \n", source, res);
        assertEquals(res, new Solution().romanToInt(source));
    }

    @Test
    void romanToIntBase() {
        runTest("III", 3);
        runTest("IV", 4);
        runTest("IX", 9);
        runTest("LVIII", 58);
        runTest("MCMXCIV", 1994);

        // I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        runTest("IV", 4);
        runTest("IX", 9);
        // X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
        runTest("XL", 40);
        runTest("XC", 90);
        // C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        runTest("CD", 400);
        runTest("CM", 900);
    }
}