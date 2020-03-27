package com.yourtion.leetcode.easy.c0771;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String j, String s, int res) {
        System.out.printf("runTest: %s %s, res: %d \n", j, s, res);
        Assertions.assertEquals(res, new Solution().numJewelsInStones(j, s));
    }

    @Test
    void numJewelsInStones() {
        runTest("aA", "aAAbbbb", 3);
        runTest("z", "ZZ", 0);
    }
}