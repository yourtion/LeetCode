package com.yourtion.leetcode.daily.m04.d21;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int k, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().numberOfSubarrays(ss, k));
    }

    @Test
    void numberOfSubarrays() {
        runTest("[1,1,2,1,1]", 3, 2);
        runTest("[2,4,6]", 1, 0);
        runTest("[2,2,2,1,2,2,1,2,2,2]", 2, 16);
    }
}