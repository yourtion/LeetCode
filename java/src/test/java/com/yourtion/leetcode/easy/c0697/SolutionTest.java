package com.yourtion.leetcode.easy.c0697;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findShortestSubArray(ss));
    }

    @Test
    void findShortestSubArray() {
        runTest("[1,2,2,3,1]", 2);
        runTest("[1,2,2,3,1,4,2]", 6);
    }
}