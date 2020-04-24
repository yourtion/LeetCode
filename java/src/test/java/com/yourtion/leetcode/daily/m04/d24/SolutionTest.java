package com.yourtion.leetcode.daily.m04.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().reversePairs(ss));
    }

    @Test
    void reversePairs() {
        runTest("[7,5,6,4]", 5);
        runTest("[7,5,6,4,3]", 9);
    }
}