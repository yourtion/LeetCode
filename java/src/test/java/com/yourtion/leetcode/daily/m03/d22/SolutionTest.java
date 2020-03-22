package com.yourtion.leetcode.daily.m03.d22;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minIncrementForUnique(ss));
    }

    @Test
    void minIncrementForUnique() {
        runTest("[1,2,2]", 1);
        runTest("[3,2,1,2,1,7]", 6);
    }
}