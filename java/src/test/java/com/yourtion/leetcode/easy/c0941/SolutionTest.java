package com.yourtion.leetcode.easy.c0941;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().validMountainArray(ss));
    }

    @Test
    void validMountainArray() {
        runTest("[2,1]", false);
        runTest("[3,5,5]", false);
        runTest("[0,3,2,1]", true);
        runTest("[0,3,2,1,2]", false);
        runTest("[14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3]", false);

    }
}