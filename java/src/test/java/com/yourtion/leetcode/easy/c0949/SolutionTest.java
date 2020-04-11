package com.yourtion.leetcode.easy.c0949;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().largestTimeFromDigits(ss));
    }

    @Test
    void largestTimeFromDigits() {
        runTest("[1,2,3,4]", "23:41");
        runTest("[5,5,5,5]", "");
        runTest("[0,0,0,0]", "00:00");
    }
}