package com.yourtion.leetcode.daily.m03.d14;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().lengthOfLIS(ss));
    }

    @Test
    void lengthOfLIS() {
        runTest("[10,9,2,5,3,7,101,18]", 4);
        runTest("[1,2,3,4,5]", 5);
        runTest("[5,4,3,2,1]", 1);
        runTest("[1]", 1);
        runTest("[]", 0);
        runTest("[10,9,2,5,3,4]", 3);
    }
}