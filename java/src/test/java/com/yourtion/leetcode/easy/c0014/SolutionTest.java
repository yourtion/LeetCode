package com.yourtion.leetcode.easy.c0014;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: [%s], res: %s \n", source, res);
        assertEquals(res, new Solution().longestCommonPrefix(TestUtils.stringToStringArray(source)));
    }

    @Test
    void longestCommonPrefixBase() {
        runTest("flower, flow, flight", "fl");
        runTest("dog, racecar, car", "");
    }

    @Test
    void longestCommonPrefix1() {
        runTest(", ", "");
        runTest("", "");
        runTest("c,c", "c");
        runTest("aa,a", "a");
    }
}