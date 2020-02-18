package com.yourtion.leetcode.easy.c0283;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().moveZeroes(ss);
        String ret = TestUtils.integerArrayToString(ss);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void moveZeroes() {
        runTest("[0,1,0,3,12]", "[1, 3, 12, 0, 0]");
        runTest("[0,1]", "[1, 0]");
        runTest("[0,0,0,0,12]", "[12, 0, 0, 0, 0]");
    }
}