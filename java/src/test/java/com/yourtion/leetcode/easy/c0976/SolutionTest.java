package com.yourtion.leetcode.easy.c0976;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().largestPerimeter(ss));
    }

    @Test
    void largestPerimeter() {
        runTest("[2,1,2]", 5);
        runTest("[1,2,1]", 0);
        runTest("[3,2,3,4]", 10);
        runTest("[3,6,2,3]", 8);
    }
}