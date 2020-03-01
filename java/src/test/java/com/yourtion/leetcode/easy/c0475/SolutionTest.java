package com.yourtion.leetcode.easy.c0475;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, int res) {
        System.out.printf("runTest: %s %s, res: %d \n", s1, s2, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().findRadius(s1s, s2s));
    }

    @Test
    void findRadius() {
        runTest("[1,2,3]", "[2]", 1);
        runTest("[1,2,3,4]", "[1,4]", 1);
    }
}