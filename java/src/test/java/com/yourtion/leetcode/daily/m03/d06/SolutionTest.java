package com.yourtion.leetcode.daily.m03.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        String ret = TestUtils.int2dArrayToString(new Solution().findContinuousSequence(source));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void findContinuousSequence() {
        runTest(9, "[[2, 3, 4],[4, 5]]");
        runTest(15, "[[1, 2, 3, 4, 5],[4, 5, 6],[7, 8]]");
    }
}