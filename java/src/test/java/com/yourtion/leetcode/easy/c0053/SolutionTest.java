package com.yourtion.leetcode.easy.c0053;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s, res: %d \n", source, res);
        assertEquals(res, new Solution().maxSubArray(TestUtils.stringToIntegerArray(source)));
    }

    @Test
    void maxSubArray() {
        runTest("[-2,1,-3,4,-1,2,1,-5,4]", 6);
        runTest("[-2,1,-3,4,-1,2,-3,-5,4]", 5);
        runTest("[]", 0);
        runTest("[1]", 1);
        runTest("[1,-1]", 1);
        runTest("[-1,-2,-3]", -1);
        runTest("[-1,-2,0]", 0);
    }
}