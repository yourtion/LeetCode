package com.yourtion.leetcode.daily.m03.d08;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int num, int res) {
        System.out.printf("runTest: %s %d, res: %d \n", source, num, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().coinChange(ss, num));
    }

    @Test
    void coinChange() {
        runTest("[1, 2, 5]", 11, 3);
        runTest("[2]", 3, -1);
    }
}