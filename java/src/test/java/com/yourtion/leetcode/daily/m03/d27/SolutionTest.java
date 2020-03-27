package com.yourtion.leetcode.daily.m03.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().hasGroupsSizeX(ss));
    }

    @Test
    void hasGroupsSizeX() {
        runTest("[1,2,3,4,4,3,2,1]", true);
        runTest("[1,1,1,2,2,2,3,3]", false);
        runTest("[1]", false);
        runTest("[1,1]", true);
        runTest("[1,1,2,2,2,2]", true);
        runTest("[1,1,1,1,2,2,2,2,2,2]", true);
    }
}