package com.yourtion.leetcode.easy.c0874;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String commands, String obstacles, int res) {
        System.out.printf("runTest: %s %s , res: %d \n", commands, obstacles, res);
        int[] cs = TestUtils.stringToIntegerArray(commands);
        int[][] os = TestUtils.stringToInt2dArray(obstacles);
        Assertions.assertEquals(res, new Solution().robotSim(cs, os));
    }

    @Test
    void robotSim() {
        runTest("[4,-1,3]", "[]", 25);
        runTest("[4,-1,4,-2,4]", "[[2,4]]", 65);
    }
}