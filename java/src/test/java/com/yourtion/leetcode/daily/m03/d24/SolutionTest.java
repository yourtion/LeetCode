package com.yourtion.leetcode.daily.m03.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().massage(ss));
    }

    @Test
    void massage() {
        runTest("[1,2,3,1]", 4);
        runTest("[2,7,9,3,1]", 12);
        runTest("[2,1,4,5,3,1,1,3]", 12);
        runTest("[]", 0);
    }
}